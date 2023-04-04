package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.client;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.factory.CharacterFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.factory.impl.WarriorFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.producer.Game;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.product.Character;

class Client {
	public static void main(String[] args) {

		CharacterFactory warriorFactory = new WarriorFactory();
		Game game = new Game(warriorFactory);
		Character warrior = game.createCharacter();

	}
}