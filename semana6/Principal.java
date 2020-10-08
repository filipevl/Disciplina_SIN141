import java.util.Random;
public class Principal{
    public static void main(String args[]){
        // FuncionarioHorista[] f1 = new FuncionarioHorista("Filipe","Er06310",10,44);
        // FuncionarioMensalista[] f2 = new FuncionarioMensalista("Larissa","Er05290",1100);
        // f1.consulta();
        // f2.consulta();

        FuncionarioHorista[] f1 = new FuncionarioHorista[150];
        FuncionarioMensalista[] f2 = new FuncionarioMensalista[150];
        for(int i=0;i<f1.length;i++){
            System.out.printf()
            f1[i] = new FuncionarioHorista("Filipe","Er06310",10,44);
        }
        for(int i=0;i<f2.length;i++){
            f2[i] = new FuncionarioMensalista("Larissa","Er05290",1100);
        }
        for(int i=0;i<f1.length;i++){
            f1[i].consulta();
        }
        for(int i=0;i<f2.length;i++){
            f2[i].consulta();
        }
    }
}