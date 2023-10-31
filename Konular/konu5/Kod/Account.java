package Konular.konu5.Kod;

public class Account {

	public String FirstName;
	public String LastName;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Account() {
	}

	public Account(AccountModel accountModel) {
		this.FirstName = accountModel.FirstName;
		this.LastName = accountModel.LastName;
	}

}
