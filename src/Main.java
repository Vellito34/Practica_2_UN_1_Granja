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
        String color;
        int edad,opc = 0;
        Perro Perronuevo = null;



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



     System.out.println("Elije que deseas realizar:");
     System.out.println("1---Agregar perro");
     System.out.println("2--Lista de perros");
     System.out.println("3--Tamano de la lista");
     System.out.println("4--Perro mayor");
     System.out.println("5--Lista de perros llamados firulais");
     System.out.println("6--Lista de perros con los ojos azules");
     System.out.println("7--Lista de perros con Ladrido alto");
     System.out.println("8--Busqueda de perros repetidos");


     opc = sc.nextInt();


        switch (opc) {

         case 1 :

          System.out.println("Escribe el nombre del perro");
         Nombre = sc.next();
          sc.next();

         System.out.println("Escribe la raza del perro");

         raza = sc.nextLine();

         System.out.println("Ingresa la edad");
         edad = sc.nextInt();

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

         System.out.println("Ingresa el volumen del ladrido");
         LadridoVolumen = sc.nextLine();

         Perronuevo = new Perro(Nombre, raza, edad, new Rabo(color, Rtipo), new Ojo(IzqOjoColor, IzqOjoTipo), new Ojo(DeOjoColor, DeOjoTipo), new Oreja(color, DeOrejaTipo), new Oreja(color, IzqOrejaTipo), new Ladrido(LadridoVolumen));
         coral.AgregarPerro(Perronuevo);
         break;

         case 2:
          for (Perro p : coral.ListaPerros) {
           n++;
           System.out.println("Perro "+n);
           System.out.println(p);
          }
          break;

         case 3:
          System.out.println("Perros en el coral: "+ coral.ListaPerros.size()+"\n");
          break;

         case 4:
          System.out.println("El perro mas viejo es: \n"+coral.PerroMayor());
          break;

         case 5:
          System.out.println("Los perros llamados Firulais son:");
          for (Perro p : coral.getFurulais()) {

           System.out.println(p);
          }
          break;

         case 6:
          System.out.println("Los perros con ojos azules son:");
          if (coral.getOjosAzul().size() != 0){
           for (Perro p : coral.getOjosAzul()) {

            System.out.println(p);
           } } else {
           System.out.println("No ahi");
          }
          break;

         case 7:
          System.out.println("Los perros con el volumen alto son:");
          if (coral.getVoluenAlto().size() != 0){
           for (Perro p : coral.getVoluenAlto()) {
            System.out.println(p);
           }} else {
           System.out.println("No ahi");
          }
          break;

         case 8 :

          System.out.println("Ingresa los datos del perro a buscar");
          System.out.println("Escribe el nombre del perro");
          Nombre = sc.next();
          sc.next();

          System.out.println("Escribe la raza del perro");

          raza = sc.nextLine();

          System.out.println("Ingresa la edad");
          edad = sc.nextInt();

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

          System.out.println("Ingresa el volumen del ladrido");
          LadridoVolumen = sc.nextLine();

          Perro perrob = new Perro(Nombre, raza, edad, new Rabo(color, Rtipo), new Ojo(IzqOjoColor, IzqOjoTipo), new Ojo(DeOjoColor, DeOjoTipo), new Oreja(color, DeOrejaTipo), new Oreja(color, IzqOrejaTipo), new Ladrido(LadridoVolumen));
          ;

          System.out.println(coral.getPerroB(perrob));

          break;

         default:
          break;
        }





        if(perro.equals(Perronuevo)){
         System.out.println("Son iguales" );
        }



        //Busqueda de un perro con una instancia hacer busquda por odjeto
    }
}