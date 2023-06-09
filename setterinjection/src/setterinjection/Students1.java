package setterinjection;


public class Students1 {
	

		 private int id;  
		 private String name;  
		 private Address address;  
		  
		
		 
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		
		  
		public void studentdetails() {
			System.out.println("Id\t\t|Name\t\tcity\t\tState\t\tCountry");
				System.out.println(this.id+"\t\t"+this.name+"\t\t"+this.address.city+"\t\t"+this.address.state+"\t\t"+this.address.country);
				
			}


		}
		 



