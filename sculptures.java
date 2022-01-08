
public class sculptures extends masterpiece{

    enum Material {iron, stone, wood}

    double volume;
    Material material;

    public sculptures(int index, String creator, int year, Movement movement, Condition condition, double volume, Material material){
        super(index, creator, year, movement, condition);

        this.volume = volume;
        this.material = material;

        System.out.println("Creating an instance of sculptures");
    }

    public void getInfo(){
        super.getInfo();

        System.out.println("Volume: " + volume);
        System.out.println("Material: " + material);
    }

    public boolean evaluate(Movement movement){
        if (this.movement == movement){
            if (this.condition == Condition.excellent) return true;
            else return false;
        }
        else{
            return false;
        }
    }

    public boolean evaluate(Movement movement, Condition condition){
        if (this.movement == movement){
            if (this.condition == condition) return true;
            else return false;
        }
        else{
            return false;
        }
    }
}