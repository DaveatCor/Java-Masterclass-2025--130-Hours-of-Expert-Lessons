package dev.lpa;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    @Override
    public int hashCode() {
        return 33 * getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

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

    @Override
    public String toString() {
        return "%s: %s %s".formatted(name, emails, phones);
    }

    public Contact mergeContactData(Contact contact) {
        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;
    }

    public void addEmail(String companyName) {
        String[] names = name.split(" ");
        String email = "%c%s@%s.com".formatted(name.charAt(0), names[names.length - 1],
                companyName.replaceAll(" ", "").toLowerCase());
        if (!emails.add(email)) {
            System.out.println(name + " already has email" + email);
        } else {
            System.out.println(name + " now has email" + email);
        }
    }

    public void replaceEmailIfExists(String oldEmail, String newEmail) {
        if (emails.contains(oldEmail)) {
            emails.remove(oldEmail);
            emails.add(newEmail);
        }
    }
}
