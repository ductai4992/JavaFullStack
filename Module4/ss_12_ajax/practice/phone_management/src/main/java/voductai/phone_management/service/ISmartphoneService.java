package voductai.phone_management.service;

import voductai.phone_management.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable< Smartphone > findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}
