package com.klef.fsad.exam;

import javax.persistence.*;

@Entity
@Table(name="movie_table")
public class Movie
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String date;
    private String status;
    private String genre;
    private double budget;

    public Movie() {}

    public Movie(String name, String date, String status, String genre, double budget)
    {
        this.name = name;
        this.date = date;
        this.status = status;
        this.genre = genre;
        this.budget = budget;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public double getBudget()
    {
        return budget;
    }

    public void setBudget(double budget)
    {
        this.budget = budget;
    }
}