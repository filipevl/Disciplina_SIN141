public class CartaoNatal extends CartaoWeb{
    private String nome;
    public abstract String retornarMensagem(String remetente){
        System.out.printf("Querida %s,\nFeliz Natal!\nEspero que esse tenha um ótimo natal!\nDe todo meu coração,\n%s",remetente,getNome());
    }
}