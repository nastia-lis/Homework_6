package geekbrains.homework;

public class Cat extends Animals {
    private static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            super.run(length);
        } else {
            System.out.println(name + " не может пробежать больше 200 м.");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(name + " не умеет плавать.");
    }

    @Override
    public void setCount() {
        super.setCount();
        System.out.println("Кошек: " + count);
    }
}
