package electivaIII;
import java.util.Scanner;
public class Calculadora {
    
    public static void vizualizar(){
        System.out.println("Ingrese el primer numero y luego el segundo numero:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println("Que operacion desea realizar: 1 para suma, 2 para resta, 3 para multiplicacion and 4 para division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(sum( num1,num2));
            break;
        case 2:
            System.out.println(res( num1,num2));
            break;     
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
            default:
                System.out.println("Error, esto no esta permitido");
        }
    }
    
    public static int sum(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int res(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
}
