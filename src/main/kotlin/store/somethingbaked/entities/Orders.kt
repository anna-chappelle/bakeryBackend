package store.somethingbaked.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import java.time.DateTimeException
import java.time.LocalDate
import java.time.LocalDateTime

@Entity(name = "orders")
class Orders(
    @Id
    @GeneratedValue
    var id: Int,
    var customerEmail: String,
    var receptionType: String,
    var orderStatus: String,
    var timeCreated: LocalDate,
) {
    fun createOrderData(): OrdersData {
        return OrdersData(
            id = id,
            customerEmail = customerEmail,
            receptionType = receptionType,
            orderStatus = orderStatus,
            timeCreated = timeCreated,
        )
    }

    companion object {
        fun createOrdersFromData(data: OrdersData): Orders {
            return Orders(
                id = data.id,
                customerEmail = data.customerEmail,
                receptionType = data.receptionType,
                orderStatus = data.orderStatus,
                timeCreated = data.timeCreated,
            )
        }
    }
}

data class OrdersData(
    val id: Int,
    val customerEmail: String,
    val receptionType: String,
    val orderStatus: String,
    val timeCreated: LocalDate,
)
