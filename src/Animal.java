public class Animal {
    private String raza;
    private int edad;
    private Ojo ojoIzquierdo;
    private Ojo ojoDerecho;
    private Oreja orejaDerecha;
    private Oreja orejaIzquierda;

    //Composicion es cuando un odjeto se relaciona con otro odjeto cuando el odjeto a depende del odjeto b
    //Agregacion cuando un odjeto tiene a otro odjeto tiene a otro pero no es obligatorio/ no dependen
    //Asociacion es cuando un odjeto utiliza a otro odjeto
    //Herencia cuando hereda xd



    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Ojo getOjoIzquierdo() {
        return ojoIzquierdo;
    }

    public void setOjoIzquierdo(Ojo ojoIzquierdo) {
        this.ojoIzquierdo = ojoIzquierdo;
    }

    public Ojo getOjoDerecho() {
        return ojoDerecho;
    }

    public void setOjoDerecho(Ojo ojoDerecho) {
        this.ojoDerecho = ojoDerecho;
    }

    public Oreja getOrejaDerecha() {
        return orejaDerecha;
    }

    public void setOrejaDerecha(Oreja orejaDerecha) {
        this.orejaDerecha = orejaDerecha;
    }

    public Oreja getOrejaIzquierda() {
        return orejaIzquierda;
    }

    public void setOrejaIzquierda(Oreja orejaIzquierda) {
        this.orejaIzquierda = orejaIzquierda;
    }
}
