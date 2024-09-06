package com.ibm.training.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopier {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		String inputFilePath = args[0];
		String outputFilePath = args[1];
		
		File src = new File(inputFilePath);
		File dest = new File(outputFilePath);
		
		try {
			FileInputStream fin = new FileInputStream(src);
			FileOutputStream fout = new FileOutputStream(dest);
			BufferedInputStream bin = new BufferedInputStream(fin);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			int aByte = -1;
			while((aByte = bin.read()) != -1) {
				bout.write(aByte);
			}
			
			bin.close();
			bout.close();
			
			long stopTime = System.currentTimeMillis();
			
			System.out.println("Finished coying in "+(stopTime - startTime)+" ms.");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
