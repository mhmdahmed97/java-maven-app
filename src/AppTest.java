import com.example.Application;
import org.junit.Test;
import sttaic org.junit.Assert.*;

public class AppTest {

  @Test
  public void testApp() {
    Application myApp = new Applicaiton();
    
    String result = myApp.getStatus();
    
    assertEquals("OK",result);
  }
}
