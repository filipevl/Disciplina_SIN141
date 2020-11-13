public class CartaoDiaDosNamorados extends CartaoWeb{
    public CartaoDiaDosNamorados(String destinatario){
        this.destinatario=destinatario;
    }
    private String destinatario;
    public String getDestinatario(){
        return this.destinatario;
    }
    public abstract String retornarMensagem(String remetente){
        System.out.printf("Querida %s,\nFeliz Dia dos Namorados!\nEspero que esse tenha um ótimo dia dos namorados!\nDe todo meu coração,\n%s",remetente,getNome());
    }
}