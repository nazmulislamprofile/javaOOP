package aggregiation;

public class emp {
    private int id;
    private String name;
    Address stdAddress;

    emp(int id, String name, Address stdAddress) {
        this.id = id;
        this.name = name;
        this.stdAddress = stdAddress;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    


}