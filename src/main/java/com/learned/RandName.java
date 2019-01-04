package com.learned;



import java.util.*;

public class RandName {
	
	 public static void main(String[] args)
	    {
	       Random generate = new Random();
	       String[] name = {"Raja", "Vinay", "Murali", "Divya"};

	       System.out.println("Winner: " + name[generate.nextInt(4)]);      

	    }

}
