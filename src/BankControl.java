package App;

import io.DataReader;
import model.Account;
import model.CustomerBank;
public class BankControl {

    private static final int EXIT = 0;
    private static final int LOG_IN = 1;
    private static final int ADD_ACCOUNT = 2;
    private static final int PRINT_ACC =3;

    private DataReader dataReader = new DataReader();
    private Account account = new Account();
    public void controlLop(){
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case LOG_IN:
                    System.out.println("logowanie:");//logIn();
                    break;
                case ADD_ACCOUNT:
                    addAccount();
                    break;
                case PRINT_ACC:
                    printAccount();
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Błąd");
            }
        }while(option != EXIT);
    }


    private void addAccount() {
        CustomerBank customerBank = dataReader.readAndCreateAccount();
        Account.addAccount(customerBank);
    }
    private void printAccount() {
        account.printAccount();
    }

    private void printOptions(){
        System.out.println("Wybierz opcje: ");
        System.out.println(EXIT +" - Wyjście z programu");
        System.out.println(LOG_IN + " - Logowanie");
        System.out.println(ADD_ACCOUNT + " - Nowe konto");
        System.out.println(PRINT_ACC + " - Pokaż dane");
    }

    private void exit(){
        System.out.println("Koniec programu BYE!");
        dataReader.close();
    }




}
