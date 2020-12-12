package suma;
import java.util.Scanner ;

public class suma {

    public static int Suma(int a, int b)
    {

        if(a==0)
        {
            return b;

        }else if(b==0)
        {
            return a;
        }else{
            return 1+Suma(a,b-1);
        }

    }

    public static void main(String[] args) {
        Scanner reader=new Scanner (System.in );

        int x,y,r;
        System.out.println ("ingrese un numero");
        x=reader.nextInt ();
        System.out.println ("ingrese otro numero");
        y=reader.nextInt ();
        r=Suma(x,y);

        System.out.println ("la suma de "+x+" + "+ y+" es: "+r);

    }
}