public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2000, 1280, 2);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year + " " + notebook.resolution + " " + notebook.memory);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkResolution();
        notebook.checkMemory();


        Notebook heavyNotebook = new Notebook(2000, 1500, 2019, 1920, 3);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year + " " + heavyNotebook.resolution + " " + heavyNotebook.memory);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkResolution();
        heavyNotebook.checkMemory();


        Notebook oldNotebook = new Notebook(1200, 500, 2000, 1280, 1);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year + " " + oldNotebook.resolution + " " + oldNotebook.memory);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkResolution();
        oldNotebook.checkMemory();
    }
}






