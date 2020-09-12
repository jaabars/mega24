package kg.megacom.mega24.models.dto;

import kg.megacom.mega24.enums.Status;
import lombok.Data;

import java.io.File;
import java.util.Date;

@Data
public class OrderDto {

    private Long id;

    private File file;

    private int schoolNum;

    private Date addDate;

    private Status status;

    private String phoneNumber;

    private String regionName;

    private String districtName;


}
