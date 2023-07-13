import org.junit.Assert;
import org.junit.Test;

public class TestCulc {
    Calc calc = new Calc();

    @Test
    public void TestOpPlus(){
        Assert.assertEquals(calc.StartCal(1,2,'+'), 3,0.0001);
        Assert.assertEquals(calc.StartCal(2.22222,2.33333,'+'), 4.5555,0.0001);
    }

    @Test
    public void TestOpMinus(){
        Assert.assertEquals(calc.StartCal(2,1,'-'), 1,0.0001);
        Assert.assertEquals(calc.StartCal(2.22222,2.11111,'-'), 0.1111,0.0001);
    }

    @Test
    public void TestOpDivision(){
        Assert.assertEquals(calc.StartCal(3,2,'/'), 1.500,0.0001);
        Assert.assertEquals(calc.StartCal(5.4444,2.2222,'/'), 2.4500,0.0001);
    }

    @Test
    public void TestOpMultiplication(){
        Assert.assertEquals(calc.StartCal(2,2,'*'), 4,0.0001);
        Assert.assertEquals(calc.StartCal(4.2222,5.3,'*'), 22.3776,0.0001);
    }
}
