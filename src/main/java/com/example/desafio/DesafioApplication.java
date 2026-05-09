package com.example.desafio;

import com.example.desafio.entity.Order;
import com.example.desafio.service.OrderService;
import com.example.desafio.service.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.example"})
public class DesafioApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        ShippingService shippingService = new ShippingService();
        OrderService orderService = new OrderService(shippingService);

        try{
            System.out.println("Código do Produto: " );
            Integer code = sc.nextInt();
            sc.nextLine();

            System.out.println("Valor Sem Desconto: " );
            Double basic = sc.nextDouble();

            System.out.println("Valor do Desconto: " );
            Double discount = sc.nextDouble();

            Order order = new Order(code, basic, discount);
            Double totalValue = orderService.total(order);

            System.out.printf("Pedido Código: %d\nValor Total: %.2f", code, totalValue);

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }

}
