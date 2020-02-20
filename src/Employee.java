
import java.time.LocalDate;

class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
       this.name = name;
       this.salary = salary;
       this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double percent){
        double moneyToAdd = salary * (percent/100);
        salary += moneyToAdd;
    }

    public boolean checkIfSame(Employee e){
        return (this.name).equals(e.name);
    }

}
