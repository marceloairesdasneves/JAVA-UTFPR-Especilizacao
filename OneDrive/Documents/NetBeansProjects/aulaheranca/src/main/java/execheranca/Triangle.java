package execheranca;

public class Triangle extends TwoDShape{
    private String style;
    
    Triangle(){//construtor padrao
        super();
        style = "none";
    }
    Triangle(String s, double w, double h){//construtor passando parametro
        super(w, h, "traingle");
        style = s;
    }
    
    Triangle(double x){//construtor com um argumento
        super(x, "triangle");
        style = "FILLED";
    }
    
    Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }
    
    @Override
    public double area(){
        return (getWidth() * getHeigth()) / 2;
    }
    
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
