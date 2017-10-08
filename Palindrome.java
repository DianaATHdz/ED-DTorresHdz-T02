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
   public static boolean isPalindrome(String palabra)
     {
            Stack pila = new Stack();
            palabra = palabra.replaceAll("\\s+", "");
            palabra = palabra.toLowerCase();
                for (int i = 0; i < palabra.length(); i++) {
                    pila.push(palabra.charAt(i));
                }
             String returnString = "";

            while (!pila.isEmpty()) {
                 returnString += pila.pop();
            }
            System.out.println(returnString);
            return returnString.equals(palabra);
     }
}

