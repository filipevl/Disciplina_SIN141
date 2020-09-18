public class Notebook {
    float memoria;
    float tamanhoTela;
    String nome;
    float preco;

    public Notebook(float mem,float tam,String name,float pre){
        this.memoria = mem;
        this.tamanhoTela = tam;
        this.nome = name;
        this.preco = pre;
    }
    public Notebook(String name, float mem){
        this.memoria = mem;
        this.nome = name;
    }
    public Notebook(float pre,String name){
        this.nome = nome;
        this.preco = pre;
    }
    public Notebook(float mem,String name,float tam){
        this.memoria = mem;
        this.tamanhoTela = tam;
    }
    public Notebook(float pre){
        this.preco = pre;
    }
}