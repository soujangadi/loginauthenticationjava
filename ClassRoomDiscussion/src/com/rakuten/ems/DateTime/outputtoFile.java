package com.rakuten.ems.DateTime;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class outputtoFile {
		public static void main(String[] args) {
			try {
				FileOutputStream fout = new FileOutputStream("/Users/ts-soujanya.angadi/Documents/souji.txt");
				int k=45567;
				String j=k+"";
				
				fout.write(j.getBytes());
						fout.flush();
						fout.close();
						System.out.println("Success");
			}
			catch (FileNotFoundException e) {
				System.out.println("Failed due to"+ e.getMessage());
				
			}
			catch (IOException ioe) {
				System.out.println("Failed due to"+ ioe.getMessage());
		}
	}
	}
	
	

