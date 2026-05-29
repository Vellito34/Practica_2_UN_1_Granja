public class Gato extends Animal {
    String Maullido;

    public Gato(String nombre, String raza, int edad, String maullido) {
        super(nombre, raza, edad);
        this.Maullido = maullido;
    }

    public String getMaullido() {
        return Maullido;
    }

    public void setMaullido(String maullido) {
        this.Maullido = maullido;
    }

}
