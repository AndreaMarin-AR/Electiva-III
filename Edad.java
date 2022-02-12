package electivaIII;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Edad {
    public static void vizualizar(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número del día nacimiento: ");
        int dia = teclado.nextInt();
        System.out.print("Numero del mes nacimiento: ");
        int mes = teclado.nextInt();
        System.out.print("Año de nacimiento: ");
        int ano = teclado.nextInt();
        System.out.println("\nTu edad es: " + calcularEdad(dia, mes, ano));
    }
    
    static int calcularEdad(int dia, int mes, int ano) {
	LocalDate fechaHoy = LocalDate.now();
	LocalDate fechaNacimiento = LocalDate.of(ano, mes, dia);
	Period periodo = Period.between(fechaNacimiento, fechaHoy);
	return periodo.getYears();
    }
}
