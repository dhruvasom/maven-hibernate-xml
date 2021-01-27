package my_group.my_second_hibernate_project;

public class Passenger {
private int pnr;
private String firstName,lastName;
public Passenger() {}
public Passenger(int pnr, String firstName, String lastName) {
	super();
	this.pnr = pnr;
	this.firstName = firstName;
	this.lastName = lastName;
}
public Passenger(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
public int getPnr() {
	return pnr;
}
public void setPnr(int pnr) {
	this.pnr = pnr;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "Passanger [pnr=" + pnr + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}

}
