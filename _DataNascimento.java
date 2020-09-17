import java.util.Scanner;

public class _DataNascimento{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        DataNascimento objeto = new DataNascimento();
        int i = 3;
        while(i!=0){
            System.out.printf("\n1 - Registrar data de nascimento\n2 - Ler data registrada\n0 - Sair do programa");
            System.out.printf("\n\nDigite uma opcao: ");
            i = input.nextInt();
            if(i==0){
                i=0;
            }else if(i==1){
                objeto.ler();
                System.out.printf("\n\nData Registrada com sucesso!");
            }else if(i==2){
                objeto.exibir();
            }
        }
    }
}