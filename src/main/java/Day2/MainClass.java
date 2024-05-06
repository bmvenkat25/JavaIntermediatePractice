package Day2;

//Pending, has to complete
interface Employee{
    String Name = null, Address=null, Salary = null , jobTitle = null;
    void calculateBonus();
    void performanceReport();
    void manageProject();
}
abstract class Manager implements Employee{

}
abstract class Developer implements Employee{

}

abstract class Programmer implements Employee{

}

public class MainClass {
    public static void main(String[] args) {

    }
}
