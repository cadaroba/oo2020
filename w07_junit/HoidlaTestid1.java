import org.junit.*;
import static org.junit.Assert.*;
public class HoidlaTestid1{
  Hoidla h;

  @Test
  public void lisamine1(){
	  h=new ViljaHoidla();
	  h.lisa(3);
	  h.lisa(4);
	  assertEquals(7, h.kysi());
  } 

  @Test
  public void algusesTyhi(){
	  h=new ViljaHoidla();
      assertEquals(0, h.kysi());	  
  }  
}