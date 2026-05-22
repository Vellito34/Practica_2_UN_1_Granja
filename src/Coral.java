import java.util.ArrayList;
import java.util.List;

public class Coral {

    public List<Perro> ListaPerros = new ArrayList<>();
    public void AgregarPerro(Perro perro){
        ListaPerros.add(perro);
    }
    public Integer getNumeroPerros(){
        return ListaPerros.size();
    }

    public Perro PerroMayor(){

        Perro PerroM = ListaPerros.get(0); //get.(0) osea posicion 0
        for (Perro p : this.ListaPerros){
            if (p.getEdad() > PerroM.getEdad() ){
                PerroM = p;
            }
        }
        return PerroM;
    }

    public List<Perro> getFurulais(){

        List<Perro> LPF = new ArrayList<>();
        for (Perro p : ListaPerros){
            if ( p.getNombre().equals("Firulais")){
                LPF.add(p);
            }
        }
        return LPF;
    }

    public  List<Perro> getOjosAzulez(){

        List<Perro> LPOA = new ArrayList<>();

        for (Perro p : ListaPerros){
            if ( p.getOjoDerecho().getColor().equals("Azul") || p.getOjoIzquierdo().getColor().equals("Azul")){
                LPOA.add(p);
            }
        }
        return LPOA;
    }

    public List<Perro> getVoluenAlto(){

        List<Perro> LPVA = new ArrayList<>();

        for (Perro p : ListaPerros){
            if ( p.getLadrido().getVolumen().equals("Alto") ){
                LPVA.add(p);
            }
        }
        return LPVA;
    }
}
