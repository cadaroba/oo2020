import org.junit.*;
import static org.junit.Assert.*;

public class kTestid1{
  Kliides k;

    // @Test
    // public void edasi1(){
    //   k = new Kilpkonnatyyp2();
    //     k.tyyp(2,1,"ida");
    //     k.edasi();
    //     k.edasi();
    //   assertEquals(4, k.kysiX());

    @Test
    public void edasi2(){
      k = new Kilpkonnatyyp3();
        int koordinaadid2[][] = {{2,1}};
        k.tyyp1(koordinaadid2,"ida");
        k.edasi();
        k.edasi();
      assertEquals(4, k.kysiX());
  } 
}