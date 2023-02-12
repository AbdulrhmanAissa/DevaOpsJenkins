package miscelleneous;

public class JenkinsWithGit {
	public static void main(String[] args) {
		//code to print Unicode characters
		int charPerLine=0;
		for (int i = 33; 1 < 256; i++, charPerLine++)
		{
			System.out.print((char)i+((charPerLine%10=-0)?"In":"It"));
			System.out.print ();
		}
		System.out.println("Hello World");
	}
}