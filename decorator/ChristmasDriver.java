package decorator;

public class ChristmasDriver {

	public void runDriver() {
		Tree tree = new ChristmasTree();
		System.out.println("\n******* We brought home our tree *******");
		System.out.println(tree);

		Tree decoratedTree = new Ornaments(new Star(new Lights(tree)));
		System.out.println("\n******* We decorated our our tree *******\n");
		System.out.println(decoratedTree);

	}

	public static void main(String[] args) {
		ChristmasDriver cd = new ChristmasDriver();
		cd.runDriver();
	}
}
