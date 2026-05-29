import java.util.ArrayList;
import java.util.List;

public class Corral {

    public List<Animal> ListaAnimales = new ArrayList<>();
    public void AgregarAnimales(Animal animal){
        ListaAnimales.add(animal);
    }
    public Integer getNumeroPerros(){
        return ListaAnimales.size();
    }

    public Animal AnimalMayor(Class<?> tipo){

        Animal AnimalM = ListaAnimales.get(0); //get.(0) osea posicion 0
        for (Animal p : this.ListaAnimales){
            if (p.getClass() == tipo) {
                if (p.getEdad() > AnimalM.getEdad()) {
                    AnimalM = p;
                }
            }
        }
        return AnimalM;
    }
//Se puede hacer pero con un typiado investiga poner un generico y ese poner que
 

    public List<Animal> getNombre(String NomBuscar,String Animal){
        List<Animal> LAF = new ArrayList<>();
        for (Animal p : ListaAnimales){

            if ( p.getNombre().equals(NomBuscar)){
                LAF.add(p);
            }
        }
        return LAF;
    }

    public  List<Animal> getOjosColor(String ColorOjo){

        List<Animal> LAO = new ArrayList<>();

        for (Animal p : ListaAnimales){
            if (p.getOjoDerecho().getColor().equals(ColorOjo) || p.getOjoIzquierdo().getColor().equals(ColorOjo)){
                LAO.add(p);
            }
        }
        return LAO;
    }

    public List<Animal> getVolumen(String Volumen){

        List<Animal> LAVA = new ArrayList<>();

        for (Animal p : ListaAnimales){
            if (p.getSonido().getVolumen().equals(Volumen) ){
                LAVA.add(p);
            }
        }
        return LAVA;
    }

    public List<Perro> getPerroB(Perro perrob){

        List<Perro> LPB = new ArrayList<>();

        for (Animal p : this.ListaAnimales){
            if (p.equals(perrob) && p instanceof Perro){
                LPB.add((Perro) p);
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

    public Gato GatoMayor(){

        Gato GatoM = ListaGatos.get(0); //get.(0) osea posicion 0
        for (Gato g : this.ListaGatos){
            if (g.getEdad() > GatoM.getEdad() ){
                GatoM = g;
            }
        }
        return GatoM;
    }

    public List<Gato> getNombreGato(String NomBuscar){

        List<Gato> LPF = new ArrayList<>();
        for (Gato g : ListaGatos    ){
            if ( g.getNombre().equals(NomBuscar)){
                LPF.add(g);
            }
        }
        return LPF;
    }

    public  List<Gato> getOjosColorGato(String ColorOjo){

        List<Gato> LPO = new ArrayList<>();

        for (Gato g : ListaGatos){
            if (g.getOjoDerecho().getColor().equals(ColorOjo) || g.getOjoIzquierdo().getColor().equals(ColorOjo)){
                LPO.add(g);
            }
        }
        return LPO;
    }

    public List<Gato> getGatoB(Gato gatob){

        List<Gato> LPB = new ArrayList<>();

        for (Gato g : ListaGatos){
            if (g.equals(gatob)){
                LPB.add(g);
            }
        }
        return LPB;
    }


}
