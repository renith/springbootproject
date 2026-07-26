package com.example.service;


import com.example.model.Product;

public interface ClientInterface {

	Product[] get() throws InterruptedException;

	String getData(int price);
}
