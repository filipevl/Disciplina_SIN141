public class ImovelVelho extends Imovel{
    public ImovelVelho(Endereco endereco,float precoImovel){
        this.endereco=endereco;
        this.precoImovel=precoImovel;
    }
    private Endereco endereco;
    private precoImovel;
    public float calcularValorImovel(float inicial){
        return inicial/3*2/3;
    }
}