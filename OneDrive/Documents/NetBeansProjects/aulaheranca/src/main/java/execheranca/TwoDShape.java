package execheranca;

public abstract class TwoDShape {
    private double width;
    private double heigth;
    private String name;
    
    public TwoDShape(){//construtor padrao
        width = heigth = 0.0;
        name = "none";
    }
    
    public TwoDShape(double x, String n){//construtor padrao passando um argumento
        width = heigth = x;
        name = n;
    }
    
    public TwoDShape(double w, double h, String n){ //construtor passando parametros
        width = w;
        heigth = h;
        name = n;
    }
    
    TwoDShape(TwoDShape ob){//construtor criado a partir de outro.
        width = ob.width;
        heigth = ob.heigth;
        name = ob.name;
    }
    
    public double getWidth(){
        return width;
    }
    public double getHeigth(){
        return heigth;
    }
    public void setWidth(double w){
        width = w;
    }
    public void setHeigth(double h){
        heigth = h;
    }
    public String getName(){
        return name;
    }
    public void showDim(){
        System.out.println("Width and height are " + width + " and " + heigth);
    }
    public abstract double area();

}
