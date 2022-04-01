
public class palindrom_number {

	public static void main(String[] args) {
String originalString, reverseString="";
originalString = args[0];
int length = originalString.length();

for(int i=length-1;i>=0;i--)
	reverseString=reverseString + originalString.charAt(i);

if(originalString.equals(reverseString))
	System.out.println("Entered String is a PALINDROM ");
else
	System.out.println("Entered String is not a PALINDROM ");
		// TODO Auto-generated method stub

	}

}

