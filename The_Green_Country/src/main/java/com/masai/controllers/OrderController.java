package com.masai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.CustomerException;
import com.masai.exceptions.InsufficientQuantity;
import com.masai.exceptions.OrderException;
import com.masai.exceptions.PlantNotFoundException;
import com.masai.exceptions.PlanterNotFoundException;
import com.masai.exceptions.SeedNotFoundException;
import com.masai.models.CartDto;
import com.masai.models.CurrentCustomerSession;
import com.masai.models.Orders;
import com.masai.repositories.CustomerSessionDao;
import com.masai.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
