package com.example.orchidservice.service.imp;

import com.example.orchidservice.dto.OrchidDTO;
import com.example.orchidservice.pojo.Orchid;
import java.util.List;
import java.util.Optional;

public interface IOrchidService {
    List<OrchidDTO> getAllOrchids();
    Optional<OrchidDTO> getOrchidById(String id);
    OrchidDTO saveOrchid(OrchidDTO orchidDTO);
    OrchidDTO updateOrchid(String id, OrchidDTO orchidDTO);
    void deleteOrchid(String id);
}
