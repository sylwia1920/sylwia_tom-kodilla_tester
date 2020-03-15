public class LeapYear {
    public static void main(String[] args) {
        leapYear(2020);
    }

    public static void leapYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 == 0 && leapYear % 400 == 0) {
            System.out.println("Jest przestepny");
        } else {
            System.out.println("Nie jest przestepny");
        }
    }
}








