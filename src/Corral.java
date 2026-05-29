import java.util.ArrayList;
import java.util.List;

public class Corral {

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

    public List<Perro> getNombre(String NomBuscar){

        List<Perro> LPF = new ArrayList<>();
        for (Perro p : ListaPerros){
            if ( p.getNombre().equals(NomBuscar)){
                LPF.add(p);
            }
        }
        return LPF;
    }

    public  List<Perro> getOjosColor(String ColorOjo){

        List<Perro> LPO = new ArrayList<>();

        for (Perro p : ListaPerros){
            if (p.getOjoDerecho().getColor().equals(ColorOjo) || p.getOjoIzquierdo().getColor().equals(ColorOjo)){
                LPO.add(p);
            }
        }
        return LPO;
    }

    public List<Perro> getVolumen(String Volumen){

        List<Perro> LPVA = new ArrayList<>();

        for (Perro p : ListaPerros){
            if (p.getLadrido().getVolumen().equals(Volumen) ){
                LPVA.add(p);
            }
        }
        return LPVA;
    }

    public List<Perro> getPerroB(Perro perrob){

        List<Perro> LPB = new ArrayList<>();

        for (Perro p : ListaPerros){
            if (p.equals(perrob)){
                LPB.add(p);
            }
        }
        return LPB;
    }

    public List<Gato> ListaGatos = new ArrayList<>();
    public void AgregarGatos(Gato gato){
        ListaGatos.add(gato);
    }
    public Integer getNumeroGatos(){
        return ListaGatos.size();
    }
}
