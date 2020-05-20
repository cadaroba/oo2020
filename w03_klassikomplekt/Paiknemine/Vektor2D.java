public class Vektor2D{
    double x, y;
    public Vektor2D(double ux, double uy){
        x=ux; y=uy; //saan need väärtused välja küsida kui vaja
    }
    public double KysiX() {return x;}
    public double KysiY() {return y;}
    public Vektor2D liida(Vektor2D liidetav){
        return new Vektor2D(this.KysiX()+liidetav.KysiX(), this.KysiY()+liidetav.KysiY());
    }
    //Lisa käsklus, mis saab parameetriks arvu
    //ning tagastab arvu ja vektori korrutuse
    public String toString() {return x+" "+y;}//teeb stringiks
    
    public Vektor2D korruta(double tegur){
        return new Vektor2D(x*tegur, y*tegur);
    }
}

