# DepartmentApi

All URIs are relative to *https://api.officient.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllDepartments**](DepartmentApi.md#getAllDepartments) | **GET** /1.0/wages/departments/list | List departments |
| [**getDetail**](DepartmentApi.md#getDetail) | **GET** /1.0/wages/departments/detail/{internal_code} | Department detail |


<a name="getAllDepartments"></a>
# **getAllDepartments**
> List&lt;DepartmentGetAllDepartmentsResponseInner&gt; getAllDepartments().execute();

List departments

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
import com.konfigthis.client.api.DepartmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    try {
      List<DepartmentGetAllDepartmentsResponseInner> result = client
              .department
              .getAllDepartments()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentApi#getAllDepartments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DepartmentGetAllDepartmentsResponseInner>> response = client
              .department
              .getAllDepartments()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentApi#getAllDepartments");
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

[**List&lt;DepartmentGetAllDepartmentsResponseInner&gt;**](DepartmentGetAllDepartmentsResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getDetail"></a>
# **getDetail**
> DepartmentGetDetailResponse getDetail(internalCode).execute();

Department detail

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
import com.konfigthis.client.api.DepartmentApi;
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
      DepartmentGetDetailResponse result = client
              .department
              .getDetail(internalCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getInternalCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentApi#getDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DepartmentGetDetailResponse> response = client
              .department
              .getDetail(internalCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentApi#getDetail");
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

[**DepartmentGetDetailResponse**](DepartmentGetDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

