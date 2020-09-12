package kg.megacom.mega24.dao;

import kg.megacom.mega24.models.entity.Order;
import kg.megacom.mega24.models.entity.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findBySubscriber(Subscriber subscriber);

    @Query("select u from Order u where u.subscriber.id = ?1")
    Order findBySubscriberId(Long id);

    Order findTopBySubscriberOrderByIdDesc(Subscriber subscriber);
}
