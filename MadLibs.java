import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Hello and welcome to the MadLibs program");

		System.out.println("Please enter a noun: ");
		String noun = input.nextLine();

		System.out.println("Please enter another noun: ");
		String noun1 = input.nextLine();
		
		System.out.println("Please enter a third noun: ");
		String noun2 = input.nextLine();
		
		System.out.println("Please enter yet another noun: ");
		String noun3 = input.nextLine();
		
		System.out.println("Please enter a final noun: ");
		String noun4 = input.nextLine();
		
		System.out.println("Please enter an adjective: ");
		String adjective = input.nextLine();
		
		System.out.println("Please enter an adverb: ");
		String adverb = input.nextLine();

		System.out.println("Please enter a color: ");
		String color = input.nextLine();

		System.out.println("Please enter a past tense tense verb: ");
		String pastTenseVerb = input.nextLine();

		System.out.println(noun);

		String result = "The " + noun + " " + pastTenseVerb + " the highway until it came upon a " + color
				+ " light and stopped " + adverb;

		String resultWrap = "";

		for (int i = 0, j = 0; i < result.length(); i++, j++) {
			if (j < 50)
				resultWrap = resultWrap + result.charAt(i);
			else if (j >= 50 && result.charAt(i) == ' ') {
				resultWrap = resultWrap + "\n";
				j = 0;
			} else
				resultWrap = resultWrap + result.charAt(i);

		}
		System.out.print(resultWrap);

	}

}
