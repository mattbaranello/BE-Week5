package week5Assignment;

public class AsteriskLogger implements Logger {

	//This method prints whatever string is passed through between two sets of asterisks.
	
	
	public void Log(String string) {
		// TODO Auto-generated method stub
		System.out.println("***" + string + "***");
	}
	
	
	/*This method starts with assigning the String "stringError" to read "***Error: " + string + "***" when printed.
	 * I then created an int variable called "length" to measure "stringError" length, and creating another 
	 * String variable called "asterisks" which will create a char array that will contain asterisks that are the same length as
	 * the "stringError" message.
	 */
	
	public void Error(String string) {
		// TODO Auto-generated method stub
		String stringError = "***Error: " + string + "***";
		int length = stringError.length();
		String asterisks = new String(new char[length]).replace('\0', '*');
		
		System.out.println(asterisks);
		System.out.println(stringError);
		System.out.println(asterisks);
	}


}
