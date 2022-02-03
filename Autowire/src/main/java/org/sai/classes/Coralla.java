package org.sai.classes;

import org.sai.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("coralla")
public class Coralla implements Car{

	//Engine engine=new Engine();
	
	@Autowired
	Engine engine;	
	@Override
	public String specs() {
		
		String specs="Hatchback from Suziki type as"+engine.type;
		return specs;
	}
}
