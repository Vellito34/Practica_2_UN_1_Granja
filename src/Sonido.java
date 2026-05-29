public class Sonido {
    String sonido;
    String Volumen;

    public Sonido(String sonido, String volumen) {
        this.sonido = sonido;
        Volumen = volumen;
    }

    public Sonido(String Volumen) {
        this.Volumen = Volumen;
    }

    public String getVolumen() {
        return Volumen;
    }

    public void setVolumen(String volumen) {
        Volumen = volumen;
    }



    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
