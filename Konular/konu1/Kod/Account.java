package Konular.konu1.Kod;

public class Account {

	private int _accountId;
	private Profile _profile;
	private Address _address;

	public int get_accountId() {
		return _accountId;
	}

	public void set_accountId(int _accountId) {
		this._accountId = _accountId;
	}

	public Profile get_profile() {
		return _profile;
	}

	public void set_profile(Profile _profile) {
		this._profile = _profile;
	}

	public Address get_address() {
		return _address;
	}

	public void set_address(Address _address) {
		this._address = _address;
	}

}
