package kg.megacom.mega24.services.impl;

import kg.megacom.mega24.dao.RegionRepository;
import kg.megacom.mega24.mappers.RegionMapper;
import kg.megacom.mega24.models.dto.RegionDto;
import kg.megacom.mega24.models.entity.Region;
import kg.megacom.mega24.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Override
    public Region getRegionById(Long id) {
        return regionRepository.findRegionById(id);


    }
}
