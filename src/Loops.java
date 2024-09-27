import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        // While loop
//        int i = 0;
//        while (i < 10) {
//            System.out.println("El valor de i es: " + i);
//            i++;
//        }
//
//        // For loop
//        for (int j = 0; j < 10; j++) {
//            System.out.println("El valor de j es: " + j);
//        }
//
//        // Enhanced for loop
//        int[] numbers = {1, 2, 3, 4, 5};
//        for (int number : numbers) {
//            System.out.println("El número es: " + number);
//        }
//
//        // Do-while loop
//        int k = 0;
//        do {
//            System.out.println("El valor de k es: " + k);
//            k++;
//        } while (k < 10);
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le daria a la pelicula de Matrix. ");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println(mediaEvaluaciones / 3);

    }
}
