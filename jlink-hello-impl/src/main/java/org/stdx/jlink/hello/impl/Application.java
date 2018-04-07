package org.stdx.jlink.hello.impl;

public class Application {
	public static void main(String[] args) {
		final HelloServiceImpl helloServiceImpl = new HelloServiceImpl();
		if (args != null && args.length >= 1) {
			System.out.println(helloServiceImpl.sayHello(args[0]));
		} else {
			System.out.println(helloServiceImpl.sayHello("world"));
		}

	}
}
