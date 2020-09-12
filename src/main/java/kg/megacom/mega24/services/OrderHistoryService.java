package kg.megacom.mega24.services;

import kg.megacom.mega24.models.dto.OrderDto;
import kg.megacom.mega24.models.dto.OrderHistoryDto;
import kg.megacom.mega24.models.dto.SubscriberDto;
import kg.megacom.mega24.models.entity.Order;

public interface OrderHistoryService {

    OrderHistoryDto findHistoryBySubscriber(SubscriberDto subscriberDto);
    OrderHistoryDto findHistoryByOrderDto(OrderDto orderDto);
    OrderHistoryDto saveNewOrderHistory(Order order);
}
