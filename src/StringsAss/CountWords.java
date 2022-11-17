package StringsAss;

public class CountWords {
    public static int countWords(String str){
        // pointer to take the count of the delemeters pesent in the string.
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                count ++;
            }


        }
        // return count +1 because the last  space is encountered before the last word.
        return count+1;
    }
    public static void main(String[] args) {
        String str="This is a Sample String";
        int countedWords=countWords(str);
        System.out.println(countedWords);
    }



}
