package observer;
import java.util.Random;

/**
 * Creates Dad class
 * @author Jackson Williams
 */
public class Dad implements Observer {
private Subject baby;
private Random rand = new Random();

/**
 * creates the dad observer
 * @param baby allows dad to be registered as an observer
 */
public Dad(Subject baby) { 
    this.baby = baby;
    baby.registerObserver(this);
}

/**
 * updates the dads response based on cry type. Dad responses are random to every cry.
 * @param cry different cry types.
 */
    @Override
    public void update(Cry cry) {
        String[] arr = {"Dad puts a pillow over his head", 
      "Dad nudges mom","Dad screams .... aaaaa"};
        int random = rand.nextInt(arr.length);
        System.out.println(arr[random]);
    }
    
}
