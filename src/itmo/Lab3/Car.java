package itmo.Lab3;

public class Car
{
    private String name;
    private String color;
    private double mass;

    public Car(String name, String color, double mass)
    {
        this.name = name;
        this.color = color;
        this.mass = mass;
    }

    public Car(String color)
    {
        this.name = "UnknownCarName";
        this.color = color;
        this.mass = 0;
    }

    public Car(String color, double mass)
    {
        this.name = "UnknownCarName";
        this.color = color;
        this.mass = mass;
    }

    public Car()
    {
        this.name = "UnknownCarName";
        this.color = "UnknownCarColor";
        this.mass = 0;
    }

    public void PrintInfo()
    {
        System.out.println("Название автомобиля: " + this.name);
        System.out.println("Цвет автомобиля: " + this.color);
        System.out.println("Масса автомобиля: " + this.mass + " кг");
        System.out.println("");
    }
}
