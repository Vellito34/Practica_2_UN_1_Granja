public class Main {
    public static void main(String[] args){

       Coral coral = new Coral();

       Perro perrito;
       perrito = new Perro("Chuchin","Chihuahua",8,new Rabo("Negro","Largo"),new Ojo("Cafe","Chinos"),new Ojo("Cafe","Chinos"));
        coral.AgregarPerro(perrito);

        Perro perro = new Perro("Juan","Chihuahua",8,new Rabo("Negro","Largo"),new Ojo("Cafe","Chinos"),new Ojo("Cafe","Chinos"));
        coral.AgregarPerro(perro);

        int n = 0;
        System.out.println("Perros en el coral: "+ coral.ListaPerros.size()+"\n");
        for (Perro p : coral.ListaPerros) {
            n++;
            System.out.println("Perro "+n+" "+p);
        }
    }
}