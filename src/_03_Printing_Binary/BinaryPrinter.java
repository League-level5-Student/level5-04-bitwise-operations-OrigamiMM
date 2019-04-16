package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary((byte)3);
		System.out.println("");
		bp.printShortBinary((short)400);
	}
	
	public void printByteBinary(byte b) {
		for (int i = 7; i > -1; i--) {
			byte c = (byte) (b & (1 << i));
			c >>= i;
			System.out.print(Math.abs(c));
			
		}
	}
	
	public void printShortBinary(short s) {
		byte c = (byte) (s & 0b000000011111111);
		printByteBinary(c);
		c = (byte) (s >>8);
		printByteBinary(c);
	}
	
	public void printIntBinary(int i) {
		
	}
	
	public void printLongBinary(long l) {
		
	}
}
