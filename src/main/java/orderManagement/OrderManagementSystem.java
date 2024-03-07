package orderManagement;
import java.util.ArrayList;
import java.util.List;

public class OrderManagementSystem {
    private List<OrderItem> orderItems;

    public OrderManagementSystem() {
        this.orderItems = new ArrayList<>();
    }

    // Method to add an item to the order
    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
        System.out.println(orderItem.getStyleName() + " added to the order.");
    }

    // Method to calculate the total order amount
    public double calculateTotal() {
        double total = 0.0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getPrice();
        }
        return total;
    }

    // Method to display order details
    public void displayOrder() {
        System.out.println("Order Details:");
        for (OrderItem orderItem : orderItems) {
            System.out.println("Style Name: " + orderItem.getStyleName() +
                               ", Color: " + orderItem.getColor() +
                               ", Size: " + orderItem.getSize() +
                               ", Price: $" + orderItem.getPrice());
        }
        System.out.println("Total Order Amount: $" + calculateTotal());
    }

    public static void main(String[] args) {
        // Example usage
        OrderManagementSystem orderSystem = new OrderManagementSystem();

        // Creating order items
        OrderItem item1 = new OrderItem("Style1", "Red", "Medium", 25.99);
        OrderItem item2 = new OrderItem("Style2", "Blue", "Large", 14.50);

        // Adding items to the order
        orderSystem.addItem(item1);
        orderSystem.addItem(item2);

        // Displaying order details
        orderSystem.displayOrder();
    }
}

// OrderItem class representing products in the order with Style Name, Color, and Size
class OrderItem {
    private String styleName;
    private String color;
    private String size;
    private double price;

    public OrderItem(String styleName, String color, String size, double price) {
        this.styleName = styleName;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getStyleName() {
        return styleName;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
