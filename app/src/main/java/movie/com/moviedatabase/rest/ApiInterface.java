package movie.com.moviedatabase.rest;

import movie.com.moviedatabase.model.MoviesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by apple on 19/01/17.
 */

public interface ApiInterface {

    @GET("movie/upcoming")
    Call<MoviesResponse> getUpComing(@Query("api_key") String apiKey);

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);




    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
