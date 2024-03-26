# InvitationApi

All URIs are relative to *https://api.officient.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateSecretUrl**](InvitationApi.md#generateSecretUrl) | **POST** /1.0/people/selfservice/invite_link | Self-service invitation |


<a name="generateSecretUrl"></a>
# **generateSecretUrl**
> InvitationGenerateSecretUrlResponse generateSecretUrl().invitationGenerateSecretUrlRequest(invitationGenerateSecretUrlRequest).execute();

Self-service invitation

Generate a secret URL that brings a person straight to the HR self-service platform.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvitationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    String personId = "personId_example"; // Officient will generate a selfservice invite link for this person
    try {
      InvitationGenerateSecretUrlResponse result = client
              .invitation
              .generateSecretUrl(personId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#generateSecretUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvitationGenerateSecretUrlResponse> response = client
              .invitation
              .generateSecretUrl(personId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#generateSecretUrl");
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
| **invitationGenerateSecretUrlRequest** | [**InvitationGenerateSecretUrlRequest**](InvitationGenerateSecretUrlRequest.md)|  | [optional] |

### Return type

[**InvitationGenerateSecretUrlResponse**](InvitationGenerateSecretUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

