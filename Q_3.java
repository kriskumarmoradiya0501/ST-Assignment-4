/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Q_3 {
    public int findindex(int a){
        int [] b = {1,2,3,5,6,9,15,36,35,14,25,95,75,65,4};
        
        for(int i = 0;i<b.length;i++){
            if(a==b[i]){
                return i;
            }
        }
        return -1;
    }
}
