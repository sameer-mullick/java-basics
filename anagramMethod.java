import java.util.Arrays;
import java.util.Scanner;
class anagramMethod
{
  public static boolean checkAnagram(String str1, String str2)
  {
    boolean num = false;
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    
    char[] char1 = str1.toCharArray();
    char[] char2 = str2.toCharArray();

     Arrays.sort(char1);
     Arrays.sort(char2);
    
    if (Arrays.equals(char1, char2)){
      num = true;
    }
    else {
      num = false;
    }
    return num;
  }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("We are going check if the words you choose are anagrams or not!");
        System.out.print("Give us your first word: ");
        String word1 =  scan.nextLine();
        System.out.print("Give us your Second word: ");
        String word2 =  scan.nextLine();

       System.out.println( checkAnagram(word1, word2));
    }

}