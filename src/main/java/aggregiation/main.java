package aggregiation;

public class main {
    public static void main(String[] args) {
        Address ad=new Address("ashulia","savar", "dhaka");
        emp t1=new emp(101,"nazmul islam",ad);

        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.stdAddress.getCity());
        System.out.println(t1.stdAddress.getState());
        System.out.println(t1.stdAddress.getCountry());     
        
    }
}
