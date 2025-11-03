package execheranca;

public class ColorTriangle extends Triangle {
    private String color;
    
    ColorTriangle(String c, String s, double w, double h){
        super(s, w, h);
        color = c;
    }

    ColorTriangle(Triangle t1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String getColor(){
        return color;
    }
    void showColor(){
        System.out.println("color is " + color);
    }
    
}
