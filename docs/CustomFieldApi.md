# CustomFieldApi

All URIs are relative to *https://api.officient.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**editValueForObject**](CustomFieldApi.md#editValueForObject) | **PATCH** /1.0/custom_fields/{custom_field_id}/{object_type}/{object_id} | Edit custom field value |
| [**listFields**](CustomFieldApi.md#listFields) | **GET** /1.0/custom_fields/list | List custom fields |


<a name="editValueForObject"></a>
# **editValueForObject**
> CustomFieldEditValueForObjectResponse editValueForObject(customFieldId, objectType, objectId).execute();

Edit custom field value

Update the custom field value for a specific object (either a person, car, asset, contract,..)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer customFieldId = 56; // Id of the custom field
    String objectType = "objectType_example"; // type of object to be edited. It can be: employee, asset, car, contract, software_license, training_participant, training
    Integer objectId = 56; // ID of the object to be edited
    try {
      CustomFieldEditValueForObjectResponse result = client
              .customField
              .editValueForObject(customFieldId, objectType, objectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#editValueForObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldEditValueForObjectResponse> response = client
              .customField
              .editValueForObject(customFieldId, objectType, objectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#editValueForObject");
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
| **customFieldId** | **Integer**| Id of the custom field | |
| **objectType** | **String**| type of object to be edited. It can be: employee, asset, car, contract, software_license, training_participant, training | |
| **objectId** | **Integer**| ID of the object to be edited | |

### Return type

[**CustomFieldEditValueForObjectResponse**](CustomFieldEditValueForObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listFields"></a>
# **listFields**
> CustomFieldListFieldsResponse listFields().execute();

List custom fields

List all custom fields in a given account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    try {
      CustomFieldListFieldsResponse result = client
              .customField
              .listFields()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#listFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldListFieldsResponse> response = client
              .customField
              .listFields()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#listFields");
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

[**CustomFieldListFieldsResponse**](CustomFieldListFieldsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

