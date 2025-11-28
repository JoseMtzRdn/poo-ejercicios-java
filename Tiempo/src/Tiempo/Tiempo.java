package Tiempo;

public class Tiempo {

    private int seg;

     private int segHoras() {
        int hora;
        hora = getSeg() / 3600;
        return hora;
    } 
    
    private int segMin() {
        int minu;
        minu = (getSeg() -  segHoras() * 3600) / 60;
        return minu;
    }

    private int segundos(){
        int segun;
        segun = (getSeg() - (segHoras()*3600) - (segMin()) * 60 );
        return  segun;     
    }

    public void conversionTotal() {
        System.out.println(segHoras() + " hora(s)");
        System.out.println(segMin() + " minuto(s)");
        System.out.println(segundos() + " segundos");
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
}
