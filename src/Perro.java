public class Perro extends Animal{
    private Ladrido Ladrido;

    public Perro(String Nombre,String Raza,int Edad,Ladrido ladrido) {

        super(Nombre,Raza,Edad);
        this.Ladrido = ladrido;
    }

    public Ladrido getLadrido() {
        return Ladrido;
    }

    public void setLadrido(Ladrido ladrido) {
        Ladrido = ladrido;
    }


}