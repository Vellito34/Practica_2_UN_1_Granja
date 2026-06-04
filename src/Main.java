import java.util.Scanner;

public class Main {

 public static void OpcionesAnimal(int opc){
  opc = 0;
  System.out.println("Que animal deseas usar:");
  System.out.println("1--Perro");
  System.out.println("2--Gato");
  System.out.println("3--Gallina");
  System.out.println("0--Salir");

 }

 public static void Opc(String Animal){
  System.out.println("Elije que deseas realizar:");
  System.out.println("1--Agregar "+Animal);
  System.out.println("2--Lista de "+Animal);
  System.out.println("3--Tamano de la lista");
  System.out.println("4--"+Animal+" mayor");
  System.out.println("5--Buscar "+Animal+" por nombre");
  System.out.println("6--Buscar "+Animal+" por color de ojo");
  System.out.println("7--Busqueda de "+Animal+" repetidos");
  System.out.println("8--Volumen del Sonido del "+Animal);
  System.out.println("9--Suma de las edades");
  System.out.println("10-Promedio de las edades");
  System.out.println("0--Salir");
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
        String NomBuscar, Animal;


     Perro perrito;
     perrito = new Perro("Chuchin","Chihuahua",8,new Ojo("Cafe","Chinos"),new Ojo("Cafe","Chinos"),new Oreja("Negro","Largas"),new Oreja("Negro","Largas"),new Sonido("Alto"),new Rabo("Negro","Largo"));
     corral.AgregarAnimales(perrito);

     Perro perro = new Perro("Firulais","Chihuahua",8,new Ojo("Cafe","Chinos"),new Ojo("Cafe","Chinos"),new Oreja("Negro","Largas"),new Oreja("Negro","Largas"),new Sonido("Alto"),new Rabo("Negro","Largo"));
     corral.AgregarAnimales(perro);

     Perro perro3 = new Perro("Negrito","Bulldog",3,new Ojo("Cafe","Grandes"),new Ojo("Cafe","Grandes"),new Oreja("Negro","Largas"),new Oreja("Negro","Largas"),new Sonido("Alto"),new Rabo("Negro","Largo"));
     corral.AgregarAnimales(perro3);

     Perro perro4 = new Perro("Mario","Doerman",2,new Ojo("Cafe","Grandes"),new Ojo("Cafe","Grandes"),new Oreja("Negro","Largas"),new Oreja("Negro","Largas"),new Sonido("Alto"),new Rabo("Negro","Largo"));
     corral.AgregarAnimales(perro4);

     Perro perro5 = new Perro("Anthony","Bull terri",10,new Ojo("Azul","Grandes"),new Ojo("Blanco","NO tiene"),new Oreja("Negro","Largas"),new Oreja("Negro","Largas"),new Sonido("Alto"),new Rabo("Negro","Largo"));
     corral.AgregarAnimales(perro5);

     Gato gato1 = new Gato("Michi", "Persa", 4, new Ojo("Verde","Grandes"), new Ojo("Verde","Grandes"), new Oreja("Blanco","Largas"), new Oreja("Blanco","Largas"), new Maullido("Bajo"), new Rabo("Blanco","Largo"));
     corral.AgregarAnimales(gato1);

     boolean repetir = true;



     do {

      OpcionesAnimal(opc);

      try {

       opc = sc.nextInt();
       sc.nextLine();

       switch (opc) {
        case 1:
         Animal = "Perro";
         Opc(Animal);
         opc = sc.nextInt();

            switch (opc) {
             case 1:
              Animal = "perro";
              System.out.println("Escribe el nombre del " + Animal);
              Nombre = sc.nextLine();

              System.out.println("Escribe la raza del " + Animal);

              raza = sc.nextLine();

              System.out.println("Ingresa la edad");
              edad = sc.nextInt();

         System.out.println("Ingresa el color del perro");
         sc.nextLine();
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


              Perro Pnuevo = new Perro(Nombre,raza, edad, new Ojo(DeOjoColor,DeOjoTipo),new Ojo(DeOjoColor,IzqOjoTipo),new Oreja(color,DeOrejaTipo),new Oreja(color,IzqOrejaTipo),new Ladrido(LadridoVolumen),new Rabo(color,Rtipo));
              corral.AgregarAnimales(Pnuevo);

              break;

             case 2:
              n=0;
              for (Perro p : corral.FiltrarTipo(Perro.class)) {
               n++;
               System.out.println("Perro " + n);
               System.out.println(p);
              }
              break;

             case 3:
              System.out.println("Perros en el corral: " + corral.FiltrarTipo(Perro.class).size() + "\n");
              break;

             case 4:
              System.out.println("El perro mas viejo es: \n" + corral.AnimalMayor(Perro.class));
              break;

             case 5:
              System.out.println("Ingresa el nombre del perro a buscar:");
              NomBuscar = sc.next();
              System.out.println("Los perros llamados " + NomBuscar + " son:");
              for (Perro p : corral.getNombre(NomBuscar,Perro.class)) {

               System.out.println(p);
              }
              break;

             case 6:
              System.out.println("Ingresa el color del ojo del perro buscado");

              String ColorOjo = sc.next();

              System.out.println("Los perros con ojos " + ColorOjo + " son:");
              if (corral.getOjosColor(ColorOjo,Perro.class).size() != 0) {
               for (Perro p : corral.getOjosColor(ColorOjo,Perro.class)) {

                System.out.println(p);
               }
              } else {
               System.out.println("No hay");
              }
              break;

             case 8:
              System.out.println("Ingresa el Volumen del ladrido del perro buscado");

              String Volumen = sc.next();

              System.out.println("Los perros con el volumen " + Volumen + " son:");
              if (corral.getVolumen(Volumen,Perro.class).size() != 0) {
               for (Animal p : corral.getVolumen(Volumen,Perro.class)) {
                System.out.println(p);
               }
              } else {
               System.out.println("No hay");
              }
              break;

             case 7:

              System.out.println("Ingresa los datos del perro a buscar");

              System.out.println("Escribe el nombre del perro");
              Nombre = sc.nextLine();


              System.out.println("Escribe la raza del perro");

              raza = sc.nextLine();

              System.out.println("Ingresa la edad");
              edad = sc.nextInt();

         System.out.println("Ingresa el color del "+Animal);
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

              Perro animalb = new Perro(Nombre, raza, edad, new Ojo(DeOjoColor,DeOjoTipo),new Ojo(DeOjoColor,IzqOjoTipo),new Oreja(color,DeOrejaTipo),new Oreja(color,IzqOrejaTipo),new Ladrido(LadridoVolumen),new Rabo(color,Rtipo));


              System.out.println("Hay " + corral.getAnimalB(animalb,Perro.class).size());

              for (Perro p : corral.getAnimalB(animalb,Perro.class)) {
               System.out.println(p);
              }


              break;

             case 9:
              System.out.println("La suma de las edades es:");
              System.out.println(corral.getSumaEdades(Perro.class));

              break;
             case 10:
              System.out.println("El promedio de las edades es:");
              System.out.println(corral.getPromedioEdades(Perro.class));
              break;
             case 0:
              System.out.println("Adios");
              repetir = false;
              break;
             default:
              break;

           }
           break;
           case 2:
            opc = 0;
           Animal ="Gato";
           Opc(Animal);
           opc=sc.nextInt();

            switch (opc){
             case 1:

              System.out.println("Escribe el nombre del " + Animal);
              Nombre = sc.next();

              System.out.println("Escribe la raza del " + Animal);

              raza = sc.next();

              System.out.println("Ingresa la edad");
              edad = sc.nextInt();

              System.out.println("Ingresa el color del "+Animal);
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


              Gato nuevo = new Gato(Nombre,raza, edad, new Ojo(DeOjoColor,DeOjoTipo),new Ojo(DeOjoColor,IzqOjoTipo),new Oreja(color,DeOrejaTipo),new Oreja(color,IzqOrejaTipo),new Maullido(LadridoVolumen),new Rabo(color,Rtipo));
              corral.AgregarAnimales(nuevo);

              break;

             case 2:
              n=0;

              for (Gato p : corral.FiltrarTipo(Gato.class)) {
               n++;
               System.out.println(Animal + " " + n);
               System.out.println(p);
              }
              break;

             case 3:
              System.out.println(Animal +" en el corral: " + corral.FiltrarTipo(Gato.class).size() + "\n");
              break;

             case 4:
              System.out.println("El "+Animal+" mas viejo es: \n" + corral.AnimalMayor(Gato.class));
              break;

             case 5:
              System.out.println("Ingresa el nombre del "+Animal+" a buscar:");
              NomBuscar = sc.next();
              System.out.println("Los "+Animal+" llamados " + NomBuscar + " son:");
              for (Gato p : corral.getNombre(NomBuscar,Gato.class)) {

               System.out.println(p);
              }
              break;

             case 6:
              System.out.println("Ingresa el color del ojo del "+Animal+" buscado");

              String ColorOjo = sc.next();

              System.out.println("Los "+Animal+" con ojos " + ColorOjo + " son:");
              if (corral.getOjosColor(ColorOjo,Gato.class).size() != 0) {
               for (Gato p : corral.getOjosColor(ColorOjo,Gato.class)) {

                System.out.println(p);
               }
              } else {
               System.out.println("No hay");
              }
              break;

             case 8:
              System.out.println("Ingresa el Volumen del maullifo del Gato buscado");

              String Volumen = sc.next();

              System.out.println("Los "+Animal+" con el volumen " + Volumen + " son:");
              if (corral.getVolumen(Volumen,Gato.class).size() != 0) {
               for (Animal p : corral.getVolumen(Volumen,Gato.class)) {
                System.out.println(p);
               }
              } else {
               System.out.println("No hay");
              }
              break;

             case 7:

              System.out.println("Ingresa los datos del gato a buscar");

              System.out.println("Escribe el nombre del Gato");
              Nombre = sc.next();


              System.out.println("Escribe la raza del Gato");

              raza = sc.next();

              System.out.println("Ingresa la edad");
              edad = sc.nextInt();

              System.out.println("Ingresa el color del "+Animal);
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

              System.out.println("Ingresa el volumen del maullido");
              LadridoVolumen = sc.nextLine();

              Gato animalb = new Gato(Nombre, raza, edad, new Ojo(DeOjoColor,DeOjoTipo),new Ojo(DeOjoColor,IzqOjoTipo),new Oreja(color,DeOrejaTipo),new Oreja(color,IzqOrejaTipo),new Maullido(LadridoVolumen),new Rabo(color,Rtipo));


              System.out.println("Hay " + corral.getAnimalB(animalb,Gato.class).size());

              for (Gato p : corral.getAnimalB(animalb,Gato.class)) {
               System.out.println(p);
              }


              break;
             case 9:
              System.out.println("La suma de las edades es:");
              System.out.println(corral.getSumaEdades(Gato.class));

              break;
             case 10:
              System.out.println("El promedio de las edades es:");
              System.out.println(corral.getPromedioEdades(Gato.class));
              break;
             case 0:
              System.out.println("Adios");
              repetir = false;
              break;

            }

            break;

        case 3:
         opc = 0;
         Animal = "Gallina";
         Opc(Animal);
         opc = sc.nextInt();

         switch (opc) {
          case 1:
           System.out.println("Escribe el nombre de la " + Animal);
           Nombre = sc.next();

           System.out.println("Escribe la raza de la " + Animal);
           raza = sc.next();

           System.out.println("Ingresa la edad");
           edad = sc.nextInt();

           System.out.println("Ingresa el color de la " + Animal);
           sc.next();
           color = sc.nextLine();

           System.out.println("Ingresa el color del ojo derecho");
           DeOjoColor = sc.nextLine();

           System.out.println("Ingresa el color del ojo izquierdo");
           IzqOjoColor = sc.nextLine();

           System.out.println("Ingresa el tipo del ojo derecho");
           DeOjoTipo = sc.nextLine();

           System.out.println("Ingresa el tipo del ojo izquierdo");
           IzqOjoTipo = sc.nextLine();


           System.out.println("Ingresa el volumen del cacareo");
           LadridoVolumen = sc.nextLine();

           Gallina nueva = new Gallina(Nombre, raza, edad, new Ojo(DeOjoColor, DeOjoTipo), new Ojo(IzqOjoColor, IzqOjoTipo), new Cacareo(LadridoVolumen));
           corral.AgregarAnimales(nueva);
           break;

          case 2:
           n=0;
           for (Gallina p : corral.FiltrarTipo(Gallina.class)) {
            n++;
            System.out.println(Animal + " " + n);
            System.out.println(p);
           }
           break;

          case 3:
           System.out.println(Animal + " en el corral: " + corral.FiltrarTipo(Gallina.class).size() + "\n");
           break;

          case 4:
           System.out.println("La " + Animal + " mas vieja es: \n" + corral.AnimalMayor(Gallina.class));
           break;

          case 5:
           System.out.println("Ingresa el nombre de la " + Animal + " a buscar:");
           NomBuscar = sc.next();
           System.out.println("Las " + Animal + "s llamadas " + NomBuscar + " son:");
           for (Gallina p : corral.getNombre(NomBuscar, Gallina.class)) {
            System.out.println(p);
           }
           break;

          case 6:
           System.out.println("Ingresa el color del ojo de la " + Animal + " buscada");
           String ColorOjo = sc.next();
           System.out.println("Las " + Animal + "s con ojos " + ColorOjo + " son:");
           if (corral.getOjosColor(ColorOjo, Gallina.class).size() != 0) {
            for (Gallina p : corral.getOjosColor(ColorOjo, Gallina.class)) {
             System.out.println(p);
            }
           } else {
            System.out.println("No hay");
           }
           break;

          case 8:
           System.out.println("Ingresa el volumen del cacareo de la " + Animal + " buscada");
           String Volumen = sc.next();
           System.out.println("Las " + Animal + "s con volumen " + Volumen + " son:");
           if (corral.getVolumen(Volumen, Gallina.class).size() != 0) {
            for (Gallina p : corral.getVolumen(Volumen, Gallina.class)) {
             System.out.println(p);
            }
           } else {
            System.out.println("No hay");
           }
           break;

          case 7:
           System.out.println("Ingresa los datos de la " + Animal + " a buscar");

           System.out.println("Escribe el nombre de la Gallina");
           Nombre = sc.next();

           System.out.println("Escribe la raza de la Gallina");
           raza = sc.next();

           System.out.println("Ingresa la edad");
           edad = sc.nextInt();

           System.out.println("Ingresa el color de la " + Animal);
           sc.next();
           color = sc.nextLine();

           System.out.println("Ingresa el color del ojo derecho");
           DeOjoColor = sc.nextLine();

           System.out.println("Ingresa el color del ojo izquierdo");
           IzqOjoColor = sc.nextLine();

           System.out.println("Ingresa el tipo del ojo derecho");
           DeOjoTipo = sc.nextLine();

           System.out.println("Ingresa el tipo del ojo izquierdo");
           IzqOjoTipo = sc.nextLine();

           System.out.println("Ingresa el volumen del cacareo");
           LadridoVolumen = sc.nextLine();

           Gallina gallinab = new Gallina(Nombre, raza, edad, new Ojo(DeOjoColor, DeOjoTipo), new Ojo(IzqOjoColor, IzqOjoTipo), new Cacareo(LadridoVolumen));

           System.out.println("Hay " + corral.getAnimalB(gallinab, Gallina.class).size());
           for (Gallina p : corral.getAnimalB(gallinab, Gallina.class)) {
            System.out.println(p);
           }
           break;

          case 9:
           System.out.println("La suma de las edades es:");
           System.out.println(corral.getSumaEdades(Gallina.class));

           break;
          case 10:
           System.out.println("El promedio de las edades es:");
           System.out.println(corral.getPromedioEdades(Gallina.class));
           break;

          case 0:
           System.out.println("Adios");
           repetir = false;
           break;
         }
         break;


        case 0:
         System.out.println("Adios");
         repetir = false;
         break;
        default:
         corral.FiltrarTipo(Perro.class).forEach(a ->{
          System.out.println(a);
         });
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