package com.rakuten.libman;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class Indianjearsey {
	private HashMap<Integer,String> hmap;
	
	public Indianjearsey (HashMap<Integer,String > hmap) {
		this.hmap=hmap;
	}

	
	
	public void displayTeam() {
		Iterator<Entry<Integer, String>> itr=hmap.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> e=itr.next();
			
			
			
			System.out.println("Jersey No ="+e.getKey()+"Player Name :"+e.getValue());
		}
		
	}
}
	
		
		
		
	
	


