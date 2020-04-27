/* balanithya created on 4/26/2020 inside the package - com.mytest.test.services */

package com.mytest.test.services;


import com.mytest.test.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
