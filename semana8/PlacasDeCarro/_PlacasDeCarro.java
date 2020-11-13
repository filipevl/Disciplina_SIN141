import java.util.Scanner;
public class _PlacasDeCarro{

    public static void main(String args[]){
        PlacasDeCarro p1 = new PlacasDeCarro("Brasil");
        p1.setDuasLetras('c','d');
        p1.setDoisNumeros(0,1);
        PlacasDeCarro p2 = new PlacasDeCarro('a','b');
        p2.setNomeDoPais("Argentina");
        p2.setDoisNumeros(1,4);
        PlacasDeCarro p3 = new PlacasDeCarro(p1);
        System.out.printf("%s\n\n",p1.toString());
        System.out.printf("%s\n\n",p2.toString());
        System.out.printf("%s\n\n",p3.toString());

    }
}