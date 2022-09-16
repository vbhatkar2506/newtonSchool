    import java.util.*;
  
public class DuplicateRemove
 {
  
    // Function to remove duplicates from an ArrayList
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {
  
        // Create a new LinkedHashSet
        Set<T> set = new LinkedHashSet<>();
  
        // Add the elements to set
        set.addAll(list);
  
        // Clear the list
        list.clear();
  
        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);
  
        // return the list
        return list;
    }
    
    public static void main(String args[])
    {
  
        // Get the ArrayList with duplicate values
        ArrayList<Character> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int Size = sc.nextInt();
        System.out.println("Enter Array elements");
        for (int i = 0; i< Size;i++)
        {
            char values = sc.next().charAt(0);
            list.add(values);
        }

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "+ list);
  
        // Remove duplicates
        ArrayList<Character> newList = removeDuplicates(list);
  
        // Print the ArrayList with duplicates remove
      System.out.println(newList);
     
    }
}
