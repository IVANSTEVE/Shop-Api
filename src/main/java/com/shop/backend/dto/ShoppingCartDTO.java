package com.shop.backend.dto;

import com.shop.backend.entity.ShoppingCart;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe de transfert de données (DTO) pour représenter un panier d'achat.
 */
public class ShoppingCartDTO {

    private int cartId;
    private Integer userId;
    private List<ShoppingCartLineDTO> cartProducts;
    private double cartTotalPrice;
    private double cartTotalPriceExcludingVAT;
    private double tvaRate;
    private int numberOfProducts;

    /**
     * Constructeur par défaut.
     */
    public ShoppingCartDTO() {
    }

    /**
     * Constructeur qui initialise un {@link ShoppingCartDTO} à partir d'une entité {@link ShoppingCart}.
     *
     * @param cart L'entité {@link ShoppingCart} à mapper.
     */
    public ShoppingCartDTO(ShoppingCart cart) {
        this.cartId = cart.getCartId();
        this.cartTotalPrice = cart.getCartTotalPrice();
        this.cartTotalPriceExcludingVAT = cart.getCartTotalPriceExcludingVAT();
        this.cartProducts = cart.getCartProducts().stream()
                .map(ShoppingCartLineDTO::new)
                .collect(Collectors.toList());
        this.tvaRate = cart.getTvaRate();
        this.numberOfProducts = cart.getNumberOfProducts();
    }

    // ============================
    // Getters & Setters
    // ============================

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<ShoppingCartLineDTO> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<ShoppingCartLineDTO> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public double getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(double cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public double getCartTotalPriceExcludingVAT() {
        return cartTotalPriceExcludingVAT;
    }

    public void setCartTotalPriceExcludingVAT(double cartTotalPriceExcludingVAT) {
        this.cartTotalPriceExcludingVAT = cartTotalPriceExcludingVAT;
    }

    public double getTvaRate() {
        return tvaRate;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}
