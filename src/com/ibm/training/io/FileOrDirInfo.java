package com.ibm.training.io;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class FileOrDirInfo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String path = kb.nextLine();
		
		File aFileOrFolder = new File(path);
		if(aFileOrFolder.exists()) {
			System.out.println("Path exists and is a " + (aFileOrFolder.isDirectory() ? "directory":"file"));
			if(aFileOrFolder.isFile()) {
				System.out.println("Absolute Path: "+aFileOrFolder.getAbsolutePath());
				Date lastMod = new Date(aFileOrFolder.lastModified());
				System.out.println("Last Modified: "+lastMod);
				System.out.println("Size: "+aFileOrFolder.length());
				System.out.println("Permissions: "+(aFileOrFolder.canRead()?"r":"")+(aFileOrFolder.canWrite()?"w":"")+(aFileOrFolder.canExecute()?"x":""));
			}else {
				System.out.println("Listing for the directory: ");
				File[] contents = aFileOrFolder.listFiles();
				for(int i = 0; i < contents.length; i++) {
					Date lastMod = new Date(contents[i].lastModified());
					System.out.print(lastMod+"\t");
					System.out.print((contents[i].isDirectory()?"<DIR>":"")+"\t");
					System.out.print(contents[i].length()+"\t");
					System.out.print(contents[i].getName()+"\n");
				}
				
				
			}
		}else {
			System.out.println("path does not exist.");
		}
	}

}
