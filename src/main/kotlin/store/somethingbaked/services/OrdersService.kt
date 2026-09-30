package store.somethingbaked.services

import org.springframework.stereotype.Service
import store.somethingbaked.entities.BakedGood
import store.somethingbaked.entities.BakedGoodData
import store.somethingbaked.entities.Orders
import store.somethingbaked.entities.OrdersData
import store.somethingbaked.repositories.BakedGoodRepository
import store.somethingbaked.repositories.OrdersRepository

@Service
class OrdersService(
    private val ordersRepository: OrdersRepository
) {
    /**
     * Gets all baked goods.
     * @return A list of all baked goods in the db.
     */
    fun getAllOrders(): List<OrdersData> {
        return ordersRepository
            .findAll()
            .map(Orders::createOrderData)
    }
}
