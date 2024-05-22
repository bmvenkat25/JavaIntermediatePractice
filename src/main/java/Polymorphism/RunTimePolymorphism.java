package Polymorphism;


class Parent {
    public void methodOverRide() {
        System.out.println("Method from Parent class called");
    }
}

class Child extends Parent {
    public void methodOverRide() {
        System.out.println("Method from Child class called");
    }
}
public class RunTimePolymorphism extends Child{
    public void methodOverRide() {
        System.out.println("Method from RunTimePolymorphism class called");
    }
    public static void main(String[] args){
        Parent p = new Parent();
        p.methodOverRide();

        p = new Child();
        p.methodOverRide();

        p = new RunTimePolymorphism();
        p.methodOverRide();
    }
}

