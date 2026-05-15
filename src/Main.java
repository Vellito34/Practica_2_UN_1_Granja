public class Main {
    public static void main(String[] args){

       Coral coral = new Coral();

       Perro perrito,perro;
       perrito = new Perro("Chuchin","Chihuahua",8,new Rabo("Negro","Largo"),new Ojo("Cafe","Chinos"),new Ojo("Cafe","Chinos"));
        coral.AgregarPerro(perrito);

        perro = new Perro("Juan","Chihuahua",8,new Rabo("Negro","Largo"),new Ojo("Cafe","Chinos"),new Ojo("Cafe","Chinos"));
        coral.AgregarPerro(perro);



    }
}