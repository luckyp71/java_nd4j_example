package com.explore.java_nd4j_example;

import java.util.Arrays;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Example3 {

	public static void main (String[] args) {

		INDArray data = Nd4j.create(new float[]{1,1,1,1,1,1},new int[] {3,2});
		System.out.println("Initial data");
		System.out.println(data);
		
		//Sum the values
		double sum = data.sumNumber().doubleValue();
		System.out.println("\nThe total value of data values: "+sum);
		
		//Modify array data
		data.putScalar(0,1, 2.0); //row 0 column 1
		data.putScalar(0, 0, 30.0); //row 0 column 0
		
		System.out.println("\nData after modification\n"+data);
		
		//Get data info
		System.out.println("\nData Summary:\nNumber of rows: "+data.size(0)); //data.rows()
		System.out.println("Number of columns: "+data.size(1)); //data.columns()
		System.out.println("Data dimensions: "+data.rank()); //data dimensions
		System.out.println("Length: "+data.length()); //3 rows * 2 columns = 6 elements
		System.out.println("Data shape: "+Arrays.toString(data.shape())); //3 rows 2 columns
		
		System.out.println();
		System.out.println(data.getRow(1));
		System.out.println(data.getScalar(0, 1).mul(20)); //get data of row 0 column 1 then mulitply it by 20
	}
}
