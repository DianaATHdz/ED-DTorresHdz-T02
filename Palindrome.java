/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dtorresh.t02;



/**
 *
 * @author DianaAlessa
 */
public class Palindrome{
   public static boolean isPalindrome(String input)
     {
            Stack pila = new Stack();
            input = input.replaceAll("\\s+", "");
            input = input.toLowerCase();
                for (int i = 0; i < input.length(); i++) {
                    pila.push(input.charAt(i));
                }
             String returnString = "";

            while (!pila.isEmpty()) {
                 returnString += pila.pop();
            }
            System.out.println(returnString);
            return returnString.equals(input);
     }
}

