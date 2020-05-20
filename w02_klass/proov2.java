public class proov2{
    public static double vettKokku(akvaarium[]akvaariumid){
        double summa = 0;
        for(int i=0; i<akvaariumid.length;i++){
            summa+=akvaariumid[i].veeKogus();
        }
        return summa;
    }
    public static void main(String[] arg){
        akvaariumityyp tyyp1=new akvaariumityyp(200, 120, 80, 200);
        akvaariumityyp tyyp2=new akvaariumityyp(150, 150, 50, 400);
        System.out.println(tyyp1.veesambaKõrgus());
        tyyp1.lisaVett(500);
        System.out.println(tyyp2.veesambaKõrgus());
        akvaariumityyp[] ad=new akvaariumityyp[2];
        ad[0]=tyyp1;
        ad[1]=tyyp2;
        System.out.print("Vett kokku " + vettKokku(ad));
    }
}