import java.util.Scanner;

public class Principal_PrimeiroPrograma{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Digite um número:");
        num = input.nextInt();

        boolean teste;

        if(num%2==0){
            teste =  true;
        }else{
            teste =  false;
        }

        if(teste == true){
            System.out.printf("%d eh par \n",num);
        }else{
            System.out.printf("%d eh impar \n",num);
        }
    }
}