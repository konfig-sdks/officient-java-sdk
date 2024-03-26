# BudgetApi

All URIs are relative to *https://api.officient.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBudgetItem**](BudgetApi.md#addBudgetItem) | **POST** /1.0/budgets/add | Add budget |
| [**addItem**](BudgetApi.md#addItem) | **POST** /1.0/budgets/{budget_id}/items/add | Add budget item |
| [**deleteBudgetById**](BudgetApi.md#deleteBudgetById) | **DELETE** /1.0/budgets/{budget_id} | Delete budget |
| [**removeItem**](BudgetApi.md#removeItem) | **DELETE** /1.0/budgets/{budget_id}/items/{item_id} | Delete budget item |
| [**updateBudgetItem**](BudgetApi.md#updateBudgetItem) | **PATCH** /1.0/budgets/{budget_id} | Edit budget |


<a name="addBudgetItem"></a>
# **addBudgetItem**
> BudgetAddBudgetItemResponse addBudgetItem().budgetAddBudgetItemRequest(budgetAddBudgetItemRequest).execute();

Add budget



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    String budgetType = "budgetType_example"; // The type of budget.
    Integer maximum = 56; // The maximum amount that will be set for the budget.
    Integer year = 56; // The year for which the budget will created.
    Integer employeeId = 56; // The id of the employee for which the budget will be created.
    try {
      BudgetAddBudgetItemResponse result = client
              .budget
              .addBudgetItem()
              .budgetType(budgetType)
              .maximum(maximum)
              .year(year)
              .employeeId(employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#addBudgetItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetAddBudgetItemResponse> response = client
              .budget
              .addBudgetItem()
              .budgetType(budgetType)
              .maximum(maximum)
              .year(year)
              .employeeId(employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#addBudgetItem");
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
| **budgetAddBudgetItemRequest** | [**BudgetAddBudgetItemRequest**](BudgetAddBudgetItemRequest.md)|  | [optional] |

### Return type

[**BudgetAddBudgetItemResponse**](BudgetAddBudgetItemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="addItem"></a>
# **addItem**
> BudgetAddItemResponse addItem(budgetId).budgetAddItemRequest(budgetAddItemRequest).execute();

Add budget item



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer budgetId = 56;
    String itemName = "itemName_example";
    Double cost = 3.4D;
    Integer employeeId = 56;
    try {
      BudgetAddItemResponse result = client
              .budget
              .addItem(budgetId)
              .itemName(itemName)
              .cost(cost)
              .employeeId(employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#addItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetAddItemResponse> response = client
              .budget
              .addItem(budgetId)
              .itemName(itemName)
              .cost(cost)
              .employeeId(employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#addItem");
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
| **budgetId** | **Integer**|  | |
| **budgetAddItemRequest** | [**BudgetAddItemRequest**](BudgetAddItemRequest.md)|  | [optional] |

### Return type

[**BudgetAddItemResponse**](BudgetAddItemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="deleteBudgetById"></a>
# **deleteBudgetById**
> BudgetDeleteBudgetByIdResponse deleteBudgetById(budgetId).execute();

Delete budget



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer budgetId = 56; // The id of the budget that will be deleted
    try {
      BudgetDeleteBudgetByIdResponse result = client
              .budget
              .deleteBudgetById(budgetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#deleteBudgetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetDeleteBudgetByIdResponse> response = client
              .budget
              .deleteBudgetById(budgetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#deleteBudgetById");
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
| **budgetId** | **Integer**| The id of the budget that will be deleted | |

### Return type

[**BudgetDeleteBudgetByIdResponse**](BudgetDeleteBudgetByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="removeItem"></a>
# **removeItem**
> BudgetRemoveItemResponse removeItem(budgetId).itemId(itemId).execute();

Delete budget item



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer budgetId = 56;
    Integer itemId = 56;
    try {
      BudgetRemoveItemResponse result = client
              .budget
              .removeItem(budgetId)
              .itemId(itemId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#removeItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetRemoveItemResponse> response = client
              .budget
              .removeItem(budgetId)
              .itemId(itemId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#removeItem");
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
| **budgetId** | **Integer**|  | |
| **itemId** | **Integer**|  | [optional] |

### Return type

[**BudgetRemoveItemResponse**](BudgetRemoveItemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateBudgetItem"></a>
# **updateBudgetItem**
> BudgetUpdateBudgetItemResponse updateBudgetItem(budgetId).budgetUpdateBudgetItemRequest(budgetUpdateBudgetItemRequest).execute();

Edit budget



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer budgetId = 56; // The id of the budget that will be edited.
    Integer maximum = 56; // The new maximum amount for the budget.
    try {
      BudgetUpdateBudgetItemResponse result = client
              .budget
              .updateBudgetItem(budgetId)
              .maximum(maximum)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#updateBudgetItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetUpdateBudgetItemResponse> response = client
              .budget
              .updateBudgetItem(budgetId)
              .maximum(maximum)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#updateBudgetItem");
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
| **budgetId** | **Integer**| The id of the budget that will be edited. | |
| **budgetUpdateBudgetItemRequest** | [**BudgetUpdateBudgetItemRequest**](BudgetUpdateBudgetItemRequest.md)|  | [optional] |

### Return type

[**BudgetUpdateBudgetItemResponse**](BudgetUpdateBudgetItemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

