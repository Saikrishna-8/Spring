package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.Corolla;
import org.studyeasy.cars.Swift;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
			new	AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar =  context.getBean("myCorolla", Car.class);
		System.out.println(myCar.specs());
		context.close();
		
	}

}
