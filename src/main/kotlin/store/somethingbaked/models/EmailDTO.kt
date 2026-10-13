package store.somethingbaked.models

data class EmailDTO (
    val to: String,
    val subject: String,
    val message: String,
) {}