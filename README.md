# Contacts Manager

Une application Java pour gérer des contacts.

## Fonctionnalités

- Ajouter des contacts
- Rechercher un contact par son nom

## Structure du projet

- `Contact` : classe représentant un contact avec un nom et un numéro de téléphone.
- `ContactsManager` : classe qui gère une liste de contacts.
- `Main` : point d’entrée de l’application avec un exemple d’utilisation.

## Exemple d’utilisation

```java
Contact no1 = new Contact();
no1.name = "Pierre";
no1.phoneNumber = "0123456789";
myContactsManager.addContact(no1);

Contact result = myContactsManager.searchContact("Alice");
System.out.println(result.phoneNumber); // Affiche : 0123456789
