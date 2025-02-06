
package textanaly2;
import java.util.*;
public class TextAnaly2 {


    public static void main(String[] args) {
        String text = "Apple is a technology company that  specializes in creating innovative products.";
        
        //Tokenize the text into words
        String[] words = text.split("\\s+");
        
        //perfom simple sentiment analysis
        int positiveCount =0;
        int negetiveCount =0;
        
        for (String word : words) {
            if(isPositiveWord(word)){
            positiveCount++;
            }else if(isNegetiveWord(word)){
              negetiveCount++;
            }
        }
        
        //print the sentiment analysis results
        System.out.println("Sentiment Analysis :");
        if(positiveCount > negetiveCount){
            System.out.println("Positive Sentiment");
        }
        else if(negetiveCount > positiveCount){
            System.out.println("Negetive Sentiment");
        }
        else{
            System.out.println("Neutral sentiment");
        }
        
        //perform simple named entity recognition
        System.out.println("\nNamed Entities: ");
        
        for (String word : words) {
            if(isNamedEntity(word)){
                System.out.println(word);
            }
        }
    }
    //Simple sentiment analysis helper methods
    private static boolean isPositiveWord(String word){
        String[] positiveWords = {"good" , "great" ,"Excellent" ,"awesome"};
        
        return Arrays.asList(positiveWords).contains(word.toLowerCase());
   }
    private static boolean isNegetiveWord(String word){
        String[] negetiveWords = {"bad" , "terrible" ,"awful" ,"poor"};
        
        return Arrays.asList(negetiveWords).contains(word.toLowerCase());
   }
    
    //simple named entity recognition
    private static boolean isNamedEntity(String word){
        
        return Character.isUpperCase(word.charAt(0));
        
    }
}
//This code performs simple sentiment analysis and named entity recognition using
//basic string manipulation and heuristic methods