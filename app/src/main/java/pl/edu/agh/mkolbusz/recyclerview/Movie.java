package pl.edu.agh.mkolbusz.recyclerview;

import java.util.Set;

/**
 * Created by mkolbusz on 22.11.16.
 */

public class Movie {

    private String title;
    private Set<String> actors;
    private Integer year;

    public Movie() {
        this.setTitle(MoviesSampleData.getRandomTitle());
        this.setActors(MoviesSampleData.getRandomActors());
        this.setYear(MoviesSampleData.getRandomYear());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<String> getActors() {
        return actors;
    }

    public void setActors(Set<String> actors) {
        this.actors = actors;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String actorsToReadableString(){
        String str = actors.toString();
        return str.substring(1,str.length()-1);
    }
}
