package voductai.furama_resort.repository.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voductai.furama_resort.model.service.ServiceType;
@Repository
public interface IServiceTypeRepository extends JpaRepository< ServiceType, Integer > {
}
