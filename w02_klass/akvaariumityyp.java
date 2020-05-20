//*koosta klass ristkülikukujulise akvaariumi tarbeks. Väljadeks pikkus, laius ja kõrgus (cm)
//ning sees oleva veehulk (ml)
//*loo käsklus küsimaks, mitme cm-ine kiht vett on akvaariumis
//*loo käsklus akvaariumi etteantud milliliitrite jagu vee lisamiseks, katseta selle tööd
//*kui lisatav vee kogus ületab akvaariiumi mahtu siis antakse hoiatus
//*kood kahes failis - ühes akvaariium ning teises proovikäsud
//*koosta peaprogramm mitme akvaariumiga
//*koosta akvaariumidest massiiv
//*loo funktsioon arvutamaks mitu liitrit vett on akvaariumimassiivis kokku

public class akvaariumityyp{
   double x, y, z, vesi;
    public akvaariumityyp (double ux, double uy, double uz, double uvesi){
            x=ux;
            y=uy;
            z=uz;
    }
    public double veesambaKõrgus(){
        return vesi/(x*y);
    }
    public void lisaVett(double cm3){
        vesi=vesi+cm3;
    }
}