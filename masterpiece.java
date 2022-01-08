
public abstract class masterpiece extends artifacts{

    enum Movement {impressionism, expressionism, naturalism}
    enum Condition {bad, good, excellent}

    final Movement movement;
    Condition condition;

    public masterpiece(int index, String creator, int year, Movement movement, Condition condition){
        super(index, creator, year);

        this.movement = movement;
        this.condition = condition;

        System.out.println("Creating an instance of masterpieces");
    }

    public void getInfo(){
        super.getInfo();

        System.out.println("Condition: " + condition);
        System.out.println("Movement: " + movement);
    }

    public abstract boolean evaluate(Movement movement);

    public abstract boolean evaluate(Movement movement, Condition condition);
}