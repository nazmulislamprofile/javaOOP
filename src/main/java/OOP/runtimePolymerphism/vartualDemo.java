package OOP.runtimePolymerphism;

public class vartualDemo {
    public static void main(String[] args) {
        employee emp=new salary("nazmul islam", "ashulia,savar,dhaka",1973961381,25000);
        salary s=new salary("alomgir hossain", "madhar,sreepur,dhaka", 125542443, 30000);
        emp.displayInfo();
        s.displayInfo();


    }

}
