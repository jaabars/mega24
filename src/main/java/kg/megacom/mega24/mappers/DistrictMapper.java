package kg.megacom.mega24.mappers;

import kg.megacom.mega24.models.dto.DistrictDto;
import kg.megacom.mega24.models.entity.District;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DistrictMapper {

    DistrictMapper INSTANCE = Mappers.getMapper(DistrictMapper.class);

    District districtDtoToDistrict(DistrictDto districtDto);
    DistrictDto districtToDistrictDto(District district);

    List<DistrictDto> districtListToDistrictDtoList(List<District> districtList);
}
