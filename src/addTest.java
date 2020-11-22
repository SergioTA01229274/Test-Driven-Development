package TestApp;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;

public class addTest {
    private LinkedList<Integer> tmp = new LinkedList<>();

    @Test
    public void singleAdditionTest(){
        this.tmp.clear();
        this.tmp.add(1);
        assertTrue(this.tmp.size() == 1);
    }

    @Test
    public void multipleAdditionTest(){
        this.tmp.clear();
        for (int i = 0; i < 10; i++) {
            this.tmp.add(i);
        }
        assertTrue(this.tmp.size() == 10);
    }
    
    @Test
    public void addtionAfterRemovingTest(){
        this.tmp.clear();
        for (int i = 0; i < 10; i++) {
            this.tmp.add(i);
            this.tmp.pop();
        }
        this.tmp.add(0);
        assertTrue(this.tmp.size() > 0);
    }
    
}
