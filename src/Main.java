class ContactsManager {

    Contact[] myFriends;
    int friendsCount;

    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}

public class Main {

    public static void main(String[] args) {

        // Étape 1 : créer le gestionnaire
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact = new Contact();
        contact.name = "Alice";
        contact.phoneNumber = "0102030405";
        myContactsManager.addContact(contact);

        contact = new Contact();
        contact.name = "Bob";
        contact.phoneNumber = "0607080910";
        myContactsManager.addContact(contact);

        contact = new Contact();
        contact.name = "Rachelle";
        contact.phoneNumber = "0611223344";
        myContactsManager.addContact(contact);

        contact = new Contact();
        contact.name = "David";
        contact.phoneNumber = "0755667788";
        myContactsManager.addContact(contact);

        contact = new Contact();
        contact.name = "Ruth";
        contact.phoneNumber = "0699887766";
        myContactsManager.addContact(contact);

        // Rechercher et afficher uniquement le numéro
        Contact resultat = myContactsManager.searchContact("Ruth");
        System.out.println(resultat.phoneNumber);
    }
}