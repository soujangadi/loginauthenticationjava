package com.Rakten.Maven;

	import java.util.Iterator;
	import java.util.List;

	public class Booklist {
			private int sno;
			private String Booktitle;
			private int nopages;
			private int price;
			private int qty;
			private int total;
			private List<String> lst;
			
			public Booklist(int sno, String booktitle, int noofpages, int price, int qty, List<String> lst, int nopages) {
				
				this.sno = sno;
				Booktitle = booktitle;
				this.nopages = nopages;
				this.price = price;
				this.qty = qty;
				this.lst = lst;
				extracted();
			}


			private int extracted() {
				int i = this.total = qty*price;
				return i;
			}
			

			void displayRecords() {
				
				System.out.println(this.sno+"\t\t"+this.Booktitle+"\t\t"+this.price+"\t\t"+this.qty+"\t\t"+this.total+"\t\t"+this.lst);
				Iterator<String>itr = lst.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
			
			}	
			}
		}

		


