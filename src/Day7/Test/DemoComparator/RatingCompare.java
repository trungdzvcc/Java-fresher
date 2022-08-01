package Day7.Test.DemoComparator;

import Day7.Test.DemoComparable.Movie;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getRating() < m2.getRating()) return 1;
        if (m1.getRating() > m2.getRating()) return -1;
        else return 0;
    }
    }
