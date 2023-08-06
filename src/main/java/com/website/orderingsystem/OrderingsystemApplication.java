package com.website.orderingsystem;

import com.website.orderingsystem.entities.Order;
import com.website.orderingsystem.services.TotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class OrderingsystemApplication implements CommandLineRunner {

	@Autowired // DEPENDENCY INJECTION
	private TotalService total;

	public static void main(String[] args) {
		SpringApplication.run(OrderingsystemApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter order code:");
		int orderCode = scanner.nextInt();
		System.out.println("Enter the order amount:");
		double orderAmount = scanner.nextDouble();
		System.out.println("Enter the discount percentage:");
		double discount = scanner.nextDouble();

		scanner.close();


		Order order = new Order(orderCode, orderAmount, discount);

		System.out.println("Order code " + order.getCode());
		System.out.println("Order total " + total.orderTotal(order));
	}
}
