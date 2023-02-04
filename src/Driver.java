public class Driver {

    public String name;
    public int age;
    public String behaviour;
    public Driver(String name, int age, String behaviour){
        //System.out.println("TEST");
        this.name = name;
        this.age = age;
        this.behaviour = behaviour;
        System.out.println("The name of the driver is: " + name + ". The age of the driver is: " + age + ". The driving behaviour of the driver is: " + behaviour);
    }
}
