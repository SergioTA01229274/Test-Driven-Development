package TestApp;

import static org.junit.Assert.assertEquals;
import java.util.LinkedList;

import org.junit.Test;

public class sizeTest 
{
    private LinkedList<Integer> tmp = new LinkedList<>();
    
    @Test
    public void GetSizeEmpty(){
        this.tmp.clear();
        assertEquals(0, this.tmp.size());
    }

    @Test
    public void GetSizeAdding(){
        this.tmp.clear();
        this.tmp.add(1);
        assertEquals(1, this.tmp.size());
        this.tmp.add(2);
        assertEquals(2, this.tmp.size());
    }

    @Test
    public void GetSizeRemoving(){
        this.tmp.clear();
        this.tmp.add(1);
        this.tmp.pop();
        assertEquals(0, this.tmp.size());
    }
}