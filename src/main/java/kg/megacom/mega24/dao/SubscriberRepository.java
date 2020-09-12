package kg.megacom.mega24.dao;

import kg.megacom.mega24.models.entity.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {

    boolean existsByPhoneNumber(String phoneNumber);
    Subscriber findByPhoneNumber(String phoneNumber);
}
