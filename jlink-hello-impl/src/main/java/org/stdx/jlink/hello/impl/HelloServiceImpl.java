package org.stdx.jlink.hello.impl;

import org.stdx.jlink.hello.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
