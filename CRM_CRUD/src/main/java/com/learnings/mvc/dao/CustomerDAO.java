package com.learnings.mvc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learnings.mvc.model.Customer;

@Repository
public class CustomerDAO {
	
	 @Autowired
	    private SessionFactory sessionFactory;
	    

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
		
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Customer")
                .list();
	}

	public void deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		Customer customer = (Customer) sessionFactory.getCurrentSession().load(
				Customer.class, customerId);
        if (null != customer) {
            this.sessionFactory.getCurrentSession().delete(customer);
        }
		
	}

	public Customer getCustomer(int customerid) {
		// TODO Auto-generated method stub
		return (Customer) sessionFactory.getCurrentSession().get(
				Customer.class, customerid);
	}

	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(customer);
        return customer;
	}

}
