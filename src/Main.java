public class Main {
    public static void main(String[] args) {
        task1();
    }

    static void task1(){
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivan","1234567");
        phonebook.add("Ivan","7654321");
        phonebook.add("Ivan","333222111");
        phonebook.add("Dima","1234567");
        phonebook.add("Dima","2452");
        phonebook.add("Dima","1233445");
        phonebook.printPhonebook();
    }
}