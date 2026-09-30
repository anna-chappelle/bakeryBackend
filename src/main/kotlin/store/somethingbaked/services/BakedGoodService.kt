package store.somethingbaked.services

import org.springframework.stereotype.Service
import store.somethingbaked.entities.BakedGood
import store.somethingbaked.entities.BakedGoodData
import store.somethingbaked.repositories.BakedGoodRepository

@Service
class BakedGoodService(
    private val bakedGoodRepository: BakedGoodRepository
) {
    /**
     * Gets all baked goods.
     * @return A list of all baked goods in the db.
     */
    fun getAllBakedGoods(): List<BakedGoodData> {
        return bakedGoodRepository
            .findAll()
            .map(BakedGood::createBakedGoodData)
    }

    /**
     * Gets all available baked goods
     * @return list of all available baked goods in the db
     */
    fun getAllAvailableBakedGoods(): List<BakedGoodData> {
        return bakedGoodRepository
            .findAllByIsAvailable(true)
            .map(BakedGood::createBakedGoodData)
    }
}
