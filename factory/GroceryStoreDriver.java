package factory;

import java.util.ArrayList;

public class GroceryStoreDriver {

	public void runStore() {
		GroceryStore groceryStore = new GroceryStore();

		ArrayList<Cereal> cereals = new ArrayList<Cereal>();
		cereals.add(groceryStore.createCereal("frosted flakes"));
		cereals.add(groceryStore.createCereal("fruit loops"));
		cereals.add(groceryStore.createCereal("lucky charms"));

		// loop through and order the cereal
		for (Cereal cereal : cereals) {
			System.out.println("\n----------------------------------------\n");

			System.out.println(cereal.prepare());
			System.out.println(cereal.boxCereal());
			System.out.println(cereal.priceCereal());

		}
	}

	public static void main(String[] args) {
		GroceryStoreDriver gsDriver = new GroceryStoreDriver();
		gsDriver.runStore();
	}
}
