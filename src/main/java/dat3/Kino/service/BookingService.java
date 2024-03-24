package dat3.Kino.service;

import dat3.Kino.dto.BookingDTO;
import dat3.Kino.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<BookingDTO> getAllBookings() {
        return bookingRepository.findAll();
    }

    public BookingDTO getBookingById(int id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found with id: " + id));
    }

    public BookingDTO createBooking(BookingDTO bookingDTO) {
        return bookingRepository.save(bookingDTO);
    }

    public BookingDTO updateBooking(int id, BookingDTO updatedBookingDTO) {
        BookingDTO existingBooking;
        try {
            existingBooking = bookingRepository.findById(id)
                    .orElseThrow(() -> new BookingNotFoundException("Booking not found with id: " + id));
        } catch (BookingNotFoundException e) {
            throw new RuntimeException("Booking not found with id: " + id);
        }

        existingBooking.setCustomerName(updatedBookingDTO.getCustomerName());
        existingBooking.setSeatId(updatedBookingDTO.getSeatId());
        existingBooking.setMovieId(updatedBookingDTO.getMovieId());
        existingBooking.setPrice(updatedBookingDTO.getPrice());
        existingBooking.setBookingTime(updatedBookingDTO.getBookingTime());

        BookingDTO updatedBooking = bookingRepository.save(existingBooking);

        return convertToDTO(updatedBooking);
    }


    // Other methods...

    private BookingDTO convertToDTO(BookingDTO booking) {
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setId(booking.getId());
        bookingDTO.setCustomerName(booking.getCustomerName());
        bookingDTO.setSeatId(booking.getSeatId());
        bookingDTO.setMovieId(booking.getMovieId());
        bookingDTO.setPrice(booking.getPrice());
        bookingDTO.setBookingTime(booking.getBookingTime());
        return bookingDTO;
    }



    public void deleteBooking(int id) {
        if (!bookingRepository.existsById(id)) {
            throw new RuntimeException("Booking not found with id: " + id);
        }
        bookingRepository.deleteById(id);
    }
}
