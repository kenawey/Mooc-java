/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohamed
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        dictionary = new HashMap<String, String>();
       
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;

    }

    public boolean load() {
        boolean loaded = false;
        try {
            
            Scanner scanner = new Scanner(Path.of(file));
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                //System.out.println(line);
                String[] row = line.split(":");
                //System.out.println(row.length);
                add(row[0], row[1]);
               
            }
            scanner.close();
 loaded = true;
           
        } catch (IOException ex) {
            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loaded;
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            dictionary.keySet()
                    .forEach(a -> {
                        writer.print(a + ':');
                        writer.println(dictionary.get(a));
                    });
            writer.close();
            return true;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void add(String words, String translation) {

       if(!dictionary.containsKey(words))
           dictionary.put(words, translation);
        
    }

    public String translate(String word) {
       
        String result = null;
        if (dictionary.containsKey(word)) {
            result = dictionary.get(word);
        } else if (dictionary.containsValue(word)) {

            for (String s : dictionary.keySet()) {
                if (dictionary.get(s).equals(word)) {
                    result = s;
                }
            }

        }
        return result;

    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
            return;
        }
        else if (dictionary.containsValue(word)) {
           
            for (String s : dictionary.keySet()) {
                if (dictionary.get(s).equals(word)) {
                    dictionary.remove(s);
                    return;
                }
            }
        }
        

    }

}
