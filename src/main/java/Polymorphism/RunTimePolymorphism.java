package Polymorphism;


class Parent {
    public void methodOverRide() {
        System.out.println("Method from Parent class called");
    }
}
public class RunTimePolymorphism extends Parent{
    public void methodOverRide() {
        System.out.println("Method from Child class called");
    }
    public static void main(String[] args){
        new RunTimePolymorphism().methodOverRide();
    }
}

