public class arvutus{
	public static void main (String[] arg){
		int arv=Integer.parseInt(arg[0]);
		int arv2=Integer.parseInt(arg[1]);
		for(int i=1; i<=arv; i++){
			for(int j=0; j<=arv2; j++){
				int v=i*j;
				if(v<10){System.out.print(" ");}
				System.out.print(" "+v);
			}
			System.out.println();
		}
	}
}