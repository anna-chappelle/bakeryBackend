package store.somethingbaked.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import store.somethingbaked.entities.BakedGoodData
import store.somethingbaked.services.BakedGoodService

@RestController("/")
class BakedGoodController(
    private val bakedGoodService: BakedGoodService
) {
    @GetMapping("/baked-good")
    fun getAllBakedGoods(): List<BakedGoodData> {
        return bakedGoodService.getAllBakedGoods();
    }
}
