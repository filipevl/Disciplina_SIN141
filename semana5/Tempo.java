public class Tempo{
    public Tempo(){
        this(0);
    }
    public Tempo(int hora){
        this(hora,0);
    }
    public Tempo(int hora, short minutos){
        this.hora = hora;
        this.minutos = minutos;
        this(0);
    }
    public Tempo(short minutos){
        this(0,minutos);
    }
    public Tempo(byte segundos){
        this.segundos = segundos;
        this(0,0);
    }

    private int hora;
    private short minutos;
    private byte segundos;

    public int getHora(){
        return this.hora;
    }
    public short getMinutos(){
        return this.minutos;
    }
    public byte getSegundos(){
        return this.segundos;
    }

    public void setHora(int hora){
        if(hora>0&&hora<=24){
            this.hora=hora;
        }else{
            return;
        }
    }
    public void setMinutos(short minutos){
        if(minutos>=0&&minutos<=59){
            this.minutos=minutos;
        }else{
            return;
        }
    }
    public void setSegundos(byte segundos){
        if(segundos>=0&&segundos<=59){
            this.segundos=segundos;
        }else{
            return;
        }
    }
    public String toString(){
        return this.hora + this.minutos + this.segundos;
    }
}