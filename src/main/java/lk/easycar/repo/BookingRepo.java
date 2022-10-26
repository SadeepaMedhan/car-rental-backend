package lk.easycar.repo;

import lk.easycar.entity.Booking;
import lk.easycar.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingRepo extends JpaRepository<Booking, String> {

    List<Booking> findAllByCustomer(Customer customer);
    @Query(value = "SELECT * FROM `booking` ORDER BY bookingId DESC LIMIT 1", nativeQuery = true)
    Booking getLastBooking();


    @Query(value = "SELECT bookingDate, leavingDate, returnDate, SUM(payment), SUM(lossDamageFee), SUM(rentalFee) FROM booking GROUP BY bookingDate;", nativeQuery = true)
    List<Object> getIncome();


}
