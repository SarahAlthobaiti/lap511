// Sarah Mohammed Althobaiti / class 6 / 444004881.

import java.util.Scanner;
import java.util.ArrayList;

/** 
   This program creates a list of songs for a CD by reading from a file. */ 

public class CompactDisc {

   public static void main(String[] args)
   { 
   
     Scanner input = new Scanner(System.in);
     String title; 
     String artist; 


     // add code line: Declare an array of Song objects, called cd, with a size of 6 
 
          ArrayList <Song> list = new ArrayList <Song>();
	 
	 
     for (int i = 0; i < 6; i++) 
    {  
         System.out.print("Enter song title #" + (i+1)+": ");
	   //add code line: read title as input from user
         title = input.nextLine();
 
	   System.out.print("Enter the song artist: " );
	   // add code line: read artist name as input from user
         artist = input.nextLine();
 
         System.out.println();
   
         //add code lines:
	   // Fill the array by creating a new song with 
	   // the title and artist and storing it in the 
	   // appropriate position in the array 

	    list.add(i,new Song(title,artist));
	 
    } 

    System.out.println("Contents of Classics:"); 

     for (int i = 0; i< list.size(); i++) 
     { 
    
	   // add code line: Print the contents of the array to the console
				System.out.print(list.get(i).toString());
	
     } 
   } 
} 
