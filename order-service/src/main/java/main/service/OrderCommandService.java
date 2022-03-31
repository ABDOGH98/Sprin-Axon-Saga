package main.service;

import main.DTO.OrderCreateDTO;

import java.util.concurrent.CompletableFuture;

public interface OrderCommandService {
    public CompletableFuture<String> createOrder(OrderCreateDTO orderCreateDTO);
}
