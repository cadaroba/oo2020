import java.util.Scanner;
class Absoluutvaartus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        System.out.printf("%n");
        System.out.println("Esimene väärtus: ");
        a = in.nextDouble();

        System.out.println("Teine väärtus: ");
        b = in.nextDouble();
        System.out.printf("%n");
        
        
        double value = a - b;

        //Kui negatiivne siis teeme positiivne

        value = (value < 0) ? -value : value;
            System.out.println("|"+a + "-" + b +"|" + " = " + value);
            //System.out.println("|"+b + "-" + a +"|" + " = " + value);

        //System.out.println(Math.max(a, b));
        //System.out.println(Math.min(a, b));
        //System.out.println(a-b);
        System.out.printf("%n");
        
        //PAREM VERSIOON
        if(a>b){

            System.out.printf("%7.0f\n", a);
            System.out.printf("%7.0f\n", b);
            System.out.printf("%7.0f\n", value);
        } else {
            System.out.printf("%7.0f\n", b);
            System.out.printf("%7.0f\n", a);
            System.out.printf("%7.0f\n", value);
        }

        //ESIALGNE VERSIOON
        //Double[] numbers = new Double[]{a, -b, a-b};

        //for (Double number : numbers) {
        //System.out.printf("%7.0f\n", number);
        //}

    }
}