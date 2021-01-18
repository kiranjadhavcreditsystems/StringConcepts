package com.csi.stringbasics;

public class StringBasicsConcepts {
	public static void main(String[] args) {

		
		String empName = "";
		String s1 = "CREDIT";
		String s2 = new String("CREDit");
		System.out.println("\n s2.toUpperCase(): "+s2.toUpperCase());
		System.out.println("\n s1==s2" + s1 == s2);

		System.out.println("\n s1.equals(s2): " + s1.equals(s2));

		System.out.println("\n s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));

		System.out.println("\n s1.charAt(4): " + s1.charAt(4));

		System.out.println("\n s1.length(): " + s1.length());

		s1.concat(s2);// Immutable
		System.out.println("\n s1: " + s1);

		System.out.println("\n s1.substring(3): " + s1.substring(3));

		System.out.println("\n s1.substring(2, 4): " + s1.substring(2, 4));

		System.out.println("\n s1.compareTo(s2): " + s1.compareTo(s2));

		if (empName.isEmpty()) {
			System.out.println("Empty");
		} else {
			System.out.println("Not Empty");
		}

		StringBuffer sb1 = new StringBuffer("CSI");
		StringBuffer sb2 = new StringBuffer("CSI");
		sb1.append(sb2);// Mutable
		System.out.println("\n sb1: " + sb1);

		System.out.println(sb1.charAt(5));

		StringBuilder sBuilder1 = new StringBuilder("FULLSTACK");
		StringBuilder sBuilder2 = new StringBuilder("FULLSTACK");


		sBuilder1.append(sBuilder2);
		System.out.println("\n sBuilder1: "+ sBuilder1);
	}
}
