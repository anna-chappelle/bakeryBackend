package store.somethingbaked.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue

@Entity(name = "baked_good")
class BakedGood(
    @Id
    @GeneratedValue
    var id: Int,
    var name: String,
    var price: Int,
    var description: String,
    var isListed: Boolean,
    var isAvailable: Boolean
) {
    fun createBakedGoodData(): BakedGoodData {
        return BakedGoodData(
            id = id,
            name = name,
            price = price,
            description = description,
            isListed = isListed,
            isAvailable = isAvailable
        )
    }

    companion object {
        fun createBakedGoodFromData(data: BakedGoodData): BakedGood {
            return BakedGood(
                id = data.id,
                name = data.name,
                price = data.price,
                description = data.description,
                isListed = data.isListed,
                isAvailable = data.isAvailable,
            )
        }
    }
}

data class BakedGoodData(
    val id: Int,
    val name: String,
    val price: Int,
    val description: String,
    val isListed: Boolean,
    val isAvailable: Boolean,
)
