import java.util.Scanner;

public class DataNascimento{
    Scanner input = new Scanner(System.in);

    String data;

    public void ler(){
        System.out.printf("Digite sua data de nascimento: ");
        data = input.next();
    }

    public void exibir(){
        System.out.printf("Sua data de nascimento: %s",data);
    }
}