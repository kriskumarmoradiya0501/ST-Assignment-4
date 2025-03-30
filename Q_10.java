/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Q_10 {
    public int countArm(){
        int count = 0;
        
        for (int i = 1; i <= 1000; i++) {
            int num = i;
            int ogNum = num;
            int digits = 0;
            int temp = num;
            
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            
            int sum = 0;
            temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            
            if (sum == ogNum) {
                count++;
            }
        }
        return count;
    }
}
