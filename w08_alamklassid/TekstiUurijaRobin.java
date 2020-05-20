public class TekstiUurijaRobin implements TekstiUurija{
	// public int t2htedeArv(String s){
	// 	return s.length();
	// }
	public int loenda(String s, char c){
	 	int loendaja=0;
	 	for(char abi: s.toCharArray()){
	 		if(abi==c){loendaja++;}
	 	}
	 	return loendaja;
	}
}