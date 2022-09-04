package observer;
import java.util.ArrayList;
import java.util.Random;

/**
 * Creates a Baby as the subject.
 * @author Jackson Williams
 */

 /**
  * Where cry types are based
  */
enum Cry {
    ANGRY,
    HUNGRY,
    WET;

}
public class Baby implements Subject{
    private String name;
	  private ArrayList<Observer> observers;
    private Random rand = new Random();

    /**
     * Creates the baby with the specific name, adds observers to arraylist. 
     * @param name
     */
    public Baby(String name) {
        this.name = name;
		observers = new ArrayList<Observer>();
    }
    
    /**
     * Gets the name of baby and represents it as a string
     * @return returns the name of the baby
     */
    public String getName() {
        return this.name;
    }

    /**
     * Adds two possible string outputs to an array for when the baby is angry. 
     * uses the Random function to randomly select from the indicies, then prints which is chosen. 
     */
    public void receiveLove() {
      String[] arr = {name + "feels appreciated and loved.", 
      name + "pushes everyone away and continues to cry."};
        int random = rand.nextInt(arr.length);
        System.out.println(arr[random]);
    }

     /**
     * Adds two possible string outputs to an array for when the baby is hungry. 
     * uses the Random function to randomly select from the indicies, then prints which is chosen. 
     */
    public void eat() {
        String[] arr = {name + "has a happy full tummy.", 
      name + " throws all his food on the floor."};
        int random = rand.nextInt(arr.length);
        System.out.println(arr[random]);
    }
    public void getChanged() {
          System.out.println(name + " is having a diaper change");
    }

    /**
     * registers the observer
     * @param observer adds an observer
     */
    @Override
    public void registerObserver(Observer observer) {
		observers.add(observer);
    }

    /**
     * removes observer
     * @param observer removes one of the observers 
     */
    @Override
    public void removeObserver(Observer observer) {
		observers.remove(observer);
        
    }

    /**
     * notify the observers when baby cries
     * @param cry updates the responses depending on type of cry. 
     */
    @Override
    public void notifyObservers(Cry cry) {
        for(Observer observer : observers) {
			observer.update(cry);
		}        

    /**
     * prints outcome of baby during angry cry. notifies the observers for angry cry using ANGRY enum.
     */
    }
    public void angryCry() {

        System.out.println("Waaaaaaaaaa!" + name + " is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

     /**
     * prints outcome of baby during hungry cry. notifies the observers for hungry cry type response
     * using HUNGRY enum.
     */
    public void hungryCry() {
        System.out.println("Neh Neh Neh!" + name + " is starving!!!!");
        notifyObservers(Cry.HUNGRY);
    }

    /**
     * prints outcome of baby during wet cry. Then notifies observers for wet cry using WET enum.
     */
    public void wetCry() {
        System.out.println("Aaaaaaaa! " + name + " is WET");
        notifyObservers(Cry.WET);
    }
}
