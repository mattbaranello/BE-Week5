package week5Assignment;

public class SpacedLogger implements Logger {

	/*This method uses a StringBuilder so that even 
	 * when the string being passed through is modified, a space will be added between each character when printed. .trim() gets
	 * rid of any whitespace on the outer parts of the string
	 */
	public void Log(String string) {
		StringBuilder stringWithSpaces = new StringBuilder();
		for (char s : string.toCharArray()) {
			stringWithSpaces.append(s).append(" ");
		}
		System.out.println(stringWithSpaces.toString().trim());
	}

	//Same thing as previous except it prints an error message
	
	public void Error(String string) {
		StringBuilder errorWithSpaces = new StringBuilder();
		for (char s : string.toCharArray()) {
			errorWithSpaces.append(s).append(" ");
		}
		System.out.println("Error: " + errorWithSpaces.toString().trim());
	}

}
