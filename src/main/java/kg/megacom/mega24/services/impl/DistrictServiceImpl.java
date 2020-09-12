package kg.megacom.mega24.services.impl;

import kg.megacom.mega24.dao.DistrictRepository;
import kg.megacom.mega24.mappers.DistrictMapper;
import kg.megacom.mega24.models.dto.DistrictDto;
import kg.megacom.mega24.models.entity.District;
import kg.megacom.mega24.services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public District getDistrictById(Long id) {
        return districtRepository.findDistrictById(id);

    }
}
