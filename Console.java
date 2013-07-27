
package my.yahorfilipchyk.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yahor Filipchyk
 * Implementing of simple custom console
 */
public class Console {
    
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
    public static void write(String str) {
        System.out.print(str);
    }
    
    public static void writeLine(String str) {
        System.out.println(str);
    }
    
    public static String readLine() {
        String line = "";
        try {
            line = reader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return line;
    }
    
    public static int read() {
        int readed = -1;
        try {
            readed = reader.read();
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return readed;
    }
}
