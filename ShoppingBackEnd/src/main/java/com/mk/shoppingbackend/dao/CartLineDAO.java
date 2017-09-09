package com.mk.shoppingbackend.dao;

import java.util.List;

import com.mk.shoppingbackend.dto.Cart;
import com.mk.shoppingbackend.dto.CartLine;

public interface CartLineDAO {
	// the common methods from reviously added one
	public CartLine get(int id);

	public boolean add(CartLine cartLine);

	public boolean update(CartLine cartLine);

	public boolean delete(CartLine cartLine);

	public List<CartLine> list(int cartId);

	// other business methods related to the cart line
	public List<CartLine> listAvailable(int cartId);

	public CartLine getByCartAndProduct(int cartId, int productId);

	// add a cart
	boolean updateCart(Cart cart);
}
