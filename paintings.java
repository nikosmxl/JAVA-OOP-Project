
public class paintings extends masterpiece{

    enum Technique {oil, aquarelle, tempera}

    final double length;
    final double width;
    final Technique technique;

    public paintings(int index, String creator, int year, Movement movement, Condition condition, double length, double width, Technique technique){
        super(index, creator, year, movement, condition);

        this.length = length;
        this.width = width;
        this.technique = technique;

        System.out.println("Creating an instance of paintings");
    }

    public void getInfo(){
        super.getInfo();

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Technique: " + technique);

        double area = length*width;
        System.out.println("Area: " + area);
    }

    public boolean evaluate(Movement movement){
        if (this.movement == movement){
            if (this.condition == Condition.bad) return false;
            else return true;
        }
        else{
            return false;
        }
    }

    public boolean evaluate(Movement movement, Condition condition){
        if (this.movement == movement){
            if (this.condition == Condition.excellent || condition == Condition.bad) return true;
            else if (this.condition == condition) return true;
            else return false;
        }
        else{
            return false;
        }
    }
}