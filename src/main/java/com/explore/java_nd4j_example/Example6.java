package com.explore.java_nd4j_example;

import java.io.File;
import java.io.IOException;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.dataset.api.preprocessor.Normalizer;
import org.nd4j.linalg.dataset.api.preprocessor.NormalizerStandardize;
import org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerSerializer;

public class Example6 {

	public static void main (String[] args) throws Exception {
		//A new normalizer can just be instantiated without any arguments, as we will fit it separately
		NormalizerStandardize normalizer = new NormalizerStandardize();
		normalizer.fitLabel(true);
		
		// Create random dataset
		DataSet data = new DataSet(Nd4j.rand(2,3), Nd4j.rand(2,1));
		System.out.println(data);
		
        // Fit the normalizer to the data - in this case it will calculate the means and standard deviations
		normalizer.fit(data);
		System.out.println("\nMeans original: "+normalizer.getMean());
		System.out.println("Stds original: "+normalizer.getStd());
		
        //Save the normalizer to a binary file. For doing this, one can use the NormalizerSerializer.
		NormalizerSerializer serializer = NormalizerSerializer.getDefault();
		
	    // Prepare a temporary file to save to and load from
		File tmpFile = File.createTempFile("nd4j-example", "normilizers");
		tmpFile.deleteOnExit();
		
	    // Save the normalizer to a temporary file
	    serializer.write(normalizer, tmpFile);
	       
	    //Restore the normalizer from the temporary file.
	     NormalizerStandardize restoredNormalizer = serializer.restore(tmpFile);

	     //Output the feature means and standard deviations so we can verify it was restored correctly
	     System.out.println("Means restored: " + restoredNormalizer.getMean());
	     System.out.println("Stds restored:  " + restoredNormalizer.getStd());
	     
	}
	
}