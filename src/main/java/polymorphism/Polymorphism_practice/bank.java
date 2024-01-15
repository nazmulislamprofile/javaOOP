package polymorphism.Polymorphism_practice;

public class bank {
    float getRateOfInterest() {
        return 0;
    }
}

class IBBL extends bank {
    float getRateOfInterest() {
        return 7;
    }
}

class DBL extends bank {
    float getRateOfInterest() {
        return 8;
    }
}

class testPolymorphism {
    public static void main(String[] args) {
        bank b;
        b = new IBBL();

        System.out.println(b.getRateOfInterest());
        b = new DBL();
        System.out.println(b.getRateOfInterest());
    }
}
