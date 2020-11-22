package TestApp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;

public class checkTest {
    private LinkedList<Integer> tmp = new LinkedList<>();
    
    @Test
    public void emptyCheckingTest(){
        this.tmp.clear();
        assertFalse(this.tmp.contains(14));
    }
    
    @Test
    public void singleCheckingTest(){
        this.tmp.clear();
        this.tmp.add(14);
        assertTrue(this.tmp.contains(14));
    }
    
    @Test
    public void multipleCheckingTest(){
        this.tmp.clear();
        this.tmp.add(14);
        this.tmp.add(13);
        this.tmp.add(10);

        assertTrue(this.tmp.contains(14));
        assertTrue(this.tmp.contains(13));
        assertTrue(this.tmp.contains(10));

    }
    
}
