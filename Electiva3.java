package electivaIII;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ElectivaIII {

    public static void main(String[] args) {
         try (Scanner sn = new Scanner(System.in)) {
            boolean salir = false;
            int opcion;
            Edad edad=new Edad();
            Temperatura temperatura=new Temperatura();
            Usuario usuario=new Usuario();
            Calculadora calculadora=new Calculadora();
            Aleatorio aleatorio=new Aleatorio();
            Tablas tablas=new Tablas();
            while(!salir){
            
            System.out.println("1. Calcular la edad personas");
            System.out.println("2. Transformar las unidades de temperatura");
            System.out.println("3. Solicitar los datos usuario");
            System.out.println("4. Calculadora de operaciones basicas");
            System.out.println("5. Generador numeros aleatorios");
            System.out.println("6. Generador de tabla de multiplicar numero ingresado");
            System.out.println("7. Salir");
            
            try{
            
                System.out.println("Seleccione un numero para empezar: ");
                opcion = sn.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println("");
                        edad.vizualizar();
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        temperatura.vizualizar();
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        Usuario.vizualizar();
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        calculadora.vizualizar();
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        aleatorio.vizualizar();
                        System.out.println("");
                        break;
                    case 6:
                        System.out.println("");
                        tablas.vizualizar();
                        System.out.println("");
                        break;
                    case 7:
                        salir=true;
                        break;
                    default:
                        System.out.println("Las opciones a elegir se encuentran entre el numero 1 y el 7");
                    }
            
                
                }catch(InputMismatchException e){
                    System.out.println("Por favor, debes elegir un numero");
                    sn.next();
                }
            
            }
        }
        
        System.out.println("Hasta luego");
    }
    
}
