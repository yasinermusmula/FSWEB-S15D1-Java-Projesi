import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MobilePhoneArray();
//        arrayListChallange();
    }

    public static void arrayListChallange(){
        Scanner input = new Scanner(System.in);

        List<String> groceryList = new ArrayList<>();

        GroceryListArr groceryListArr = new GroceryListArr(groceryList);

        System.out.println("Sayı giriniz: ");
        int x = input.nextInt();
        input.nextLine();
        while (x!=0){
            switch (x){
                case 1:
                    System.out.print("Eklenmesini istediğiniz elemanları giriniz: ");
                    String addItem = input.nextLine();
                    groceryListArr.addItem(addItem);
                    groceryListArr.printSorted();
                    break;
                case 2:
                    System.out.print("Cikarilmasini istediğiniz elemanları giriniz: ");
                    String removeItem = input.nextLine();
                    groceryListArr.removeItem(removeItem);
                    groceryListArr.printSorted();
                    break;
                case 0:
                    break;
            }
            x= input.nextInt();
            input.nextLine();
        }
       }

       public static void MobilePhoneArray(){
        Contacts c1 = new Contacts("Ali","8586934340");
        Contacts c2 = new Contacts("Veli","7834357742");
        Contacts c3 = new Contacts("Hande","086544575");
        Contacts c4 = new Contacts("Ayşe","4334575876");
        Contacts c5 = new Contacts("Veli","4334575876");


        MobilePhone mobilePhone = new MobilePhone("12345678");
        MobilePhone mobilePhone2 = new MobilePhone("55321123");
        MobilePhone mobilePhone3 = new MobilePhone("232355");
        MobilePhone mobilePhone4 = new MobilePhone("321546455");

        mobilePhone.addNewContact(c1);
        mobilePhone.addNewContact(c2);
        mobilePhone.addNewContact(c3);
        mobilePhone.addNewContact(c4);
        mobilePhone.addNewContact(c5);
        System.out.println(mobilePhone.updateContact(c4,c5));
        System.out.println(mobilePhone.findContact(c3));
        mobilePhone.prntContact();
       }
     }
