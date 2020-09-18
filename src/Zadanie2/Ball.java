package Zadanie2;
import java.lang.String;

public class Ball {
    public String colour;
    public int weight;
    public String toString(){
        return this.colour+", weight "+this.weight;
    }
    public Ball(String c, int w){
        colour=c;
        weight=w;
        if (w>567 & w<650)
            System.out.println(this.colour+" ball "+"This basketball ball");
        else {
            if (w > 260 & w < 280)
                System.out.println(this.colour + " ball " + "This volleyball ball");
            if (w>410 & w<450)
                System.out.println(this.colour+" ball "+"This football ball");
            else{
                System.out.println(this.colour+" ball "+"This boll not football, basketball, or volleyball");
            }
        }
    }
    public Ball(String c){
        colour=c;
        System.out.println("This ball "+this.colour);
    }

}