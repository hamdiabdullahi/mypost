package com.example.apiapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun fetchPosts(){
        var retrofit=apiClient.buildService(ApiInterface::class.java)
        var request = retrofit.getPosts()
        request.enqueue(object : Callback<List<post>>{
            override fun onResponse(call: Call<List<post>>, response: Response<List<post>>) {
               if (response.isSuccessful){
                   var postslist=response.body()



                   Toast.makeText(baseContext,postslist!!.size,Toast.LENGTH_LONG).show()
               }}

            override fun onFailure(call: Call<List<post>>, t: Throwable) {
                Toast.makeText(baseContext,t.message!!,Toast.LENGTH_LONG).show()
                fun getpost(){
                 var retrofit=apiClient.buildService(ApiInterface::class.java)
                    Toast.makeText(baseContext,t.message,Toast.LENGTH_LONG).show()


                }
            }
            }

            
        )
    }
}
