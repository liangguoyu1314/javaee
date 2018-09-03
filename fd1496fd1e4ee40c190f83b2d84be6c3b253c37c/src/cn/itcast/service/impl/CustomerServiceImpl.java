package cn.itcast.service.impl;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.ICustomerDao;
import cn.itcast.entity.Customer;
import cn.itcast.service.ICustomerService;

@Service("customerService")
@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao customerDao;
	

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

}
