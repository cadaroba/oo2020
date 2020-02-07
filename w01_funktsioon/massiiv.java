public class massiiv{
	public static void main(String[] arg){
		String[] eesnimed={"Juku", "Kati", "Margus"};
		System.out.println(eesnimed[eesnimed.length-1]);
		for(int i=0; i<eesnimed.length; i++){
			System.out.println(eesnimed[i].substring(0, 2)+" "+eesnimed[i].substring(eesnimed[i].length()-1, eesnimed[i].length()));
			//kuvage iga eesnime viimane täht
			
			
		}
	}
}