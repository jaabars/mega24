package kg.megacom.mega24.services;

import kg.megacom.mega24.models.dto.RegionDto;
import kg.megacom.mega24.models.entity.Region;

public interface RegionService {
    Region getRegionById(Long id);
}
