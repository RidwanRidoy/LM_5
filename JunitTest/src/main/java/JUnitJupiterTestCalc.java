import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitJupiterTestCalc {
    private final Calculator calc = new Calculator();

    public JUnitJupiterTestCalc() {
    }

    @Test
    public void testAddition() {
        Assertions.assertEquals(4.0, this.calc.add(2.0, 2.0));
    }

    @Test
    public void testSubtraction() {
        Assertions.assertEquals(2.0, this.calc.sub(5.0, 3.0));
    }

    @Test
    public void testMultiplication() {
        Assertions.assertEquals(12.0, this.calc.mul(3.0, 4.0));
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(2.0, this.calc.div(8.0, 4.0));
    }
}
