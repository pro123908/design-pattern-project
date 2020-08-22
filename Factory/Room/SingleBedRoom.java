package Factory.Room;

public class SingleBedRoom implements Room {

    @Override
    public double getCost() {

        return 50.00;
    }

    @Override
    public String getRoomDescription() {

        return "Single Bed... Blah Blah";
    }

    @Override
    public String getRoomType() {

        return "Single Bed";
    }

}