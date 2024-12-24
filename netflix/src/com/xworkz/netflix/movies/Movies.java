package com.xworkz.netflix.movies;

import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString
public final class Movies implements Cloneable {

    private final String movieName = "abc";
    private final String joner= "xyz";
    private final int noOfMovies = 1;
    private final String language= "kannada";

    public Movies(){

    }

    public String getMovieName() {
        return movieName;
    }



    public String getJoner() {
        return joner;
    }



    public int getNoOfMovies() {
        return noOfMovies;
    }



    public String getLanguage() {
        return language;
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        Movies movies = (Movies) obj; //explicit type casting
        if(this.movieName.equals(movies.movieName))
            return true;
    if(this.noOfMovies == movies.noOfMovies)
        return true;

        if(this.language.equals(movies.language) )
            return true;

        if(this.joner.equals(movies.joner) )
            return true;

        return false;
    }

    @Override
    public String toString(){
        return "movie-(movieName = "+this.movieName+" ," +
                   "joner"+this.joner +" ," +
                   "noOfMovies"+this.noOfMovies +"," +
                   "language"+this.language+")";
    }
}
