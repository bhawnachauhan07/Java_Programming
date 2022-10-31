public class Passenger {
	private String firstname;
	private String lastname;
	private int id;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	// by default print class name @ hexa decimal value
	public String toString() {
		return "Passenger first name is "+this.firstname+". Passenger last name is "+this.lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return id + firstname.length() + lastname.length();
	}
}
