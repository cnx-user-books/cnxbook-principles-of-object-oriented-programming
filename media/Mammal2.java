abstract class Mammal {    

	boolean givesMilk() {
		return true;
	}

    abstract String makeSound();

    abstract boolean givesLiveBirth();
}


class Cat extends Mammal {
	
	String makeSound() {
		return "Meow";	
	}

    boolean givesLiveBirth() {
        return (true);
    }
}


class Monkey extends Mammal {
	
	String makeSound() {
		return "Screech";	
	}

      boolean givesLiveBirth() {
        return (true);
    }
}


class Whale extends Mammal {
	
	String makeSound() {
		return "[whale song]";	
	}

    boolean givesLiveBirth() {
        return (true);
    }
}


class DuckbilledPlatypus extends Mammal {
	
	String makeSound() {
		return "Growl";	
	}

    boolean givesLiveBirth() {
         return (false);
    }
}
