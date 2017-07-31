/**
 * Created by Guest on 7/31/17.
 */
public class Parcel {
    double height;
    double length;
    double width;
    double weight;
    double volume = getVolume();
    String speed;
    double distance;
    double shippingCost = costToShip();


    public Parcel(double height, double lenght, double width, double weight, double distance, String speed) {
        this.height = height;
        this.length = lenght;
        this.width = width;
        this.weight = weight;
        this.distance = distance;
        this.speed = speed;
    }


    public double getVolume() {
        return height * length * width;
    }

    public double costToShip() {
        double cost = 10;
        return cost + costByDistance() + costBySpeed();

    }

    public double costByDistance() {
        return distance * 0.10;

    }

    public double costBySpeed() {
        double cost;
        switch (speed) {
            case "overnight":
                cost = 20;
                break;
            case "two-day":
                cost = 10;
                break;
            default:
                cost = 2;
                break;
        }
        return cost;
    }

    public void printInfo() {
        System.out.println("Height: " + height + ", length: "+ length + ", width: " + width + ", weight: " + weight + ".");
        System.out.println("The volume: " + volume + ", the cost to ship is " + costToShip());
    }


}