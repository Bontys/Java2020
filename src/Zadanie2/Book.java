package Zadanie2;

public class Book {
    public String name;
    public double price;
    public double discount;
    public double DiscountMoney;
    public double PriceMinusDiscount;
    public Book (String n, int p, double d){
        name=n;
        price=p;
        discount=d;
        DiscountMoney=this.price/100*this.discount;
        PriceMinusDiscount=this.price-this.DiscountMoney;
    }
    public String toString(){
        return this.name+", price "+this.price+", discount %"+this.discount;
    }
    public void intoDiscount(){
        System.out.println(name+", discount $"+DiscountMoney+", price minus the discount "+PriceMinusDiscount);
    }

}
