//import java.util.Scanner;

public class Kaivitaja1{
	public static void main(String[] arg) throws Exception{
		TekstiUurija t=(TekstiUurija)Class.forName("TekstiUurijaRobin").newInstance();
		System.out.println("sõnas pere on (e) tähti: ");
		System.out.println(t.loenda("pere", 'e'));
		System.out.println("sõnas pere on (a) tähti: ");
		System.out.println(t.loenda("pere", 'a'));
		System.out.println("sõnas pere on (p) tähti: ");
		System.out.println(t.loenda("pere", 'p'));
		
	}
}