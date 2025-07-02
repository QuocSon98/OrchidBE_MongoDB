package com.example.orchidservice.controller;

import com.example.orchidservice.dto.OrchidDTO;
import com.example.orchidservice.service.imp.IOrchidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orchids")
public class OrchidController {

    @Autowired
    private IOrchidService orchidService;

    @GetMapping
    public ResponseEntity<List<OrchidDTO>> getAllOrchids() {
        List<OrchidDTO> orchids = orchidService.getAllOrchids();
        return ResponseEntity.ok(orchids);
    }

    @GetMapping("/{orchidId}")
    public ResponseEntity<OrchidDTO> getOrchidById(@PathVariable String orchidId) {
        return orchidService.getOrchidById(orchidId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}