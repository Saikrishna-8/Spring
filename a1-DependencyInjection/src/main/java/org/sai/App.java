package org.sai;

import org.sai.classes.Coralla;
import org.sai.classes.Swift;
import org.sai.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car swift=new Swift();
		Car coralla=new Coralla();
		
		System.out.println(swift.specs());
		System.out.println(coralla.specs());
		
		AnnotationConfigApplicationContext context=new 
				 AnnotationConfigApplicationContext(AppConfig.class);
		
		Car mycar=context.getBean("coralla",Car.class);
		System.out.println(mycar.specs());
		
		mycar=context.getBean("swift",Car.class);
		System.out.println(mycar.specs());
		context.close();
	}

}
