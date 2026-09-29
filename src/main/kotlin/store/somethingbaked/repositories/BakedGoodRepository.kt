package store.somethingbaked.repositories

import store.somethingbaked.entities.BakedGood
import org.springframework.data.jpa.repository.JpaRepository

interface BakedGoodRepository : JpaRepository<BakedGood, Int> {}
