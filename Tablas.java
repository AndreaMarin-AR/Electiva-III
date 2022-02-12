package electivaIII;
import java.util.Scanner;
public class Tablas {
    public static void vizualizar(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Por favor introduzca un número entero: ");                                                         
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);       
        }
    }
}
