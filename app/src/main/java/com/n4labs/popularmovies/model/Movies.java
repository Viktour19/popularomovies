package com.n4labs.popularmovies.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Movies {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Movie> MOVIES = new ArrayList<Movie>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Movie> Movie_MAP = new HashMap<String, Movie>();

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Movie {
        public final String id;
        public final String title;
        public final Date releasedate;
        public final String plot_synopsis;
        public final String posterurl;
        public final float rating;
        public final int duration ;

        public Movie(String id, String title, Date releasedate, String plot_synopsis, String posterurl, float rating, int duration) {
            this.id = id;
            this.title = title;
            this.releasedate = releasedate;
            this.plot_synopsis = plot_synopsis;
            this.posterurl = posterurl;
            this.rating = rating;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return plot_synopsis;
        }
    }
}
