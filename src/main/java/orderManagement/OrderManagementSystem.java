package orderManagement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Enum for Size
enum Size {
    SIZE_34,
    SIZE_36,
    SIZE_38,
    SIZE_40,
    SIZE_42,
    SIZE_44,
    SIZE_46,
    SIZE_48,
    SIZE_50
}

// OrderItem class representing products in the order with Style Name, Color, Size, and Quantity
class OrderItem {
    private String styleName;
    private String color;
    private Size size;
    private int quantity;

    public OrderItem(String styleName, String color, Size size, int quantity) {
        this.styleName = styleName;
        this.color = color;
        this.size = size;
        this.quantity = quantity;
    }

    public String getStyleName() {
        return styleName;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }
}

// OrderManagementSystem class
public class OrderManagementSystem {
    private List<OrderItem> orderItems;

    public OrderManagementSystem() {
        this.orderItems = new ArrayList<>();
    }

    // Method to add an item to the order
    public void addItem(String styleName, String color, Size size, int quantity) {
        OrderItem orderItem = new OrderItem(styleName, color, size, quantity);
        orderItems.add(orderItem);
        System.out.println(orderItem.getStyleName() + " added to the order.");
    }

    // Method to display order details
    public void displayOrder() {
        System.out.println("Order Details:");
        System.out.printf("%-15s%-15s%-10s%-10s%n", "Style Name", "Color", "Size", "Quantity");
        
        for (OrderItem orderItem : orderItems) {
            System.out.printf("%-15s%-15s%-10s%-10d%n",
                    orderItem.getStyleName(), orderItem.getColor(),
                    orderItem.getSize(), orderItem.getQuantity());
        }
    }

     // New method to display summary
    public void displaySummary() {
        System.out.println("\nQuantity Summary:");
        Map<String, Integer> summaryMap = new HashMap<>();

        for (OrderItem orderItem : orderItems) {
            // Creating a unique key for each combination of Style, Color, and Size
            String key = orderItem.getStyleName() + "-" + orderItem.getColor() + "-" + orderItem.getSize();

            // Updating the quantity in the summary map
            summaryMap.put(key, summaryMap.getOrDefault(key, 0) + orderItem.getQuantity());
        }

        // Displaying the summary
        for (Map.Entry<String, Integer> entry : summaryMap.entrySet()) {
            String[] keyParts = entry.getKey().split("-");
            System.out.printf("%-15s%-15s%-10s%-10d%n",
                    keyParts[0], keyParts[1], keyParts[2], entry.getValue());
        }
    }



    public static void main(String[] args) {
        // Example usage
        OrderManagementSystem orderSystem = new OrderManagementSystem();

        // Adding items to the order with quantity
        orderSystem.addItem("Style1", "Red", Size.SIZE_36, 3);
        orderSystem.addItem("Style1", "Red", Size.SIZE_40, 5);
        orderSystem.addItem("Style1", "Red", Size.SIZE_42, 5);
        orderSystem.addItem("Style2", "Blue", Size.SIZE_44, 5);
        orderSystem.addItem("Style2", "Blue", Size.SIZE_46, 5);
        orderSystem.addItem("Style2", "Blue", Size.SIZE_48, 3);
        orderSystem.addItem("Style1", "red", Size.SIZE_36, 3);



        // Displaying order details
        orderSystem.displayOrder();
        // Displaying quantity summary
        orderSystem.displaySummary();
    }
}
