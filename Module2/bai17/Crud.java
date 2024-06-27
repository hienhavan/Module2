package bai17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crud {
    public static void readData(List<Product> product) {
        if (checkFileNull()) return;
        var scanner = new Scanner(System.in);
        System.out.println("nhap vao id");
        int id = scanner.nextInt();
        boolean found = false;
        for (Product products : product) {
            if (products.getId() == id) {
                System.out.println("san pham co id =" + " " + id + " " + "la :" + products);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("khong co san pham nay");
    }
    public static void addData(List<Product> products, Product product) {
        try {
            products.add(product);
            writeObject(products);
            System.out.println("them vao thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateData(List<Product> products) throws IOException {
        var scanner = new Scanner(System.in);
        System.out.println("nhap vao id can sua");
        int id = scanner.nextInt();
        boolean found = false;
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("san pham co id =" + " " + id + " " + "la :" + products.get(i));
                found = true;
                index = products.indexOf(products.get(i));
                break;
            }
        }
        if (!found) {
            System.out.println("khong co san pham nay");
            return;
        }
        System.out.print("nhap vao ten moi: ");
        String name = scanner.next();
        System.out.print("nhap vao gia moi: ");
        double price = scanner.nextDouble();
        System.out.print("nhap vao hang san xuat moi: ");
        String brand = scanner.next();
        System.out.print("nhap vao mo ta moi: ");
        String description = scanner.next();
        Product product = new Product(id, name, price, brand, description);
        if (found == true) {
            products.set(index, product);
            System.out.println("san pham da duoc cap nhat :" + " " + product);
        }
        writeObject(products);
    }

    public static void deleteData(List<Product> products) throws IOException {
        var scanner = new Scanner(System.in);
        System.out.println("nhap vao id can xoa");
        int id = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("san pham co id =" + " " + id + " " + "la :" + products.get(i));
                found = true;
                products.remove(i);
                System.out.println("san pham da duoc xoa");
                break;
            }
        }
        if (!found) System.out.println("khong co san pham nay");
        writeObject(products);
    }

    public static void choose() throws IOException {
        var products = new ArrayList<Product>();
        var scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Read data");
            System.out.println("2. Add data");
            System.out.println("3. Update data");
            System.out.println("4. Delete data");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    readData(products);

                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    int price = scanner.nextInt();
                    System.out.print("Enter product description: ");
                    String description = scanner.next();
                    System.out.print("Enter product brand: ");
                    String brand = scanner.next();
                    Product product = new Product(id, name, price, description, brand);
                    addData(products, product);
                    break;
                case 3:
                    updateData(products);
                    break;
                case 4:
                    deleteData(products);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void writeObject(List<Product> products) throws IOException {
        var inputStream = new FileOutputStream("Module2\\bai17\\products.csv");
        var outputStream = new ObjectOutputStream(inputStream);
        outputStream.writeObject(products.toString());
        outputStream.close();
    }
    private static boolean checkFileNull() {
        File file = new File("Module2\\bai17\\products.csv");
        if (!file.exists()) {
            System.out.println("File not found.");
            return true;
        }
        return false;
    }
}
