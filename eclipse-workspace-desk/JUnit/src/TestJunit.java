import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import java.util.regex.*;


public class TestJunit {
   @Test
		
   public void testAdd() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }
}

