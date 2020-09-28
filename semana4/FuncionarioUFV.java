public class FuncionarioUFV{
    private String nome, matricula,cargo;
    private Data data;

    public FuncionarioUFV(){

    }
    public FuncionarioUFV(String nome, String matricula, String cargo, Data data){
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.data = data;
    }

    public Data getData(){
        return this.data;
    }
    public String getNome(){
        return this.nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getCargo(){
        return this.cargo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setData(Data data){
        this.data = data;
    }
}