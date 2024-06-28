package live.hassan.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  @Autowired
  private MovieRepo movieRepo;

  public List<Movie> getAllMovies() {
    return movieRepo.findAll();
  }

  public Optional<Movie> getMovieFromRepo(String imdbdId) {
    return movieRepo.getMovieByImdbId(imdbdId);
  }
}
