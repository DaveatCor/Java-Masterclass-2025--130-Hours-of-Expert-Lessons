package dev.lpa;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this(name, null, 0);
    }

    public Contact(String name, String email) {
        this(name, email, 0);
    }

    public Contact(String name, long phones) {
        this(name, null, phones);
    }

    public Contact(String name, String email, long phone) {
        this.name = name;
        if (emails != null) {
            emails.add(email);
        }

        if (phone > 0) {
            String p = String.valueOf(phone);
            p = "(%s) %s-%s".formatted(p.subSequence(0, 3), p.substring(3, 6), p.substring(6));
        }
    }

    public String getName() {
        return name;
    }

    public Contact mergeContactData(Contact contact) {
        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;
    }

}
