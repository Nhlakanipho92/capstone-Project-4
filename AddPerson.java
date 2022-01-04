// main class is declared
public class AddPerson {
	
    // Attribute as private and declares theas a variable.	
	private String personsNames;
	private int telephoneNumber;
	private String email;
	private String physicalAddress;
	
    // Constructor method for new project object.
    public AddPerson (String personsNames, int telephoneNumber,
        String email, String physicalAddress) {
	
	    this.personsNames = personsNames;
	    this.telephoneNumber = telephoneNumber;
	    this.email = email;
	    this.physicalAddress = physicalAddress;
}   

    // Getters and Setters.
    public String getPersonsNames() {
	   return personsNames;
}
    public void setPersonsNames (String personsNames){
	   this.personsNames = personsNames;
}
    public int getTelephoneNumber() {
	   return telephoneNumber;
}
    public void setTelephoneNumber (int telephoneNumber){
	    this.telephoneNumber = telephoneNumber;
}
    public String getEmail() {
	   return email;
}
    public void setEmail (String email){
	    this .email = email;
}
    public String getPhysicalAddress() {
	    return physicalAddress;
}
    public void setPhysicalAddress (String physicalAddress){
	    this.physicalAddress = physicalAddress;
}
    // This writer a output this is easy to read.
    public String displayPerson () {
	    String output = "Persons Names : " + personsNames;
	    output += "Telephone number : " + telephoneNumber;
	    output += "Email Address : " + email;
	    output += "Physical Address : " + physicalAddress;
	
	    return output;
}

}
