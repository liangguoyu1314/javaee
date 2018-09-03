package cn.itcast.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


import cn.itcast.dao.ICustomerDao;
import cn.itcast.entity.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements ICustomerDao {

	@Autowired
	private HibernateTemplate ht;
	

	@Override
	public void saveCustomer(Customer customer) {
		ht.save(customer);
	}

}
