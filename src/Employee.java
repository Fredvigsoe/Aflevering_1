public class Employee {
    public String firstName;
    public String lastName;
    public float salary;

    public Employee(String firstName, String lastName, float salary){
        if(salary < 0.0f){
            salary = 0.0f;
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        System.out.println(firstName + " " + lastName + " makes: " + salary + "DKK monthly from working here.");
    }
}
