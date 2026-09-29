package store.somethingbaked.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import store.somethingbaked.entities.BakedGoodData
import store.somethingbaked.services.BakedGoodService

@RestController("/baked-good")
class MyController(
    private val bakedGoodService: BakedGoodService
) {
    @GetMapping("/")
    fun getAllBakedGoods(): List<BakedGoodData> {
        return bakedGoodService.getAllBakedGoods();
    }
}
