//public class Abifunktsioonid{
//	public static double geomKeskmine(double[] arvud){		
//		double abi=1;
//		for(double a: arvud){abi*=a;}
//		return Math.pow(abi, 1.0/arvud.length);
//	}
//}

public class Abifunktsioonid{
    public static double geomKeskmine(double[] arvud){		
        double abi = arvud[0];
        for(int i = 1; i < arvud.length; i++){
            abi*=arvud[i];}
        return Math.pow(abi, 1.0/arvud.length);
    }
}