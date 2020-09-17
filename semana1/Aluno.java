import java.util.Scanner;

public class Aluno{
    String nome;
    float nota;

    public void ler(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite seu nome: ");
        this.nome = input.next();
        System.out.print("\nDigite sua nota: ");
        this.nota = input.nextFloat();
    }
}