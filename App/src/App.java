import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Random r = new Random();
        int valor = r.nextInt(100) + 1;

        Scanner entrada = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){

            System.out.println("Qual foi o número sorteado pelo computador?");
            int valorUser = entrada.nextInt();

            if(valorUser == valor){
                System.out.println("Parabéns, você ganhou o jogo!");
                break;
            } 
            else {
                if(i == 5){
                    System.out.println("Game Over!");
                    break;
                }

                if((valorUser - 1) == valor || (valorUser + 1) == valor){
                    System.out.println("TÁ QUENTE!");
                } else {
                    if(valorUser < valor){
                        System.out.println("O número digitado é menor do que o número sorteado!");
                    } 
                    else{
                        System.out.println("O número digitado é maior do que o número sorteado!");
                    }
                }
            }
        }
    }
} 
