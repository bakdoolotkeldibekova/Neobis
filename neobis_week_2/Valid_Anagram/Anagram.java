import java.util.Scanner;
import java.util.Arrays;



class Anagram{
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		System.out.print("Введите 1-ое слово: \n");
		String s_word = scanner.nextLine();
		System.out.print("Введите 2-ое слово: \n");
		String t_word = scanner.nextLine();
		if(anagrams_cheking(s_word, t_word)) {
			System.out.println("True");		
		}else {
			System.out.println("False");		
		}
		scanner.close();
	}	
	
	public static boolean anagrams_cheking(String s_word, String t_word) {
		s_word = s_word.replaceAll("s", "");
		t_word = t_word.replaceAll("s", "");
		
		if(s_word.length() != t_word.length()) {
			return false;		
		}else{
			char[] word_s = s_word.toLowerCase().toCharArray();
			char[] word_t = t_word.toLowerCase().toCharArray();

			Arrays.sort(word_s);
			Arrays.sort(word_t);
			return (Arrays.equals(word_s, word_t));	
		}
	}
}
