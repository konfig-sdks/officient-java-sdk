# PrioritySchemeApi

All URIs are relative to *https://api.officient.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listActivePrioritySchemesByYear**](PrioritySchemeApi.md#listActivePrioritySchemesByYear) | **GET** /1.0/calendar/events/priorityschemes/{year} | List priority schemes |


<a name="listActivePrioritySchemesByYear"></a>
# **listActivePrioritySchemesByYear**
> PrioritySchemeListActivePrioritySchemesByYearResponse listActivePrioritySchemesByYear(year).execute();

List priority schemes

lists the active priority schemes for a specific year

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrioritySchemeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer year = 56;
    try {
      PrioritySchemeListActivePrioritySchemesByYearResponse result = client
              .priorityScheme
              .listActivePrioritySchemesByYear(year)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrioritySchemeApi#listActivePrioritySchemesByYear");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PrioritySchemeListActivePrioritySchemesByYearResponse> response = client
              .priorityScheme
              .listActivePrioritySchemesByYear(year)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrioritySchemeApi#listActivePrioritySchemesByYear");
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
| **year** | **Integer**|  | |

### Return type

[**PrioritySchemeListActivePrioritySchemesByYearResponse**](PrioritySchemeListActivePrioritySchemesByYearResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

