import java.util.Scanner;

public class _Vetor{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int[] valores = new int[7];

        for(int i=0;i <7 ; i++){
            valores[i]= input.nextInt();
        }

        for(int i=0;i<7;i++){
            System.out.printf("\n%d",valores[i]);
        }

    }
}
