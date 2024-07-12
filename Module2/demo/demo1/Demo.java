//package demo.demo1;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Demo {
//    public static void main(String[] args) {
////        Product product = getProductById(1);
////        Optional<Product> optionalProduct = Optional.ofNullable(product);
////
////        optionalProduct.ifPresent(p -> System.out.println("Tên s?n ph?m: " + p.getName()));
////    }
////
////    public static Product getProductById(int id) {
////        if (id == 1) {
////            return new Product("Laptop", 999.99);
////        } else {
////            return null; // Gi? l?p tr??ng h?p không tìm th?y s?n ph?m v?i id ?ã cho
////        }
//////    }
////
//        List<String> list = Arrays.asList("Asus", "dell", "Mac", "tuf", "rog", "dell2");
//        Stream<String> stream = list.stream().filter(s -> s.startsWith("d")).limit(2);
//
//                stream.forEach(System.out::println);
//
//
//    }
//}
////
////
////package casemodule2;
////
////import java.io.*;
////        import java.util.ArrayList;
////import java.util.HashMap;
////import java.util.List;
////import java.util.Map;
////
////public class CustomersManager {
////
////    private final Map<String, Customers> customerMap;
////
////    public CustomersManager() {
////        this.customerMap = new HashMap<>();
////    }
////
////    public void addCustomer(Customers customer) {
////        if (customerMap.containsKey(customer.getCode())) {
////            System.err.println("Mó kh?ch hàng tr?ng l?p: " + customer.getCode());
////            return;
////        }
////        customerMap.put(customer.getCode(), customer);
////        System.err.println("Th?m kh?ch hàng thành c?ng");
////        writeCustomersToFile();
////        updateRedeemPoints();
////    }
////
////    public void deleteCustomer(Customers customer) {
////        customerMap.remove(customer.getCode());
////        updateCustomerIds();
////        writeCustomersToFile();
////    }
////
////    public Customers searchByCode(String code) {
////        return customerMap.get(code);
////    }
////
////    public void showCustomers() {
////        if (customerMap.isEmpty()) {
////            System.err.println("Kh?ng cú kh?ch hàng nào trong danh s?ch");
////            return;
////        }
////        customerMap.values().forEach(System.out::println);
////    }
////
////    private void updateCustomerIds() {
////        int newId = 1;
////        for (Customers customer : customerMap.values()) {
////            customer.setId(newId);
////            newId++;
////        }
////    }
////
////    private void writeCustomersToFile() {
////        String filePath = "Module2/demo/casemodule2/customers.txt";
////        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
////            for (Customers customer : customerMap.values()) {
////                writer.write(customer.toString());
////                writer.newLine();
////            }
////        } catch (IOException e) {
////            System.err.println("L?i ghi kh?ch hàng vào t?p tin: " + e.getMessage());
////        }
////    }
////
////    private void updateRedeemPoints() {
////        List<String[]> redeemPointsList = readRedeemPoints();
////        String filePath = "Module2/demo/casemodule2/redeem_points.txt";
////        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
////            for (String[] tokens : redeemPointsList) {
////                String phoneNumber = tokens[2];
////                int redeemPoints = Integer.parseInt(tokens[tokens.length - 1]);
////                for (Customers customer : customerMap.values()) {
////                    if (customer.getPhoneNumber().equals(phoneNumber)) {
////                        redeemPoints++;
////                        break;
////                    }
////                }
////                writer.write(String.join(",", tokens) + "," + redeemPoints);
////                writer.newLine();
////            }
////        } catch (IOException e) {
////            System.err.println("L?i c?p nh?t di?m d?i thu?ng: " + e.getMessage());
////        }
////    }
////
////    private List<String[]> readRedeemPoints() {
////        List<String[]> redeemPointsList = new ArrayList<>();
////        String filePath = "Module2/demo/casemodule2/redeem_points.txt";
////        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
////            String line;
////            while ((line = reader.readLine()) != null) {
////                String[] tokens = line.split(",");
////                redeemPointsList.add(tokens);
////            }
////        } catch (IOException e) {
////            System.err.println("L?i d?c di?m d?i thu?ng: " + e.getMessage());
////        }
////        return redeemPointsList;
////    }
////}
//
public static void main(String[] args) {
    int a = 4;
    int b = 11;
    int c = b++%a;
    System.out.println(++c);

}