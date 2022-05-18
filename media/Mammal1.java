abstract class Mammal {    boolean givesMilk() {
		return true;
	}

    abstract String makeSound();

    boolean givesLiveBirth() {
		return true;
	}
}


class Cat extends Mammal {
	
	String makeSound() {
		return "Meow";	
	}
}


class Monkey extends Mammal {
	
	String makeSound() {
		return "Screech";	
	}
}


class Whale extends Mammal {
	
	String makeSound() {
		return "[whale song]";	
	}
}


