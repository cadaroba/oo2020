public class Proov2{
    public static void main(String[] arg){
        Jook jook1=new Jook("piim", 0.28, 1.05);
        Joogipudel pudel1=new Joogipudel(jook1, 0.5, 0.2, 0.1, 0);
        System.out.println(pudel1);
        System.out.println(pudel1.kysiMass());
        System.out.println(pudel1.kysiOmahind());
        Joogipudel pudel2=new Joogipudel(null, 0.5, 0.05, 0.1, 1);
        System.out.println(pudel2);
        System.out.println(pudel2.kysiMass());
        System.out.println(pudel2.kysiOmahind());
    }
}