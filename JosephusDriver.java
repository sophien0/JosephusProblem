import java.util.*;

public class JosephusDriver {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      JosephusSim simulation = new JosephusSim("people.txt");
      
      while(!simulation.isOver()) {
         System.out.println(simulation);
         System.out.println("\nContinue elimination? <press enter>");
         console.nextLine(); // make the user hit enter to continue
         simulation.eliminate();
      }
      
      System.out.println(simulation);
   }

}

/* output:
 ----jGRASP exec: java JosephusDriver
 The elimination count is 2
 Yunfeng Mya Maharshi Phoung Lukas Angel Anthony Unumergen Mohamed Sophie Marshall Ziru 
 
 Continue elimination? <press enter>
 6
 Mya
 Yunfeng Maharshi Phoung Lukas Angel Anthony Unumergen Mohamed Sophie Marshall Ziru 
 
 Continue elimination? <press enter>
 8
 Maharshi
 Yunfeng Phoung Lukas Angel Anthony Unumergen Mohamed Sophie Marshall Ziru 
 
 Continue elimination? <press enter>
 5
 Phoung
 Yunfeng Lukas Angel Anthony Unumergen Mohamed Sophie Marshall Ziru 
 
 Continue elimination? <press enter>
 4
 Lukas
 Yunfeng Angel Anthony Unumergen Mohamed Sophie Marshall Ziru 
 
 Continue elimination? <press enter>
 7
 Angel
 Yunfeng Anthony Unumergen Mohamed Sophie Marshall Ziru 
 
 Continue elimination? <press enter>
 3
 Anthony
 Yunfeng Unumergen Mohamed Sophie Marshall Ziru 
 
 Continue elimination? <press enter>
 2
 Unumergen
 Yunfeng Mohamed Sophie Marshall Ziru 
 
 Continue elimination? <press enter>
 1
 Mohamed
 Yunfeng Sophie Marshall Ziru 
 
 Continue elimination? <press enter>
 8
 Sophie
 Yunfeng Marshall Ziru 
 
 Continue elimination? <press enter>
 5
 Marshall
 Yunfeng Ziru 
 
 Continue elimination? <press enter>
 6
 Ziru
 Yunfeng 
 
  ----jGRASP: Operation complete.
*/