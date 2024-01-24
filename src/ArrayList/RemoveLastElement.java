package arraylist;
import java.util.ArrayList;


public class RemoveLastElement {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("BMW");
        stringList.add("FORD");
        stringList.add("KIA");
        stringList.add("Volkswagen");

        // Displaying the ArrayList before removal
        System.out.println("ArrayList before removal: " + stringList);
        //System.out.println(stringList.indexOf("KIA"));

        // Removing the last object using basic method
        int lastIndex = stringList.size() - 1;
        String removedElement = stringList.remove(lastIndex);

        // Displaying the ArrayList after removal
        System.out.println("ArrayList after removal: " + stringList);

        // Displaying the removed element
        System.out.println("Removed Element: " + removedElement);
}

}
