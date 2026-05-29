public class Gato extends Animal {
    String Maullido;

    public Gato(String nombre, String raza, int edad, String maullido) {
        super(nombre, raza, edad);
        this.Maullido = maullido;
    }

    public Gato(String nombre, String raza, int edad, Ojo ojoIzquierdo, Ojo ojoDerecho, Oreja orejaDerecha, Oreja orejaIzquierda, String maullido) {
        super(nombre, raza, edad, ojoIzquierdo, ojoDerecho, orejaDerecha, orejaIzquierda);
        Maullido = maullido;
    }

    public String getMaullido() {
        return Maullido;
    }

    public void setMaullido(String maullido) {
        this.Maullido = maullido;
    }

}
