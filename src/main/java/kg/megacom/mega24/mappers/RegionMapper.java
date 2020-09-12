package kg.megacom.mega24.mappers;

import kg.megacom.mega24.models.dto.RegionDto;
import kg.megacom.mega24.models.entity.Region;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RegionMapper {

    RegionMapper INSTANCE = Mappers.getMapper(RegionMapper.class);

    Region regionDtoToRegion(RegionDto regionDto);

    RegionDto regionToRegionDto(Region region);

    List<RegionDto> regionListToRegionDtoList(List<Region> regionList);
}
