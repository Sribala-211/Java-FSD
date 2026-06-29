// TestSearch.java
public class TestSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Book", "Education")
        };

        // Linear Search
        Product result1 = LinearSearch.search(products, 103);
        System.out.println("Linear Search Result: " + result1);

        // Binary Search
        Product result2 = BinarySearch.search(products, 104);
        System.out.println("Binary Search Result: " + result2);
    }
}
