package kg.megacom.mega24.models.dto;

import lombok.Data;

import java.io.File;

@Data
public class OrderAppDto {

    private File file;
    private int schoolNum;
    private String phoneNumber;
    private Long regionId;
    private Long districtId;
}
