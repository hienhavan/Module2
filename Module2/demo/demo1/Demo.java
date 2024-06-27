package demo.demo1;

import bai17.Product;

import java.util.ArrayList;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        var product = new ArrayList<Product>();
        var product2 = new Product(1, "name3", 100,"ss","nl");
        product.add(new Product(1, "name1", 100,"ss","nl"));
        product.add(new Product(1, "name2", 100,"ss","nl"));
        Optional<Product> optionalName = Optional.ofNullable(product2);
        optionalName.ifPresent(name -> System.out.println("User name: " + name));

    }
}
