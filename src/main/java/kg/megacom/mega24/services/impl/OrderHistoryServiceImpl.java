package kg.megacom.mega24.services.impl;

import kg.megacom.mega24.dao.OrderHistoryRepository;
import kg.megacom.mega24.enums.Status;
import kg.megacom.mega24.mappers.OrderHistoryMapper;
import kg.megacom.mega24.mappers.OrderMapper;
import kg.megacom.mega24.models.dto.OrderDto;
import kg.megacom.mega24.models.dto.OrderHistoryDto;
import kg.megacom.mega24.models.dto.SubscriberDto;
import kg.megacom.mega24.models.entity.Order;
import kg.megacom.mega24.models.entity.OrderHistory;
import kg.megacom.mega24.services.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryRepository orderHistoryRepository;


    @Override
    public OrderHistoryDto findHistoryBySubscriber(SubscriberDto subscriberDto) {
        return null;
    }

    @Override
    public OrderHistoryDto findHistoryByOrderDto(OrderDto orderDto) {

        OrderHistory orderHistory = orderHistoryRepository.findByOrderAndEndDateIsNull(OrderMapper.INSTANCE.orderDtoToOrder(orderDto));

        return OrderHistoryMapper.INSTANCE.toOrderHistoryDto(orderHistory);
    }

    @Override
    public OrderHistoryDto saveNewOrderHistory(Order order, Status status) {
        OrderHistory orderHistory = new OrderHistory();
        orderHistory.setOrder(order);
        orderHistory.setStartDate(new Date());
        orderHistory.setStatus(Status.NEW);
        orderHistory = orderHistoryRepository.save()
    }
}
