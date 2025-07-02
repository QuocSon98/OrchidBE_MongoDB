package com.example.orchidservice.service.imp;

import com.example.orchidservice.dto.OrderDTO;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IOrderService {
    List<OrderDTO> getAllOrders();
    Optional<OrderDTO> getOrderById(String id);
    OrderDTO saveOrder(OrderDTO orderDTO);
    OrderDTO updateOrder(String id, OrderDTO orderDTO);
    void deleteOrder(String id);
    List<OrderDTO> getOrdersByAccount(String accountId);

}
