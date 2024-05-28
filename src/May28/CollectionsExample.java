package May28;

import java.util.*;
/*today
* arraylist
* linklist
* stack
* vector
* hashSet
* linkedSet
* collection
* iterable */


/**
 * this is the Example class of Collections and how to use them
 * */
public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String option;
        do{
            System.out.println("Enter the name of user ");
            String name = sc.nextLine();
            list.add(name);
            System.out.println("Do you want to enter the name of user [y/n], [yes/no]");
            option = sc.nextLine();
        } while (Objects.equals(option, "y") || Objects.equals(option, "yes"));
        if(printArrayList(list))
            System.out.println("List Printed !!");
    }

    public static boolean printArrayList(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
        return true;
    }
    public static boolean TravelingListThroughIterator(ArrayList<String> list) {
        //Traversing list through Iterator
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        return true;
    }

    public void AddNameToKey(int key, String value) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, value);
        hashMap.put(2, value);
        hashMap.put(3, value);
        hashMap.put(4, value);
        hashMap.put(5, value);
        for (int i = 1; i <= hashMap.size(); i++) {
            System.out.println("data -> "+ hashMap.get(i));
        }
    }
}

