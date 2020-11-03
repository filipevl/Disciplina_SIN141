public class _Alarme{

    public static void main(String args[]){
        Alarme p1 = new Alarme(10,30);
        p1.setAmPm("pm");
        p1.setDiaDaSemana(4);
        Alarme p2 = new Alarme(5,30);
        p2.setAmPm("am");
        p2.setDiaDaSemana(1);
        Alarme p3 = new Alarme(p1,p1.getAmPm());
        System.out.printf("%s\n\n",p1.toString());
        System.out.printf("%s\n\n",p2.toString());
        System.out.printf("%s\n\n",p3.toString());

    }
}