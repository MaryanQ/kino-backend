package dat3.Kino.service;

import dat3.Kino.dto.MovieDTO;
import dat3.Kino.repository.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDTO> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<MovieDTO> getMovieById(int id) {
        return movieRepository.findById(id);
    }

    public MovieDTO saveMovie(MovieDTO movieDTO) {
        return movieRepository.save(movieDTO);
    }

    public MovieDTO createMovie(MovieDTO movieDTO) {

        return movieRepository.save(movieDTO);
    }



    // Method to generate a unique integer ID
    private int generateUniqueId() {

        int lastAssignedId = 0; // Initialize with some default value or retrieve from storage


        lastAssignedId++;



        return lastAssignedId;
    }


    public MovieDTO updateMovie(MovieDTO movieDTO, int id) throws MovieNotFoundException {
        Optional<MovieDTO> existingMovieOptional = movieRepository.findById(id);

        if (existingMovieOptional.isPresent()) {
            MovieDTO existingMovie = existingMovieOptional.get();
            existingMovie.setTitle(movieDTO.getTitle());
            existingMovie.setYear(movieDTO.getYear());
            existingMovie.setGenre(movieDTO.getGenre());
            existingMovie.setDirector(movieDTO.getDirector());
            existingMovie.setPlot(movieDTO.getPlot());

            return movieRepository.save(existingMovie);
        } else {
            throw new MovieNotFoundException("Movie with ID " + id + " not found");
        }
    }


    public MovieDTO deleteMovieById(int id) {
        Optional<MovieDTO> movieOptional = movieRepository.findById(id);
        if (movieOptional.isPresent()) {
            MovieDTO deletedMovie = movieOptional.get();
            movieRepository.deleteById(id);
            return deletedMovie;
        } else {
            return null;
        }
    }
}
