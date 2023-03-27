package kr.hs.dgsw.smartschool.dodamdodam.dauth.service

import kr.hs.dgsw.smartschool.dodamdodam.dauth.request.LoginRequest
import kr.hs.dgsw.smartschool.dodamdodam.dauth.request.TokenRequest
import kr.hs.dgsw.smartschool.dodamdodam.dauth.response.LoginResponse
import kr.hs.dgsw.smartschool.dodamdodam.dauth.response.BaseResponse
import kr.hs.dgsw.smartschool.dodamdodam.dauth.response.TokenResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface DAuthService {
    @POST("auth/login")
    suspend fun login(
        @Body loginRequest: LoginRequest
    ): Response<BaseResponse<LoginResponse>>

    @POST("token")
    suspend fun getToken(
        @Body tokenRequest: TokenRequest
    ): Response<TokenResponse>
}
