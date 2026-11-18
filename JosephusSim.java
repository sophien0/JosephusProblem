import java.util.*;
import java.io.*;

public class JosephusSim {
   private PersonNode front;      // a PersonNode pointer that tracks first node in the list
   private int size;              // the number of people in the circle
   private int eliminationCount;  // the number to count to for elimination 
   private PersonNode last;      

   public JosephusSim(String fileName) {
      try {
         size = 0;
         front = null;
         // load names from the file in order, generating a singly linked list of PersonNodes
         Scanner input = new Scanner(new File(fileName));
         while(input.hasNextLine()){
            String name = input.nextLine();
            PersonNode person = new PersonNode(name, front);
            front = person;
            size++;
            
            if(size == 1){
               last = front;
            }
         }
        
         
         // make the ring circular by attaching last node's next to front
         last.next = front;
         // generate, print, and save the random elimination count

      } catch (FileNotFoundException e) {
         System.out.println("Something went wrong with " + fileName);
      }
   }
   
   // optional helper method for constructing the circle
   private void add(String val) {
   }
   
   public void eliminate() {
      // count to the elimination count
      
      // print who will be eliminated
      
      // eliminate the person and update "front" of the circle and size

   }
   
   public boolean isOver() {
      // check if there's only one person left in the circle
      return false;
   }
   
   public String toString() {
      String name = "";
      if(front.next == null){
         name += front.name;
      } else{
         PersonNode current = front;
         for(int i = 0; i < size; i++){
            name += current.name + " ";
            current = current.next;
         }
      }
      return name;
   }

}