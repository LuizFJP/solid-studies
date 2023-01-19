// before Single Responsability Principle
// many contexts
class Restaurant {
  public void makeFood() {}
  public void washDishes() {}

  public void createOrder() {}
  public void updateOrder() {}
  public void getOrder() {}
  public void deleteOrder() {}

  public void paymentMethod() {}
}

// It becomes complicated to maintain our code this way, it has so much responsabilities.

// Using SLP

class Kitchen {
  public void makeFood() {}
  public void washDishes() {}
}

class OrderRepository {
  public void createOrder() {}
  public void updateOrder() {}
  public void getOrder() {}
  public void deleteOrder() {}
}

class Payment {
  public void paymentMethod() {}
}