package ua.bozhko.hw7;

public class Layout<engine> {
    public String brand;
    public float engine;
    public String colour;
    public int petrol;
    public String manufacturer;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String name;

    @Override
    public String toString() {
        return "\n" +
                "Brand: " + brand +
                "\nEngine: " + engine +
                "\nColour: " + colour +
                "\nPetrol: " + petrol +
                "\nManufacturer: " + manufacturer +
                '\n';
    }

    public float getEngine() {
        return engine;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Float engine, String colour, String manufacturer) {
        this.engine = engine;
        this.colour = colour;
        this.manufacturer = manufacturer;
        this.petrol = 100;
    }
    public String getCar(){
        return  "\nEngine: " + engine +
                "\nColour: " + colour +
                "\nPetrol: " + petrol +
                "\nManufacturer: " + manufacturer +
                '\n';
    }

    public String startEngine(){
        return name + " - запустил двигатель\n";
    }

    public boolean isEnoughPetrolLevel(int toPetrol) {
        boolean status = toPetrol < 50 ? false : true;
        return status;
    }
}

