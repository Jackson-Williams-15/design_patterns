package observer;

/**
 * creates mom class
 * @author Jackson Williams
 */
public class Mom implements Observer {
private Subject baby;

/**
 * creates the mom
 * @param baby allows mom to be registered as observer
 */
public Mom(Subject baby) {
this.baby = baby;
baby.registerObserver(this);
}

/**
 * updates moms responses based off of the baby's cry types.
 * @param cry specifies what type of cry the baby is doing so mom observer respnds properly.
 */
    @Override
    public void update(Cry cry) {
        if(cry.equals(Cry.ANGRY)) {
            System.out.println("mom hugs " + ( (Baby)baby).getName());
           ((Baby)baby).receiveLove();

        }
         if(cry.equals(Cry.HUNGRY)) {
            System.out.println("mom feeds " + ( (Baby)baby).getName());
            ((Baby)baby).eat();
        }
        
         if(cry.equals(Cry.WET)) {
            System.out.println("mom changes " + ( (Baby)baby).getName());
            ((Baby)baby).getChanged();
        }
    
    }
    
}
