public class KaivitajaRobin{
	public static void main(String[] arg) throws Exception{
		TekstiUurija t=(TekstiUurija)Class.forName("TekstiUurijaRobin").newInstance();
		System.out.println(t.loenda("taishaalik", 'a'));
	}
}