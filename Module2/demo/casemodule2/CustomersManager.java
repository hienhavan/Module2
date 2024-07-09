package demo.casemodule2;

import java.io.*;
import java.util.*;

public class CustomersManager {

    private final Map<String, Customers> customerMap;
    int redeemPoint = 0;

    public CustomersManager() {
        this.customerMap = new HashMap<>();
    }

    public void addCustomer(Customers customer) {
        if (customerMap.containsKey(customer.getCode())) {
            System.err.println("Mã khách hàng trùng l?p: " + customer.getCode());
            return;
        }
        customerMap.put(customer.getCode(), customer);
        System.err.println("Thêm khách hàng thành công");
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
        String filePath = "Module2/demo/casemodule2/customers.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Customers customer : customerMap.values()) {
                writer.write(customer.toString() + ", diem hien tai = " + redeemPoint + '\'' +
                        '}');
                writer.newLine();
            }
        } catch (IOException _) {
        }
    }

    private void updateRedeemPoints(Customers customer) {
        List<String[]> redeemPointsList = readRedeemPoints();
        String filePath = "Module2/demo/casemodule2/redeem_points.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            if (redeemPointsList.isEmpty()) {
                writer.write(customerMap.values() + "}"+ "," + redeemPoint );
                writer.newLine();
                return;
            }
            for (String[] tokens : redeemPointsList) {
                try {
                    String phoneNumber = tokens[3];
                    String[] phoneNumbers = phoneNumber.split("=");
                    if (customer.getPhoneNumber().equals(phoneNumbers[1])) {
                        redeemPoint = Integer.parseInt(tokens[tokens.length - 1]);
                        redeemPoint++;
                        writer.write(customer + "}"+ "," + redeemPoint);
                        writer.newLine();
                        break;
                    }
                } catch (NullPointerException _) {
                }
                writer.write(customer + "}"+ "," + redeemPoint);
                writer.newLine();
            }
        } catch (IOException _) {
        }
    }

    private List<String[]> readRedeemPoints() {
        List<String[]> redeemPointsList = new ArrayList<>();
        String filePath = "Module2/demo/casemodule2/redeem_points.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                redeemPointsList.add(tokens);
            }
        } catch (IOException _) {
        }
        return redeemPointsList;
    }
}
