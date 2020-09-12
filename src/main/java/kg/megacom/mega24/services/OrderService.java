package kg.megacom.mega24.services;

import kg.megacom.mega24.models.Response;
import kg.megacom.mega24.models.dto.OrderAppDto;
import kg.megacom.mega24.models.dto.OrderDto;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDto);

    Response appendOrder(OrderAppDto orderAppDto);
}
