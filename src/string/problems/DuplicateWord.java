package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static HashMap<String,Integer> duplicateElement(String source){
        HashMap<String,Integer> hash = new HashMap<String,Integer>();
        String [] words = source.split("\\s+"); for(String x:words){
            if(x.contains(".")){
                x=x.replace(".","");
                x = x.toLowerCase();
            }
            if(hash.containsKey(x)){
                hash.put(x,hash.get(x)+1);
            }else{
                hash.put(x,1);
            }
        }
      //  hash.entrySet().removeIf(x->(1==x.getValue()));
        return hash;
    }

    // TODO secondly we wrote a function to get the average length of words used in the string given
    public static double averageLengthOfWords(String source){
        // we split the word using white space as a delimiter remove period in word if present the first
        // take sum of all the word length then divide it by total words
        double avg = 0;
        String [] words = source.split("\\s+");
        int sum=0;
        for(String x:words){
            if(x.contains(".")){
                x=x.replace(".","");
            }
            sum += x.length();
        }
        avg = (double)sum/words.length;
        return avg;
    }




    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        HashMap<String,Integer> frequencyCount = new HashMap<String,Integer>();
        frequencyCount = duplicateElement(st);

        System.out.println("Duplicate Element : Frequency");
        for(Map.Entry<String,Integer> x:frequencyCount.entrySet()){
            System.out.println(x.getKey()+" : "+x.getValue());
        }

        System.out.println("Average Length of Words in String : "+String.format("%4f",averageLengthOfWords(st)));
    }
    }

