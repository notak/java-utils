package utils.stuff;

import java.util.Arrays;
import java.util.Objects;

public class Equals {
	public static boolean equals(Object a, Object b) {
		return Objects.deepEquals(a, b);
	}
	public static boolean equals(boolean a, boolean b) {
		return a==b;
	}
	public static boolean equals(char a, char b) {
		return a==b;
	}
	public static boolean equals(byte a, byte b) {
		return a==b;
	}
	public static boolean equals(short a, short b) {
		return a==b;
	}
	public static boolean equals(int a, int b) {
		return a==b;
	}
	public static boolean equals(long a, long b) {
		return a==b;
	}
	
	public static boolean equalsUnset(String a) {
		return a==null || a.isEmpty();
	}
	public static boolean equalsUnset(Object a) {
		return a==null;
	}
	public static boolean equalsUnset(boolean a) {
		return !a;
	}
	public static boolean equalsUnset(char a) {
		return a==0;
	}
//	public static boolean equals(byte a) {
//		return a==b;
//	}
//	public static boolean equals(short a) {
//		return a==b;
//	}
//	public static boolean equals(int a) {
//		return a==b;
//	}
	public static boolean equalsUnset(long a) {
		return a==0;
	}

	//	public static <T> boolean equals(T[] a, T[] b) {
//		return Arrays.deepEquals(a, b);
//	}
//	public static boolean equals(boolean[] a, boolean[] b) {
//		return Arrays.equals(a, b);
//	}
//	public static boolean equals(char[] a, char[] b) {
//		return Arrays.equals(a, b);
//	}
//	public static boolean equals(byte[] a, byte[] b) {
//		return Arrays.equals(a, b);
//	}
//	public static boolean equals(short[] a, short[] b) {
//		return Arrays.equals(a, b);
//	}
//	public static boolean equals(int[] a, int[] b) {
//		return Arrays.equals(a, b);
//	}
//	public static boolean equals(long[] a, long[] b) {
//		return Arrays.equals(a, b);
//	}
}
