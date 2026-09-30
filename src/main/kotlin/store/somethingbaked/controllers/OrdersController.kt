package store.somethingbaked.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import store.somethingbaked.entities.OrdersData
import store.somethingbaked.services.OrdersService

@RestController("")
class OrdersController(
    private val ordersService: OrdersService
) {
    @GetMapping("/all-orders")
    fun getAllOrders(): List<OrdersData> {
        return ordersService.getAllOrders();
    }
}
