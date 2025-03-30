/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Q_5 {
    public int[] countchar(String str){
        String input=str;
    
        int digits = 0, alphabets = 0, specialChars = 0;
        
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                alphabets++;
            } else {
                specialChars++;
            }
        }
        int[] temp = {digits,alphabets,specialChars};
        return temp;
    }
}
