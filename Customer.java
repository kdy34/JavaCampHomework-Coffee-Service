
public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String dateTimeofBirth;
	private String nationalityId;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, String dateTimeofBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateTimeofBirth = dateTimeofBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDateTimeofBirth() {
		return dateTimeofBirth;
	}

	public void setDateTimeofBirth(String dateTimeofBirth) {
		this.dateTimeofBirth = dateTimeofBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	

}
