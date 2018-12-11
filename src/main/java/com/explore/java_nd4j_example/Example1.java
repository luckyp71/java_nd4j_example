package com.explore.java_nd4j_example;

import org.nd4j.linalg.api.iter.NdIndexIterator;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Example1 {
	public static void main (String[] args) {
		
		int nRows = 2;
		int nColumns = 2;
		
		//Create INDArray of zeros 
		INDArray zeros = Nd4j.zeros(2, 2);
		
		//Create one of all ones
		INDArray ones = Nd4j.ones(nRows, nColumns);
		
		//Vertical stack
		INDArray vstack = Nd4j.vstack(ones, zeros);
		
		//Horizontal stack
		INDArray hstack = Nd4j.hstack(ones, zeros);
		
		//Combine dimension 0
		INDArray combined1 = Nd4j.concat(0, zeros, ones);
	
		System.out.println("Zeros");
		System.out.println(zeros);
		System.out.println();
		
		System.out.println("Ones");
		System.out.println(ones);
		System.out.println();
		
		System.out.println("vstack");
		System.out.println(vstack);
		System.out.println();
		
		
		System.out.println("hstack");
		System.out.println(hstack);
		System.out.println();
		
		
		System.out.println("Combined dimension 0");
		System.out.println(combined1);
		
		
	}

}
