class A {
    void show(){
        System.out.println("PARENT");
    } 
}
class B extends A {
    public void display(){
        System.out.println("Child");
    } 
}
class Test{
    public static void main(String[] args) {
       B obj=new A();//object of B class
       obj.show();
       obj.display();
        
    }

    
}                          