public class Main {
    public static void main(String[] args){

       Coral coral = new Coral();

       Perro perrito;
       perrito = new Perro("Chuchin","Chihuahua",8,new Rabo("Negro","Largo"),new Ojo("Cafe","Chinos"),new Ojo("Cafe","Chinos"));
        coral.AgregarPerro(perrito);

        Perro perro = new Perro("Juan","Chihuahua",8,new Rabo("Negro","Largo"),new Ojo("Cafe","Chinos"),new Ojo("Cafe","Chinos"));
        coral.AgregarPerro(perro);

        Perro perro3 = new Perro("Negrito","Bulldog",3,new Rabo("Negro","Corto"),new Ojo("Cafe","Grandes"),new Ojo("Cafe","Grandes"));
        coral.AgregarPerro(perro3);
        Perro perro4 = new Perro("Mario","Doerman",2,new Rabo("Negro","Corto"),new Ojo("Cafe","Grandes"),new Ojo("Cafe","Grandes");
        coral.AgregarPerro(perro4);
        Perro perro5 = new Perro("Anthony","Bull terri",10,new Rabo("Blanco","Corto"),new Ojo("azul","Grandes"),new Ojo("Blanco","NO tiene");
        coral.AgregarPerro(perro5);
        int n = 0;
        System.out.println("Perros en el coral: "+ coral.ListaPerros.size()+"\n");
        for (Perro p : coral.ListaPerros) {
            n++;
            System.out.println("Perro "+n+" "+p);
        }
    }
}