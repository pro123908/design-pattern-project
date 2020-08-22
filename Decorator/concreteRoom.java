
public class ConcreteRoom implements Room {
    public double getCost() {
        System.out.println("Cost of Concrete Room: " + 150.0);
        return 150.0;
    }

    public String getRoomDescription() {
        return "A comfortable Single Bed room, with sunshine view and suiteable temperature";
    }

    public String getRoomType() {
        return "Single Bed";
    }

}