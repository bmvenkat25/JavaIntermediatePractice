package Polymorphism;

public class CompileTimePolymorphism {
    public void noOfArgument(int a, int b) {
        System.out.println("Method with 2 arguments called");
    }
    public void noOfArgument(int a, int b, int c) {
        System.out.println("Method with 3 arguments called");
    }
    public void dataType(int a){
        System.out.println("Method with int argument called");
    }
    public void dataType(String a){
        System.out.println("Method with String argument called");
    }

    public static void main(String[] args) {
        CompileTimePolymorphism compile = new CompileTimePolymorphism();
        compile.noOfArgument(1,2,3); //Method with 3 arguments called
        compile.noOfArgument(1,2); //Method with 2 arguments called
        compile.dataType("Example"); // Method with String argument called
        compile.dataType(2); // Method with int argument called
    }
}
