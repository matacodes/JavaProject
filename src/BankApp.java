import java.util.Scanner;


// Public class for a Bank Application
public class BankApp {


	private static final String APP_NAME = "******  Witaj w aplikacji ePortfel  ******";

    public static void main(String[] args) {

        System.out.println(APP_NAME);
        // BankControl ControlBank = new BankControl(); // wywolujemy pierwsze menu / tworzymy obiekt klas
        // ControlBank.controlLop1();
        
        BankAccount account1 = new BankAccount("1234", "Kowalski");
        account1.menu();

    }



}

// Class of bank account including four methods (deposit, withdraw, last transaction and menu) and one object (BankAccount)
class BankAccount {

	// Object of bank account with two parameters: customer id and customer name
	BankAccount(String custid, String custname) {
	    int balance; // Amount of money on customer's account
	    int lastTransaction; // Amount of money that can be withdrawn or deposited during last transaction
	    String customerID; // Customer ID
	    String customerName; // Customer Name
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
		System.out.println("1. Sprawdz bilans konta");
		System.out.println("2. Wplata");
		System.out.println("3. Wyplata");
		System.out.println("4. Ostatnia tranzakcja");
		System.out.println("5. Koniec");


	}

}

