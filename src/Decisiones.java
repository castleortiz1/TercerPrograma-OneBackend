public class Decisiones {

    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

// codigo que prueba los operadores relacionales.
//        if (fechaDeLanzamiento >= 2022) {
//            System.out.println("peliculas mas populares.");
//        } else {
//            System.out.println("Peliculas Retro que aun vale la pena ver.");
//        }

//        if (incluidoEnElPlan || tipoPlan.equals("plus")) {
//            System.out.println("Disfrute de su pelicula.");
//        } else {
//            System.out.println("Pelicula no disponible para su plan actual.");
//        }

        if (incluidoEnElPlan && tipoPlan.equals("plus") && notaDeLaPelicula >= 7.8) {
            System.out.println("Esta pelicula es una gran obra y se encuentra disponible para su plan actual.");
        } else {
            System.out.println("Esta pelicula no es una gran obra o no se encuentra disponible para su plan actual.");
        }

        System.out.println("Fin del programa.");
    }
}
