package demo.demo1;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Product product = getProductById(1);
        Optional<Product> optionalProduct = Optional.ofNullable(product);

        optionalProduct.ifPresent(p -> System.out.println("Tên s?n ph?m: " + p.getName()));
    }

    public static Product getProductById(int id) {
        if (id == 1) {
            return new Product("Laptop", 999.99);
        } else {
            return null; // Gi? l?p tr??ng h?p không tìm th?y s?n ph?m v?i id ?ã cho
        }
    }
}


