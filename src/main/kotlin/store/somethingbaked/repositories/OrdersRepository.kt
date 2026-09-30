package store.somethingbaked.repositories

import org.springframework.data.jpa.repository.JpaRepository
import store.somethingbaked.entities.Orders

interface OrdersRepository : JpaRepository<Orders, Int> {}
