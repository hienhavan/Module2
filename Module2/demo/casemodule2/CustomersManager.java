
package demo.casemodule2;

import java.io.*;
import java.util.*;

public class CustomersManager {

    private final Map<String, Customers> customerMap;
    private final ArrayList <String> customers = new ArrayList<String>();
    int redeemPoint = 0;

    public CustomersManager() {
        this.customerMap = new HashMap<>();
    }

    public void addCustomer(Customers customer) {
        if (customerMap.containsKey(customer.getCode())) {
            System.err.println("Mã khách hàng trùng l?p: " + customer.getCode());
            return;
        }
        updateRedeemPoints(customer);
        customer.setPoint(redeemPoint);
        customerMap.put(customer.getCode(), customer);
        System.err.println("Thêm khách hàng thành công");
        updateCustomerIds();
//        updateRedeemPoints(customer);
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
            System.err.println("Không có khách hàng nào trong danh sách");
            return;
        }
        customerMap.values().forEach(customer -> System.out.println(customer + ", diem hien tai = " + redeemPoint + '\'' +
                '}'));
    }

    private void updateCustomerIds() {
        int newId = 1;
        for (Customers customer : customerMap.values()) {
            customer.setId(newId);
            newId++;
        }
    }

    private void writeCustomersToFile() {
        String filePath = "Module2/demo/casemodule2/customers.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Customers customer : customerMap.values()) {
                writer.write(customer.toString() + ", diem hien tai = " + redeemPoint + '\'' + '}');
                writer.newLine();
            }
        } catch (IOException _) {
        }
    }

    private void updateRedeemPoints(Customers customer) {
        List<String[]> redeemPointsList = readRedeemPoints();
        String filePath = "Module2/demo/casemodule2/redeem_points.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            if (redeemPointsList.isEmpty()) {
                writer.write(customerMap.values() + "}" + "," + redeemPoint);
                writer.newLine();
                return;
            }
            for (String[] tokens : redeemPointsList) {
                try {
                    String phoneNumber = tokens[3];
                    String[] phoneNumbers = phoneNumber.split("=");
                    String phone = phoneNumbers[1].replaceAll("'", "");
                    if (customer.getPhoneNumber().equals(phone)) {
                        redeemPoint = Integer.parseInt(tokens[tokens.length - 1]);
                        System.out.println("dem" + redeemPoint);
                        redeemPoint++;
                        break;
                    }
                } catch (NullPointerException _) {
                }
            }
            writer.write(customer + "}" + "," + redeemPoint);
            writer.newLine();
        } catch (IOException _) {
        }
    }

    private List<String[]> readRedeemPoints() {
        List<String[]> redeemPointsList = new ArrayList<>();
        List<String[]> redeemPointsLists = new ArrayList<>();
        String filePath = "Module2/demo/casemodule2/redeem_points.txt";
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
                for (String[] points : redeemPointsLists) {
                    if (points[3].equals(currentPoints[3])) {
                        isNewMax = false;
                        break;
                    }
                }
                if (isNewMax) {
                    redeemPointsLists.add(currentPoints);
                }
            }
        } catch (IOException _) {
        }
        return redeemPointsLists;
    }

}
//    private List<String[]> readRedeemPoints() {
//        List<String[]> redeemPointsList = new ArrayList<>();
//        List<String[]> redeemPointsLists = new ArrayList<>();
//        String filePath = "Module2/demo/casemodule2/redeem_points.txt";
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] tokens = line.split(",");
//                redeemPointsList.add(tokens);
//            }
//            for (int i = 0; i < redeemPointsList.size(); i++) {
//                String[] temp = null;
//                for (int j = 1; j < redeemPointsList.size(); j++) {
//                    if (redeemPointsList.get(i)[3].equals(redeemPointsList.get(j)[3])) {
//                        if (Integer.parseInt(redeemPointsList.get(i)[redeemPointsList.get(i).length - 1]) < Integer.parseInt(redeemPointsList.get(j)[redeemPointsList.get(j).length - 1])) {
//                            temp = redeemPointsList.get(j);
//                        } else {
//                            temp = redeemPointsList.get(i);
//                        }
//                    }
//                }
//                redeemPointsLists.add(temp);
//                System.out.println(STR."temp: \{Arrays.toString(temp)}");
//            }
//        } catch (IOException _) {
//        }
//        return redeemPointsLists;
//    }
//}