import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Testing {
	public static void main(String[] args) {
		Thread t = new Thread(()-> {
			for (int i = 0; i < 10; i++) {
				System.out.println("monday");
			}
		});
		t.start();
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
		
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			strings.add((char)(i+70) + "");
		}
		Stream<String> dubStream = strings.stream();
		
		dubStream.forEach((e)->{
			System.out.println(e.charAt(0));
		});
	}
}
