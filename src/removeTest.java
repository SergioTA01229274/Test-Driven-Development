package TestApp;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;


public class removeTest {
    private LinkedList<Integer> tmp = new LinkedList<>();

    @Test
    public void removeFirstTest(){
        this.tmp.add(10);
        this.tmp.remove(0);
        assertFalse(this.tmp.contains(10));
    }

    @Test
    public void removeLastTest(){
        this.tmp.add(10);
        this.tmp.add(20);
    
        this.tmp.remove(this.tmp.size() - 1);
        assertFalse(this.tmp.contains(20));
        assertTrue(this.tmp.size() == 1);
    }
    
    @Test
    public void removeMiddleTest(){
        this.tmp.add(10);
        this.tmp.add(20);
        this.tmp.add(30);
        this.tmp.remove(1);
        assertFalse(this.tmp.contains(20));
    }
    
}
