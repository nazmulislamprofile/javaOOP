package OOP.runtimePolymerphism;

public class employee {
    private String name;
    private String address;
    private long number;

    employee(String name,String address,long number){
        this.name=name;
        this.address=address;
        this.number=number;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name=newName;
    }

    public String getAddress(){
            return address;
    }
    public void setAddress(String newAddress){
            address=newAddress;
    }

    public long getNumber(){
        return number;
    }
    public void setNumber(long newNumber){
        number=newNumber;
    }

    public String toString(){
        return name+" "+address+" "+number;
    }

    public void displayInfo(){
    
    }

}
