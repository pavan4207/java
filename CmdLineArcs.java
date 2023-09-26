import java.io.*;
public class CmdLineArcs extends Object {
//Object is the super class of classes of java
      public static void main(String args[]) {
         if(args.length!=2){
         System.out.println("you have to enter only two integers");
         }
         else {
         int x = Integer.parseInt(args[0]);
         int y = Integer.parseInt(args[1]);
         int z = x + y;
         System.out.println("Sum of"+x+"and"+y+"is"+z);
     }
  }
} 
