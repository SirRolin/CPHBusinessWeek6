package Task4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTests {
    ShapeBuilder SB1 = new ShapeBuilder();
    double totalArea = Math.pow(2,2) + (Math.PI * Math.pow(4,2));
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        SB1.addShape(new Square(2));
        SB1.addShape(new Circle(4));
    }
    @Test
    void getTotalArea() {
        assertEquals(SB1.getTotalArea(), totalArea);
        SB1.addShape(new Circle(18));
        assertEquals(SB1.getTotalArea(), totalArea + (Math.PI * Math.pow(18,2)));
    }
}
