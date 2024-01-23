import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacts contact){
        if (!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        } return false;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        if (myContacts.contains(oldContact) && !oldContact.equals(newContact)){
            myContacts.set(myContacts.indexOf(oldContact),newContact);
            return true;
        }  return false;
    }

    public int findContact(Contacts findContact){
        for (int i = 0; i<myContacts.size(); i++){
            if (myContacts.get(i).equals(findContact)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeContact(Contacts removeContect){
        if (myContacts.contains(removeContect)){
            myContacts.remove(removeContect);
        }
        if (!myContacts.contains(removeContect)){
            return true;
        } return false;
    }

    public int findContact(String strFindContact){
        for (int i = 0; i<myContacts.size(); i++){
            if (myContacts.get(i).equals(strFindContact)){
                return i;
            }
        }
        return -1;
    }

    public Contacts queryContact(String contactName){
        for (Contacts contact : myContacts){
            if (contact.getName().equals(contactName)){
                return contact;
            }
        }
        return null;
    }

    public void prntContact(){
        for (int i = 0; i<myContacts.size(); i++){
            System.out.println(i + " " + myContacts.get(i).getName() + "-> " +  myContacts.get(i).getPhoneNumber());
        }
    }
}

