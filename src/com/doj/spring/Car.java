package com.doj.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
 * @Component annotation is used to define bean.
 * It is like <bean id="car" class="com.doj.spring.Car"/>
 */

@Component
//@Scope("singleton")-One instance of the bean is created for the entire application.
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)-One instance of the bean is created every time the bean is injected into or retrieved from the Spring application context
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Car {
	
	@Autowired(required=false)
	Engine engine;
	@Autowired
	Tyre tyre;
	@Autowired
	Body body;

	public Car(Engine engine, Tyre tyre, Body body) {
		super();
		this.engine = engine;
		this.tyre = tyre;
		this.body = body;
	}

	public Car() {
		super();
	}
	
	public void driveCar(){
		System.out.println("You are driving a car which has a engine "+this.engine.engineName
				+" has a tyre "+this.tyre.getTyreName()+" has a body "+this.body.getBodyType());
	}
}
