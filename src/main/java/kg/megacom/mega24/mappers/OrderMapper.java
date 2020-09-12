package kg.megacom.mega24.mappers;

import kg.megacom.mega24.enums.Status;
import kg.megacom.mega24.models.dto.OrderAppDto;
import kg.megacom.mega24.models.dto.OrderDto;
import kg.megacom.mega24.models.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order orderDtoToOrder(OrderDto orderDto);

    @Mappings({
            @Mapping(source = "order.subscriber.phoneNumber", target = "phoneNumber"),
            @Mapping(source = "order.region.name", target = "regionName"),
            @Mapping(source = "order.district.name",target = "districtName"),
            @Mapping(source = "status",target = "status")
    })
    OrderDto orderToOrderDto(Order order, Status status);


    @Mappings({
            @Mapping(source = "order.subscriber.phoneNumber", target = "phoneNumber"),
            @Mapping(source = "order.region.name", target = "regionName"),
            @Mapping(source = "order.district.name",target = "districtName")
    })
    OrderDto toOrderDto(Order order);


    List<OrderDto> orderListToOrderDtoList(List<Order> orderList);


    OrderDto orderAppToOrderDto(OrderAppDto orderAppDto);
}
