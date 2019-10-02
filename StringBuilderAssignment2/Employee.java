package StringBuilderAssignment2;

public class Employee {
	
	private String firstname;
	private String lastname;
	private String company;
	private String role;

	public String getPassword() {
		String str = firstname.substring(0, 2) + lastname.substring(0, 2) + company.substring(0, 2)
				+ role.substring(0, 2);
		return str;
	}

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
