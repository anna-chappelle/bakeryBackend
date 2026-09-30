package store.somethingbaked.repositories

import store.somethingbaked.entities.BakedGood
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface BakedGoodRepository : JpaRepository<BakedGood, Int> {

    fun findAllByIsAvailable(isAvailable: Boolean): List<BakedGood>
}
