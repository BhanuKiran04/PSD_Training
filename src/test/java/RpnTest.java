import org.junit.Assert;
import org.junit.Test;

public class RpnTest {

    @Test
    public void test1(){
        String exp ="2 2 +";
        Assert.assertEquals(4, new RpcCalc().compute(exp));
    }

    @Test
    public void test2(){
        String exp = "8 2 /";
        Assert.assertEquals(4, new RpcCalc().compute(exp));
    }

    @Test
    public void test3(){
        String exp = "2 10 ^";
        Assert.assertEquals(1024, new RpcCalc().compute(exp));
    }
}

