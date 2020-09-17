import java.util.Scanner;

public class _Calculadora{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Calculadora objeto = new Calculadora();
        int i =4;
        while(i!=0){
            System.out.printf("\n1 - Divir numero\n2 - Seno\n3 - Cosseno\n0 - Sair");
            System.out.printf("\n\nDigite uma opcao: ");
            i = input.nextInt();
            if(i==0){
                i=0;
            }else if(i==1){
                objeto.dividir();
            }else if(i==2){
                objeto.seno();
            }else if(i==3){
                objeto.cosseno();
            }else if(i<0||i>3){
                System.out.printf("\n\n%d eh uma opcao invalida!!!\n\nDigite uma opcao valida\n\n ",i);
            }
        }
    }
}