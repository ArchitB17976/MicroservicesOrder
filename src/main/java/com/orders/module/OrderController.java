package com.orders.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orders.misc.TransactionRequest;
import com.orders.misc.TransactionResponse;

@RestController
@RequestMapping("/orders")
public class OrderController 
{
    @Autowired
    private OrderServe serve;

    // "Create" operations
    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest tReq)
    {
        return serve.addOrder(tReq);
    }
}
