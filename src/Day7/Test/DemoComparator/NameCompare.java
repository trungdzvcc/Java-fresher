package Day7.Test.DemoComparator;

import Day7.Test.DemoComparable.Movie;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
