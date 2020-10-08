public class FuncionarioMensalista extends Funcionario{
    public FuncionarioMensalista(String nome, String matricula,float salarioMensal){
        super(nome,matricula);
        this.salarioMensal = salarioMensal;
    }
    private float salarioMensal;

    public float getSalarioMensal(){
        return this.salarioMensal;
    }
    public void setSalarioMensal(float SalarioMensal){
        this.salarioMensal = salarioMensal;
    }

    public float calcularSalarioFinal(float salarioMensal){
        return salarioMensal;
    }

    public void consulta(){
        super.consulta();
        System.out.printf("\nSalário Mensal: %f",this.salarioMensal);
    }
}