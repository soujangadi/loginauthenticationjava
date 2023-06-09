package setterinjection;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	public class TestStudents{

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("StudentsContext.xml");
			Students1 stud = (Students1)context.getBean("stubean");
			stud.studentdetails();

		}


}
