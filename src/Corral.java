import java.util.ArrayList;
import java.util.List;

public class Corral {

    public List<Animal> ListaAnimales = new ArrayList<>();

    public void AgregarAnimales(Animal animal) {
        ListaAnimales.add(animal);
    }

    public Integer getNumeroPerros() {
        return ListaAnimales.size();
    }

    public <T extends Animal> T AnimalMayor(Class<T> Tipo) {

        T AnimalM = null;

        for (Animal p : this.ListaAnimales) {
            if (p.getClass() == Tipo) {
                if (AnimalM == null || p.getEdad() > AnimalM.getEdad()) {
                    AnimalM = Tipo.cast(p);
                }
            }
        }
        return AnimalM;
    }
//Se puede hacer pero con un typiado investiga poner un generico y ese poner que


    public <T extends Animal> List<T> getNombre(String NomBuscar, Class<T> Tipo) {
        List<T> LAN = new ArrayList<>();
        for (Animal p : ListaAnimales) {

            if (p.getClass() == Tipo){
                if (p.getNombre().equals(NomBuscar)) {
                    LAN.add(Tipo.cast(p));
                }
            }
        }
        return LAN;
    }

    public <T extends Animal> List<T> getOjosColor(String ColorOjo,Class<T> Tipo) {

        List<T> LAO = new ArrayList<>();

        for (Animal p : ListaAnimales) {
            if (p.getClass() == Tipo){
                if (p.getOjoDerecho().getColor().equals(ColorOjo) || p.getOjoIzquierdo().getColor().equals(ColorOjo)) {
                    LAO.add(Tipo.cast(p));
                }
            }
        }
        return LAO;
    }

    public <T extends Animal> List<T> getVolumen(String Volumen,Class<T> Tipo) {

        List<T> LAV = new ArrayList<>();

        for (Animal p : ListaAnimales) {
            if (p.getClass() == Tipo) {
                if (p.getSonido().getVolumen().equals(Volumen)) {
                    LAV.add(Tipo.cast(p));
                }
            }
        }
        return LAV;
    }

    public <T extends Animal> List<T> getAnimalB(T animalb,Class<T> Tipo) {

        List<T> LPB = new ArrayList<>();

        for (Animal p : this.ListaAnimales) {
            if (p.getClass() == Tipo) {
                if (p.equals(animalb) ) {
                    LPB.add(Tipo.cast(p));
                }
            }
        }
        return LPB;
    }

    public <T extends Animal> List<T> FiltrarTipo(Class<T> Tipo) {

        List<T> Clases = new ArrayList<>();

        for (Animal a : ListaAnimales) {
            if (Tipo.isInstance(a)) {
                Clases.add(Tipo.cast(a));
            }
        }
        return Clases;
    }
}
