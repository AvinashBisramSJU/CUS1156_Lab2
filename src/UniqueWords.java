//Avinash Bisram
//February 24th, 2021
//CUS 1156
//Lab 2

import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {   
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++)	  
      {
    	  int tempCount=0;
    	  for (int j = 0; j < list.size(); j++) 
    	  {
    		  if (list.get(i)==list.get(j)) {//duplicate word is encountered
    			  if (i!=j) {//makes sure it's not the same exact word
    				  if (j<i) {//if the duplicate has a smaller index, it skips the word because the duplicates were already counted
    					  tempCount=0;
    					  break;
    				  }
    				  else
    					  tempCount++;
    			  }
    		  }
		 }
    	 count+=tempCount; //count keeps track of duplicate words
      }
      count=list.size()-count; //subtracts duplicate words from total words to get true unique word count
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
