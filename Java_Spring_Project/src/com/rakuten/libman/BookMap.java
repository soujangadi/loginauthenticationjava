package com.rakuten.libman;
import java.util.Iterator;
import java.util.Map;

public class BookMap {
	Map<Integer,Book> mbook;

public BookMap(Map<Integer, Book> mbook) {
		this.mbook = mbook;
	}

public void displayBook() {
	double final_amt=0;
	System.out.println("--------------------------------------------------------------------");
	System.out.println("ISBN\tBook Title\tNo.Of Pages\tPrice\tQuantity\tAmount");
	System.out.println("--------------------------------------------------------------------");
	Iterator<Map.Entry<Integer, Book>> itr =mbook.entrySet().iterator();
	while(itr.hasNext()) 
	{
		Map.Entry<Integer, Book> entry=itr.next();
		double total=entry.getValue().qty*entry.getValue().price;
		System.out.println(entry.getKey()+"\t"+entry.getValue().title+"\t"+entry.getValue().pages+"\t\t"
				+entry.getValue().price+"\t"+entry.getValue().qty+"\t"+total);
		final_amt=total;
	}
	System.out.println("--------------------------------------------------------------------");
	System.out.println("\t\t\t\tTotal" + final_amt);
	System.out.println("--------------------------------------------------------------------");
}
}