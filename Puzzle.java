 import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
   ArrayList <String> guessList = new ArrayList<String>(); 
   ArrayList<String> puzzleName = new ArrayList<String>();
   ArrayList <String> rightList = new ArrayList<String>();
   String puzzleKey = "nice";
   public Puzzle(){
       puzzleName.add("n");
       puzzleName.add("i");
       puzzleName.add("c");
       puzzleName.add("e");
       

   }
   
   public Boolean isUnsolved(){
       ArrayList <String> copyPuzzle = new ArrayList<String>();
       ArrayList <String> copyRight =  new ArrayList<String>();
       copyPuzzle = puzzleName;
       copyRight = rightList;
       for(int i = copyPuzzle.size()-1; i>= 0; i--){
           for(int o = copyRight.size()-1; o>= 0; o--){
               if(copyRight.get(o).equals(copyPuzzle.get(i))){
                   copyPuzzle.remove(i);
                   copyRight.remove(o);
               }
            } 
        }
        
       if(copyPuzzle.size()==0) return false;
       
       return true;
   }
   
   public Boolean makeGuess(String guessLetter){
       Boolean isThere = false;
       guessList.add(guessLetter);
       for(int i = 0; i < puzzleName.size(); i++){
        if(puzzleName.get(i).equals(guessLetter)){
             isThere = true;
             rightList.add(guessLetter);
          }  
        }
      
       
       return isThere;
    }    
   
   
   
   public String getWord(){
        return puzzleKey;
    }

   public void show() {
        for (int i = 0; i < puzzleName.size(); i++) {
            if (rightList.contains(puzzleName.get(i))) {
                System.out.print(puzzleName.get(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
        System.out.print("letters guessed: ");
        for(String str : guessList){
            System.out.print(str + ". ");
        }
    }
   
   
}
