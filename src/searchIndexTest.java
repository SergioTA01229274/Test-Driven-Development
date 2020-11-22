package TestApp;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;

public class searchIndexTest {
    private LinkedList<Integer> tmp = new LinkedList<>();

    @Test
    public void getSingleIndex(){
        this.tmp.clear();
        this.tmp.add(10);
        assertTrue(this.tmp.indexOf(10) == 0);
    }
    @Test
    public void getEmptyIndex(){
        this.tmp.clear();
        assertTrue(this.tmp.indexOf(12) == -1);
    }
    @Test
    public void getIndexAfterRemmoval(){
        this.tmp.clear();
        this.tmp.add(10);
        this.tmp.pop();
        assertTrue(this.tmp.indexOf(10) == -1);
    }
}
