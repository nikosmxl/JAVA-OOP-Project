
public abstract class artifacts{
    final int index;
    final String creator;
    final int year;

    public artifacts(int index, String creator, int year){
        this.index = index;
        this.creator = creator;
        this.year = year;

        System.out.println("Creating an instance of artifacts");
    }

    public void getInfo(){
        System.out.println("Creator: " + creator);
        System.out.println("Year: " + year);
    }

    public void getIndex(){
        System.out.println("Index: " + index);
    }

    public abstract boolean evaluate(masterpiece.Movement movement);

    public abstract boolean evaluate(masterpiece.Movement movement, masterpiece.Condition condition);
}