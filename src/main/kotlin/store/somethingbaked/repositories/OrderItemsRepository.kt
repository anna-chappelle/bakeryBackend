package store.somethingbaked.repositories

import org.springframework.data.jpa.repository.JpaRepository
import store.somethingbaked.entities.OrderItems

interface OrderItemsRepository : JpaRepository<OrderItems, Int> {}
