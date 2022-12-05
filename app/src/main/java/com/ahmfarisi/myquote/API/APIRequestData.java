package com.ahmfarisi.myquote.API;

import com.ahmfarisi.myquote.Model.QuoteModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("quotes")
    Call<List<QuoteModel>> ardRetrieve();
}
