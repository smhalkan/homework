package Entities;
import java.time.LocalDate;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String nationlityId;
	private LocalDate dateOfBirth;
	
	
	public Customer(int id, String firstName, String lastName, String email, String nationlityId, LocalDate dateOfBirth) 
	{
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setNationlityId(nationlityId);
		this.setDateOfBirth(dateOfBirth);
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNationlityId() {
		return nationlityId;
	}
	public void setNationlityId(String nationlityId) {
		this.nationlityId = nationlityId;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
