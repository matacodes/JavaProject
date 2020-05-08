import java.util.Scanner;

// Public class for a Bank Application
public class BankApp {

	public static void main(String[] args) {

		System.out.println("******  Witaj w aplikacji ePortfel  ******");

	}

}

// Class of bank account including four methods (deposit, withdraw, last transaction and menu) and one object (BankAccount)
class BankAccount {

	// Object of bank account with two parameters: customer id and customer name
	BankAccount(String custid, String custname) {
	}

	// Method of deposit
	void deposit(int amount) {

	}

	// Method of withdraw
	void withdraw(int amount) {

	}

	// Method of showing last transaction on the account
	void getLastTransaction() {

	}

	// Method of showing menu
	void menu() {
		char option = '0';
		Scanner scanner = new Scanner(System.in);

		System.out.println("Klient: ");
		System.out.println("ID Klienta: ");
		System.out.println("");
<<<<<<< HEAD
		System.out.println("1. Sprawdz bilans konta");
		System.out.println("2. Wp³ata");
		System.out.println("3. Wyp³ata");
=======
		System.out.println("1. Sprawdz balans konta");
		System.out.println("2. Wpï¿½ata");
		System.out.println("3. Wypï¿½ata");
>>>>>>> a009c53ad9b76c64160c6bdd0676df806ed286f8
		System.out.println("4. Ostatnia tranzakcja");
		System.out.println("5. Koniec");


	}

}
