package electivaIII;
import java.util.Random;
public class Aleatorio {
    public static void vizualizar(){
        int min = 25;
	int max = 75;

	Random random = new Random();

	int value = random.nextInt(max + min) + min;
	System.out.println(value);
    }
}
