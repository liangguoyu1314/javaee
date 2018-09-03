package cn.itcast.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.entity.Customer;
import cn.itcast.service.ICustomerService;

@Controller("customerAction")
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/customer")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	
	@Autowired
	private ICustomerService customerService;
	
	private Customer customer = new Customer();
	@Override
	public Customer getModel() {
		return customer;
	}
	
	@Action(value="saveCustomer",results= {
			@Result(name="saveCustomer",type="redirect",location="/success.jsp")
	})
	public String saveCustomer() {
		customerService.saveCustomer(customer);
		return "saveCustomer";
	}

}
