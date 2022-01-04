import java.util.Scanner;

public class PoisedProjects {
    // The main class is where the program will run from.
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
    // While that loop through and provides the menu.
		while(true){
			System.out.println("Welcome to Poised Projects project" + 
			"\n1.) To add a new project." +
			"\n2.) To change the deadline on the project." + 
			"\n3.) To the total fees in a project." + 
			"\n4.) Change the contractor details." +
			"\n5.) To exit menu option.");
			int choice = input.nextInt();

    // If option 1 is selected  request input from uses.
			if (choice == 1){
				System.out.println("Welcome to Poised ");
				System.out.println("Please the new projects number : ");
				int projectNumber = input.nextInt();
				System.out.println("Please enter new project name : ");
				String projectName = input.nextLine();
				System.out.println("Please enter the Building Type : ");
				String buildingType = input.nextLine();
				System.out.println("Please enter Address of project : ");
				String physicalAddress = input.nextLine();
				System.out.println("Please enter ERF Number : ");
				int ERFNumber = input.nextInt();
				System.out.println("Total cost of the project : ");
				int totalFees = input.nextInt();
				System.out.println("Total amont paid : ");
				int totalPaid = input.nextInt();
				System.out.println("The deadline for the project : ");
				String deadline = input.nextLine();

			// Calls the constructor and  all new parameters to the project.
				newProject addProject = new newProject(projectName, projectNumber, buildingType, physicalAddress, 
					ERFNumber, totalFees, totalPaid, deadline);
				System.out.println(addProject.toString());
				System.out.println("New project has been Added successfully! ");
				break;
			}
			// If option 2 is selected the changeDeadline method is called.
			else if (choice == 2){
				System.out.println("What is the new deadline for the project : ");
				Scanner inputDeadline = new Scanner(System.in);
				String deadline = inputDeadline.next();
				

            // Object is called from the class new project.
			// New details are then set for deadline.
				newProject changeDeadline = new newProject(deadline);
				changeDeadline.setDeadline(deadline);
				System.out.println("Deadline has been updated.");
				break;
			}

			// If option 3 is selected the change fees  program runs
			else if (choice == 3){
				System.out.println("Please enter new amont : ");
				Scanner inputFee = new Scanner(System.in);
				int totalFees = inputFee.nextInt();

			// Object is called from the call newProject.
			// Changes are then set .
				newProject changeFees = new newProject(totalFees);
				changeFees.setTotalFees(totalFees);
				System.out.println("Total has been updated.");
				break;
			}
			// If Option 4 is selected the add contractor program run.
			// The request a serie of inputs.
			else if (choice == 4){
				Scanner input1 = new Scanner(System.in);
				System.out.println("Please enter contractor name : ");
				String contractorName = input1.nextLine();
				System.out.println("Please enter contractor  Telephone Number : ");
				int telephoneNumber = input1.nextInt();
				System.out.println("Please enter contractor email address : ");
				String email = input1.nextLine();
				System.out.println("Please enter the contractor  physical Address : ");
				String physicalAddress = input1.nextLine();

            // The new detail are then added to the Object in the Addperson call.
				AddPerson theContractor = new AddPerson(contractorName, telephoneNumber, physicalAddress, email);
				System.out.println(theContractor.displayPerson());
				System.out.println("Contractor information has been uploaded.");
				break;
			}

			// If option 5 is selected the program ends.
			else if (choice == 5) {
				System.out.println("GoodBye!!");
				break;
			}
		}
	}
					

	        
			
		
}







