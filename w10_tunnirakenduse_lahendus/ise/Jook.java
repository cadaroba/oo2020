public class Jook{
    String nimetus;
    double liitriHind;
    double erikaal;

    public Jook (String uusNimetus, double uusLiitriHind, double uusErikaal){
        nimetus=uusNimetus;
        liitriHind=uusLiitriHind;
        erikaal=uusErikaal;
    }

    public String toString(){
        return nimetus + " " +  liitriHind + " " + erikaal;
    }

    public String kysiNimetus(){return nimetus;}
    public double kysiOmahind(){return liitriHind;}
    public double kysiErikaal(){return erikaal;}
}