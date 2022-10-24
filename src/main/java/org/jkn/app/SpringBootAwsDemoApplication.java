package org.jkn.app;

import java.util.List;

import org.jkn.app.dao.OrderDao;
import org.jkn.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsDemoApplication {
	
	@Autowired
	OrderDao orderDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsDemoApplication.class, args);
	}

	@GetMapping("/index")
	public String getMsg() {
		return "<h1 style='color:pink;'>Hello first aws deployment</h1>";
	}
	
	@GetMapping("/orders")
	public List<Order> orders() {
		return orderDao.getOrders();
	}

}
