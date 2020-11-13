public class PlacasDeCarro{
    public PlacasDeCarro(String nome){
        setNomeDoPais(nome);
    }
    public PlacasDeCarro(char a, char b){
        setDuasLetras(a,b);
    }
    public PlacasDeCarro(PlacasDeCarro placa){
        setNomeDoPais(placa.nomeDoPais);
        setDuasLetras(placa.letraA,placa.letraB);
        setDoisNumeros(placa.numA,placa.numB);
    }

    private String nomeDoPais;
    private char letraA,letraB;
    private int numA,numB;

    public String getNomeDoPais(){
        return this.nomeDoPais;
    }

    public char[] getDuasLetras(){
        char [] string = new char[1];
        string[0]=this.letraA;
        string[1]=this.letraB;

        return string;
    }

    public int[] getDoisNumeros(){
        int [] string = new int[1];
        string[0]=this.numA;
        string[1]=this.numB;
        return string;
    }

    public void setNomeDoPais(String nomeDoPais){
        this.nomeDoPais = nomeDoPais;
    }
    public void setDuasLetras(char a, char b){
        if(a=='a'||a=='b'||a=='c'||a=='d'||a=='e'||a=='f'||a=='g'||a=='h'||a=='i'||a=='j'||a=='k'){
            if(b=='a'||b=='b'||b=='c'||b=='d'||b=='e'||b=='f'||b=='g'||b=='h'||b=='i'||b=='j'||b=='k'){
                this.letraA=a;
                this.letraB=b;
            }else{
                this.letraB='E'; //E - Erro
            }
        }else{
            this.letraB='E'; //E - Erro
        }
    }
    public void setDoisNumeros(int a, int b){
        if(a<-1||a<5){
            if(b>-1||b<5){
                this.numA=a;
                this.numB=b;
            }else{
                this.numB=0;
            }
        }else{
            this.numA=0;
        }
    }

    public String toString(){
        return this.nomeDoPais + '\n' + this.letraA+ this.letraB + '-' + this.numA+this.numB;
    }
}