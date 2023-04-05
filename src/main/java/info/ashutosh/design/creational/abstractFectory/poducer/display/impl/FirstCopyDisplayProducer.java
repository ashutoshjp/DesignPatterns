package info.ashutosh.design.creational.abstractFectory.poducer.display.impl;

import info.ashutosh.design.creational.abstractFectory.poducer.display.Display;

public class FirstCopyDisplayProducer extends Display {

	@Override
	public void display() {
		System.out.println("FirstCopyDisplayProducer.display()");
	}

}
