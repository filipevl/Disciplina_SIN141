public class ImovelNovo extends Imovel{
    public ImovelNovo(Endereco endereco,float precoImovel){
        this.endereco=endereco;
        this.precoImovel=precoImovel;
    }
    private Endereco endereco;
    private precoImovel;
    public float calcularValorImovel(float inicial){
        return inicial/2*1/4;
    }
}