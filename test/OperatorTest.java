import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OperatorTest {
    @Test
    public void testAddition(){
        Operator subject = new PlusOperator();
        double result = subject.operate(new Expression(2d), new Expression(3d));

        assertEquals(5d, result);
    }
    @Test
    public void testSub(){
        Operator subject = new MinusOperator();
        double result = subject.operate(new Expression(2d), new Expression(3d));

        assertEquals(-1d, result);
    }
}
