import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double metaAlcancada = 0;
        double contribuicaoMensal = 0;
        double taxaJuros = 0;

        System.out.println("Digite a meta a ser alcançada");
        metaAlcancada = input.nextInt();

        System.out.println("Digite a contribuição mensal");
        contribuicaoMensal = input.nextInt();

        System.out.println("Digite a taxa de juros");
        taxaJuros = input.nextInt();

        int anos = 0;

        for (double i = contribuicaoMensal; i < metaAlcancada; i += contribuicaoMensal) {

            double valorJuro = (taxaJuros * i) / 100;
            i = i + valorJuro;

            anos++;
        }
        System.out.println("falta " + anos + " anos");
    }
}