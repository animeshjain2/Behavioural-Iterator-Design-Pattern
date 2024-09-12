package designpattern.iterable.dto;

public class Cards {

    private final Color color;
    private final int value;
    private final String name;
    public Cards(Color color, int val,String name){
        this.color = color;
        this.value = val;
        this.name = name;
    }
    public Color getColor() {
        return color;
    }
    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }

   @Override
   public String toString(){
        return "color="+this.color + ", value="+this.value + ", name="+this.name;
   }

}
