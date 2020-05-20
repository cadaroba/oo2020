public class Proov1{
    public static void main(String[] arg){
        Kilpkonnatyyp1 hallloom=new Kilpkonnatyyp1(2, 1, "põhi");
        Kilpkonnatyyp1 kollaneloom=new Kilpkonnatyyp1(2, 3, "ida");
        hallloom.edasi();
        kollaneloom.paremale();
        System.out.println(hallloom.kysiX());
        System.out.println(kollaneloom);
    }
}