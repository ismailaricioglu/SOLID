package Konular.konu5.Kod;

public class AccountCreator {
	IAccountRepository _accountRepository ;
	

	public AccountCreator(IAccountRepository _accountRepository) {
		this._accountRepository = _accountRepository;
	}


	void SaveAccount(AccountModel accountModel) {
		_accountRepository.SaveAccount(new Account(accountModel));
	};
}
