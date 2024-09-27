import java.util.Scanner;


public class Lectura {

    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Ingrese el nombre de tu pelicula favorita: ");
//        String pelicula = teclado.nextLine();
//        System.out.println("Ahora escribe la fecha de lanzamiento");
//        int fechaDeLanzamineto = teclado.nextInt();
//        System.out.println("Por Ultimo dinos que nota le das a esta pelicula");
//        double nota = teclado.nextDouble();
//
//        System.out.println(pelicula);
//        System.out.println(fechaDeLanzamineto);
//        System.out.println(nota);
//
//        teclado.close();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Digite su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Digite el valor que pretende investir este mes: ");
        double valor = scanner.nextDouble();

        System.out.println(nombre + " tiene " + edad + " años, investira Lps " + valor + " este mes.");

        scanner.close();
    }
}
