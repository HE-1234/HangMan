import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
   ArrayList <String> guessList = new ArrayList<String>(); 
   ArrayList<String> puzzleName = new ArrayList<String>();
   ArrayList <String> rightList = new ArrayList<String>();
   public Puzzle(){
       puzzleName.add("n");
       puzzleName.add("i");
       puzzleName.add("c");
       puzzleName.add("e");
       
       for(int i = 0; i < puzzleName.size(); i++){
           rightList.add(" _ ");
       }
   }
   
   public Boolean isUnsolved(){
       ArrayList <String> copyPuzzle = new ArrayList<String>();
       ArrayList <String> copyRight =  new ArrayList<String>();
       copyPuzzle = puzzleName;
       copyRight = rightList;
       for(int i = copyPuzzle.size()-1; i>= 0; i--){
           for(int o = copyRight.size()-1; o>= 0; o--){
               if(copyRight.get(o).equals(copyPuzzle.get(i))){
                   copyPuzzle.remove(o);
                   copyRight.remove(i);
               }
            } 
        }
        
       if(copyRight.size()==0) return true;
       
       return false;
   }
   
   public Boolean makeGuess(String guessLetter){
       Boolean isThere = false;
       guessList.add(guessLetter);
       for(int i = 0; i < guessList.size(); i++){
        if(guessList.get(i).equals(guessLetter)){
             isThere = true;
             rightList.set(i,guessLetter);
          }  
        }
      
       
       return isThere;
    }    
   
   
   
   public void getWord(){
       for(String i: puzzleName){
           System.out.print(i);
       }
   }

   public String show(){
       String theList = "";
       for(String i : rightList){
           theList = theList + " " + i;
       }
 
       return theList;
   }
   
   
}
