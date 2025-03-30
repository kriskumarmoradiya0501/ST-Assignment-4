
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Q_8 {
    public int countTxt(String path){
        String directoryPath =path;
        
        File directory = new File(directoryPath);
        
        if (directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));
            
            if (files != null) {
                return files.length;
            } else {
                return 0;
            }
        } 
        else {
            System.out.println("Invalid directory.");
        }
        return 0;
    }
}
