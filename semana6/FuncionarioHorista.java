public class FuncionarioHorista extends Funcionario{
    public FuncionarioHorista(String nome, String matricula,float valorHora,float horasTrabalhadas){
        super(nome,matricula);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    private float valorHora;
    private float horasTrabalhadas;

    public float setValorHora(float valorHora){
        return this.valorHora;
    }
    public float setHorasTrabalhadas(float horasTrabalhadas){
        return this.valorHora;
    }
    public void getValorHora(float valorHora){
        this.valorHora = valorHora;
    }
    public void getHorasTrabalhadas(float horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float calcularSalarioFinal(float valorHora,float horasTrabalhadas){
        float total = valorHora*horasTrabalhadas;
        return total;
    }

    public void consulta(){
        super.consulta();
        System.out.printf("\nSalário Mensal: %f",calcularSalarioFinal(this.valorHora,this.horasTrabalhadas));
    }
}