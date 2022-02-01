package org.sai.classes;

import org.sai.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("coralla")
public class Coralla implements Car{

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "Hatchback from Suziki";
	}
}
