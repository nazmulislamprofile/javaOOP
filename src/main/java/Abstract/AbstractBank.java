package Abstract;

abstract class bank{
    abstract int rateOfInterest();
}

class IBL extends bank{ 
    int rateOfInterest(){
        return 7;
    }
}
class DBL extends bank{
    int rateOfInterest(){
        return 8;
    }
}
class SBL extends bank{
    int rateOfInterest(){
        return 9;
    }
}



public class AbstractBank {
    public static void main(String[] args) {
        bank obj1=new DBL();
        bank obj2=new IBL();
        bank obj3=new SBL();

        System.out.println(obj1.rateOfInterest());
        System.out.println(obj2.rateOfInterest());
        System.out.println(obj3.rateOfInterest());
    }
    }
