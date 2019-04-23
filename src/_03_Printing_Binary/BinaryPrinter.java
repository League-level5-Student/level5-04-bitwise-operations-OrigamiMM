package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary((byte)3);
		System.out.println("");
		bp.printShortBinary((short)65534);
		System.out.println("");
		bp.printIntBinary(1234567);
		System.out.println("");
		bp.printLongBinary((long)3000000);
	}
	//00000011
	public void printByteBinary(byte b) {
		for (int i = 7; i > -1; i--) {
			byte c = (byte) (b & (1 << i));
			c >>= i;
			System.out.print(Math.abs(c));
			
		}
	}
	//1100100000000000
	//0000000011111111
	//0000000000000000
	
	public void printShortBinary(short s) {
		byte c = (byte) (s & 0b0000000011111111);
		byte c2 = (byte) (s >>8);
		printByteBinary(c2);
		printByteBinary(c);
	}
	
	public void printIntBinary(int i) {
		short s = (short) (i & 0b00000000000000001111111111111111);
		short s2 = (short) (i >> 16);
		printShortBinary(s2);
		printShortBinary(s);
	}
	
	public void printLongBinary(long l) {
		int i =  (int) (l & 0b0000000000000000000000000000000011111111111111111111111111111111);
		int i2 = (int) (l >> 32);
		printIntBinary(i2);
		printIntBinary(i);
	}
}
