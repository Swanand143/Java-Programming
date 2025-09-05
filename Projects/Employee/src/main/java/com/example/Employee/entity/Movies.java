package com.example.Employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name="movies_table")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="movie_id")
    private int id;

    @Column(name ="movie_name")
    private  String MovieName;

    @Column(name ="release_date")
    private  String ReleaseDate;

    @Column(name ="duration")
    private  String Duration;

    @Column(name ="language")
    private  String Language;

    @Column(name ="rating")
    private  double Rating;

    public Movies() {}

    public Movies( String movieName, String releaseDate,String duration,String language,double rating) {
        MovieName = movieName;
        ReleaseDate = releaseDate;
        Duration = duration;
        Language = language;
        Rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "MovieName='" + MovieName + '\'' +
                ", ReleaseDate='" + ReleaseDate + '\'' +
                ", Duration='" + Duration + '\'' +
                ", Language='" + Language + '\'' +
                ", Rating=" + Rating +
                '}';
    }
}
