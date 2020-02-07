public class arvutus{
	public static void main (String[] arg){
		int arv=Integer.parseInt(arg[0]);
		int arv2=Integer.parseInt(arg[1]);
		for(int i=0; i<arv; i++){
			if(i<10){System.out.println(" ");}
			System.out.println(i+". tere");
		}
	}
}
	