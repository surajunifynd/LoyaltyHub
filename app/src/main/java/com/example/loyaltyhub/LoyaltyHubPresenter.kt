import com.example.loyaltyhub.LoyaltyHubView
import com.example.loyaltyhub.data.api.RetrofitClient
import com.example.loyaltyhub.model.Loyalty
import retrofit2.Call
import retrofit2.Response

class LoyaltyHubPresenter (private val view: LoyaltyHubView) {
    fun getLoyaltyHome(token: String, mallId: String) {
        RetrofitClient().apiService.getLoyaltyHub(token, mallId).enqueue(object : retrofit2.Callback<Loyalty> {
            override fun onResponse(call: Call<Loyalty>, response: Response<Loyalty>) {
                if(response.isSuccessful) {
                    val data = response.body()
                    if(data !=null && data !=null) {

                    }
                }
            }

            override fun onFailure(call: Call<Loyalty>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}