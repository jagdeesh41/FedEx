package com.example.searchrestapi.repository;


import com.example.searchrestapi.entity.Address;
import com.example.searchrestapi.entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OneToOneUnidirectionalMappingTest
{
    @Autowired
    private OrderRepository orderRepository;

    @Test
    void saveOrderMethod()
    {
        Order order=new Order();
        order.setOrderTrackingNumber("1000ABC");
        order.setTotalQuantity(5);
        order.setStatus("In progress");
        //we need to set the address field now
        Address address=new Address();
        address.setCountry("USA");
        address.setState("Newyork");
        address.setStreet("Baffole");
        address.setZipCode("320003");
        order.setBillingAddress(address);
        orderRepository.save(order);
    }

    @Test
    void updateOrderMethod()
    {
        Order order=orderRepository.findById(1L).get();

        order.setStatus("Delivered");
        order.getBillingAddress().setZipCode("411087");
        order.getBillingAddress().setState("Texas");
        orderRepository.save(order);
    }

    @Test
    void deleteOrderMethod()
    {
        Order order=orderRepository.findById(1L).get();
        orderRepository.delete(order);


    }

    @Test
    void getOrderMethod()
    {
        Order order=orderRepository.findById(2L).get();
        System.out.println(order);

    }

}
