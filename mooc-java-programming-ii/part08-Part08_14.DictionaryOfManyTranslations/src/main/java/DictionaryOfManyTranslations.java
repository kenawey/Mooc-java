
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> Words;

    public DictionaryOfManyTranslations() {
        Words = new HashMap<>();
    }

    public void add(String word, String translation) {
        Words.putIfAbsent(word, new ArrayList<String>());
        ArrayList<String> translations = this.Words.get(word);
        translations.add(translation);

    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> translations = this.Words.getOrDefault(word, new ArrayList<>());
        return translations;
    }

    public void remove(String word) {
        
        Words.remove(word);

    }

}
