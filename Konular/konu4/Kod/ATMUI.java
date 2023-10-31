package Konular.konu4.Kod;

public interface ATMUI extends DepositUI, WithdrawalUI, TransferUI {

	void requestDepositAmount();

	void requestWithdrawalAmount();

	void requestTransferAmount();

	void informinsufficientFunds();
}
