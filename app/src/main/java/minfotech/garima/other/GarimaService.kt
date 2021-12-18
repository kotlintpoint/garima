package minfotech.garima.other

import minfotech.garima.model.User
import retrofit2.Call
import retrofit2.http.*
import java.util.HashMap

/**
 * Created by Ankit Sodha on 16/12/2021.
 */
interface GarimaService {

    @Headers("Content-Type: application/json;charset=UTF-8")
    @POST("Login")
    fun Login(@Body fields:HashMap<String, String> ): Call<List<User>>


}