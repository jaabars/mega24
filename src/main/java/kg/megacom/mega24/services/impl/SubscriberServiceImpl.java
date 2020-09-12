package kg.megacom.mega24.services.impl;

import kg.megacom.mega24.dao.SubscriberRepository;
import kg.megacom.mega24.mappers.SubscriberMapper;
import kg.megacom.mega24.models.dto.SubscriberDto;
import kg.megacom.mega24.models.entity.Subscriber;
import kg.megacom.mega24.services.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    private SubscriberMapper subscriberMapper = SubscriberMapper.INSTANCE;

    @Autowired
    private SubscriberRepository subscriberRepository;
    @Override
    public SubscriberDto findByPhoneNumber(String phone) {

        Subscriber subscriber = subscriberRepository.findByPhoneNumber(phone);

        return subscriber == null ? null : subscriberMapper.subscriberToSubscriberDto(subscriber);
    }

    @Override
    public SubscriberDto saveSubscriber(String phoneNumber) {
        Subscriber subscriber  = new Subscriber();
        subscriber.setPhoneNumber(phoneNumber);
        subscriber = subscriberRepository.save(subscriber);
        return subscriberMapper.subscriberToSubscriberDto(subscriber);
    }
}
