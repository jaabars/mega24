package kg.megacom.mega24.dao;

import kg.megacom.mega24.models.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

    District findDistrictById(Long id);
}
