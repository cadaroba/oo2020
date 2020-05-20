public class ViljaHoidla implements Hoidla{
	int laosKokku=0;
	public void lisa(int kogus){
		laosKokku+=kogus;
	}
	public int kysi(){
		return laosKokku;
	}
}