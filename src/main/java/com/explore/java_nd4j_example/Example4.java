package com.explore.java_nd4j_example;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import static org.nd4j.linalg.ops.transforms.Transforms.sigmoid;
import static org.nd4j.linalg.ops.transforms.Transforms.abs;


public class Example4 {

	public static void main (String[] args) {
		INDArray nd = Nd4j.create(new float[] {1,2,3,4,5,6,7,8,9,10,11,12}, new int[] {2,6});
		INDArray nd2 = Nd4j.create(new float[] {15,16,17,18,19,20,21,22,23,24,25,26,27,28}, new int[] {2,7});
		INDArray ndv; 
		
		System.out.println("nd data");
		System.out.println(nd);
		
		System.out.println("\n nd2 data");
		System.out.println(nd2);
		
		//Normalizes data and helps activate artificial neurons in deep-learning nets and assigns it to var ndv
		System.out.println("\nAfter normalization");
		ndv = sigmoid(nd);
		System.out.println(ndv);
		
		//Give absolute value
		System.out.println("\nAbsolute value");
		ndv = abs(nd);
		System.out.println(ndv);
		
	}
	
	
}
