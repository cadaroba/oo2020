public class Proov1{
	public static void main(String[] arg){
		Arvutatav a=new RingiPindala();
		System.out.println(a.f(2));

		Arvutatav b=new RuuduPindala();
		System.out.println(b.f(5));
	}
}

/*
[jaagup@greeny 06_liidesed]$ java Proov1
12.566370614359172
*/