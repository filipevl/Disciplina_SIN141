import java.util.Scanner;

public class Principal{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        FolhaDePagamentoUFV[] objeto = new FolhaDePagamentoUFV[3];
        int i = 3;

        while(i!=0){
            System.out.printf("\n1 - Registrar \n2 - Imprimir\n0 - Sair do programa");
            System.out.printf("\n\nDigite uma opcao: ");
            i = input.nextInt();
            if(i==0){
                i=0;
            }else if(i==1){
                for(int y=0;y<objeto.length;y++){
                    int dia,mes,ano,m,a;
                    float salario;
                    String nome,matricula,cargo;
                    FuncionarioUFV funcionario;
                    Data data;

                    System.out.printf("\n\nDigite o nome do %d servidor: ",y+1);
                    nome = input.next();input.nextLine();

                    System.out.printf("\nDigite a matricula do %d servidor: ",y+1);
                    matricula = input.next();input.nextLine();

                    System.out.printf("\nDigite o cargo do %d servidor: ",y+1);
                    cargo = input.next();input.nextLine();

                    System.out.printf("\nDigite o dia de nascimento do %d servidor: ",y+1);
                    dia = input.nextInt();input.nextLine();

                    System.out.printf("\nDigite o mês de nascimento do %d servidor: ",y+1);
                    mes = input.nextInt();input.nextLine();

                    System.out.printf("\nDigite o ano de nascimento do %d servidor: ",y+1);
                    ano = input.nextInt();input.nextLine();

                    System.out.printf("\nDigite o mês de admissão do %d servidor: ",y+1);
                    m = input.nextInt();input.nextLine();

                    System.out.printf("\nDigite o ano de admissão do %d servidor: ",y+1);
                    a = input.nextInt();input.nextLine();

                    System.out.printf("\nDigite o totalDeVencimentos do %d servidor: ",y+1);
                    salario = input.nextFloat();input.nextLine();

                    data = new Data(dia,mes,ano);
                    funcionario = new FuncionarioUFV(nome,matricula,cargo,data);
                    objeto[i] = new FolhaDePagamentoUFV(m,a,salario,funcionario);
                }
                System.out.printf("\n\nRegistro com sucesso!");
            }else if(i==2){
                for(int y=0;y<objeto.length;y++){
                    objeto[i].imprimir();
                }
            }
        }
    }
}