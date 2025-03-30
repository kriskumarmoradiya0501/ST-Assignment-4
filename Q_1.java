/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Q_1 {
    public boolean prime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <a; i++) {
            if (a % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
