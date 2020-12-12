import java.util.Scanner;
public class exm2
{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in );
        int a=0,b=0;
        int busca;
        int posicion=0,fila=0,columna=0;
        System.out.println("ingresar dimensión de la matriz");
        System.out.print("valor de matriz x=");
        a=entrada.nextInt ();
        System.out.print("valor de matriz y=");
        b=entrada.nextInt ();
        int m[][]=new int[a][b];
        System.out.println ("ingrese los valores para la matriz");
        for(int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                System.out.print("matriz["+i+"]["+j+"] = ");
                m[i][j]=entrada.nextInt ();
            }
        }
        System.out.println("datos de la matriz de 4x3");
        for(int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                System.out.print ("   "+m[i][j]);
            }
            System.out.println ();
        }
        System.out.println("busca el numero dentro de la matriz");
        busca=entrada.nextInt ();
        int cont=1;
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                if(m[a][b]==busca)
                {
                    posicion=cont;
                    fila=i;
                    columna=j;
                }
                cont++;

            }
            if(posicion<=1)
            {
                System.out.println("elemento encontrado en la posicion "+posicion+"del arreglo");
                System.out.println("se encuentra en la fila "+(fila+1)+"columna"+(fila+1));
            }
            else
            {
                System.out.println("elemento no encontrado");
            }
        }

    }
}
