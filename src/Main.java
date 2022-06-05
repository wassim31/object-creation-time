import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Item> myItems = new ArrayList<>();
        CurrentTime myTime = new CurrentTime();
        System.out.println("Enter your items name , type empty to exit");
        while(true)
        {
            String itemName = myScanner.nextLine();
            if(itemName.isEmpty())
                break;
            else
                myItems.add(new Item(itemName,new CurrentTime().toString()));
        }
        for(Item temp : myItems)
        {
            System.out.println(temp);
        }

    }
}