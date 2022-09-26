package iterator;

import java.util.Scanner;

/**
 * Creates the Driver for the Course Assignment Viewer
 */
public class CourseDriver {
	private Course csce247;
	private Scanner in;
	private String[] options = new String[5];

	/**
	 * Creates the new Course and all the associated assignments
	 */
	public CourseDriver() {
		in = new Scanner(System.in);
		csce247 = new Course("CSCE 247", "Software Engineering");
		csce247.addAssignment("Strategy Design Pattern", "Implement the Stragety Design Pattern to build robots",
				Topic.DESIGN_PATTERN);
		csce247.addAssignment("Requirements - Part 1", "Complete project proposal, competitive analysis and personas",
				Topic.PROJECT);
		csce247.addAssignment("Observer Design Pattern", "Implement the Observer Design Pattern to similate a baby cry",
				Topic.DESIGN_PATTERN);
		csce247.addAssignment("Decorator Design Pattern",
				"Implement the Decorator Design Pattern to build Christmas trees", Topic.DESIGN_PATTERN);
		csce247.addAssignment("Requirements - Part 2", "Complete document and all requirements",
				Topic.PROJECT);
		csce247.addAssignment("Factory Design Pattern", "Implement the Factory Design Pattern to build cereal",
				Topic.DESIGN_PATTERN);
		csce247.addAssignment("Git Branching", "Individually experiment with branches in git",
				Topic.GIT);
		csce247.addAssignment("Iterator Design Pattern",
				"Implement the Iterator Design Pattern to loop over assignments", Topic.DESIGN_PATTERN);
		csce247.addAssignment("Git Team Branching", "As a team collaborate over git",
				Topic.GIT);
		csce247.addAssignment("Design Document Diagrams", "Create UML project diagrams",
				Topic.PROJECT);
		csce247.addAssignment("Singleton Design Pattern", "Implement the Singleton Design Pattern to build a library",
				Topic.DESIGN_PATTERN);
		csce247.addAssignment("Design Document Complete",
				"Create an outline of the UI, the Data Storage, and update UML diagrams",
				Topic.PROJECT);
		csce247.addAssignment("Command Design Pattern",
				"Implement the Command Design Pattern to build a Document Editor", Topic.DESIGN_PATTERN);
		csce247.addAssignment("SCRUM Board",
				"Create an outline of all project tasks",
				Topic.PROJECT);
		csce247.addAssignment("Project Impementation",
				"Complete all code for the project",
				Topic.PROJECT);
		csce247.addAssignment("Testing",
				"Create JUnit tests for the project",
				Topic.PROJECT);
		csce247.addAssignment("Adapter Design Pattern",
				"Implement the Adapter Design Pattern to build a CD to Cassette Converter", Topic.DESIGN_PATTERN);
		csce247.addAssignment("Template Design Pattern", "Implement the Template Design Pattern to simulate a worker",
				Topic.DESIGN_PATTERN);

		options[0] = "View All Assignments";
		options[1] = "View Project Related Assignments";
		options[2] = "View Design Pattern Assignments";
		options[3] = "View Git Assignments";
		options[4] = "Quit";
	}

	/**
	 * Creates the logic of the main program
	 */
	public void runDriver() {
		clear();
		System.out.println("******** " + csce247 + " ******** ");

		while (true) {
			displayMenu();
			int choice = getNum();

			if (choice == -1) {
				continue;
			}

			if (choice == options.length - 1) {
				System.out.println("Goodbye");
				return;
			}

			switch (choice) {
				case 0:
					System.out.println("\n***** All Assignments *****");
					displayAssignments(Topic.ALL);
					break;
				case 1:
					System.out.println("\n***** Project Related Assignments *****");
					displayAssignments(Topic.PROJECT);
					break;
				case 2:
					System.out.println("\n***** Design Pattern Assignments *****");
					displayAssignments(Topic.DESIGN_PATTERN);
					break;
				case 3:
					System.out.println("\n***** git Assignments *****");
					displayAssignments(Topic.GIT);
					break;
			}
		}

	}

	/**
	 * Displays the assignments for a given topic
	 * 
	 * @param topic The topic to show the assignments for
	 */
	private void displayAssignments(Topic topic) {
		AssignmentIterator assignmentIterator = csce247.createIterator();

		while (assignmentIterator.hasNext()) {
			Assignment assignment = assignmentIterator.next();
			if (topic == Topic.ALL || assignment.hasTopic(topic)) {
				System.out.println("- " + assignment);
			}
		}
		System.out.println();
	}

	/**
	 * Displays the menu options for the program
	 */
	private void displayMenu() {
		System.out.println("What would you like to do:");
		for (int i = 0; i < options.length; i++) {
			System.out.println((i + 1) + ". " + options[i]);
		}
	}

	/**
	 * Clears the console
	 */
	private void clear() {
		System.out.print("\033[H\033[2J");
	}

	/**
	 * Gets a number from the user, used to get their option
	 * 
	 * @return A number between 0 and 4 correspoinding to their option
	 */
	private int getNum() {
		int num;

		try {
			num = Integer.parseInt(in.nextLine()) - 1;
		} catch (Exception e) {
			clear();
			System.out.println("You need to enter a valid number\n");
			return -1;
		}

		clear();

		if (num < 0 || num > 4) {
			System.out.println("Sorry, your option is not in the valid range.\n");
			return -1;
		}

		return num;
	}

	public static void main(String[] args) {
		CourseDriver driver = new CourseDriver();
		driver.runDriver();
	}
}
