# CostUnitApi

All URIs are relative to *https://api.officient.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFunctionsDetail**](CostUnitApi.md#getFunctionsDetail) | **GET** /1.0/wages/cost_units/detail/{internal_code} | Cost unit detail |
| [**listFunctions**](CostUnitApi.md#listFunctions) | **GET** /1.0/wages/cost_units/list | List cost units |


<a name="getFunctionsDetail"></a>
# **getFunctionsDetail**
> CostUnitGetFunctionsDetailResponse getFunctionsDetail(internalCode).execute();

Cost unit detail

Get the details of all functions or that of a single one

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostUnitApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    String internalCode = "internalCode_example"; // The internal code / GUID of the function you would like to receive information on
    try {
      CostUnitGetFunctionsDetailResponse result = client
              .costUnit
              .getFunctionsDetail(internalCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getInternalCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostUnitApi#getFunctionsDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CostUnitGetFunctionsDetailResponse> response = client
              .costUnit
              .getFunctionsDetail(internalCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostUnitApi#getFunctionsDetail");
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
| **internalCode** | **String**| The internal code / GUID of the function you would like to receive information on | |

### Return type

[**CostUnitGetFunctionsDetailResponse**](CostUnitGetFunctionsDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listFunctions"></a>
# **listFunctions**
> List&lt;CostUnitListFunctionsResponseInner&gt; listFunctions().execute();

List cost units

Get the details of all functions or that of a single one

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostUnitApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    try {
      List<CostUnitListFunctionsResponseInner> result = client
              .costUnit
              .listFunctions()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostUnitApi#listFunctions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CostUnitListFunctionsResponseInner>> response = client
              .costUnit
              .listFunctions()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostUnitApi#listFunctions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CostUnitListFunctionsResponseInner&gt;**](CostUnitListFunctionsResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

