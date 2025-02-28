import java.util.ArrayList;
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    private ArrayList<Bird> zoobirds;
    
    public Zoo(){
        zoobirds.add(new Bird("blue","blue jay",2));
        zoobirds.add(new Bird("red","red cardinal",1));
    }
    public int countBlueBirds(){
        return 0;
    }    
}
