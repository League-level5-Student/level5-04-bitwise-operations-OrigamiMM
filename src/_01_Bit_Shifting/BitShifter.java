package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary. 1 0 0
		int num = 4;
		int numShifted = num << 3;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		System.out.println(0b100000);
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
