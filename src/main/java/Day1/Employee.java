package Day1;

public class Employee {
    int salary, workHoursPerDay;

    public Employee(int salary, int workHoursPerDay) {
        this.salary = salary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public void getInfo(Employee e){
        System.out.println("Salary :"+e.getSalary()+"\nWorking Hours Per Day :"+e.getWorkHoursPerDay());
    }

    public void addSalary(Employee e){
        if(e.getSalary()<1500)
            e.setSalary(e.getSalary()+1000);
    }

    public void addWork(Employee e) {
        if(e.getWorkHoursPerDay()>6)
            e.setSalary(e.getSalary()+500);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }
    public static void main(String[] args){
        Employee e1 = new Employee(3000,10);
        e1.addSalary(e1);
        e1.addWork(e1);
        e1.getInfo(e1);
    }
}
