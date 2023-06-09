package setterinjection;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

			public class Testindianjearse {
				public static void main(String[] args) {
					ApplicationContext context = new ClassPathXmlApplicationContext("IndianjearseyContext.xml");
					IndianJearsey emp = (IndianJearsey)context.getBean("jearseybean");
				    emp.displayTeam();		
				}



}
