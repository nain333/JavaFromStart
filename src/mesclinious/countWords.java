package mesclinious;

public class countWords {
    public static int countWords(String strl,int si,int ei,int count){
        if (si>=ei){
            return count;
        }
        if (strl.charAt(si)==' '){
            count++;

        }
        System.out.print("count : "+count);
        int words= countWords(strl,si+1,ei,count);
        System.out.println("word: "+words);
        return words;

    }

    public static void main(String[] args) {
        String str ="This is a sample text";
        System.out.println("The number of words in: "+str + " are:  "+countWords(str,0,str.length()-1,1));

    }
}
