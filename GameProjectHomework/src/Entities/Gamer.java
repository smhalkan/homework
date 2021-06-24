package Entities;
import java.time.LocalDate;

public class Gamer extends Customer {
	private String userName;

	public Gamer(int id, String firstName, String lastName, String email, String nationlityId,LocalDate dateOfBirth, String userName) {
			super(id, firstName, lastName, email, nationlityId, dateOfBirth);
			this.userName = userName;
		}

	public String getUserName() {
			return userName;
		}

	public void setUserName(String userName) {
			this.userName = userName;
		}

}
