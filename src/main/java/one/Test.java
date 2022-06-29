package one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@SuppressWarnings("resourse")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Customer customer = context.getBean(Customer.class);
		System.out.println(customer);
		
		Adress adress=context.getBean(Adress.class);
		System.out.println(adress);

	}

}
