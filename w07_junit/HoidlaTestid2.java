import org.junit.*;
import static org.junit.Assert.*;
public class HoidlaTestid2{
  Hoidla h;

  @Before
  public void alustaTesti(){
	  h=new M2lugaHoidla();	  
  }

  @Test
  public void lisamine1(){
	  h.lisa(3);
	  h.lisa(4);
	  assertEquals(7, h.kysi());
  } 

  @Test
  public void algusesTyhi(){
      assertEquals(0, h.kysi());	  
  }  
  /*
  @After
  public void testiLopetus(){
	  System.out.println(h);
  }*/
}