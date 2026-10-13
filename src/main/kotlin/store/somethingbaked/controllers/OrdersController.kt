package store.somethingbaked.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import store.somethingbaked.entities.OrdersData
import store.somethingbaked.models.EmailDTO
import store.somethingbaked.services.MailSenderService
import store.somethingbaked.services.OrdersService

@RestController("")
class OrdersController(
    private val ordersService: OrdersService,
    private val mailSenderService: MailSenderService
) {
    @GetMapping("/all-orders")
    fun getAllOrders(): List<OrdersData> {
        return ordersService.getAllOrders();
    }

    @PostMapping("/send-email")
    fun sendEmail(@RequestBody emailDTO: EmailDTO){
        return mailSenderService.sendMail(emailDTO);
    }
}
