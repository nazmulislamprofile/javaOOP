package OOP.runtimePolymerphism;

public class salary extends employee {
    double salary;
    salary(String name,String address,int number,double salary){
        super(name, address,number);
        setSalary(salary);
    }

    public void setSalary(double newSalary){
        salary=newSalary;
    }

    public void displayInfo(){
        System.out.println("name="+getName()+"salary="+salary);
    }
}
