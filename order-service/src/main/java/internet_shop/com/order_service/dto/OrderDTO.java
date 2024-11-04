package internet_shop.com.order_service.dto;

import internet_shop.com.order_service.model.Order;

import java.time.LocalDateTime;

public class OrderDTO {

    private Long id;
    private Long productId;
    private Long userId;
    private int quantity;
    private double price;
    private LocalDateTime orderDate;

    // No-argument constructor (required for frameworks like Spring)
    public OrderDTO() {
    }

    // Constructor with all fields
    public OrderDTO(Long id, Long productId, Long userId, int quantity, double price, LocalDateTime orderDate) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
        this.price = price;
        this.orderDate = orderDate;
    }

    // Constructor without ID (for cases where ID is auto-generated)
    public OrderDTO(Long productId, Long userId, int quantity, double price, LocalDateTime orderDate) {
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
        this.price = price;
        this.orderDate = orderDate;
    }

    public OrderDTO(Order order) {
        this.id = order.getId();
        this.productId = order.getProductId();
        this.userId = order.getUserId();
        this.quantity = order.getQuantity();
        this.price = order.getPrice();
        this.orderDate = order.getOrderDate();
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    // Optional: toString method for easy debugging
    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", productId=" + productId +
                ", userId=" + userId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", orderDate=" + orderDate +
                '}';
    }
}