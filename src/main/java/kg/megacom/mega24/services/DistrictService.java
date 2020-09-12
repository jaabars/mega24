package kg.megacom.mega24.services;

import kg.megacom.mega24.models.dto.DistrictDto;
import kg.megacom.mega24.models.entity.District;

public interface DistrictService {

    District getDistrictById(Long id);
}
