public class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact no1 = new Contact();
        no1.name = "Pigeon";
        no1.phoneNumber = "0256894512";
        myContactsManager.addContact(no1);

        Contact no2 = new Contact();
        no2.name = "Phineas";
        no2.phoneNumber = "0244157845";
        myContactsManager.addContact(no2);

        Contact no3 = new Contact();
        no3.name = "Villa";
        no3.phoneNumber = "2574123658";
        myContactsManager.addContact(no3);

        Contact no4 = new Contact();
        no4.name = "John";
        no4.phoneNumber = "1203587412";
        myContactsManager.addContact(no4);

        Contact foundContact = myContactsManager.searchContact("Pigeon");
        if (foundContact != null) {
            System.out.println("Numéro du contact trouvé: " + foundContact.phoneNumber);
        } else {
            System.out.println("Contact introuvable");
        }
    }
}

class Contact{
    //Attributs
    String name;
    String phoneNumber;
}

class ContactsManager {

    // Attributs :
    Contact [] myFriends;
    int friendsCount;

    // Constructeur :
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    //Fonction d'ajout des contacts
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    //Fonction de recherche des contacts
    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }

}