package com.niit.bloomyz.Service;

import com.niit.bloomyz.model.Cart;
import com.niit.bloomyz.model.CartItem;

public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);
}
