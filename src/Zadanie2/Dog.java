package Zadanie2;

public class Dog {
    public String name;
    public int age;
    public Dog(){}

    public Dog(int a){
        age=a;
    }

    public Dog(String n){
        name=n;
    }

    public Dog(String n, int a){
        age=a;
        name=n;
    }

    public String toString(){
        return this.name+", age "+this.age;
    }

    public void intoHumanAge(){
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }
}