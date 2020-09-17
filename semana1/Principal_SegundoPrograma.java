import java.util.Scanner;
public class Principal_SegundoPrograma{

    public static void main(String args[]){

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.ler();
        a2.ler();
        a3.ler();

        if(a1.nota>a2.nota&&a1.nota>a3.nota){
            System.out.printf("\n\n%s teve a maior nota!\n\n",a1.nome);
        }else if(a2.nota>a1.nota&&a2.nota>a3.nota){
            System.out.printf("\n\n%s teve a maior nota!\n\n",a2.nome);
        }else if(a3.nota>a1.nota&&a3.nota>a1.nota){
            System.out.printf("\n\n%s teve a maior nota!\n\n",a3.nome);
        }
    }
}