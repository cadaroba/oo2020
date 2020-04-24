public class Proov1{
    public static void main(String[] arg){
        Jook jook1=new Jook("morss", 1.5, 0.3);
        Joogipudel pudel1=new Joogipudel(1000, 1, 0.5, 0.1, jook1);
        System.out.println(jook1.toString());
        System.out.println(pudel1.toString());
        System.out.println(pudel1.kysiMass());
        System.out.println(pudel1.kysiOmahind());
    }
}