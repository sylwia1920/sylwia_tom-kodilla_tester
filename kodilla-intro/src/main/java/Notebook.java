public class Notebook {
    int weight;
    int price;
    int year;
    int resolution;
    int memory;


    public Notebook(int weight, int price, int year, int resolution, int memory) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.resolution = resolution;
        this.memory = memory;
    }

    public void checkYear() {
        if (this.year < 2018 && this.price > 1500) {
        } else if (this.year > 2000 && this.price == 600) {
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("light");
        } else if (this.weight < 2000) {
            System.out.println("not too heavy");
        } else System.out.println("heavy");
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price > 1000) {
            System.out.println("This notebook is expensive.");
        } else {
            System.out.println("This price is good.");
        }
    }


    public void checkResolution() {
        if (this.resolution > 1280) {
            System.out.println("Full HD");
        } else {
            System.out.println("HD");
        }
    }

    public void checkMemory() {
        if (this.memory > 2) {
            System.out.println("The Best Memory RAM");
        } else if (this.memory < 2) {
            System.out.println("Weak Memory RAM");
        } else {
            System.out.println("Good Memory RAM");
        }
    }
}






