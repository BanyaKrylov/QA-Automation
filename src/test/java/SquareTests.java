import org.junit.Assert;
import org.junit.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Square square = new Square(5);
        Assert.assertEquals(square.area(), 25, 0);
    }
}
