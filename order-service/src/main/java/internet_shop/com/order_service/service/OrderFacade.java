package internet_shop.com.order_service.service;
import internet_shop.com.order_service.dto.OrderDTO;

public interface OrderFacade {
    OrderDTO createOrder(OrderDTO orderDTO);
    OrderDTO getOrderById(Long orderId);
    void cancelOrder(Long orderId);
}