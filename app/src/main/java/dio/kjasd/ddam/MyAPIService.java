package dio.kjasd.ddam;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface MyAPIService {
    @FormUrlEncoded
    @POST("IfUsuarioExiste.php")
    Call<UResponse> IfUsuarioExits(@Field("usuario") String usuario);

    @FormUrlEncoded
    @POST("InsertarUsuario.php")
    Call<UResponse> insertUsuario(@Field("usuario") String usuario,
                                @Field("contrasena") String contrasena);

    @FormUrlEncoded
    @POST("ObtenerUsuario.php")
    Call<UResponse> iniciarSesion(@Field("usuario") String usuario,
                                @Field("contrasena") String contrasena);

    @FormUrlEncoded
    @POST("InsertarNumeroConfianza.php")
    Call<UResponse> insertarNumeroConfianza(@Field("idUsuario") Integer idUsuario,
                                            @Field("Numero") String Numero);

    @FormUrlEncoded
    @POST("ObtenerNumeroConfianza.php")
    Call<UResponse> obtenerNumeroConfianza(@Field("idUsuario") Integer idUsuario);

    @FormUrlEncoded
    @POST("EditNumeroConfianza.php")
    Call<UResponse> editNumeroConfianza(@Field("Numero") String Numero,
                                        @Field("idUsuario") Integer idUsuario);

    @FormUrlEncoded
    @POST("DeleteNumeroConfianza.php")
    Call<UResponse> DeleteNumeroConfianza(@Field("idUsuario") Integer idUsuario);

    @FormUrlEncoded
    @POST("InsertarPalabraFavorita.php")
    Call<UResponse> insertarPalabraFavorita(@Field("KeyWord") String KeyWord,
                                            @Field("idUsuario") Integer idUsuario,
                                            @Field("Frase") String Frase,
                                            @Field("Orden") Integer Orden);

    @FormUrlEncoded
    @POST("ObtenerPalabraFavorita.php")
    Call<UResponse> obtenerPalabraFavorita(@Field("idUsuario") Integer idUsuario,
                                           @Field("Orden") Integer Orden);

    @FormUrlEncoded
    @POST("ObtenerALLPalabraFavorita.php")
    Call<UResponse> obtenerALLPalabraFavorita(@Field("idUsuario") Integer idUsuario);

    @FormUrlEncoded
    @POST("EditPalabraFavorita.php")
    Call<UResponse> editPalabraFavorita(@Field("Frase") String Frase,
                                        @Field("KeyWord") String KeyWord,
                                        @Field("idUsuario") Integer idUsuario,
                                        @Field("Orden") Integer Orden);

    @FormUrlEncoded
    @POST("DeletePalabraFavoritaphp")
    Call<UResponse> deletePalabraFavoritaphp(@Field("idUsuario") Integer idUsuario,
                                             @Field("Orden") Integer Orden);

}
