import static org.junit.Assert.*;

import org.junit.Test;

import info.sjd.Line;

public class LineTest {

	@Test
    public void test1() {
      String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
      int n = 1;  
      new Line();
      assertEquals("Sheldon", Line.WhoIsNext(names, n));
    }
   @Test
    public void test2() {
      String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
      int n = 17;  
      new Line();
	assertEquals("Leonard", Line.WhoIsNext(names, n));
    }

}
