import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
public class TekstiTestid{
	TekstiUurija t;
	TekstiUurija u;
	// @Test
	// public void pikkus(){
	// 	assertEquals(4, t.t2htedeArv("pere"));
	// }
	@Test
	public void loendamine1(){
	assertEquals(2, t.loenda("pere", 'e'));
	}
	@Test
	public void loendamine2(){
	assertEquals(1, t.loenda("pere", 'p'));
	}
	@Test
	public void loendamine3(){
	assertEquals(1, t.loenda("pere", 'a'));
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// public void looTervitavFail(){
	// 	try{
	// 		PrintWriter pw=new PrintWriter(new FileWriter("tervitus.txt"));
	// 		pw.println("tere tulemast");
	// 		pw.close();
	// 	} catch(Exception e){e.printStackTrace();}
	// }
	// @Test
	// public void sonadFailist(){
	// 	looTervitavFail();
	// 	t.loeFailist("tervitus.txt");
	// 	assertEquals(2, t.sonadeArv()); 
	// }
//}



