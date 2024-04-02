package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.ateendee.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
}
