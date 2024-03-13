package dat3.Kino.service;

import dat3.Kino.dto.MovieDTO;
import dat3.Kino.repository.MovieRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class MovieService {

    private final MovieRespository movieRepository;

    @Autowired
    public MovieService(MovieRespository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDTO> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<MovieDTO> getMovieById(String id) {
        return movieRepository.findById(id);
    }
    public MovieDTO saveMovie(MovieDTO movieDTO) {
        return movieRepository.save(movieDTO);
    }

    public MovieDTO createMovie(MovieDTO movieDTO) {

        String imdbID = UUID.randomUUID().toString();
        movieDTO.setImdbID(imdbID);
        return movieRepository.save(movieDTO);
    }

    public MovieDTO updateMovie(MovieDTO movieDTO, String imdbID) {
        Optional<MovieDTO> existingMovieOptional = movieRepository.findById(imdbID);

        if (existingMovieOptional.isPresent()) {
            MovieDTO existingMovie = existingMovieOptional.get();
            existingMovie.setTitle(movieDTO.getTitle());
            existingMovie.setYear(movieDTO.getYear());
            existingMovie.setRated(movieDTO.getRated());
            existingMovie.setReleased(movieDTO.getReleased());
            existingMovie.setRuntime(movieDTO.getRuntime());
            existingMovie.setGenre(movieDTO.getGenre());
            existingMovie.setDirector(movieDTO.getDirector());
            existingMovie.setWriter(movieDTO.getWriter());
            existingMovie.setActors(movieDTO.getActors());
            existingMovie.setPlot(movieDTO.getPlot());
            existingMovie.setLanguage(movieDTO.getLanguage());
            existingMovie.setCountry(movieDTO.getCountry());
            existingMovie.setAwards(movieDTO.getAwards());
            existingMovie.setPoster(movieDTO.getPoster());
            existingMovie.setMetascore(movieDTO.getMetascore());
            existingMovie.setImdbRating(movieDTO.getImdbRating());
            existingMovie.setImdbVotes(movieDTO.getImdbVotes());
            existingMovie.setImdbID(movieDTO.getImdbID());
            existingMovie.setType(movieDTO.getType());
            existingMovie.setDvd(movieDTO.getDvd());
            existingMovie.setBoxOffice(movieDTO.getBoxOffice());
            existingMovie.setProduction(movieDTO.getProduction());
            existingMovie.setWebsite(movieDTO.getWebsite());
            existingMovie.setResponse(movieDTO.getResponse());


            return movieRepository.save(existingMovie);
        } else {

            return null;
        }
    }
    public MovieDTO deleteMovieByImdbID(String imdbID) {
        Optional<MovieDTO> movieOptional = movieRepository.findById(imdbID);
        if (movieOptional.isPresent()) {
            MovieDTO deletedMovie = movieOptional.get();
            movieRepository.deleteById(imdbID);
            return deletedMovie;
        } else {
            return null;
        }
    }

}
