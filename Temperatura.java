package electivaIII;
import java.util.Scanner;

public class Temperatura {
     public static void vizualizar(){
     float celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca los grados celsius: ");
        celsius = sc.nextFloat();
        // Calcular
        float fahrenheit = celsiusAFahrenheit(celsius);
        System.out.printf("si %f egrados son celsius entoces, son %f grados fahrenheit", celsius, fahrenheit);
     }
     
     
    public static float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }

    public static float fahrenheitACelsius(float fahrenheit) {
        return (fahrenheit - 32) / 1.8f;
    }
}
