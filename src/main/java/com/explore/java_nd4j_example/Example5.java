package com.explore.java_nd4j_example;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Example5 {

	public static void main (String[] args) {

		INDArray array1 = Nd4j.ones(2,2);
		
		System.out.println("Initial Array");		
		System.out.println(array1);
		
		//Multiply value of row 1 column 0 by 20
		array1 = array1.putScalar(1,0, array1.getScalar(1,0).mul(20).getFloat(0));
		System.out.println("\nAfter multiplication");
		System.out.println(array1);
	
		//Add value
		array1 = array1.putScalar(1, 0, array1.getScalar(1,0).add(5).getFloat(0));
		System.out.println("\nAfter Addition");
		System.out.println(array1);
		
		INDArray array2 = Nd4j.create(new float[]{100,200,300,400}, new int[] {2,2});
		INDArray combinedArr = Nd4j.concat(0, array1, array2);
				
		System.out.println("\nCombined Array");
		System.out.println(combinedArr);
		
		//Add row vector to matrix
		INDArray vector = Nd4j.create(new float[]{300,400}, new int[] {1,2});
		System.out.println("\nVector:\n"+vector);
		combinedArr = combinedArr.addRowVector(vector);
		System.out.println("\nCombined array after adding row vector:\n"+combinedArr);
		
		//Create matrix using linspace method and shape it into 
		INDArray arr = Nd4j.linspace(10, 100, 10).reshape(2,5);
		System.out.println("\nMatrix using linspace:\n"+arr);
	}
}
