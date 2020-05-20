public class Ala{
    public double xmin, ymin, xmax, ymax;
    public Ala(Vektor2D koht1, Vektor2D koht2){
        xmin=Math.min(koht1.KysiX(), koht2.KysiX());
        xmax=Math.max(koht1.KysiX(), koht2.KysiX());
        ymin=Math.min(koht1.KysiY(), koht2.KysiY());
        ymax=Math.max(koht1.KysiY(), koht2.KysiY());
    }
    //koosta funktsioon mis tagastab kas etteantud asukoht in ala sees
    public boolean kasSees(Vektor2D koht){
       if(koht.KysiX()<xmin){return false;}
       if(koht.KysiX()>xmax){return false;}
       if(koht.KysiY()<xmin){return false;}
       if(koht.KysiY()>xmax){return false;}
       return true;
    }
        
    public String toString(){
        return xmin+","+xmax+"-"+ymin+","+ymax;
    }

}