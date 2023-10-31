package Konular.konu5.Kod;

public interface IAccountRepository {
	void SaveAccount(Account account);

	Account GetAccount(int accountId);
}
