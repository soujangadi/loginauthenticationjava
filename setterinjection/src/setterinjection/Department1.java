package setterinjection;

	import java.util.Iterator; //when list or map the iterarator is been used
	import java.util.List;

	public class Department1 {
		private int deptid;
		private String deptname;
		private List<String> lst; //using list 
		
		public int getDeptid() {
			return deptid;
		}

		public void setDeptid(int deptid) {
			this.deptid = deptid;
		}

		public String getDeptname() {
			return deptname;
		}

		public void setDeptname(String deptname) {
			this.deptname = deptname;
		}

		public List<String> getLst() {
			return lst;
		}

		public void setLst(List<String> lst) {
			this.lst = lst;
		}

		void displayRecords() {//methods to display
			System.out.println(this.deptid+"\t\t"+this.deptname);
			Iterator<String>itr = lst.iterator();// iterator has been called
			while(itr.hasNext()) {
				System.out.println(itr.next());
		
		}	
		}
	}


