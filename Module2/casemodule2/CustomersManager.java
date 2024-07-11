
package casemodule2;

import casemodule2.interfaces.choice;

import java.io.*;
import java.util.*;

public class CustomersManager implements choice {

    private final Map<String, Customers> customerMap;

    public CustomersManager() {
        this.customerMap = new HashMap<>();
    }

    public void addCustomer(Customers customer) {
        if (customerMap.containsKey(customer.getCode())) {
            System.err.println("ma khach hang trung lap: " + customer.getCode());
            return;
        }
        customerMap.put(customer.getCode(), customer);
        System.out.println("them khach hang thanh cong");
        updateCustomerIds();
        updateRedeemPoints(customer);
        writeCustomersToFile();
    }

    public void deleteCustomer(Customers customer) {
        customerMap.remove(customer.getCode());
        updateCustomerIds();
        writeCustomersToFile();
    }

    public Customers searchByCode(String code) {
        return customerMap.get(code);
    }

    public void showCustomer() {
        if (customerMap.isEmpty()) {
            System.err.println("khong co khach hang nao trong danh sach");
            return;
        }
        customerMap.values().forEach(System.out::println);
    }

    private void updateCustomerIds() {
        int newId = START_ID;
        for (Customers customer : customerMap.values()) {
            customer.setId(newId);
            newId++;
        }
    }

    private void writeCustomersToFile() {
        String filePath = "Module2\\casemodule2\\file\\customer.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Customers customer : customerMap.values()) {
                writer.write(customer.toString());
                writer.newLine();
            }
        } catch (IOException _) {
        }
    }

    private void updateRedeemPoints(Customers customer) {
        List<String[]> redeemPointsList = readRedeemPoints();
        String filePath = "Module2\\casemodule2\\file\\redeem_point.txt";
        int redeemPoint = START_POINT;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            if (redeemPointsList.isEmpty()) {
                writer.write(customerMap.values() + "}" + "," + redeemPoint);
                return;
            }
            for (String[] tokens : redeemPointsList) {
                try {

                    String phoneNumber = tokens[3];
                    String[] phoneNumbers = phoneNumber.split("=");
                    String phone = phoneNumbers[1].replaceAll("'", "");
                    if (customer.getPhoneNumber().equals(phone)) {
                        redeemPoint = Integer.parseInt(tokens[tokens.length - 1]);
                        if (customer instanceof RegularCustomers) {
                            redeemPoint++;
                            break;
                        }
                        redeemPoint += POINTS_AWARDED;
                        break;
                    }
                } catch (NullPointerException _) {
                }
            }
            for (Customers customers : customerMap.values()) {
                if (customers.getPhoneNumber().equals(customer.getPhoneNumber())) {
                    customers.setPoint(redeemPoint);
                    customerMap.put(customer.getCode(), customer);
                }
            }
            writer.write(customer + "}" + "," + redeemPoint);
            writer.newLine();
        } catch (IOException _) {
        }
    }

    private List<String[]> readRedeemPoints() {
        List<String[]> redeemPointsList = new ArrayList<>();
        List<String[]> topScoreList = new ArrayList<>();
        String filePath = "Module2\\casemodule2\\file\\redeem_point.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                redeemPointsList.add(tokens);
            }

            for (int i = 0; i < redeemPointsList.size(); i++) {
                String[] currentPoints = redeemPointsList.get(i);
                int currentMaxPoints = Integer.parseInt(currentPoints[currentPoints.length - 1]);
                for (int j = i + 1; j < redeemPointsList.size(); j++) {
                    String[] nextPoints = redeemPointsList.get(j);
                    if (currentPoints[3].equals(nextPoints[3])) {
                        int nextPointsValue = Integer.parseInt(nextPoints[nextPoints.length - 1]);
                        if (nextPointsValue > currentMaxPoints) {
                            currentMaxPoints = nextPointsValue;
                            currentPoints = nextPoints;
                        }
                    }
                }
                boolean isNewMax = true;
                for (String[] points : topScoreList) {
                    if (points[3].equals(currentPoints[3])) {
                        isNewMax = false;
                        break;
                    }
                }
                if (isNewMax) {
                    topScoreList.add(currentPoints);
                }
            }
        } catch (IOException _) {
        }
        return topScoreList;
    }
}
