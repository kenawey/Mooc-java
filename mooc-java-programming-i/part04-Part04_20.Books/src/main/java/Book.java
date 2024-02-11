
import java.text.DateFormat;

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
    private int numberOfPages;
    private int publishDate;

    public Book(String name, int numberOfPages, int publishDate) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.publishDate = publishDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublishDate() {
        return publishDate;
    }

    @Override
    public String toString() {

        return name + ", " + numberOfPages + " pages, " + publishDate;
    }

}
