package com.example.orchidservice.controller;

import com.example.orchidservice.dto.OrderDTO;
import com.example.orchidservice.service.imp.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private IOrderService orderService;

//    @GetMapping("/account/{accountId}")
//    public ResponseEntity<List<OrderDTO>> getOrdersByAccount(@PathVariable String accountId) {
//        try {
//            List<OrderDTO> orders = orderService.getOrdersByAccount(accountId);
//            return new ResponseEntity<>(orders, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

//    @GetMapping("/status/{status}")
//    public ResponseEntity<List<OrderDTO>> getOrdersByStatus(@PathVariable String status) {
//        try {
//            List<OrderDTO> orders = orderService.getOrdersByStatus(status);
//            return new ResponseEntity<>(orders, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/date-range")
//    public ResponseEntity<List<OrderDTO>> getOrdersByDateRange(
//            @RequestParam LocalDate startDate,
//            @RequestParam LocalDate endDate) {
//        try {
//            List<OrderDTO> orders = orderService.getOrdersByDateRange(startDate, endDate);
//            return new ResponseEntity<>(orders, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PatchMapping("/{id}/status")
//    public ResponseEntity<OrderDTO> updateOrderStatus(
//            @PathVariable Integer id,
//            @RequestParam String status) {
//        try {
//            OrderDTO updatedOrder = orderService.updateOrderStatus(id, status);
//            return new ResponseEntity<>(updatedOrder, HttpStatus.OK);
//        } catch (RuntimeException e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/{id}/total")
//    public ResponseEntity<Double> calculateOrderTotal(@PathVariable Integer id) {
//        try {
//            Double total = orderService.calculateOrderTotal(id);
//            return new ResponseEntity<>(total, HttpStatus.OK);
//        } catch (RuntimeException e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}