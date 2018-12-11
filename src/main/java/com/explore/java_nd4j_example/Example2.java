package com.explore.java_nd4j_example;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Example2 {
	
	public static void main (String[] args) {
		
		INDArray nd = Nd4j.create(new float[] {1,2,3,4}, new int[] {2,2});
		INDArray ndv;
		
		System.out.println(nd);
		System.out.println();
		
		ndv = nd.transpose(); //the two and the three switch- a simple transpose
		System.out.println(ndv);
		
		System.out.println("\nNew Data");
		INDArray nd2 = Nd4j.create(new float[] {1,2,3,4,5,6,7,8,9,10,11,12}, new int[] {2,6}); //rows and column
		System.out.println(nd2);
		
		System.out.println("\nTranpose the new data");
		INDArray ndv2 = nd2.transpose();
		System.out.println(ndv2);
		
		System.out.println("\nReshape the trasposed data");
		ndv2 = nd2.reshape(3,4);
		System.out.println(ndv2);
		
//		System.out.println(ndv2.isVector());
//		System.out.println(ndv2.isMatrix());
	}
}
