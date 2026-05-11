class ContactsManager {

    int friendsCount;
    Contact[] myFriends;

    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Ajoute un contact dans le tableau
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Cherche un contact par son nom et le retourner
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i]; // trouvé !
            }
        }
        return null; // pas trouvé
    }
}


public class Main {

    public static void main(String[] args) {

        // Créer le gestionnaire
        ContactsManager myContactsManager = new ContactsManager();


        Contact contact1 = new Contact();
        contact1.name = "Alice";
        contact1.phoneNumber = "0102030405";
        myContactsManager.addContact(contact1);


        Contact contact2 = new Contact();
        contact2.name = "Bob";
        contact2.phoneNumber = "0607080910";
        myContactsManager.addContact(contact2);


        Contact contact3 = new Contact();
        contact3.name = "Chloé";
        contact3.phoneNumber = "0611223344";
        myContactsManager.addContact(contact3);


        Contact contact4 = new Contact();
        contact4.name = "David";
        contact4.phoneNumber = "0755667788";
        myContactsManager.addContact(contact4);


        Contact contact5 = new Contact();
        contact5.name = "Emma";
        contact5.phoneNumber = "0699887766";
        myContactsManager.addContact(contact5);

        // Rechercher un contact et afficher son numéro
        Contact resultat = myContactsManager.searchContact("Chloé");

        if (resultat != null) {
            System.out.println("Contact trouvé : " + resultat.name);
            System.out.println("Numéro de téléphone : " + resultat.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}