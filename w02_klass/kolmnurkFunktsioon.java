public class kolmnurkFunktsioon {

    public static void ruutJoonis(){
        for(int i=0;i<5;i++)	//või teha 2 for loopinga  
        System.out.println(" * * * * * ");
    }

    public static void kolmnurkPool(){
        for (int i = 0; i<5; i++){
            for (int j=0; j<=i; j++){//kui j tuleb suurem kui i siis ei prindi
                System.out.print(" *");
            }
            System.out.println();//sellega läheb uuele reale
        }
    }

    public static void kolmnurkJoonis() {
        for (int i = 0; i<5; i++) {//iga kord liidetakse +1 rida kuni 5
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");//nihutab poolikut kormnurka tühikutega paremale, kui see ära võtta tueb poolik kolmnurk
            }
            for (int k = 0; k<=i; k++) {
                System.out.print("* ");// või System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}