public class Test {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Jack", 2000, 2019, 10, 24);
        staff[1] = new Employee("Alex", 3000, 2012, 10, 3);
        staff[2] = new Employee("James", 1000, 2013, 12, 14);

        for(Employee e : staff){
            e.raiseSalary(15);
        }

        for(Employee e : staff){
            System.out.println("Name" + e.getName() + ", salary: " + e.getSalary());
        }
    }
}
