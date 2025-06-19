package ecommerce;
import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    // Linear Search by product name
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search by product name
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Shirt", "Fashion")
        };

        // Linear Search
        System.out.println("Linear Search: " + linearSearch(products, "Phone"));

        // Sort products by name for Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName));
        System.out.println("Binary Search: " + binarySearch(products, "Phone"));
    }
}
