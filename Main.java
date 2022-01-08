import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Main{
    
    public static void main(String[] args) {
        
        if (args.length != 2 && args.length != 3){                              // He may give condition he may not.
            throw new IllegalArgumentException("Make sure the amount of arguments you insert is 2 or 3.");
        }

        int N = 0;                                                              // Initializing it with 1 to avoid compilation errors only.
        masterpiece.Movement movement;                  
        masterpiece.Condition condition = masterpiece.Condition.bad;            // Initializing it with "bad" to avoid compilation errors only.

        try{
            N = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        if (args[1].equals("impressionism") || args[1].equals("expressionism") || args[1].equals("naturalism")){
            movement = masterpiece.Movement.valueOf(args[1]);
        }
        else{
            throw new IllegalArgumentException("Second argument is not valid. Valid insertions: impressionism, expressionism, naturalism");
        }

        if (args.length == 3){
            if (args[2].equals("bad") || args[2].equals("good") || args[2].equals("excellent")){
                condition = masterpiece.Condition.valueOf(args[2]);
            }
            else{
                throw new IllegalArgumentException("Second argument is not valid. Valid insertions: bad, good, excellent");
            }
        }

        artifacts art[] = new artifacts[N];
        Random rand = new Random();
        
        for (int j = 0 ; j < N ; j++){
            masterpiece.Movement[] movement_array = masterpiece.Movement.values();
            masterpiece.Movement give_movement = movement_array[rand.nextInt(3)];

            masterpiece.Condition[] condition_array = masterpiece.Condition.values();
            masterpiece.Condition give_condition = condition_array[rand.nextInt(3)];

            if (rand.nextInt(2) == 0){
                //Creating Painting object
                double give_length = 1 + rand.nextInt(10) + rand.nextDouble();                             // Between 0 and 10.99
                double give_width = 1 + rand.nextInt(10) + rand.nextDouble();                              // Between 0 and 10.99

                paintings.Technique[] technique_array = paintings.Technique.values();
                paintings.Technique give_technique = technique_array[rand.nextInt(3)];

                art[j] = new paintings(j , "creator" + String.valueOf(j), rand.nextInt(2023) , give_movement, give_condition, give_length, give_width, give_technique);
            }
            else{
                //Creating Sculpture object
                double give_volume = 1 + rand.nextInt(10) + rand.nextDouble();                              // Between 0 and 10.99
                
                sculptures.Material[] material_array = sculptures.Material.values();
                sculptures.Material give_material = material_array[rand.nextInt(3)];

                art[j] = new sculptures(j, "creator" + String.valueOf(j), rand.nextInt(2023), give_movement, give_condition, give_volume, give_material);
            }
            
        }
        
        if (args.length == 3){
            auction(art, movement, condition);
        }
        else{
            auction(art, movement);
        }

    }

    public static void auction(artifacts[] array, masterpiece.Movement movement, masterpiece.Condition condition){

        for (artifacts i : array){
            i.getIndex();
            i.getInfo();
            System.out.println("The artifact is: " + ((i.evaluate(movement, condition) == true) ? "Acceptable" : "Unacceptable"));
        }
    }

    public static void auction(artifacts[] array, masterpiece.Movement movement){

        for (artifacts i : array){
            i.getIndex();
            i.getInfo();
            System.out.println("The artifact is: " + ((i.evaluate(movement) == true) ? "Acceptable" : "Unacceptable"));
        }
    }

}