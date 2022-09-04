package observer;

public class CribDriver {
	public void run() {
		Baby baby = new Baby("Charlie");
		Observer dad = new Dad(baby);
		Observer mom = new Mom(baby);
		
		System.out.println("\n***** " + baby.getName() + " was put down in his crib. *****\n");
		baby.angryCry();

		System.out.println("\n");
		baby.hungryCry();

		System.out.println("\n");
		baby.wetCry();
	}

	public static void main(String[] args) {
		CribDriver driver = new CribDriver();
		driver.run();
	}
}