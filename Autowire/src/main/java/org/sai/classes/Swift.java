package org.sai.classes;

import org.sai.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("swift")
public class Swift implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "Seden from Toyota -----------------";
	}
}
