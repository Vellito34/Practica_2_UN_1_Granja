import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       Coral coral = new Coral();
       int n = 0;
        Scanner sc = new Scanner(System.in);
        String Nombre,raza,Rcolor,Rtipo;
        String IzqOjoColor,IzqOjoTipo,DeOjoColor,DeOjoTipo;
        String IzqOrejaColor,DeOrejaColor,IzqOrejaTipo,DeOrejaTipo;
        String LadridoVolumen;
        int edad;

        System.out.println("Escribe el nombre del perro");
        sc.next();
        Nombre = sc.nextLine();

        System.out.println("Escribe la raza del perro");
        sc.next();
        raza = sc.nextLine();

       Perro perrito;
       perrito = new Perro("Chuchin","Chihuahua",8,new Rabo("Negro","Largo"),new Ojo("Cafe","Chinos"),new Ojo("Cafe","Chinos"),new Oreja("Negro","Largas"),new Oreja("Negro","Largas"),new Ladrido("Alto"));
        coral.AgregarPerro(perrito);

        Perro perro = new Perro("Firulais","Chihuahua",8,new Rabo("Negro","Largo"),new Ojo("Cafe","Chinos"),new Ojo("Cafe","Chinos"),new Oreja("Negro","Largas"),new Oreja("Negro","Largas"),new Ladrido("Alto"));
        coral.AgregarPerro(perro);

        Perro perro3 = new Perro("Negrito","Bulldog",3,new Rabo("Negro","Corto"),new Ojo("Cafe","Grandes"),new Ojo("Cafe","Grandes"),new Oreja("Negro","Largas"),new Oreja("Negro","Largas"),new Ladrido("Alto"));
        coral.AgregarPerro(perro3);

        Perro perro4 = new Perro("Mario","Doerman",2,new Rabo("Negro","Corto"),new Ojo("Cafe","Grandes"),new Ojo("Cafe","Grandes"),new Oreja("Negro","Largas"),new Oreja("Negro","Largas"),new Ladrido("Alto"));
        coral.AgregarPerro(perro4);

        Perro perro5 = new Perro("Anthony","Bull terri",10,new Rabo("Blanco","Corto"),new Ojo("Azul","Grandes"),new Ojo("Blanco","NO tiene"),new Oreja("Negro","Largas"),new Oreja("Negro","Largas"),new Ladrido("Alto"));
        coral.AgregarPerro(perro5);




        System.out.println("Perros en el coral: "+ coral.ListaPerros.size()+"\n");
        for (Perro p : coral.ListaPerros) {
            n++;
            System.out.println("Perro "+n);
            System.out.println(p);
        }

        System.out.println("El perro mas viejo es: \n"+coral.PerroMayor());

        System.out.println("Los perros llamados Firulais son:");
        for (Perro p : coral.getFurulais()) {

            System.out.println(p);
        }

        System.out.println("Los perros con ojos azules son:");
        if (coral.getOjosAzul().size() != 0){
        for (Perro p : coral.getOjosAzul()) {

            System.out.println(p);
        } } else {
            System.out.println("No ahi");
        }

        System.out.println("Los perros con el voluen alto son:");
        if (coral.getVoluenAlto().size() != 0){
        for (Perro p : coral.getVoluenAlto()) {
            System.out.println(p);
        }}
    }
}