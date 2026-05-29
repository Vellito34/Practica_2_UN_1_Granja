import java.util.Objects;

public class Animal {
    private String Nombre;
    private String Raza;
    private int Edad;
    private Ojo OjoIzquierdo;
    private Ojo OjoDerecho;
    private Oreja OrejaDerecha;
    private Oreja OrejaIzquierda;
    private Sonido sonido;
    private Rabo rabo;




    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        this.Raza = raza;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public Ojo getOjoIzquierdo() {
        return OjoIzquierdo;
    }

    public void setOjoIzquierdo(Ojo ojoIzquierdo) {
        this.OjoIzquierdo = ojoIzquierdo;
    }

    public Ojo getOjoDerecho() {
        return OjoDerecho;
    }

    public void setOjoDerecho(Ojo ojoDerecho) {
        this.OjoDerecho = ojoDerecho;
    }

    public Oreja getOrejaDerecha() {
        return OrejaDerecha;
    }

    public void setOrejaDerecha(Oreja orejaDerecha) {
        this.OrejaDerecha = orejaDerecha;
    }

    public Oreja getOrejaIzquierda() {
        return OrejaIzquierda;
    }

    public void setOrejaIzquierda(Oreja orejaIzquierda) {
        this.OrejaIzquierda = orejaIzquierda;
    }

    public Animal() {
    }

    public Sonido getSonido() {
        return sonido;
    }

    public void setSonido(Sonido sonido) {
        this.sonido = sonido;
    }

    public Animal(String nombre, String raza, int edad) {
        Nombre = nombre;
        Raza = raza;
        Edad = edad;
    }

    public Rabo getRabo() {
        return rabo;
    }

    public void setRabo(Rabo rabo) {
        this.rabo = rabo;
    }


    //Composicion es cuando un odjeto se relaciona con otro odjeto cuando el odjeto a depende del odjeto b
    //Agregacion cuando un odjeto tiene a otro odjeto tiene a otro pero no es obligatorio/ no dependen
    //Asociacion es cuando un odjeto utiliza a otro odjeto
    //Herencia cuando hereda xd


    public Animal(String nombre, String raza, int edad, Ojo ojoIzquierdo, Ojo ojoDerecho, Oreja orejaDerecha, Oreja orejaIzquierda, Sonido sonido, Rabo rabo) {
        Nombre = nombre;
        Raza = raza;
        Edad = edad;
        OjoIzquierdo = ojoIzquierdo;
        OjoDerecho = ojoDerecho;
        OrejaDerecha = orejaDerecha;
        OrejaIzquierda = orejaIzquierda;
        this.sonido = sonido;
        this.rabo = rabo;
    }

    public Animal(String nombre, String raza, int edad, Ojo ojoIzquierdo, Ojo ojoDerecho, Sonido sonido) {
        Nombre = nombre;
        Raza = raza;
        Edad = edad;
        OjoIzquierdo = ojoIzquierdo;
        OjoDerecho = ojoDerecho;
        this.sonido = sonido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Edad == animal.Edad && Objects.equals(Nombre, animal.Nombre) && Objects.equals(Raza, animal.Raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Raza, Edad);
    }

    @Override
    public String toString() {
        return "Animal\n" +
                "Nombre:    " + Nombre + '\n' +
                "Raza:      " + Raza + '\n' +
                "Edad:      " + Edad +
                '\n';
    }
}
