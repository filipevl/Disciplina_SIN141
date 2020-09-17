import java.util.Scanner;

public class Calculadora {
    Scanner input = new Scanner(System.in);

    public void dividir(){
        float d1,d2;
        System.out.printf("Digite o dividendo: ");
        d1 = input.nextFloat();
        System.out.printf("\nDigite o divisor: ");
        d2 = input.nextFloat();
        System.out.printf("Resultado: %f",d1/d2);
    }

    public void seno(){
        int seno;
        System.out.printf("\nDigite o angulo: ");
        seno = input.nextInt();
        System.out.printf("\nSeno: %f",Math.sin(seno));
    }

    public void cosseno(){
        int cosseno;
        System.out.printf("\nDigite o angulo: ");
        cosseno = input.nextInt();
        System.out.printf("\nCosseno: %f\n\n",Math.cos(cosseno));
    }
}