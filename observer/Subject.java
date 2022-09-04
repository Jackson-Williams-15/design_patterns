package observer;

/**
 * Creates a parent interface for the Baby class
 * @author Jackson williams
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(Cry cry);
}
