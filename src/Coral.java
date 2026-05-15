import java.util.ArrayList;
import java.util.List;

public class Coral {

    List<Perro> ListaPerros = new ArrayList<>();
    public void AgregarPerro(Perro perro){
        ListaPerros.add(perro);
    }

    @Override
    public String toString() {
        return "Coral{" +
                "ListaPerros=" + ListaPerros +
                '}';
    }
}
