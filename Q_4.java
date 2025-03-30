/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Q_4 {
    public double avg(int a, int b) {
        int[] array = {1, 5, 8, 12, 20, 25, 30};

        int sum = 0;
        int count = 0;

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int value : array) {
            if (value >= min && value <= max) {
                sum += value;
                count++;
            }
        }

        if (count == 0) {
            throw new ArithmeticException("No elements found in the range. Cannot calculate average.");
        }

        return (double)sum / count;
    }
}
