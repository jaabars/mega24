package kg.megacom.mega24.mappers;

import kg.megacom.mega24.models.dto.SubscriberDto;
import kg.megacom.mega24.models.entity.Subscriber;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubscriberMapper {

    SubscriberMapper INSTANCE = Mappers.getMapper(SubscriberMapper.class);

    Subscriber toSubscriber(SubscriberDto subscriberDto);
    SubscriberDto toSubscriberDto(Subscriber subscriber);

    List<SubscriberDto> subscriberListToSubscriberDtoList(List<Subscriber> subscriberList);


}
