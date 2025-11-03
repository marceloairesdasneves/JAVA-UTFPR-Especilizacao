
package execheranca;

public class Shapes {
    public static void main(String[] args) {
        //ColorTriangle t1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        //ColorTriangle t2 = new ColorTriangle("Red", "filled", 2.0, 2.0);
        
        TwoDShape shapes[] = new TwoDShape[5];
        
        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        //shapes[4] = new TwoDShape(10, 20, "generic");

        
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            //System.out.println("Area is " + (shapes[i].getHeigth() * shapes[i].getWidth())/2);// + "Area is ");
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }   
}
/*
//Triangle t1 = new Triangle("filled", 4.0, 4.0);
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);
        t1 = t2;
                
        System.out.println("\nInfo for t1 ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
        
        System.out.println();
        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
*/