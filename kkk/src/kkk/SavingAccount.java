package kkk;

public class SavingAccount extends BankAccount
	throws InsufficientBalanceException, InvalidAmountException;{
	private double interestRate;
	public static final double MIN_BALANCE = 50000.0;
	public SavingAccount(String accountNumber, String holderName, double balance, double interestRate) {
		super(accountNumber, holderName, balance);
		if(balance <MIN_BALANCE) {
			throw new InsufficientBalanceException("So du toi thieu cua tai khoan tiet kiem phai tu "+ MIN_BALANCE + " VND!!");
		}
		this.interestRate = interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override 
	public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException{
		if(amout <=0) {
			throw new InvalidAmountException("So tien can rut phai lon hon 0!");
		}
		if(getBalance() - amount <MIN_BALANCE) {
			throws new InsufficientBalanceException("Khong the rut! So du sau khi rut khong duoc nho homn 50.000 VND");
		}
		setBalance(getBalance()- amount);
	}
}
