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
    Call<MoviesResponse> getPopularMovies(@Query("api_key")String apiKey);

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key")String apiKey);

    @GET("movie/{movie_db}/videos")
    Call<TrailerResponse> getMovieTrailer(@Path("movie_id") int id, @Query("api_key")String apiKey);



}
