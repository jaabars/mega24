package kg.megacom.mega24.services.impl;

import kg.megacom.mega24.dao.*;
import kg.megacom.mega24.enums.Status;
import kg.megacom.mega24.mappers.OrderMapper;
import kg.megacom.mega24.mappers.SubscriberMapper;
import kg.megacom.mega24.models.Response;
import kg.megacom.mega24.models.dto.*;
import kg.megacom.mega24.models.entity.*;
import kg.megacom.mega24.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private FileService fileService;

    @Autowired
    private SubscriberService subscriberService;

    @Autowired
    private OrderHistoryService orderHistoryService;

    @Autowired
    private RegionService regionService;

    @Autowired
    private DistrictService districtService;






    @Override
    public Response appendOrder(OrderAppDto orderAppDto) {

        SubscriberDto subscriberDto = subscriberService.findByPhoneNumber(orderAppDto.getPhoneNumber());

        if (subscriberDto != null){
            Order lastOrder = orderRepository.findTopBySubscriberOrderByIdDesc(
                    SubscriberMapper.INSTANCE.toSubscriber(subscriberDto)
            );

            OrderDto orderDto = OrderMapper.INSTANCE.toOrderDto(lastOrder);

            OrderHistoryDto actualOrderHistoryDto = orderHistoryService.findHistoryByOrderDto(orderDto);

            switch (actualOrderHistoryDto.getStatus()){
                case NEW:

                    break;
                case IN_PROCESS:

                    break;
                case CANCELED:
                    break;
                case DENIED:

                    break;

                case APPROVED:
                    break;
            }

        }else{
            saveOrder(orderAppDto);

        }
        return null;
    }

    private void saveOrder(OrderAppDto orderAppDto) {
    }
}
