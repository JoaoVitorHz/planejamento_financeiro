import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double soma = 0;
        int qtdFuncionarios = 0;

        while(true){
            double resposta = exibirMsg();
            if(resposta == -1)
                break;

            soma += resposta;
            qtdFuncionarios++;
        }
        System.out.println("A media salarial é de: " + media(soma, qtdFuncionarios));
    }

    public static double exibirMsg(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o salario! Caso queira sair digite -1");
        double teste = entrada.nextDouble();
        entrada.close();
        
        return teste;
    }

    public static double media(double valor, double funcionarios){
        return valor / funcionarios;
    }
}