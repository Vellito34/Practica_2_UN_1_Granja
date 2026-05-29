import java.util.Scanner;

public class Main {

 public static void OpcionesAnimal(int opc){
  opc = 0;
  System.out.println("Que animal deseas agregar:");
  System.out.println("1--Perro");
  System.out.println("2--Gato");


 }


    public static void main(String[] args){

       Corral corral = new Corral();
       int n = 0;
        Scanner sc = new Scanner(System.in);
        String Nombre,raza,Rcolor,Rtipo;
        String IzqOjoColor,IzqOjoTipo,DeOjoColor,DeOjoTipo;
        String IzqOrejaColor,DeOrejaColor,IzqOrejaTipo,DeOrejaTipo;
        String LadridoVolumen;
        String color;
        int edad,opc = 0;
        Perro Perronuevo = null;
        String NomBuscar,animal;


    /* Perro perrito;
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
*/
     boolean repetir = true;

     Perro perro = new Perro("Juan","Chihuahua",4,new Ladrido("Alto"));
     corral.AgregarPerro(perro);

     do {
      System.out.println("Elije el Animal del corral:");
      System.out.println("1---Perro");
      System.out.println("2---Gato");

      System.out.println("Elije que deseas realizar:");
      System.out.println("1--Agregar Animal");
      System.out.println("2--Lista de perros");
      System.out.println("3--Tamano de la lista");
      System.out.println("4--Perro mayor");
      System.out.println("5--Buscar perros por nombre");
      System.out.println("6--Buscar perro por color de ojo");
      System.out.println("7--Lista de perros con Ladrido alto");
      System.out.println("8--Busqueda de perros repetidos");
      System.out.println("0--Salir");


      try {
       opc = sc.nextInt();
       sc.nextLine();

       switch (opc) {

        case 1:
         OpcionesAnimal(opc);
         opc = sc.nextInt();

         switch (opc) {
          case 1:
           animal = "perro";
           System.out.println("Escribe el nombre del "+animal);
           Nombre = sc.next();

           System.out.println("Escribe la raza del "+animal);

           raza = sc.next();

           System.out.println("Ingresa la edad");
           edad = sc.nextInt();
/*
         System.out.println("Ingresa el color del perro");
         sc.next();
         color = sc.nextLine();

         System.out.println("Ingresa el tamano de rabo:");
         Rtipo = sc.nextLine();

         System.out.println("Ingresa el color del ojo derecho");
         DeOjoColor = sc.nextLine();

         System.out.println("Ingresa el color del ojo derecho");
         IzqOjoColor = sc.nextLine();

         System.out.println("Ingresa el tipo del ojo derecho");
         DeOjoTipo = sc.nextLine();

         System.out.println("Ingresa el tipo del ojo izquierdo");
         IzqOjoTipo = sc.nextLine();

         System.out.println("Ingresa el tipo de la oreja derecha");
         DeOrejaTipo = sc.nextLine();

         System.out.println("Ingresa el tipo del Oreja izquierda");
         IzqOrejaTipo = sc.nextLine();
*/
           System.out.println("Ingresa el volumen del ladrido");
           LadridoVolumen = sc.nextLine();



           //       Perro nuevo = new Perro(Nombre, raza, edad, new Rabo(color, Rtipo), new Ojo(IzqOjoColor, IzqOjoTipo), new Ojo(DeOjoColor, DeOjoTipo), new Oreja(color, DeOrejaTipo), new Oreja(color, IzqOrejaTipo), new Ladrido(LadridoVolumen));

           Perro Pnuevo = new Perro(Nombre, raza, edad, new Ladrido(LadridoVolumen));
           corral.AgregarPerro(Pnuevo);

           break;
          case 2:
           animal = "Gato";
           System.out.println("Escribe el nombre del "+animal);
           Nombre = sc.next();

           System.out.println("Escribe la raza del "+animal);
           raza = sc.next();

           System.out.println("Ingresa la edad");
           edad = sc.nextInt();

           System.out.println("Volumen del maullido:");
           String maullido = sc.next();
           Gato Gnuevo = new Gato(Nombre,raza,edad,maullido );
           break;
         }
          break;
        case 2:

         for (Perro p : corral.ListaPerros) {
          n++;
          System.out.println("Perro " + n);
          System.out.println(p);
         }
         break;

        case 3:
         System.out.println("Perros en el corral: " + corral.ListaPerros.size() + "\n");
         break;

        case 4:
         System.out.println("El perro mas viejo es: \n" + corral.PerroMayor());
         break;

        case 5:
         System.out.println("Ingresa el nombre del perro a buscar:");
         NomBuscar = sc.next();
         System.out.println("Los perros llamados "+NomBuscar+" son:");
         for (Perro p : corral.getNombre(NomBuscar)) {

          System.out.println(p);
         }
         break;

        case 6:
         System.out.println("Ingresa el color del ojo del perro buscado");

         String ColorOjo = sc.next();

         System.out.println("Los perros con ojos "+ColorOjo+" son:");
         if (corral.getOjosColor(ColorOjo).size() != 0) {
          for (Perro p : corral.getOjosColor(ColorOjo)) {

           System.out.println(p);
          }
         } else {
          System.out.println("No hay");
         }
         break;

        case 7:
         System.out.println("Ingresa el Volumen del ladrido del perro buscado");

         String Volumen = sc.next();

         System.out.println("Los perros con el volumen "+Volumen+" son:");
         if (corral.getVolumen(Volumen).size() != 0) {
          for (Perro p : corral.getVolumen(Volumen)) {
           System.out.println(p);
          }
         } else {
          System.out.println("No hay");
         }
         break;

        case 8:

         System.out.println("Ingresa los datos del perro a buscar");

         System.out.println("Escribe el nombre del perro");
         Nombre = sc.next();


         System.out.println("Escribe la raza del perro");

         raza = sc.next();

         System.out.println("Ingresa la edad");
         edad = sc.nextInt();

/*         System.out.println("Ingresa el color del perro");
         sc.next();
         color = sc.nextLine();

         System.out.println("Ingresa el tamano de rabo:");
         Rtipo = sc.nextLine();

         System.out.println("Ingresa el color del ojo derecho");
         DeOjoColor = sc.nextLine();

         System.out.println("Ingresa el color del ojo derecho");
         IzqOjoColor = sc.nextLine();

         System.out.println("Ingresa el tipo del ojo derecho");
         DeOjoTipo = sc.nextLine();

         System.out.println("Ingresa el tipo del ojo izquierdo");
         IzqOjoTipo = sc.nextLine();

         System.out.println("Ingresa el tipo de la oreja derecha");
         DeOrejaTipo = sc.nextLine();

         System.out.println("Ingresa el tipo del Oreja izquierda");
         IzqOrejaTipo = sc.nextLine();
*/
         System.out.println("Ingresa el volumen del ladrido");
         LadridoVolumen = sc.nextLine();

 //        Perro perrob = new Perro(Nombre, raza, edad, new Rabo(color, Rtipo), new Ojo(IzqOjoColor, IzqOjoTipo), new Ojo(DeOjoColor, DeOjoTipo), new Oreja(color, DeOrejaTipo), new Oreja(color, IzqOrejaTipo), new Ladrido(LadridoVolumen));
         Perro perrob = new Perro(Nombre,raza,edad,new Ladrido(LadridoVolumen));


         System.out.println("Hay "+corral.getPerroB(perrob).size());

         for (Perro p : corral.getPerroB(perrob)) {
          System.out.println(p);
         }


         break;


        case 0:
         System.out.println("Adios");
         repetir = false;
        default:
         break;
       }
      } catch (Exception e) {

       System.out.println("\nDato no valido intenta otra vez \n\n\n");
       sc.nextLine();

      }


     }
     while (repetir);


    }
}