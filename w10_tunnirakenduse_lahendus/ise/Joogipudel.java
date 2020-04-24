public class Joogipudel{
    Jook sisu;
    double maht;
    int pudeliTyyp; //0 klaas 1 - plast
    double mass;
    double taaraHind;
    Jook pudeliSisu;
    public Joogipudel (double uusMaht, int uusPudeliTyyp, double uusMass, double uusTaaraHind, Jook uusPudeliSisu){
        sisu=usisu;
        maht=uusMaht;
        pudeliTyyp=uusPudeliTyyp;
        mass=uusMass;
        taaraHind=uusTaaraHind;
        pudeliSisu=uusPudeliSisu;
    }

    public String toString(){
        return maht + "ml" +  pudeliTyyp + "0=klaas 1=plast " + mass + "kg " + taaraHind + "eur " + pudeliSisu;
    }

    public double kysiMass(){
        if(pudeliSisu==null){return mass;}
        return mass+maht*pudeliSisu.kysiErikaal();
    }

    public double kysiOmahind(){
        if(pudeliSisu==null){return taaraHind;}
        return taaraHind+maht*pudeliSisu.kysiOmahind();
    }
    
    public double kysiMaht(){return maht;}
    public Jook kysiSisu(){return sisu;}
    public void uusSisu(Jook j){sisu=j;}
}