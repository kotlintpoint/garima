package minfotech.garima.other

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import java.lang.Exception
import java.lang.RuntimeException
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import javax.net.ssl.*


/**
 * Created by Ankit Sodha on 16/12/2021.
 */
class GarimaClient {
    companion object{


        fun getClient():GarimaService{
            val retrofit=Retrofit.Builder()
                .baseUrl("https://garima.minfotech.in//api/Values/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(GarimaService::class.java)
        }
    }
}