
import java.util.Random;
import java.util.Scanner;

public class Main {

    private Scanner scanner;

    private boolean done = false;

    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }

    private void run() {
        scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamano de la matriz: ");

        int tamanoMatriz = scanner.nextInt();
        int[] x = new int[tamanoMatriz];


        x = fillMatrix(x);

        while(!done) {
            int cont1=0;
            int cont2=0;
            int cont3=0;
            System.out.print(" \n1.-Metodo Burbuja \n2-.Metodo Shell \n3-.Metodo Seleccion \n4-.Datos metodo Burbuja " +
                    "\n5-.Datos metodo Shell \n6-.Datos metodo Seleccion \n6-.Tiempos de los Metodos \n0=salir, \nEscoge la opcion :");
            int option = scanner.nextInt();
            processOption(option, x);
        }
        scanner.close();
    }

    /**
     * proces option
     *
     * @param option
     * @param matrix
     */
    private void processOption(int option, int[] matrix) {
        if (option == 0)
            salir();
        else if (option == 1)
            // printMatrix(burbuja(matrix));
               burbuja(matrix);
        else if (option == 2)
            // printMatrix(shell(matrix));
           shell(matrix);
        else if (option == 3)
            //printMatrix(seleccion(matrix));
          seleccion(matrix);
        else if (option == 4)
            printMatrix(seleccion(matrix));
            //    seleccion(matrix);
        else if (option == 5)
            printMatrix(seleccion(matrix));
            //    seleccion(matrix);
        else if (option == 6)
            printMatrix(seleccion(matrix));
            //    seleccion(matrix);
        else if (option == 7)
            //printMatrix(seleccion(matrix));
            //    seleccion(matrix);

        else
            System.out.println("Opcion invalida!");
    }

    /**
     * Salir del programa
     */
    private void salir() {
        done = true;
        System.out.println("Bye!");
    }

    /**
     * Metodo de ordenamiento burbuja, link de referencia: http://puntocomnoesunlenguaje.blogspot.com/2012/07/metodo-de-ordenacion-burbuja.html
     *
     * @param A Matrix a ordenar
     * @return matrix ordenada
     */
    private int[]  burbuja(int[] A) {
        // Inicio del metodo
        long startTime = System.nanoTime();
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        // fin del metodo
        long endTime = System.nanoTime();
        System.out.println("la duracion del proceso es:" + (endTime-startTime)/1e6 + " ms");
        return A;
    }

    /**
     * Metodo de ordenamiento shell, link de referencia http://puntocomnoesunlenguaje.blogspot.com/2014/09/metodo-shell-de-ordenacion.html
     * @param A matrix value:
     * @return matriz ordenada.
     */
    private int[] shell(int A[]) {
        // Inicio del metodo
        long startTime = System.nanoTime();

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.
                    }
                }
            }
        }
        // fin del metodo
        long endTime = System.nanoTime();
        System.out.println("la duracion del proceso es:" + (endTime-startTime)/1e6 + " ms");

        return A;
    }

    /**
     * Metodo de ordenamiento por seleccion, link de referencia https://parzibyte.me/blog/2020/08/30/java-ordenamiento-seleccion/
     *
     * @param A
     * @return
     */
    private int[] seleccion(int A[]) {
        // Inicio del metodo
        long startTime = System.nanoTime();

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i+1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int temporal = A[i];
                    A[i] = A[j];
                    A[j] = temporal;
                }

            }
        }

        // fin del metodo
        long endTime = System.nanoTime();
        System.out.println("la duracion del proceso es:" + (endTime-startTime)/1e6 + " ms");
        return A;
    }

    /**
     * Llenado de la matriz.
     *
     * @param x - Tamanio de la matriz.
     * @return una matrix con valores aleatorios.
     */
    private int[] fillMatrix(int[] x) {
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt();
        }
        return x;
    }

    /**
     * Imprime la matriz
     *
     * @param matrix matriz que se desea imprimir
     */
    private void printMatrix(int[] matrix) {
        System.out.println("Matriz ordenada");
        for (int i = 0; i < matrix.length ; i++) {
            System.out.println(matrix[i]);
        }
    }
}
