package geekbrains.homework;

public class Dog extends Animals {
    private static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            super.run(length);
        } else {
            System.out.println(name + " не может пробежать больше 500 м.");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            super.swim(length);
        } else {
            System.out.println(name + " не может проплыть больше 10 м.");
        }
    }

    @Override
    public void setCount() {
        super.setCount();
        System.out.println("Собак: " + count);
    }
}
