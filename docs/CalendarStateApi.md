# CalendarStateApi

All URIs are relative to *https://api.officient.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**unlockMonthProcessed**](CalendarStateApi.md#unlockMonthProcessed) | **POST** /1.0/calendar/state/lock | Unlock calendar |


<a name="unlockMonthProcessed"></a>
# **unlockMonthProcessed**
> CalendarStateUnlockMonthProcessedResponse unlockMonthProcessed().calendarStateUnlockMonthProcessedRequest(calendarStateUnlockMonthProcessedRequest).execute();

Unlock calendar

Unlock the calendar for a month that has already been processed by your payroll provider. This is usually done to add corrections.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CalendarStateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Boolean disableLock = true; // By disabling the lock, the calendar will become unlocked.
    try {
      CalendarStateUnlockMonthProcessedResponse result = client
              .calendarState
              .unlockMonthProcessed()
              .disableLock(disableLock)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarStateApi#unlockMonthProcessed");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CalendarStateUnlockMonthProcessedResponse> response = client
              .calendarState
              .unlockMonthProcessed()
              .disableLock(disableLock)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarStateApi#unlockMonthProcessed");
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
| **calendarStateUnlockMonthProcessedRequest** | [**CalendarStateUnlockMonthProcessedRequest**](CalendarStateUnlockMonthProcessedRequest.md)|  | [optional] |

### Return type

[**CalendarStateUnlockMonthProcessedResponse**](CalendarStateUnlockMonthProcessedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

