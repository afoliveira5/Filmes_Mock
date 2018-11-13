package pao.de.queijo.omdbmtc.data;

import io.reactivex.Observable;
import pao.de.queijo.omdbmtc.data.model.MovieDetail;
import pao.de.queijo.omdbmtc.data.model.MovieResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author Lucas Campos
 * @since 1.0.0
 */
public interface OmdbApi {

    @GET("?apikey=5036e0cc")
    Observable<MovieResponse> getMovieByName(@Query("s") String name);

    @GET("?apikey=5036e0cc")
    Observable<MovieResponse> getMovieByNameAndYear(@Query("s") String name, @Query("y") int year);

    @GET("?apikey=5036e0cc")
    Observable<MovieDetail> getMovieDetails(@Query("i") String movieId);

}
