package Zadanie2;

import Zadanie2.Dog;

public class MainTestDog {
    public static void main(String[] args){
        Dog d1 = new Dog("Michael",2);
        Dog d2 = new Dog("JoJi",7);
        Dog d3 = new Dog("Mark");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}