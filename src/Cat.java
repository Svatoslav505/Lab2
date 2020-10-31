public class Cat {

    String name;
    int age;

    public void sayMeow() {
        System.out.println("Мур-Мяу!");
    }

    public void run() {
        System.out.println("вжух");
    }

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Температура";

        barsik.sayMeow();
        barsik.run();

    }
}