public class Funcionario{
    public Funcionario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    protected String nome;
    protected String matricula;

    public String getNome(){
        return this.nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public float calcularSalarioFinal(){
        return 0;
    }

    public void consulta(){
        System.out.printf("\nNome: %s - Matrícula: %s",this.nome,this.matricula);
    }
}