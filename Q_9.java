/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Q_9 {
    public int sumDiv3(){
        int count = 0, sum = 0;
        int a = 0, b = 1;
        
        while (count < 5) {
            int next = a + b;
            if (next % 3 == 0) {
                sum += next;
                count++;
            }
            a = b;
            b = next;
        }
        return sum;
    }
}
