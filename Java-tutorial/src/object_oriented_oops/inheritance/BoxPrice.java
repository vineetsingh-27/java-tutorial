package object_oriented_oops.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
        System.out.println("Box price constructor");
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, int weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
