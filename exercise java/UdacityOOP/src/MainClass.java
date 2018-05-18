public class MainClass {
    public static void main(String[] args) {

        //1. create object from ContactsManager class:
        ContactsManager myContactsManager = new ContactsManager();

        //2. create Contact objects with name and phoneNumber fields:
        Contact contactA = new Contact("Kierepka", "657458");

        //3. method which add all Contact objects to 'myFriends' array:
        myContactsManager.addContact(contactA);

        //repeat 2. and 3. steps x4:
        Contact contactB = new Contact("Welter", "635328392");
        myContactsManager.addContact(contactB);
        Contact contactC = new Contact("Kot", "88223");
        myContactsManager.addContact(contactC);
        Contact contactD = new Contact("Dzik", "66224327");
        myContactsManager.addContact(contactD);

        //method which return result of search:
        Contact resultOfSearch = myContactsManager.searchContact("Dzik");
        System.out.println("Name: " + resultOfSearch.name + ", Phone number: " + resultOfSearch.phoneNumber);
        

    }
}
