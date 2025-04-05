import java.util.ArrayList;

public class Arrlist {
   public static void main(String[] args) {
      ArrayList<String> arrlst = new ArrayList<>();

      // Adding elements
      arrlst.add("aiyo");
      arrlst.add("bat");
      arrlst.add("cat");
      arrlst.add("Dogesh");
      arrlst.add("Etamol");
      System.out.println("Original list: " + arrlst);

      // Updating elements
      arrlst.set(1, "amma");
      arrlst.set(4, "bhai");
      System.out.println("Updated list: " + arrlst);

      // Accessing elements
      System.out.println("Accessed elements are :" + arrlst.get(0) + " and " + arrlst.get(1));

      // Removing elements
      // By index
      arrlst.remove(2);
      System.out.println("List after removing element by index: " + arrlst);
      // By element
      arrlst.remove("bhai");
      System.out.println("List after removing element by value: " + arrlst);
      // By element if it is integer - arrlst.remove(Integer.valueOf(1));

      // Searching
      System.out.println("Index of amma: " + arrlst.indexOf("amma"));
      System.out.println("List contains Dogesh? " + arrlst.contains("Dogesh"));
   }
}
