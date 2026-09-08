public class Cat {
    private String color;
    private String name;
    private int age;

    public void meow() {
        System.out.println("Miau!");
    }

    public Cat (String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Cat gato = new Cat("Walter Branco", "Heisenberg", 80) {

        };
        System.out.printf("O nome do gato é %s, com a cor de %s e a idade é %d %n", gato.name, gato.color, gato.age);
        gato.meow();
    }
}
