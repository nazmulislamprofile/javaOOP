package methodOveriding;

public class main {
    public static void main(String[] args) {
        vehicle v1 = new car();
        vehicle v2 = new bike();

        v1.displayInfo();
        v2.displayInfo();
    }
}

class car extends vehicle {
    public void displayInfo() {
        System.out.println("It's a car");
    }

}

class bike extends vehicle {
    public void displayInfo() {
        System.out.println("it's a bike");
    }
}
