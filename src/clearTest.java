package TestApp;
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class clearTest {
    private LinkedList<Integer> tmp = new LinkedList<>();

    @Test
    public void emptyClearTest(){
        tmp.clear();
        assertEquals(0, this.tmp.size());
    }
    @Test
    public void addingClearTest(){
        for(int i = 0; i < 4; i++){
            this.tmp.add(i);
        }
        tmp.clear();
        assertEquals(0, this.tmp.size());
    }
}
