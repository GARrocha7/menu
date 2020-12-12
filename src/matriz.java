import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz[][]=new int[4][3];
        System.out.println("Ingrese elementos de la Matriz: ");
        for (int j=0; j<4; j++){
            for (int i=0; i<3; i++){
                System.out.print("["+j+"]["+i+"]: ");
                matriz[j][i] = teclado.nextInt();
            }
        }
        System.out.println("Mostrar Matriz: ");
        for (int j=0; j<4; j++){
            for (int i=0; i<3; i++){
                System.out.print(+matriz[j][i]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Ingrese fila: ");
        int fila=teclado.nextInt();
        int i=0;
        System.out.print("["+fila+"]["+i+"]: ");
        if (fila<=4){
            for (int j=fila; j<=fila; j++){
                for (i=0; i<3; i++){
                    System.out.println(matriz[j][i]);
                }
            }
        }else{
            System.out.println("Fila inexistante");
        }
        System.out.println("Ingrese columna: ");
        int columna=teclado.nextInt();
        int j=0;
        System.out.print("["+j+"]["+columna+"]: ");
        if (columna<=3){
            for (j=0; j<4; j++){
                for (i=columna; i<=columna; i++){
                    System.out.println(matriz[j][i]);
                }
            }
        }else{
            System.out.println("Columna inexistente");
        }

    }

}