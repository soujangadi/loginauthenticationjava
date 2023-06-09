package setterinjection;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	public class TestDepartment1{

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("Department1Context.xml");
			Department1 stud = (Department1)context.getBean("deptbean");
			stud.displayRecords();

		}


}
