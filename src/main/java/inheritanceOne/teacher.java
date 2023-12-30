
package inheritanceOne;


public class teacher extends person {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    void display(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
        System.out.println("\n \n");
    }
    
    
}
