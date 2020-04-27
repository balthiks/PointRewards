/* balanithya created on 4/26/2020 inside the package - com.mytest.test.controller */

package com.mytest.test.controller;


import com.mytest.test.model.Customer;
import com.mytest.test.services.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class PointsController {

    //@Autowired
    //private PointsServiceMock pointsService;

    @Autowired
    private PointsService pointsService;

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
        Customer customer = pointsService.getCustomerById(id);
        if (customer == null) return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @GetMapping("/customers")
    public List<Customer> findCustomerAll() {
        return pointsService.getCustomerAll();
    }

}
