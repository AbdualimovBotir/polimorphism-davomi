// Shakl sinfi
class Shape {
    // Xususiyatlar
    protected double area;
    protected double perimeter;

    // Konstruktor
    public Shape() {
        this.area = 0;
        this.perimeter = 0;
    }

    // Yuzini hisoblash
    public double calculateArea() {
        return this.area;
    }

    // Perimetrini hisoblash
    public double calculatePerimeter() {
        return this.perimeter;
    }
}

// Hayvon sinfi
class Animal {
    // Xususiyatlar
    protected String name;
    protected String sound;

    // Konstruktor
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Hayvonning ismini qaytarish
    public String getName() {
        return this.name;
    }

    // Hayvonning ovozini chiqarish
    public String sound() {
        return this.sound;
    }
}

public class Main {
    public static void main(String[] args) {
        // Shakl sinfi
        Shape shape = new Shape();
        double area = shape.calculateArea();
        double perimeter = shape.calculatePerimeter();
        System.out.println("Shaklning yuzi: " + area);
        System.out.println("Shaklning perimetri: " + perimeter);

        // Hayvon sinfi
        Animal animal = new Animal("Kuching", "Meow");
        String name = animal.getName();
        String sound = animal.sound();
        System.out.println(name + " ning ovozi: " + sound);
    }
}
