package minfotech.garima.model


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("ID")
    val id: Int,
    @SerializedName("PASSWORD")
    val password: String,
    @SerializedName("USERNAME")
    val username: String
)