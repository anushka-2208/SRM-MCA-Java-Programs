package MCA;

public class MyString {
	String str1 = "Welcome to java tutorial";
	String str2 = "Today's topic is string handling in Java";
	
	public void performOperations() {
		String ConcatenatedString = str1 + " " + str2;
		System.out.println("The concatenated string is " + ConcatenatedString);
		
		String lowerCaseStr1 = str1.toLowerCase();
		System.out.println("The lower case str1 is " + lowerCaseStr1);
		
		String upperCaseStr2 = str2.toUpperCase();
		System.out.println("The upper case str2 is " + upperCaseStr2);

	}
	public static void main(String[] args) {
		MyString MS = new MyString();
		MS.performOperations();
	}
}
