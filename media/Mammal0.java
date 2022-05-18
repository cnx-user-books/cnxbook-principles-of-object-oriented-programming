abstract class Mammal {}


class Cat extends Mammal {
	boolean givesMilk() {
		return true;
	}
	
	String makeSound() {
		return "Meow";	
	}

	boolean givesLiveBirth() {
		return true;
	}
}


class Monkey extends Mammal {
	boolean givesMilk() {
		return true;
	}
	
	String makeSound() {
		return "Screech";	
	}

	boolean givesLiveBirth() {
		return true;
	}
}


class Whale extends Mammal {
	boolean givesMilk() {
		return true;
	}
	
	String makeSound() {
		return "[whale song]";	
	}

	boolean givesLiveBirth() {
		return true;
	}
}


