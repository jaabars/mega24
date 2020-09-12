package kg.megacom.mega24.mappersTest;

import kg.megacom.mega24.enums.Status;
import kg.megacom.mega24.models.dto.OrderDto;
import kg.megacom.mega24.models.entity.District;
import kg.megacom.mega24.models.entity.Order;
import kg.megacom.mega24.models.entity.Region;
import kg.megacom.mega24.models.entity.Subscriber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMapper {

    @Test
    public void orderMapper(){

        Subscriber subscriber = new Subscriber();
        subscriber.setPhoneNumber("0550550550");

        District district = new District();
        district.setName("IK");
        Region region = new Region();
        region.setName("Tyup");
        district.setRegion(region);

        Order order = new Order();
        order.setAddDate(new Date());
        order.setSchoolNum(1);
        order.setId(32l);
        order.setSubscriber(subscriber);
        order.setDistrict(district);
        order.setRegion(region);

        OrderDto orderDto = kg.megacom.mega24.mappers.OrderMapper.INSTANCE.orderToOrderDto(order, Status.NEW);
        System.out.println(order.getRegion().getName());
        System.out.println(orderDto.getRegionName());
        assertEquals(orderDto.getDistrictName(),order.getDistrict().getName());
        assertEquals(orderDto.getRegionName(),order.getRegion().getName());
        assertEquals(orderDto.getStatus(),Status.NEW);
        assertEquals(orderDto.getPhoneNumber(),order.getSubscriber().getPhoneNumber());
        assertEquals(orderDto.getAddDate(),order.getAddDate());
        assertEquals(orderDto.getId(),order.getId());
        assertEquals(orderDto.getSchoolNum(),order.getSchoolNum());
    }
}
