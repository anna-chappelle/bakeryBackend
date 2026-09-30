package store.somethingbaked.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import store.somethingbaked.entities.Orders

interface OrdersRepository : JpaRepository<Orders, Int> {


}
