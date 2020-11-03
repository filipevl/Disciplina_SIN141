public class Alarme{
    public Alarme(int hora, int minuto){
        this.hora=hora;
        this.minuto=minuto;
    }
    public Alarme(String diaDaSemana){
        this.diaDaSemana=diaDaSemana;
    }
    public Alarme(Alarme alarme, String amPm){
        this.hora=alarme.hora;
        this.minuto=alarme.minuto;
        this.diaDaSemana=alarme.diaDaSemana;
        this.amPm=amPm;
    }

    private String amPm,diaDaSemana;
    private int hora,minuto;

    public String getAmPm(){
        return this.amPm;
    }
    public String getDiaDaSemana(){
        return this.diaDaSemana;
    }

    public int getHora(){
        return this.hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public void setAmPm(String amPm){
        if(amPm=="am"){
            this.amPm="am";
        }else{
            this.amPm=null;
        }
        if(amPm=="pm"){
            this.amPm="pm";
        }else{
            this.amPm=null;
        }
    }
    public void setHora(int hora){
        if(hora>=0||hora<12){
            this.hora=hora;
        }else{
            this.hora=0;
        }
    }
    public void setMinuto(int minuto){
        if(minuto>=0||minuto<60){
            this.minuto=minuto;
        }else{
            this.minuto=0;
        }
    }
    public void setDiaDaSemana(int dia){
        switch(dia){
            case 1:
                this.diaDaSemana="Domingo";
                break;
            case 2:
                this.diaDaSemana="Segunda";
                break;
            case 3:
                this.diaDaSemana="Terça";
                break;
            case 4:
                this.diaDaSemana="Quarta";
                break;
            case 5:
                this.diaDaSemana="Quinta";
                break;
            case 6:
                this.diaDaSemana="Sexta";
                break;
            case 7:
                this.diaDaSemana="Sábado";
                break;
            default :
                this.diaDaSemana=null;
        }
    }
    public String toString(){
        return this.hora + ":" + this.minuto + "-" + this.diaDaSemana;
    }
}