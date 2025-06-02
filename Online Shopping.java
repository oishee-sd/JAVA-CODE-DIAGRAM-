// WebUser.java public class WebUser { private String loginId; private String password; private String email; private WebUserStatus status;

public enum WebUserStatus {
    New, Active, Blocked
}

public WebUser(String loginId, String password, String email, WebUserStatus status) {
    this.loginId = loginId;
    this.password = password;
    this.email = email;
    this.status = status;
}

// Getters and Setters

}

// Customer.java import java.util.Date;

public class Customer { private String id; private String billingAddress; private boolean isClosed; private Date open; private Date closed; private Account account;

public Customer(String id, String billingAddress, boolean isClosed, Date open, Date closed, Account account) {
    this.id = id;
    this.billingAddress = billingAddress;
    this.isClosed = isClosed;
    this.open = open;
    this.closed = closed;
    this.account = account;
}

// Getters and Setters

}

// Account.java import java.util.Date;

public class Account { private String id; private String billingAddress; private boolean isClosed; private Date open; private Date closed; private ShoppingCart shoppingCart; private Order order;

public Account(String id, String billingAddress, boolean isClosed, Date open, Date closed) {
    this.id = id;
    this.billingAddress = billingAddress;
    this.isClosed = isClosed;
    this.open = open;
    this.closed = closed;
}

// Getters and Setters

}

// ShoppingCart.java import java.util.ArrayList; import java.util.Date; import java.util.List;

public class ShoppingCart { private Date createdDate; private List<LineItem> items = new ArrayList<>();

public ShoppingCart(Date createdDate) {
    this.createdDate = createdDate;
}

public void addItem(LineItem item) {
    items.add(item);
}

public void removeItem(LineItem item) {
    items.remove(item);
}

// Getters and Setters

}

// LineItem.java public class LineItem { private int quantity; private double price; private Product product;

public LineItem(int quantity, double price, Product product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
}

// Getters and Setters

}

// Product.java public class Product { private String id; private String name; private String supplier;

public Product(String id, String name, String supplier) {
    this.id = id;
    this.name = name;
    this.supplier = supplier;
}

// Getters and Setters

}

// Order.java import java.util.ArrayList; import java.util.Date; import java.util.List;

public class Order { private String number; private Date orderedDate; private Date shipToDate; private double total; private OrderStatus status; private List<LineItem> items = new ArrayList<>();

public enum OrderStatus {
    New, Hold, Shipped, Delivered, Closed
}

public Order(String number, Date orderedDate, Date shipToDate, double total, OrderStatus status) {
    this.number = number;
    this.orderedDate = orderedDate;
    this.shipToDate = shipToDate;
    this.total = total;
    this.status = status;
}

public void addItem(LineItem item) {
    items.add(item);
}

// Getters and Setters

}

// Payment.java import java.util.Date;

public class Payment { private String id; private Date paid; private double total; private Order order;

public Payment(String id, Date paid, double total, Order order) {
    this.id = id;
    this.paid = paid;
    this.total = total;
    this.order = order;
}

// Getters and Setters

}