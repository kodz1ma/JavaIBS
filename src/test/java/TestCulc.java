import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestCulc {
    Calc calc = new Calc();

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void TestForException(){

        thrown.expect(ArithmeticException.class);
        calc.StartCal("2","0",'/');

    }
}
