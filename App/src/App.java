import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        double menor = 0;
        double maior = 0;
        int homem = 0; 
        int mulher = 0;
        double alturaHomem = 0;

        for(int i = 0; i <= 10; i++){
            Scanner entrada = new Scanner(System.in);

            System.out.println("Informe a altura dessa pessoa!");
            double altura = entrada.nextDouble();

            System.out.println("Informe se essa pessoa é homem ou mulher, digite 1 para homem e 2 para mulher");
            int tipoPessoa = entrada.nextInt();

            if(tipoPessoa == 1){
                homem ++;
                alturaHomem += altura;
            } 
            else if(tipoPessoa == 2){
                mulher ++;
            }

            if(menor == 0){
                menor = altura;
            }
            else if(altura > maior){
                maior = altura;
            } 
            else if(altura < menor){
                menor = altura;
            }
        }
        System.out.println("A maior altura foi de: " + maior + ". E a menor altura foi de: " + menor);
        System.out.println("A media de altura dos homens é de: " + (alturaHomem / homem));
        System.out.println("A quantidade de mulheres é de: " + mulher);
    }
}