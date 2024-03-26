# AuthenticationApi

All URIs are relative to *https://api.officient.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccessToken**](AuthenticationApi.md#getAccessToken) | **POST** /1.0/token | Get access token |


<a name="getAccessToken"></a>
# **getAccessToken**
> AuthenticationGetAccessTokenResponse getAccessToken().authenticationGetAccessTokenRequest(authenticationGetAccessTokenRequest).execute();

Get access token



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    String code = "code_example"; // Authorization code in case of 3 legged oauth flow
    String clientId = "clientId_example"; // client_id of your app. Can be found under 'my apps'
    String clientSecret = "clientSecret_example"; // client secret of your app. Can be found under 'my apps'
    String grantType = "grantType_example"; // should always be either authorization_code or refresh_token
    String refreshToken = "refreshToken_example"; // optional
    try {
      AuthenticationGetAccessTokenResponse result = client
              .authentication
              .getAccessToken()
              .code(code)
              .clientId(clientId)
              .clientSecret(clientSecret)
              .grantType(grantType)
              .refreshToken(refreshToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getTokenType());
      System.out.println(result.getScope());
      System.out.println(result.getRefreshToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthenticationGetAccessTokenResponse> response = client
              .authentication
              .getAccessToken()
              .code(code)
              .clientId(clientId)
              .clientSecret(clientSecret)
              .grantType(grantType)
              .refreshToken(refreshToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticationGetAccessTokenRequest** | [**AuthenticationGetAccessTokenRequest**](AuthenticationGetAccessTokenRequest.md)|  | [optional] |

### Return type

[**AuthenticationGetAccessTokenResponse**](AuthenticationGetAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

