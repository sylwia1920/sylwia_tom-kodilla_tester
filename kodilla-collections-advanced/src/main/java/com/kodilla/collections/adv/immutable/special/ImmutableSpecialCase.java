package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCase {
    public static void main(String[] args) {
        Integer a = 112;
        Integer b = 112;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println("---------");

        String x = "This is String";
        String y = "This is String";
        System.out.println(x == y);
        System.out.println(x.equals(y));

        Integer c = 100;
        Integer d = 100;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);

        c = c + 10 ; // mozna zapisać również c += 10;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);

        c = 10567;
        d = 10567;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);




    }
}
