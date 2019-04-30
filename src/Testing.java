import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Testing {
	public static void main(String[] args) {
		int[] list = new int[100];
		Random r = new Random();
		for (int i = 0; i < list.length; i++) {
			list[i] = r.nextInt(500);
		}
		
		Arrays.stream(list).sorted();
		
		System.out.println("");
		Arrays.stream(list).sorted().forEach((object)->{
			System.out.println(object);
		});
	}
}
