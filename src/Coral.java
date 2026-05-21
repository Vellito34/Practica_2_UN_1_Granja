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

    public List<Perro> LFirulais = new ArrayList<>();
}
