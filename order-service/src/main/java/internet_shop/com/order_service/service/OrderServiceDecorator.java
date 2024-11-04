package internet_shop.com.order_service.service;

import internet_shop.com.order_service.dto.OrderDTO;
import internet_shop.com.order_service.model.Order;

import java.util.List;

public abstract class OrderServiceDecorator implements OrderServiceInterface {

    protected final OrderServiceInterface wrappedOrderService;

    protected OrderServiceDecorator(OrderServiceInterface orderService) {
        this.wrappedOrderService = orderService;
    }

    @Override
    public List<Order> getAllOrders() {
        return wrappedOrderService.getAllOrders();
    }

    @Override
    public Order getOrderById(Long id) {
        return wrappedOrderService.getOrderById(id);
    }

    @Override
    public Order createOrder(OrderDTO orderDTO) {
        return wrappedOrderService.createOrder(orderDTO);
    }

    @Override
    public void deleteOrder(Long id) {
        wrappedOrderService.deleteOrder(id);
    }

    @Override
    public void cancelOrder(Long orderId) {
        wrappedOrderService.cancelOrder(orderId);
    }
}
