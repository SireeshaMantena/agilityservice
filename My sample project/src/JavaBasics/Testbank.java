package JavaBasics;

public class Testbank {

	public static void main(String[] args) {
		ICICIBank  icici = new ICICIBank();
		icici.Debit();
		icici.Insurance();
		icici.mutualfunds();
		icici.EducationalLoan();
		
	USBank	usbank= new ICICIBank();		
		
		usbank.Debit();
		usbank.Credit();
		usbank.TransferMoney();
		

	}

}
