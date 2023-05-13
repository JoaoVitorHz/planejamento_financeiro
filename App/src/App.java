import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
            Scanner entrada = new Scanner(System.in);

            System.out.println("Informe uma temperatura em celsius");
            double temperatura = entrada.nextDouble();

            System.out.println("Kelvim = " + (temperatura + 273.15));
            System.out.println("Réaumur  = " + (temperatura * 0.8));
            System.out.println("Rankine  = " + (temperatura  * 1.8));
            System.out.println("Fahrenheit   = " + (temperatura  * 1.8 + 32));
    }
}