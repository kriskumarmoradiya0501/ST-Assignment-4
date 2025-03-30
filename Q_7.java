/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Q_7 {
    public int countOfDiv(int[] a){
        
        int[] numbers = a;
        
        int count = 0;
        for (int num : numbers) {
            if (num%4==0 && num%6==0 && num%7==0 && num%8==0) {
                count++;
            }
        }
        
        return count;
    }
}
