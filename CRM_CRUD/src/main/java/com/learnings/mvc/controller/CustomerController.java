package com.learnings.mvc.controller;

import java.awt.LayoutManager;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learnings.mvc.model.Customer;
import com.learnings.mvc.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	private static final Logger logger = Logger.getLogger(CustomerController.class);

	public CustomerController() {
		System.out.println("CustomerController()");
	}

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/")
	public ModelAndView listCustomers(ModelAndView model) throws IOException {
		List<Customer> listCustomer = customerService.getAllCustomers();
		model.addObject("customers", listCustomer);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newCustomer", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Customer customer = new Customer();
		model.addObject("customer", customer);
		model.setViewName("CRMForm");
		// return new ModelAndView("redirect:/students/");
		return model;
	}

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {
		if (customer.getId() == 0) {
			customerService.addCustomer(customer);
		} else {
			customerService.updateCustomer(customer);
		}
		return new ModelAndView("redirect:/customers/");
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.GET)
	public ModelAndView deleteCustomer(HttpServletRequest request) {
		int customerId = Integer.parseInt(request.getParameter("id"));
		
		/*JFrame Alert_Frame = new JFrame("Alert Window");
        //Alert_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JOptionPane.showMessageDialog(Alert_Frame, "Hello This is Alert from Delfstack!");
        Alert_Frame.setSize(400, 200);
        Alert_Frame.setLocationRelativeTo(null);
        Alert_Frame.setVisible(true);
        */
		customerService.deleteCustomer(customerId);
		return new ModelAndView("redirect:/customers/");
	}

	

	@RequestMapping(value = "/editCustomer", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int customerId = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.getCustomer(customerId);
        ModelAndView model = new ModelAndView("CRMForm");
        model.addObject("customer", customer);
        //return new ModelAndView("redirect:/customers/");
        System.out.print("Customer " + customerId + "after editing");
        return model;
    }

}
