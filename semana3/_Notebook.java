import java.util.Scanner;

public class _Notebook{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int i =10;
        float memoria;
        float tamanhoTela;
        String nome;
        float preco;

        System.out.printf("Digite o nome do computador: ");
        nome = input.next();
        System.out.printf("\nDigite o preco: ");
        preco = input.nextFloat();
        System.out.printf("\nDigite a memoria: ");
        memoria = input.nextFloat();
        System.out.printf("Digite o tamanho da tela: ");
        tamanhoTela = input.nextFloat();

        while(i!=0){
            System.out.printf("\n1 - Construtor completo \n2 - Construtor -> nome e memoria\n3 - Construtor -> nome e preco\n4 - Construtor -> memoria e tamanhoTela\n5 - Construtor -> preco\n0 - Sair");
            System.out.printf("\n\nDigite uma opcao: ");
            i = input.nextInt();
            if(i==0){
                i=0;
            }else if(i==1){
                Notebook completo = new Notebook(memoria,tamanhoTela,nome,preco);
                System.out.printf("\nNome:%s\nPreco:%f\nMemoria:%f\nTamanho da tela:%f\n",completo.nome,completo.preco,completo.memoria,completo.tamanhoTela);
            }else if(i==2){
                Notebook nomeMemoria = new Notebook(nome,memoria);
                System.out.printf("\nNome:%s\nPreco:%f\nMemoria:%f\nTamanho da tela:%f\n",nomeMemoria.nome,nomeMemoria.preco,nomeMemoria.memoria,nomeMemoria.tamanhoTela);
            }else if(i==3){
                Notebook nomePreco = new Notebook(nome,preco);
                System.out.printf("\nNome:%s\nPreco:%f\nMemoria:%f\nTamanho da tela:%f\n",nomePreco.nome,nomePreco.preco,nomePreco.memoria,nomePreco.tamanhoTela);
            }else if(i==4){
                Notebook memoriaTamanho = new Notebook(memoria,nome,tamanhoTela);
                System.out.printf("\nNome:%s\nPreco:%f\nMemoria:%f\nTamanho da tela:%f\n",memoriaTamanho.nome,memoriaTamanho.preco,memoriaTamanho.memoria,memoriaTamanho.tamanhoTela);
            }else if(i==5){
                Notebook ult = new Notebook(preco);
                System.out.printf("\nNome:%s\nPreco:%f\nMemoria:%f\nTamanho da tela:%f",ult.nome,ult.preco,ult.memoria,ult.tamanhoTela);
            }else if(i<0||i>5){
                System.out.printf("\n\n%d eh uma opcao invalida!!!\n\nDigite uma opcao valida\n\n ",i);
            }
        }
    }
}