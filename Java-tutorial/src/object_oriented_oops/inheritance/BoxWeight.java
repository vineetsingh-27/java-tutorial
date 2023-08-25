package object_oriented_oops.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
        System.out.println("empty constructor");
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, int weight) {
        super(l, h, w); //calling parent class constructor
        //use to initialise values present in parent class
        this.weight = weight;
    }
}
