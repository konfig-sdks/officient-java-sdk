# ExpenseApi

All URIs are relative to *https://api.officient.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCategory**](ExpenseApi.md#addCategory) | **POST** /1.0/expenses/categories/add | Add expense category |
| [**addExpenseWithCategory**](ExpenseApi.md#addExpenseWithCategory) | **POST** /1.0/expenses/add | Add expense |
| [**deleteById**](ExpenseApi.md#deleteById) | **DELETE** /1.0/expenses/{expense_id} | Delete expense |
| [**deleteCategory**](ExpenseApi.md#deleteCategory) | **DELETE** /1.0/expenses/categories/{category_id} | Delete expense category |
| [**editCategoryName**](ExpenseApi.md#editCategoryName) | **PATCH** /1.0/expenses/categories/{category_id} | Edit expense category name |
| [**getDetail**](ExpenseApi.md#getDetail) | **GET** /1.0/expenses/{expense_id}/detail | Expense detail |
| [**listByCategoryDetail**](ExpenseApi.md#listByCategoryDetail) | **GET** /1.0/expenses/categories/{category_id}/detail | Expense category detail |
| [**listByMonth**](ExpenseApi.md#listByMonth) | **GET** /1.0/expenses/list/{year}/{month} | List expenses by month |
| [**listByYear**](ExpenseApi.md#listByYear) | **GET** /1.0/expenses/list/{year} | List expenses by year |
| [**listCategories**](ExpenseApi.md#listCategories) | **GET** /1.0/expenses/categories/list | List expense categories |
| [**setPayoutMethodAndStatus**](ExpenseApi.md#setPayoutMethodAndStatus) | **POST** /1.0/expenses/{expense_id}/updatePayout | Set payout method and status |
| [**updateDetails**](ExpenseApi.md#updateDetails) | **PATCH** /1.0/expenses/{expense_id} | Edit expense |


<a name="addCategory"></a>
# **addCategory**
> ExpenseAddCategoryResponse addCategory().expenseAddCategoryRequest(expenseAddCategoryRequest).execute();

Add expense category

The api end-point to add an expense nd an optional category id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    String name = "name_example";
    String type = "total";
    Float pricePerKilometer = 3.4F;
    Float pricePerDay = 3.4F;
    try {
      ExpenseAddCategoryResponse result = client
              .expense
              .addCategory(name, type)
              .pricePerKilometer(pricePerKilometer)
              .pricePerDay(pricePerDay)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#addCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseAddCategoryResponse> response = client
              .expense
              .addCategory(name, type)
              .pricePerKilometer(pricePerKilometer)
              .pricePerDay(pricePerDay)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#addCategory");
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
| **expenseAddCategoryRequest** | [**ExpenseAddCategoryRequest**](ExpenseAddCategoryRequest.md)|  | [optional] |

### Return type

[**ExpenseAddCategoryResponse**](ExpenseAddCategoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="addExpenseWithCategory"></a>
# **addExpenseWithCategory**
> ExpenseAddExpenseWithCategoryResponse addExpenseWithCategory().expenseAddExpenseWithCategoryRequest(expenseAddExpenseWithCategoryRequest).execute();

Add expense

The api end-point to add an expense nd an optional category id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    String description = "description_example"; // This is the title for the expense
    Integer employeeId = 56;
    Integer categoryId = 0; // For some integrations this is required not to be 0 which is the default category id
    Float amount = 3.4F; // this is the price of the expense, this is only required when using a total amount category
    String extraInformation = "extraInformation_example";
    String date = "date_example"; // this is the day the expense has incurred on and is required when it is a total amount category
    String filename = "filename_example"; // this is required when you want to add an expense with a total amount category
    String fileBase64 = "fileBase64_example"; // this is required when you want to add an expense with a total amount category
    List<String> dates = Arrays.asList(); // this is required when you want to add an expense with a kilometer or day allowance expense category, multiple dates are also possible (ex: [\\\"24/05/2023\\\", \\\"26/05/2023\\\"])
    Integer distance = 0; // this is required when you want to update to a killometer allowance expense category. This is equal to the total amount of kilometers that has been done
    String ride = "single"; // this is the value if it's an outward or a round journey when using kilometer allowances, this defaults to single
    try {
      ExpenseAddExpenseWithCategoryResponse result = client
              .expense
              .addExpenseWithCategory(description, employeeId, categoryId)
              .amount(amount)
              .extraInformation(extraInformation)
              .date(date)
              .filename(filename)
              .fileBase64(fileBase64)
              .dates(dates)
              .distance(distance)
              .ride(ride)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#addExpenseWithCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseAddExpenseWithCategoryResponse> response = client
              .expense
              .addExpenseWithCategory(description, employeeId, categoryId)
              .amount(amount)
              .extraInformation(extraInformation)
              .date(date)
              .filename(filename)
              .fileBase64(fileBase64)
              .dates(dates)
              .distance(distance)
              .ride(ride)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#addExpenseWithCategory");
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
| **expenseAddExpenseWithCategoryRequest** | [**ExpenseAddExpenseWithCategoryRequest**](ExpenseAddExpenseWithCategoryRequest.md)|  | [optional] |

### Return type

[**ExpenseAddExpenseWithCategoryResponse**](ExpenseAddExpenseWithCategoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="deleteById"></a>
# **deleteById**
> ExpenseDeleteByIdResponse deleteById(expenseId).execute();

Delete expense



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer expenseId = 56;
    try {
      ExpenseDeleteByIdResponse result = client
              .expense
              .deleteById(expenseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseDeleteByIdResponse> response = client
              .expense
              .deleteById(expenseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#deleteById");
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
| **expenseId** | **Integer**|  | |

### Return type

[**ExpenseDeleteByIdResponse**](ExpenseDeleteByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="deleteCategory"></a>
# **deleteCategory**
> ExpenseDeleteCategoryResponse deleteCategory(categoryId).execute();

Delete expense category



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer categoryId = 56;
    try {
      ExpenseDeleteCategoryResponse result = client
              .expense
              .deleteCategory(categoryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#deleteCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseDeleteCategoryResponse> response = client
              .expense
              .deleteCategory(categoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#deleteCategory");
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
| **categoryId** | **Integer**|  | |

### Return type

[**ExpenseDeleteCategoryResponse**](ExpenseDeleteCategoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="editCategoryName"></a>
# **editCategoryName**
> ExpenseEditCategoryNameResponse editCategoryName(categoryId).expenseEditCategoryNameRequest(expenseEditCategoryNameRequest).execute();

Edit expense category name



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    String name = "name_example";
    Integer categoryId = 56;
    try {
      ExpenseEditCategoryNameResponse result = client
              .expense
              .editCategoryName(name, categoryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#editCategoryName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseEditCategoryNameResponse> response = client
              .expense
              .editCategoryName(name, categoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#editCategoryName");
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
| **categoryId** | **Integer**|  | |
| **expenseEditCategoryNameRequest** | [**ExpenseEditCategoryNameRequest**](ExpenseEditCategoryNameRequest.md)|  | [optional] |

### Return type

[**ExpenseEditCategoryNameResponse**](ExpenseEditCategoryNameResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getDetail"></a>
# **getDetail**
> ExpenseGetDetailResponse getDetail(expenseId).execute();

Expense detail

List all expenses

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer expenseId = 56; // the specific id we want to see the details about
    try {
      ExpenseGetDetailResponse result = client
              .expense
              .getDetail(expenseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#getDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseGetDetailResponse> response = client
              .expense
              .getDetail(expenseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#getDetail");
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
| **expenseId** | **Integer**| the specific id we want to see the details about | |

### Return type

[**ExpenseGetDetailResponse**](ExpenseGetDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listByCategoryDetail"></a>
# **listByCategoryDetail**
> ExpenseListByCategoryDetailResponse listByCategoryDetail(categoryId).execute();

Expense category detail

List all expenses

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer categoryId = 56; // the specific id we want to see the details about
    try {
      ExpenseListByCategoryDetailResponse result = client
              .expense
              .listByCategoryDetail(categoryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#listByCategoryDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseListByCategoryDetailResponse> response = client
              .expense
              .listByCategoryDetail(categoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#listByCategoryDetail");
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
| **categoryId** | **Integer**| the specific id we want to see the details about | |

### Return type

[**ExpenseListByCategoryDetailResponse**](ExpenseListByCategoryDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listByMonth"></a>
# **listByMonth**
> ExpenseListByMonthResponse listByMonth(year, month).page(page).includeDeleted(includeDeleted).execute();

List expenses by month

List all expenses

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    String year = "year_example"; // the specific year we want to filter
    String month = "month_example"; // the specific month we want to filter this is optional
    String page = "0"; // optional to filter pages
    Integer includeDeleted = 1; // this is so you can exclude any deleted expense, by default we show them (0 - 1)
    try {
      ExpenseListByMonthResponse result = client
              .expense
              .listByMonth(year, month)
              .page(page)
              .includeDeleted(includeDeleted)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#listByMonth");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseListByMonthResponse> response = client
              .expense
              .listByMonth(year, month)
              .page(page)
              .includeDeleted(includeDeleted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#listByMonth");
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
| **year** | **String**| the specific year we want to filter | |
| **month** | **String**| the specific month we want to filter this is optional | |
| **page** | **String**| optional to filter pages | [optional] [default to 0] |
| **includeDeleted** | **Integer**| this is so you can exclude any deleted expense, by default we show them (0 - 1) | [optional] [default to 1] |

### Return type

[**ExpenseListByMonthResponse**](ExpenseListByMonthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listByYear"></a>
# **listByYear**
> ExpenseListByYearResponse listByYear(year, month).page(page).includeDeleted(includeDeleted).execute();

List expenses by year

List all expenses

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    String year = "year_example"; // the specific year we want to filter
    String month = "month_example"; // the specific month we want to filter this is optional
    String page = "0"; // optional to filter pages
    Integer includeDeleted = 1; // this is so you can exclude any deleted expense, by default we show them (0 - 1)
    try {
      ExpenseListByYearResponse result = client
              .expense
              .listByYear(year, month)
              .page(page)
              .includeDeleted(includeDeleted)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#listByYear");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseListByYearResponse> response = client
              .expense
              .listByYear(year, month)
              .page(page)
              .includeDeleted(includeDeleted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#listByYear");
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
| **year** | **String**| the specific year we want to filter | |
| **month** | **String**| the specific month we want to filter this is optional | |
| **page** | **String**| optional to filter pages | [optional] [default to 0] |
| **includeDeleted** | **Integer**| this is so you can exclude any deleted expense, by default we show them (0 - 1) | [optional] [default to 1] |

### Return type

[**ExpenseListByYearResponse**](ExpenseListByYearResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listCategories"></a>
# **listCategories**
> String listCategories().execute();

List expense categories

List all expenses

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    try {
      String result = client
              .expense
              .listCategories()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#listCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .expense
              .listCategories()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#listCategories");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="setPayoutMethodAndStatus"></a>
# **setPayoutMethodAndStatus**
> ExpenseSetPayoutMethodAndStatusResponse setPayoutMethodAndStatus(expenseId).expenseSetPayoutMethodAndStatusRequest(expenseSetPayoutMethodAndStatusRequest).execute();

Set payout method and status



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    String newPayoutMethod = "UNDECIDED";
    Integer expenseId = 56;
    String payoutOtherReason = "payoutOtherReason_example";
    String payoutStatus = "PAID_OUT"; // This field is required when the \\\"new\\\"payout_method\\\" is either PAYOUT_ACCOUNTING, PAYOUT_OTHER or PAYOUT_MANUALLY
    String period = "period_example";
    String year = "year_example";
    try {
      ExpenseSetPayoutMethodAndStatusResponse result = client
              .expense
              .setPayoutMethodAndStatus(newPayoutMethod, expenseId)
              .payoutOtherReason(payoutOtherReason)
              .payoutStatus(payoutStatus)
              .period(period)
              .year(year)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#setPayoutMethodAndStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseSetPayoutMethodAndStatusResponse> response = client
              .expense
              .setPayoutMethodAndStatus(newPayoutMethod, expenseId)
              .payoutOtherReason(payoutOtherReason)
              .payoutStatus(payoutStatus)
              .period(period)
              .year(year)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#setPayoutMethodAndStatus");
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
| **expenseId** | **Integer**|  | |
| **expenseSetPayoutMethodAndStatusRequest** | [**ExpenseSetPayoutMethodAndStatusRequest**](ExpenseSetPayoutMethodAndStatusRequest.md)|  | [optional] |

### Return type

[**ExpenseSetPayoutMethodAndStatusResponse**](ExpenseSetPayoutMethodAndStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateDetails"></a>
# **updateDetails**
> ExpenseUpdateDetailsResponse updateDetails(expenseId).expenseUpdateDetailsRequest(expenseUpdateDetailsRequest).execute();

Edit expense



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    Integer categoryId = 0; // For some integrations this is required not to be 0 which is the default category id
    Integer expenseId = 56;
    try {
      ExpenseUpdateDetailsResponse result = client
              .expense
              .updateDetails(categoryId, expenseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#updateDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseUpdateDetailsResponse> response = client
              .expense
              .updateDetails(categoryId, expenseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseApi#updateDetails");
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
| **expenseId** | **Integer**|  | |
| **expenseUpdateDetailsRequest** | [**ExpenseUpdateDetailsRequest**](ExpenseUpdateDetailsRequest.md)|  | [optional] |

### Return type

[**ExpenseUpdateDetailsResponse**](ExpenseUpdateDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

