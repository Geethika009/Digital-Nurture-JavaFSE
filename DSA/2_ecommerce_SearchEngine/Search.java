import java.util.Arrays;
import java.util.Scanner;
// Product class to represent a product in the e-commerce application

class Product {
    int productId;
    String productName;
    String category;
    // Constructor to initialize the product object
    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {

    // Linear Search Method
    public static Product linearSearch(Product[] products, String target) {

        for (int i = 0; i < products.length; i++) {

            if (products[i].productName.equalsIgnoreCase(target)) {
                return products[i];
            }
        }

        return null;
    }

    // Binary Search Method
    public static Product binarySearch(Product[] products, String target) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int result =
                products[mid].productName.compareToIgnoreCase(target);

            if (result == 0)
                return products[mid];

            else if (result < 0)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Accessories"),
            new Product(103, "Keyboard", "Accessories"),
            new Product(104, "Monitor", "Electronics"),
            new Product(105, "Phone", "Electronics")
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String searchItem = sc.nextLine();

        // Linear Search
        Product linearResult =
            linearSearch(products, searchItem);

        if (linearResult != null)
            System.out.println("Linear Search: Product Found");
        else
            System.out.println("Linear Search: Product Not Found");

        // Sort array before Binary Search
        Arrays.sort(products,
            (p1, p2) ->
                p1.productName.compareToIgnoreCase(p2.productName));

        Product binaryResult =
            binarySearch(products, searchItem);

        if (binaryResult != null)
            System.out.println("Binary Search: Product Found");
        else
            System.out.println("Binary Search: Product Not Found");

        sc.close();
    }
}