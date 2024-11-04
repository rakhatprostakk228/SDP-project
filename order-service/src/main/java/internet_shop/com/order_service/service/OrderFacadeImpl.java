package internet_shop.com.order_service.service;

import internet_shop.com.order_service.dto.OrderDTO;
import internet_shop.com.order_service.model.Order;
import internet_shop.com.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFacadeImpl implements OrderFacade {

    private final OrderService orderService;

    @Autowired
    public OrderFacadeImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        // Use OrderService to handle the order creation
        Order order = orderService.createOrder(orderDTO);
        return new OrderDTO(order); // assuming OrderDTO has a constructor that takes Order
    }

    @Override
    public OrderDTO getOrderById(Long orderId) {
        // Retrieve order details
        Order order = orderService.getOrderById(orderId);
        return new OrderDTO(order);
    }

    @Override
    public void cancelOrder(Long orderId) {
        // Use OrderService to handle order cancellation
        orderService.cancelOrder(orderId);
    }
}