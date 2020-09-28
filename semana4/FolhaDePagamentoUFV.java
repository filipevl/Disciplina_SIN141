public class FolhaDePagamentoUFV{
    private FuncionarioUFV funcionario;

    private int mes,ano;
    private float totalDeVencimentos;

    public FolhaDePagamentoUFV(){

    }
    public FolhaDePagamentoUFV(int mes, int ano, float totalDeVencimentos, FuncionarioUFV funcionario){
        this.mes = mes;
        this.ano = ano;
        this.totalDeVencimentos = totalDeVencimentos;
        this.funcionario = funcionario;
    }

    public FuncionarioUFV getFuncionario(){
        return this.funcionario;
    }
    public void setFuncionario(FuncionarioUFV funcionario){
        this.funcionario = funcionario;
    }
    public int getMes(){
        return this.mes;
    }
    public float getAno(){
        return this.ano;
    }
    public float getTotalDeVencimentos(){
        return this.totalDeVencimentos;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setTotalDeVencimentos(float totalDeVencimentos){
        this.totalDeVencimentos = totalDeVencimentos;
    }

    public void imprimir(){
        System.out.printf("\n%s - %s - %s\nData de nascimento: %d/%d/%d \nData de admissão:%d/%d\nTotal de vencimentos:%f\n",getFuncionario().getNome(),getFuncionario().getMatricula(),getFuncionario().getCargo(),getFuncionario().getData().getDia(),getFuncionario().getData().getMes(),getFuncionario().getData().getAno(),getMes(),getAno(),getTotalDeVencimentos());
    }
}