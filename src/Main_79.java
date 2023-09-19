public class Main_79 {

    public static void main(String[] args) {
        ClassesChallenge_79 bankAccount = new ClassesChallenge_79();

        bankAccount.setAccountNumber("12345678910");
        bankAccount.setName("Bayu Aji Nurmansah");
        bankAccount.setBalance(0.0);
        bankAccount.setEmail("bayuaji@dummy.com");
        bankAccount.setPhoneNumber("066-8972-88");

        bankAccount.deposit(850000);
        bankAccount.withdraw(50000);
        bankAccount.withdraw(850000);
    }
}
