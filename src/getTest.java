package TestApp;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;

public class getTest{
    private LinkedList<Integer> tmp = new LinkedList<>();

    @Test
    public void getSingleValue(){
        this.tmp.clear();
        this.tmp.add(10);
        assertTrue(this.tmp.get(0) == 10);
    }

    @Test
    public void getSingleValueIncorrectly(){
        this.tmp.clear();
        this.tmp.add(12);
        assertFalse(this.tmp.get(0) == 10);
    }

    @Test
    public void getSingleMiddleValue(){
        this.tmp.clear();
        this.tmp.add(10);
        this.tmp.add(11);
        this.tmp.add(12);
        this.tmp.add(13);
        assertTrue(this.tmp.get(1) == 11);
        this.tmp.remove(1);
        assertTrue(this.tmp.get(1) == 12);
    }
}
