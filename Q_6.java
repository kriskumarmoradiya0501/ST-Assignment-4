/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Q_6 {
    public int countOccurence(String str,char c){
        
        String input = str;
        
        char targetChar = c;
        
        int count = 0;
        
        for (char ch : input.toCharArray()) {
            if (ch == targetChar) {
                count++;
            }
        }
        
        if (count > 0) {
            return count;
        } 
        else {
            return -1;
        } 
    }
}
