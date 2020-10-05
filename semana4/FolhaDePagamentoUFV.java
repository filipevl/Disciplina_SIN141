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
    public int getAno(){
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
        String nome,cargo,matricula;
        int dia,mes,ano,m,a;
        float totalDeVencimentos;
        nome = getFuncionario().getNome();
        matricula = getFuncionario().getMatricula();
        cargo = getFuncionario().getCargo();
        dia = getFuncionario().getData().getDia();
        mes = getFuncionario().getData().getMes();
        ano = getFuncionario().getData().getAno();
        m = getMes();
        a = getAno();
        totalDeVencimentos = getTotalDeVencimentos();
        System.out.printf("\n%s - %s - %s\nData de nascimento: %d/%d/%d \nData de admissão:%d/%d\nTotal de vencimentos:%f\n",nome,cargo,matricula,dia,mes,ano,m,a,totalDeVencimentos);
    }
}