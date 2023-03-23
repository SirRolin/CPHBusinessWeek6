package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>();
    public void addShape(Shape s){
        shapes.add(s);
    }

    public double getTotalArea(){
        double output = 0;
        for(Shape s: shapes){
            output += s.getArea();
        }
        return output;
    }
}
