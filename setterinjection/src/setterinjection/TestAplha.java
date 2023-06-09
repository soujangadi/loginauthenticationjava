package setterinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAplha {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("AutoWire.xml");
		Alpha a=context.getBean("alpha",Alpha.class);
		a.displayDetails();
		
	}

}
