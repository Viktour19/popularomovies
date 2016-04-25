package com.n4labs.popularmovies.services;

import com.n4labs.popularmovies.model.Movies;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mac on 4/21/16.
 */
public interface MoviesRestService {

    @GET("/popular")
    Call<List<Movies.Movie>> popularMoviesList(@Query("api_key") String api_key);


    @GET("/top_rated")
    Call<List<Movies.Movie>> topRatedMoviesList(@Query("api_key") String api_key);
}
