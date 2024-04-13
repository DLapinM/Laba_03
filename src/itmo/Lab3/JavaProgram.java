package itmo.Lab3;

import java.util.Calendar;

public class JavaProgram
{
    public static void main(String[] args)
    {
        Study study1 = new Study("Изучение Java - это просто!");

        String str1 = study1.printCourse();

        System.out.println(str1);
        System.out.println("");



        Car car1 = new Car("Volkswagen Polo Sedan", "белый", 1500);
        Car car2 = new Car("белый");
        Car car3 = new Car("красный", 2000);
        Car car4 = new Car();

        car1.PrintInfo();
        car2.PrintInfo();
        car3.PrintInfo();
        car4.PrintInfo();



        House house1 = new House();
        House house2 = new House();

        house1.SetHouseParameters("Красивый дом", 4, 1970);
        house2.SetHouseParameters("Прекрасный дом", 5, 1980);

        house1.PrintHouseParameters();
        System.out.println(house1.GetHouseAge());
        System.out.println("");

        house2.PrintHouseParameters();
        System.out.println(house2.GetHouseAge());
        System.out.println("");




        Tree tree1 = new Tree("Дуб", 200, true);
        tree1.PrintInfo();

        Tree tree2 = new Tree("Сосна", 20);
        tree2.PrintInfo();

        Tree tree3 = new Tree();
        tree3.PrintInfo();
    }
}
