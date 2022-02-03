package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("myCorolla")
public class Corolla implements Car {
	
	Engine engine;

	
	public void setEngine(Engine engine) {
		engine.type="New V8888 from setEngine Method";
		this.engine = engine;
	}
	
	@Autowired
	public Corolla(Engine engine) {
		engine.type="New V8 from constructor";
		this.engine = engine;
	}

	public String specs() {
		String specs = "Sedan from Toyota with engine type as " + engine.type;
		return specs;
	}

}
