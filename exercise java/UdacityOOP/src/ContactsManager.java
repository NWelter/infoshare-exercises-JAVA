public class ContactsManager {
    //Fields:

    Contact [] myFriends; //array which will store objects from Contact class
    int friendsCount; //variable represents number of friend added to the array

    //default constructor:

    ContactsManager (){

        this.friendsCount = 0; //starts from 0 and increments when we add new contact
        this.myFriends = new Contact[500]; //we reserved space to store up 500 contacts
    }

    //methods

    //method which will add a Contact object to the Contact array 'myFriends'
    public void addContact (Contact contact){
        myFriends[friendsCount]= contact;
        friendsCount++;

    }

    //method which will search trough the array using a String name and return Contact object once a match is found:

    public Contact searchContact (String searchName){
        //'searchname' == Contact object.name

        //this method loops over array and searching object with field 'name' == 'searchName'
        for (int i = 0; i <friendsCount ; i++) {
            if(myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }

        }
        //it will return null indicating that it could not find that contact:
        return null;
    }
}
