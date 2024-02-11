/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mostafa
 */
public class Book {

    private String name;

    private String author;
    
        private int pages;

    /**
     * Get the value of pages
     *
     * @return the value of pages
     */
    public int getPages() {
        return pages;
    }

    public Book( String author,String name, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    
    
    /**
     * Get the value of author
     *
     * @return the value of author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
    return (this.author +", " + this.name+", "+this.pages+" pages");
    }
    
}
