package compareTwoObject;

public class employee {
    private int regNo;
    private String name;

    public employee(int regNo,String name){
        this.regNo=regNo;
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setReg(int regNo){
        this.regNo=regNo;
    }
    public int getReg(){
        return regNo;
    }

}
