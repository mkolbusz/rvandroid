package pl.edu.agh.mkolbusz.recyclerview;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by mkolbusz on 23.11.16.
 */

public class MoviesSampleData {
    private static String titles[] = {"Władca pierścieni", "Matrix", "Planet terror", "Mechete",
            "Piraci z Karaibów", "Hobbit", "Kiler", "Fantastyczne zwierzęta i jak je znaleźć", "Inferno",
            "Ojciec chrzestny"};

    private static String actors[] = {
            "Cezary Pazura", "Tom Hanks", "Al Pacino", "Morgan Freeman", "Nicolas Cage", "Johny Depp",
            "Samuel L. Jackson", "Clint Eastwood", "Christopher Lee", "Audrey Hepburn", "Harrison Ford",
            "Sean Connery", "Jack Nicholson ", "Robert De Niro", "Andrzej Grabowski"
    };

    private static Integer years[] = {1998, 1999, 2004, 2006, 2007, 2015, 1996, 2003, 2001, 2010, 2011};

    private static Random random = new Random();

    public static String getRandomTitle(){
        return titles[random.nextInt(titles.length)];
    }

    public static Set<String> getRandomActors(){
        Set<String> result = new HashSet<>();
        int number = random.nextInt(3)+2;
        while (result.size() < number){
            result.add(actors[random.nextInt(actors.length)]);
        }
        return result;
    }

    public static Integer getRandomYear(){
        return years[random.nextInt(years.length)];
    }
}
