package bookdelivery;

public class OrderTaken extends AbstractEvent {

    private Long orderMgmtId;
    private Long orderId;
    private Long itemId;
    private String itemName;
    private Integer qty;
    private String customerName;
    private String deliveryAddress;
    private String deliveryPhoneNumber;
    private String orderStatus;

    public Long getOrderMgmtId() {
        return orderMgmtId;
    }

    public void setOrderMgmtId(Long orderMgmtId) {
        this.orderMgmtId = orderMgmtId;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getMenuId() {
        return itemId;
    }

    public void setMenuId(Long itemId) {
        this.itemId = itemId;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Integer getFoodCount() {
        return qty;
    }

    public void setFoodCount(Integer qty) {
        this.qty = qty;
    }
    public String getCustomerId() {
        return customerName;
    }

    public void setCustomerId(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddress() {
        return deliveryAddress;
    }

    public void setCustomerAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    public String getDeliveryPhoneNumber() {
        return deliveryPhoneNumber;
    }

    public void setDeliveryPhoneNumber(String deliveryPhoneNumber) {
        this.deliveryPhoneNumber = deliveryPhoneNumber;
    }
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}