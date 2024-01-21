package compareTwoObject;

public class HashCodeExample {
    public static void main(String[] args) {
        employee emp1=new employee(1250, "Nazmul");
        employee emp2=new employee(1250, "Nazmul");
        int a=emp1.hashCode();
        int b=emp2.hashCode();

        System.out.println("hascode of emp1"+a);
        System.out.println("hascode of emp2"+b);
        System.out.println("Comparing objects emp1 and emp2 ="+emp1.equals(emp2));

    }
}
