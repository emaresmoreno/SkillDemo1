import static org.junit.Assert.*;
import org.junit.*;

public class DemoRedoTest{
    @Test
    public void test(){
        assertEquals("We expect 4 to be divided by 2", 
        2, DemoRedo.divide(4,2));

    }
    
}