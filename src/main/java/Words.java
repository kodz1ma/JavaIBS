import java.util.Arrays;
import java.util.Scanner;

public class Words {
    public void WordsStart(){
        System.out.println("Enter number of words:");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        System.out.println("\nWrite " + num + " words:");
        Scanner words = new Scanner(System.in);

        String text = words.nextLine().replaceAll("\\s+", " ");

        String[] separated = text.split(" ");
        int[] ResultArray = new int[100];
        int iWordCount = separated.length;
        
        if (num == iWordCount){

            for(int i=0;i<iWordCount;i++)
            {
                int s = separated[i].length();
                ResultArray[i] = s;
            }

            int result = Arrays.stream(ResultArray).max().getAsInt();

            for(int i=0;i<iWordCount;i++){
                if (separated[i].length() == result) {
                    System.out.println("Word with max words:");
                    System.out.println(separated[i]);
                }
            }
        } else {
            System.out.println("Wrong number of words");
        }
    }
}
