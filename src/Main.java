import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     //variaveis
        double[] temperatura = new double[7];
        double soma = 0, media = 0;
        int dias_acima = 0, dias_abaixo = 0;

        Scanner temp = new Scanner(System.in);

        for(int i = 0; i < temperatura.length; i++) {
            System.out.println("Digite a temperatura do " + (i +1) + "º dia: ");
            temperatura[i] = temp.nextDouble();
            soma = soma + temperatura[i];
        }
        media = soma / temperatura.length;
        for(int i = 0; i < temperatura.length; i++) {
            if(temperatura[i] > media){
                dias_acima++;
            }
            if(temperatura[i] < media){
                dias_abaixo++;
            }

        }
        System.out.println("A media da temperatura é: " + media);
        System.out.println("Qtde de dias com a temperatura acima da media: " + dias_acima);
        System.out.println("Qtde de dias com a temperatura abaixo da media: " + dias_abaixo);
    }
}