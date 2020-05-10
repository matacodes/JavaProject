import java.util.Scanner;


// Public class for a Bank Application
public class BankApp {


	private static final String APP_NAME = "******  Witaj w aplikacji ePortfel  ******";

    public static void main(String[] args) {

        System.out.println(APP_NAME);
        BankControl ControlBank = new BankControl(); // wywolujemy pierwsze menu / tworzymy obiekt klas
        ControlBank.controlLop1();
        
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

	// Method of showing menu and running it
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

class BankControl {

    private final static int EXIT = 3;
    private final static int LOG_IN = 1;
    private final static int ADD_ACCOUNT = 2;

    public void controlLop1(){
        int option;

        System.out.println("MENU: ");
        System.out.println("1. Logowanie");
        System.out.println("2. Dodaj nowe konto");
        System.out.println("3. Wyjscie");
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


public class AddAccount {
    /*
    addaccount - dodaje nowego uzytkownika.
Sprawdzamy czy nie ma juz max ilosci kont.
Jeśli nie to tworzymy uzytkownika
Uzytkownik podaje imie, nazwisko, haslo itp
Login sam sie tworzy - myslisz ze to bedzie dobre pobrac np 3litery imienia i nazwiska i dodac np 1 na koncu np. karbin1 areskr2

 musimy ogarnac zapisywanie uzytkownika do pliku i tworzenie listy klientow poprzez wypisanie loginu kazdego na tej liscie
 */

      /*  private static final int MAX_CUSTOMER_NUMBER =5;
        private BankCustomer[] customers = new BankCustomer[MAX_CUSTOMER_NUMBER];
        private int registerCustomer = 0;


        public void addAccount(BankCustomer customer){

            if(registerCustomer < MAX_CUSTOMER_NUMBER){
                customers[registerCustomer] = customer;
                
                registerCustomer ++;
            }else{
                System.out.println("The limit of places has been exhausted");
            }
}



       */
}

public class LogIn {
    private String name = "Karol";
    String surname;
    String login;


   /* Scanner tekst = new Scanner (System.in);
    System.out.println("Podaj imie: ");
    name = tekst.next();
    System.out.println("Podaj nazwisko: ");
    surname = tekst.next();
    System.out.println("Wpisałeś: ");
    System.out.println(+ name + " " + surname);
    String a = name.substring(0. 3);
    String b = surname.substring(0. 3);
    login = "a" + "b";
    System.out.println(login);

    /*

    podajemy login
podajemy haslo
i sprawdzamy, po zalogowaniu przechodzimy do konta

     */
}



