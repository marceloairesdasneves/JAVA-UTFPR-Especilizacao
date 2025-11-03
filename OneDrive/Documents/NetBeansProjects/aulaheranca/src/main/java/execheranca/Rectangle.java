package execheranca;

public class Rectangle extends TwoDShape{
    Rectangle(){
        super();
    }
    Rectangle(double w, double h){
        super(w, h, "rectangle");
    }
    Rectangle(double x){
        super(x, "rectangle");
    }
    Rectangle(Rectangle ob){
        super(ob);
    }
    public boolean isSquare(){
        return getWidth() == getHeigth();
    } 
    @Override
    public double area(){
        return getWidth() * getHeigth();
    }
   
}
