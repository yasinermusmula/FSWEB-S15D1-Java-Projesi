import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GroceryListArr {
    private List<String> groceryList;

    public GroceryListArr(List<String> groceryList) {
        this.groceryList = groceryList;
    }

    public boolean checkItemIsInList(String item){
       return groceryList.contains(item);
    }

    public void addItem(String item){
        if (!checkItemIsInList(item)){
            groceryList.add(item);
        }
        else {
            System.out.println("This item in the list");
        }
    }
    public void removeItem(String item){
        if (checkItemIsInList(item)){
            groceryList.remove(item);
        }else {
            System.out.println("This item doesn't contains in the list");
        }
    }

    public void printSorted(){
        Collections.sort(this.groceryList);
        System.out.println(groceryList);
    }
}
