package misclinious;
import java.util.Scanner;
public class RemoveConsecutiveDuplicates{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
		System.out.println(removeDuplicate(str));
	}
	public static String removeDuplicate(String str){
	int i =0; int j = 1;
	String rc="";
	for( ; i<str.length()&&j<str.length(); i++,j++){
	if (str.charAt(i)!=str.charAt(j)){
		rc+=str.charAt(i);



		}


	}
	rc+=str.charAt(i);
	return rc;
	}



}
