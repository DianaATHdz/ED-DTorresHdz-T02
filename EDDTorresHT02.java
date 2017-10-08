/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dtorresh.t02;

import java.util.Scanner;


/**
 *
 * @author DianaAlessa
 */
public class EDDTorresHT02 {
    
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a word to determine if it is a palindrome: ");     
      String word = scan.nextLine();                  //user types word

    if(Palindrome.isPalindrome(word)) {        
        System.out.println("is a palindrome");
    } else {
        System.out.println("is not a palindrome\n");
    }
  }
}
    
