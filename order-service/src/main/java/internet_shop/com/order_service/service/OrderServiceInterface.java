package internet_shop.com.order_service.service;

import internet_shop.com.order_service.dto.OrderDTO;
import internet_shop.com.order_service.model.Order;

import java.util.List;

public interface OrderServiceInterface {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createOrder(OrderDTO orderDTO);
    void deleteOrder(Long id);
    void cancelOrder(Long orderId);
}
