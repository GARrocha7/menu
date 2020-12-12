import java.util.Scanner;
public class exm1 {

    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in );
        int n;
        System.out.println("ingresar el tamaño del vector");
        n=entrada.nextInt ();
        int vector1[]=new int[n];
        int vector2[]=new int[n];
        int suma[]=new int[n];
        System.out.println ();
        System.out.println ("INGRESAR DATOS DEL VECTOR 1");
        for(int i =0;i<n;i++)
        {
            System.out.print("Vector A["+(i+1)+"]=");
            vector1[i]=entrada.nextInt();
        }
        System.out.println ("INGRESAR DATOS DEL VECTOR 2");
        for(int i =0;i<n;i++)
        {
            System.out.print("Vector B["+(i+1)+"]=");
            vector2[i]=entrada.nextInt();
        }
            for(int i =0;i<n;i++)
                     {
                          suma[i]=vector1[i]+vector2[i];
                     }
                   for(int i =0;i<n;i++)
                             {
                                 System.out.print("la suma de los vectores es: "+vector1[i]+"+"+vector2[i]+"= "+suma[i]);
                                 System.out.println("\t");
                                 if (i%2==0)
                                 {
                                     System.out.println("VECTOR A["+vector1[i]+"]VECTOR B["+vector2[i]+"]  "+"El mayor es= "+suma[i]);
                                 }
                             }
    //    int may=suma[0];
    //    for(int i =1;i>n;i++)
      //  {
        //    if (suma[i]<may)
         //   {
         //       may=suma[i];
         //       System.out.println("el mayor es: "+may);
         //   }
       // }
    }
}
