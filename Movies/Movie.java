package coll.Movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Movie with a title and year, as well as user ratings.
 */
public class Movie {
    private String title;
    private int year;
    private List<Integer> ratings;


    /**
     * Constructs a Movie with the specified title and year.
     *
     * @param title
     * @param year
     */
    public Movie(String title, int year)
    {
        this.title = title;
        this.year = year;
        ratings = new ArrayList<Integer>();
    }

    /**
     * Rates the movie.
     *
     * @param rating
     */
    public void addRating(int rating)
    {
        ratings.add(rating);
    }

    /**
     * Gets the title of the movie.
     *
     * @return the title of the movie as a String.
     */
    public String title() {
        return title;
    }

    /**
     * Gets the year of the movie.
     *
     * @return the year of the movie.
     */
    public int year() {
        return year;
    }

    /**
     * Get the average rating of the movie.
     *
     * @return the average rating of the movie.
     */
    public double rating()
    {
        double size = ratings.size();
        double total = 0.0;
        for(int n = 0; n < size; n++)
        {
            total += ratings.get(n);
        }
        total = (total / size);
        return total;
    }

}