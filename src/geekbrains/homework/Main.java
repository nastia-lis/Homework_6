package geekbrains.homework;

public class Main {

	public static void main(String[] args) {
		Animals[] animals = {
				new Dog("Барсик"),
				new Dog("Бобик"),
				new Dog("Лорд"),
				new Cat("Мурзик"),
				new Cat("Рыжик"),
				new Cat("Бублик")
		};

		for (int i = 0, j = 600, k = 1; i < animals.length; i++, j -= 100, k += 5) {
			animals[i].run(j);
			animals[i].swim(k);
			animals[i].setCount();
		}
	}

}
