package kg.megacom.mega24.services;

import kg.megacom.mega24.models.dto.SubscriberDto;
import kg.megacom.mega24.models.entity.Subscriber;

public interface SubscriberService {
    SubscriberDto findByPhoneNumber(String phone);

    SubscriberDto saveSubscriber(String phoneNumber);
}
