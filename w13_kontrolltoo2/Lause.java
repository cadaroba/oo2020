import java.util.Scanner;

public class Lause{
	public static void main(String[] arg) throws Exception{
        Scanner lause = new Scanner(System.in);
        System.out.println("KIRJUTA LAUSE: ");
        String laused=lause.nextLine();
        String[] loenda_sonad=laused.split(" ");
        System.out.println("LAUSES ON SÕNU: "+ loenda_sonad.length);
    }
}