package internet_shop.com.order_service.service;

import internet_shop.com.order_service.dto.OrderDTO;
import internet_shop.com.order_service.model.Order;

public class LoggingOrderServiceDecorator extends OrderServiceDecorator {

    public LoggingOrderServiceDecorator(OrderServiceInterface orderService) {
        super(orderService);
    }

    @Override
    public Order createOrder(OrderDTO orderDTO) {
        System.out.println("Creating order: " + orderDTO);
        Order order = super.createOrder(orderDTO);
        System.out.println("Order created with ID: " + order.getId());
        return order;
    }

    @Override
    public void deleteOrder(Long id) {
        System.out.println("Deleting order with ID: " + id);
        super.deleteOrder(id);
        System.out.println("Order deleted.");
    }
}
