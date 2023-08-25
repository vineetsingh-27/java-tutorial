package object_oriented_oops.inheritance;

public class Box {
    double l;
    double h = 1;
    double w;

   public Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
   public Box(double l,double h,double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
        System.out.println("Hello");
    }
}
