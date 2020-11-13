public class CartaoAniversario extends CartaoWeb{
    public CartaoAniversario(String destinatario){
        this.destinatario=destinatario;
    }
    private String destinatario;
    public String getDestinatario(){
        return this.destinatario;
    }
    public abstract String retornarMensagem(String remetente){
        System.out.printf("Querida %s,\nFeliz Aniversário!\nEspero que esse tenha um ótimo aniversário!\nDe todo meu coração,\n%s",remetente,getDestinatario());
    }
}