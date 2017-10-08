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
      System.out.println("Enter a word: ");     
      String palabra = scan.nextLine();                 

    if(Palindrome.isPalindrome(palabra)) {        
        System.out.println("is a palindrome");
    } else {
        System.out.println("is not a palindrome\n");
    }
  }
}
    
