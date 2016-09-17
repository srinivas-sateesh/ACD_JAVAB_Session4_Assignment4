import java.util.*;
public class StringRev {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inp = reader.nextLine();
		System.out.println("Reverse of the string you entered is:");
		char [] charray = inp.toCharArray();
		for(int i = inp.length()-1; i>=0; i--)
		{
			System.out.print(charray[i]);
		}
	}
	
}
