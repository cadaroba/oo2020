import org.junit.*;
import static org.junit.Assert.*;



public class kTestid1{
  Kliides k;

  @Test
  public void edasi1(){
	  k = new Kilpkonnatyyp2();
      k.tyyp(2,1,"ida");
      k.edasi();
      k.edasi();
	  assertEquals(4, k.kysiX());
  } 

  /*@Test
  public void algusesTyhi(){
	  h=new ViljaHoidla();
      assertEquals(0, h.kysi());  
  } */
}