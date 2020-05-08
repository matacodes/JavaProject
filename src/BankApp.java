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
		System.out.println("1. Sprawdz bilans konta");
		System.out.println("2. Wp�ata");
		System.out.println("3. Wyp�ata");
		System.out.println("4. Ostatnia tranzakcja");
		System.out.println("5. Koniec");


	}

}

 class BankControl {

    private final static int EXIT = 3;
    private final static int LOG_IN = 1;
    private final static int ADD_ACCOUNT = 2;

    public void controlLop1(){
        int option;

        System.out.println("MENU: ");
        System.out.println("1. Logowanie");
        System.out.println("2. Dodaj nowe konto");
        System.out.println("3. Wyjście");
        Scanner choose = new Scanner(System.in);


        do{
            System.out.print("Wybierz: ");
            option = choose.nextInt();
            switch (option){
                case LOG_IN:
                    System.out.println("Zaloguj"); // tworzymy klase logowania
                    break;
                case ADD_ACCOUNT:
                    System.out.println("Dodaj konto:"); // tworzymy klase dodaj nowe konto
                    break;
                case EXIT:
                    System.out.println("Bye"); // wyjscie z programu
                    break;
                default:
                    System.out.println("Błąd");
            }
        }while(option !=EXIT);





    }

}

