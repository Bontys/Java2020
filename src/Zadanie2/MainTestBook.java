package Zadanie2;

import Zadanie2.Book;

public class MainTestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Harry Potter",200 ,20 );
        System.out.println(d1);
        d1.intoDiscount();
    }
}