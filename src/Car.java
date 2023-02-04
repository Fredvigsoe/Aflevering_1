public class Car {
    public String model;
    public int price;
    public boolean isStarted = true;
    public boolean isStopped = false;
    public boolean isMoving = true;

    public Car(String model, int price, boolean isStarted, boolean isStopped, boolean isMoving) {
        //System.out.println("TEST");
        this.model = model;
        this.price = price;
        this.isStarted = isStarted;
        this.isStopped = isStopped;
        this.isMoving = isMoving;
        System.out.println("Model type: " + model + " The price of the car is: " + price + "DKK");

    }
}