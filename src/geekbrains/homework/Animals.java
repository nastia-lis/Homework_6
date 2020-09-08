package geekbrains.homework;

public class Animals {
    protected String name;
    private static int count;

    public Animals(String name) {
        this.name = name;
        count++;
    }

    public void run(int length) {
        System.out.println(name + " пробежал " + length + " м.");
    }

    public void swim(int length) {
        System.out.println(name + " проплыл " + length + " м.");
    }

    public void setCount() {
        System.out.println("Животных: " + count);
    }
}
