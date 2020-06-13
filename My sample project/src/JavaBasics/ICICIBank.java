package JavaBasics;

public class ICICIBank implements USBank, RBIbank {

	@Override
	public void Debit() {
		System.out.println("im debit");
		
	}

	@Override
	public void Credit() {
		System.out.println("im credit");
	}

	@Override
	public void TransferMoney() {
		System.out.println("im transfermoney");
		
	}

	@Override
	public void HomeLoan() {
		System.out.println("im homeloan");		
	}

	@Override
	public void CarLoan() {
		System.out.println("im car loan");
		
	}

	@Override
	public void EducationalLoan() {
		System.out.println("educationl loan");
		
	}
	public void mutualfunds()
	{
		System.out.println("mutual loans");
	}

	public void Insurance()
	{
		System.out.println("insurance");
	}

}
