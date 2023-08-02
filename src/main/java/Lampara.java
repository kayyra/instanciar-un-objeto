

public class Lampara {
    
    private String color;
    private boolean encendida;

    public Lampara(String color){
        this.color = color;
    }
    public Lampara(){
        this("Roja");
    }

    public String getColor(){
        return color;
    }

    public void interruptor(){
        encendida = !encendida;
        System.out.println("Lámpara:" + encendida);
    }

    public boolean isEncendida(){
        return encendida;
    }

    @Override
    public String toString() {
        String onOff = encendida ? "ON" : "OFF";
        return "La lámpara es" + color + " y está " + onOff;
    }
}

class LamparaCreator {
    public static void main(String[] args){

        Lampara lampara = new Lampara();
        System.out.println(lampara.getColor() + " " + lampara.isEncendida());
        lampara.interruptor();
        System.out.println(lampara.getColor() + " " + lampara.isEncendida());
        System.out.println(lampara);
    }
}
