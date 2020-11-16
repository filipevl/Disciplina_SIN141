public class Main{
    public static void main(String []args){
        Imovel imoveis[] = new Imovel[200];
        for(int i=0;i<200;i++){
            if(i%2==0){
                imoveis[i]=new ImovelNovo();
            }else{
                imoveis[i]=new ImovelVelho();
            }
        }
        for(int i=0;i<200;i++){
            imoveis[i].calcularValorImovel();
        }
    }
}