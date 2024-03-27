package static_class;

 class outer {
    static class inner{
        public  void display(){
            System.out.println("this is a inner static class");
        }
    }
}

 class tester{
    public static void main(String[] args) {
       new outer.inner().display(); // if method not static 
            // outer.inner.display();  //it will work when method will be static.
    }
}