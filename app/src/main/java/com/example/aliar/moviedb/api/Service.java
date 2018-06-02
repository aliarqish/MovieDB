package com.example.aliar.moviedb.api;

import com.example.aliar.moviedb.model.MoviesResponse;
import com.example.aliar.moviedb.model.TrailerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by aliar on 4/9/2018.
 */


public interface Service {

    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("https://api.themoviedb.org/3/movie/popular?api_key=ac73c243c58f6dba1c9dc954b7ed9d0d&language=en-US&page=1")String apiKey);

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("https://api.themoviedb.org/3/movie/top_rated?api_key=ac73c243c58f6dba1c9dc954b7ed9d0d&language=en-US&page=1")String apiKey);

    @GET("movie/{movie_db}/videos")
    Call<TrailerResponse> getMovieTrailer(@Path("67890") int id, @Query("https://api.themoviedb.org/3/movie/67890/videos?api_key=ac73c243c58f6dba1c9dc954b7ed9d0d&language=en-US")String apiKey);



}
