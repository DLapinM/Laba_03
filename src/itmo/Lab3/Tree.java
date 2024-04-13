package itmo.Lab3;

public class Tree
{
    private String name;
    private int age;
    private boolean IsAlive;

    public Tree(String name, int age, boolean IsAlive)
    {
        this.name = name;
        this.age = age;
        this.IsAlive = IsAlive;
    }

    public Tree(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.IsAlive = true;
    }

    public Tree()
    {
        System.out.println("Пустой конструктор без параметров сработал");
        System.out.println("");
    }

    public void PrintInfo()
    {
        System.out.println("Имя дерева: " + this.name);
        System.out.println("Возраст дерева: " + this.age);
        System.out.println("Состояние дерева: " + (this.IsAlive ? "живое" : "мёртвое"));
        System.out.println("");
    }
}
