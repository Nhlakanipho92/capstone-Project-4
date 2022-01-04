// main class is declared
public class newProject { 

    // Attribute as private and declares theas a variable.
	private String projectName;
	private int projectNumber;
	private String buildingType;
	private String physicalAddress;
	private int ERFNumber;
	private double totalFees;
	private double totalPaid;
	private String deadline;

    // Constructor method for new project object.
    public newProject (String projectName, int projectNumber, String buildingType, String physicalAddress, 
	int ERFNumber, int totalFees, int totalPaid, String deadline) {
	
	    this.projectName = projectName;
	    this.projectNumber = projectNumber;
	    this.buildingType = buildingType;
	    this.physicalAddress = physicalAddress;
	    this.ERFNumber = ERFNumber;
	    this.totalFees = totalFees;
	    this.totalPaid = totalPaid;
	    this.deadline = deadline;
		}
	// Getters and Setters.
    public newProject(String deadline1) {
    }
    public newProject(int totalFees2) {
    }
    public String getProjectName(){
		return projectName;
	}
	public void setProjectName(String projectName){
		this.projectName = projectName;
	}
    public int getProjectNumber () {
		return projectNumber;
	}
	public String getPhysicalAddress () {
		return physicalAddress;
	}
	public void setPhysicalAddress(String physicalAddress){
		this.physicalAddress = physicalAddress;
	}
	public int getERFNumber () {
		return ERFNumber;
	}
	public void setERFNumber (int ERFNumber){
		this.ERFNumber = ERFNumber;
	}
	public double getTotalFees () {
		return totalFees;
	}
	public void setTotalFees (double totalFees){
		this.totalFees = totalFees;
	}
	public double getTotalPaid () {
		return totalPaid;
	}
	public void setTotalPaid (double totalPaid){
		this.totalPaid = totalPaid;
	}
	public String getDeadLine () {
		return deadline;
	}
	public void setDeadline (String deadline){
		this.deadline = deadline;
	}

// This writer a output this is easy to read.
public String toString () {
	String output = "Project name: " + projectName ;
	output += "\n Project number : " + projectNumber;
	output += "\n Building Type : " + buildingType;
	output += "\n Physical Address : " + physicalAddress;
	output += "\n ERF number : " + ERFNumber;
	output += "\n Total fee to project : " + totalFees;
	output += "\n Total fee paid : " + totalPaid;
	output += "\n Project deadline : " + deadline;
	
	return output;
} 




}
