package store.somethingbaked.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import java.time.DateTimeException
import java.time.LocalDateTime

@Entity(name = "order_item")
class OrderItems(
    @Id
    @GeneratedValue
    var id: Int,
    var quantity: Int,
    var orderId: Int,
    var bakedGoodId: Int,
) {
    fun createOrderItemsData(): OrderItemsData {
        return OrderItemsData(
            id = id,
            quantity = quantity,
            orderId = orderId,
            bakedGoodId = bakedGoodId,
        )
    }

    companion object {
        fun createOrderItemsFromData(data: OrderItemsData): OrderItems {
            return OrderItems(
                id = data.id,
                quantity = data.quantity,
                orderId = data.orderId,
                bakedGoodId = data.bakedGoodId,
            )
        }
    }
}

data class OrderItemsData(
    val id: Int,
    val quantity: Int,
    val orderId: Int,
    val bakedGoodId: Int
)
