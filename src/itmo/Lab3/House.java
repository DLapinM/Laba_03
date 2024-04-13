package itmo.Lab3;

public class House
{
    private String name;
    private int quantityOfLevels;
    private int year;


    public House()
    {
        this.name = "UnknownHouseName";
        this.quantityOfLevels = 0;
        this.year = 0;
    }

    public void SetHouseParameters(String name, int quantityOfLevels, int year)
    {
        this.name = name;
        this.quantityOfLevels = quantityOfLevels;
        this.year = year;
    }

    public void PrintHouseParameters()
    {
        System.out.println("Название дома: " + this.name);
        System.out.println("Количетво этажей: " + this.quantityOfLevels);
        System.out.println("Год постройки дома: " + this.year);
        System.out.println("Количество лет, прошедших с момента постройки дома: " + GetHouseAge());
        System.out.println("");
    }

    public int GetHouseAge()
    {
        int yearNow = java.time.Year.now().getValue();

        return yearNow - this.year;
    }
}
