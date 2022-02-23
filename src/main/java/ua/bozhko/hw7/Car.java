package ua.bozhko.hw7;

/*
Создайте класс Car который содержит четыре свойства (дополнительных объектов создавать не требуется)
manufacturer
engine
colour
petrol
Создайте несколько экземпляров Car, установите значения свойствам (с помощью set’ров) и выведите информацию на консоль (toString)

Добавьте методы:
startEngine принимающий параметр name. Метод выводит в консоль “{name} запустил двигатель”
isEnoughPetrolLevel проверяет количество бензина, если значение ниже 50 - возвращает - false, если больше - true

Добавить конструктор в класс, который принимает на вход 3 параметра (manufacturer, engine, colour), устанавливает их и дополнительно задает значение petrol = 100
 */
public class Car {

    public static void main(String[] args) {

//        1 part

        Layout hyundai = new Layout();
        hyundai.setBrand("Hyundai");
        hyundai.setName("Person");
        hyundai.setColour("Black");
        hyundai.setManufacturer("Sonata");
        hyundai.setPetrol(100);
        hyundai.setEngine(2.4f);

        String info = hyundai.toString();
        System.out.println(info);

        Layout volkswagen = new Layout();
        volkswagen.setBrand("Volkswagen");
        volkswagen.setColour("White");
        volkswagen.setManufacturer("Polo");
        volkswagen.setPetrol(30);
        volkswagen.setEngine(1.6f);

        String info1 = volkswagen.toString();
        System.out.println(info1);

//      2 part

        Layout namePerson = new Layout();
        namePerson.setName("Person");

        String start = namePerson.startEngine();
        System.out.println(start);

        System.out.println("Статус топлива: " + hyundai.brand + " " + hyundai.isEnoughPetrolLevel(hyundai.petrol));
        System.out.println("Статус топлива: " + volkswagen.brand + " " + volkswagen.isEnoughPetrolLevel(volkswagen.petrol));

//      3 part

        Layout test = new Layout();
        test.setCar(3.5f, "Yellow", "Bugatti");
        String test1 = test.getCar();
        System.out.println(test1);
    }

}

