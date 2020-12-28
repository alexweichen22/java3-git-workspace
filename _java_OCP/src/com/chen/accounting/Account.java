package com.chen.accounting;
public class Account {
    public static void main(String args[]) throws Exception {
        // Test
	System.out.println("System Test1 - Hello World");
	System.out.println("################################");

	// Test main method argument (String[])
	System.out.println("System Test2 - main method arguments amount & each arguments");
	System.out.println(args.length);
		for (int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	System.out.println("################################");
	
	// Test array 1 dimention
	int[] arrInt = new int[10];
	for(int i=0;i<arrInt.length;i++){
		arrInt[i]=i*2;
		System.out.println(arrInt[i]);		
	}
	System.out.println("################################");

	// Test array - 3 dimension
	int[][][] arrD3Int = new int[5][10][15];
	System.out.println(arrD3Int.length);
	System.out.println(arrD3Int[0].length);
	System.out.println(arrD3Int[0][0].length);

	// Test array-list
    }

}
