public abstract class Imovel{
    protected Endereco endereco = new Endereco();
    protected float preco;
    public abstract float calcularValorImove(float inicial);
}