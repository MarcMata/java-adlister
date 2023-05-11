import models.*;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        Album album1 = new Album(1, "The Beatles", "Abbey Road", "September 26, 1969", "9.5 million", "Rock");
        Author author1 = new Author(1, "John Lennon");
        Quote quote1 = new Quote(1, "Life is what happens when you're busy making other plans.", "John Lennon");

        Album album2 = new Album(2, "Beyonce","Good Girl Gone Bad", "May 23, 2006", "9.5 million", "R&B");
        Author author2 = new Author(2, "Beyonce Knowles");
        Quote quote2 = new Quote(2, "Power is not given to you. You have to take it.", "Beyonce Knowles");

        Album album3 = new Album(3, "Katy Perry", "Teenage Dream", "August 24, 2010", "7.5 million", "Pop");
        Author author3 = new Author(3, "Katy Perry");
        Quote quote3 = new Quote(3, "If you're presenting yourself with confidence, you can pull off pretty much anything.", "Katy Perry");

        Album album4 = new Album(4, "Styx", "The Grand Illusion", "July 7, 1977", "3 million", "Rock");
        Author author4 = new Author(4, "Tommy Shaw");
        Quote quote4 = new Quote(4, "I'm not a big fan of the thought that you can become a star by winning a contest. I'm sort of old-fashioned. I think people need to get out there and they need to work and they need to do their music because they love it.", "Tommy Shaw");

//        In BeanTest, experiment with storing multiple instances of Quote in an arraylist and iterating over it to print out the content and author name of multiple quotes.
        //store in an arrayList
        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);

        //iterate over the arrayList
        for(Quote quote: quotes){
            System.out.println(quote.getQuote());
            System.out.println(quote.getAuthor());
        }

    }
}
