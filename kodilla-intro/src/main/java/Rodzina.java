public class Rodzina {
    public static void main(String[] args) {
        Rodzic rodzic = new Rodzic("Facet", "Janusz", "Kowalski", "Zielony", "Czarny", 40);
        System.out.println(rodzic.plec + " " + rodzic.imie + " " + rodzic.nazwisko + " " + rodzic.kolorOczu + " " + rodzic.kolorWlosow + " " + rodzic.wiek);
        System.out.println(rodzic.imie);
        Dziecko dziecko = new Dziecko();
        dziecko.imie = "Marek";

    }

}
//plec:"facet", imie:"Janusz", "kowalski", "zielony", "czarny", 40
//Dziecko dziecko = new Dziecko();
//
//            dziecko.this ="Tomek";
//
//        System.out.println("tata " + tata.this + "dziecko" + dziecko.this);
//rodzic.checkImie();
//        rodzic.checkNazwisko();
//        rodzic.checkKolorOczu();
//        rodzic.checkKolorWlosow();
//        rodzic.checkWiek();

//public static void main(String[] args) {
//        Dziecko dziecko = new Dziecko("Chłopiec", "Marek", "Kowalski", "Zielony", "Brązowy", 20)
//        System.out.println(dziecko.plec + " " + dziecko.imie + " " + dziecko.nazwisko + " " + dziecko.kolorOczu + " " + dziecko.kolorWlosow + " " + dziecko.wiek);