/*
* David Lutelmowski
* 05/03/19
* Hangman
*/

package hangman;

import javax.swing.JOptionPane;
/**
 *
 * @author dalut3278
 */
public class Hangman {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String[] movie = {"skyfall", "whiplash", "interstellar", "martian"};
        String word = movie[(int) (Math.random() * movie.length)];
        String blankspace = new String(new char[word.length()]).replace("\0", "*");
        int count = 0;
    }
        
                
        
                if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println("  O  ");
		
		if (count == 2) {
			System.out.println("Try again");
			System.out.println("  O ");
			System.out.println("/ ");
		
		}
		if (count == 3) {
			System.out.println("Try again");
			System.out.println("  O  ");
			System.out.println("/ | ");
		
		}
		if (count == 4) {
			System.out.println("Try again");
			System.out.println("  O  ");
			System.out.println("/ | \");
			
		
		}
		if (count == 5) {
			System.out.println("Try again");
			System.out.println("  O  ");
			System.out.println("/ | \");
			System.out.println("  | ");
                     
			
		}
		if (count == 6) {
			System.out.println("Try again");
			System.out.println("  O  ");
			System.out.println("/ | \");
			System.out.println("  | ");
                        System.out.println(" /");
			
		}
		if (count == 7) {
			System.out.println("You Lost");
			System.out.println("Try again");
			System.out.println("  O  ");
			System.out.println("/ | \");
			System.out.println("  | ");
                        System.out.println(" / \");
			System.out.println("The word was " + movie);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
