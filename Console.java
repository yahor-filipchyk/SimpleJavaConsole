
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
         
    /**
     * Writes string to stdout.
     * @param str String to be written to stdout.
     */
    public static void write(String str) {
        System.out.print(str);
    }
    
    /**
     * Writes line to stdout.
     * @param str String to be written to stdout.
     */
    public static void writeLine(String str) {
        System.out.println(str);
    }
    
    /**
     * Read one line from stdin.
     * @return String read from stdin.
     */
    public static String readLine() {
        String line = "";
        try {
            line = reader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return line;
    }
    
    /**
     * Reads input data after the message.
     * @param message String to be written to stdout before the input.
     * @return String read from stdin after the printed message.
     */
    public static String read(String message) {
        write(message);
        String line;
        try {
            line = reader.readLine();
            String parts[] = line.split(message);
            return parts[0];
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    /**
     * Reads one character from stdin.
     * @return Code of read character. -1 if nothing read.
     */
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
