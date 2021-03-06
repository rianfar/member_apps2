package connection;

//import model.RequestLogin;

import android.util.Log;

//import datasource.remote.NewsFeedResponse;
import Fragment.VideoKajian;
import model.Artikel;
import model.InfoKajian;
import model.Kajian;
import model.UserList;
import model.UserLogin;
import model.UserMember;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LoginAPI {
    @POST("api/members/login")

//    Call<UserLogin> loginUser(@Body RequestLogin login);
    Call<UserList> responseUser(@Body UserLogin requestUser);

    @GET("api/members/{key}/{user_id}")
    Call<UserMember> responseMember(@Query(value = "key") String key, @Query(value = "user_id") String user_id);

    @GET("api/articles/index/{page}")
    Call<Artikel> responseArtikel(@Query(value = "page") String page);

    @GET("api/articles/categories/{page}/{category}")
    Call<InfoKajian> responseInfoKajian(@Query(value = "page") String page, @Query(value = "category") String category);

    @GET("api/articles/categories/{page}")
    Call<Artikel> responsCategory(@Query(value = "page") String page,@Query(value = "category") String category);


    @GET("api/members/update/{key}/{id}/{member_no}/{member_name}/{member_nickname}/{member_gender}/{member_blood}/" +
            "{member_pob}/{member_dob}/{member_hoby}/{member_alamat}/{member_kota}/{member_poscode}/{member_telp}/" +
            "{member_hp}/{member_pinbb}/{member_job}/{member_jabatan}/{member_office_address}/{member_office_telp}/{member_angkatan}")
    Call<UserMember> responseUpdateMember(@Query(value = "key") String key, @Query(value = "id") Integer user_id, @Query(value = "member_no") String member_no,
        @Query(value = "member_name") String member_name, @Query(value = "member_nickname") String member_nickname,
        @Query(value = "member_gender") Integer member_gender, @Query(value = "member_blood") String member_blood,
        @Query(value = "member_pob") String member_pob, @Query(value = "member_dob") String member_dob,
        @Query(value = "member_hoby") String member_hoby, @Query(value = "member_alamat") String member_alamat,
        @Query(value = "member_kota") String member_kota, @Query(value = "member_poscode") String member_poscode,
        @Query(value = "member_telp") String member_telp, @Query(value = "member_hp") String member_hp,
        @Query(value = "member_pinbb") String member_pinbb, @Query(value = "member_job") Integer member_job,
        @Query(value = "member_jabatan") String member_jabatan, @Query(value = "member_office_address") String member_office_address,
        @Query(value = "member_office_telp") String member_office_telp, @Query(value = "member_angkatan") String member_angkatan);

    @GET("search/{part}/{channelId}/{key}")
    Call<ResponseBody> responseVideo(@Query(value = "part") String part, @Query(value = "channelId") String channelId, @Query(value = "key") String key);

//    @GET("api/articles/index/")
//    Call<NewsFeedResponse> getNewsFeed();
}

