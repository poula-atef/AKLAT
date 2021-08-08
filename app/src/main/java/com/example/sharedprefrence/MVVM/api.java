package com.example.sharedprefrence.MVVM;

import com.example.sharedprefrence.Classes.categories;
import com.example.sharedprefrence.Classes.catogeryMeals;
import com.example.sharedprefrence.Classes.mealDetail;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface api {
    @GET("categories.php")
    Call<categories> getAllCategories();

    @GET("lookup.php/")
    Call<mealDetail> getSpecificMeal(@Query("i") String id);

    @GET("filter.php/")
    Call<catogeryMeals>getCategoryMeals(@Query("c") String categoryName);

    @GET("search.php/")
    Call<mealDetail>SearchForMeals(@Query("s") String mealName);

}
