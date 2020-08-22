package Room;

public class DoubleBedRoom implements Room {

    @Override
    public double getCost() {

        return 100.00;
    }

    @Override
    public String getRoomDescription() {

        return "Double Bed.... blah blah";
    }

    @Override
    public String getRoomType() {

        return "Double Bed";
    }

}