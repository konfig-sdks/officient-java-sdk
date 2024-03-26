<div align="left">

[![Visit Officient](./header.png)](https://officient.io)

# [Officient](https://officient.io)

Officient offers an intuitive HRIS which helps manage all personnel administration through our HR platform & personalized employee self-services. Manage payroll, company assets, contracts, days off, fleet, performance reviews and all employee data in one HR system. HR deserves great software and we're here to provide it.

We support our customers in transforming HR towards paperless administration and automating tedious workforce management tasks in the process. Our goal? Transform HR from an administrative, processing role, to a controlling role which fuels HR strategy across the organization.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Officient&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>officient-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:officient-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/officient-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Officient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.officient.io";
    Officient client = new Officient(configuration);
    try {
      AccountGetInformationResponse result = client
              .account
              .getInformation()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountGetInformationResponse> response = client
              .account
              .getInformation()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.officient.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**getInformation**](docs/AccountApi.md#getInformation) | **GET** /1.0/account | Your account
*AssetApi* | [**addCustomType**](docs/AssetApi.md#addCustomType) | **POST** /1.0/assets/types/add | Add custom asset type
*AssetApi* | [**createNewAsset**](docs/AssetApi.md#createNewAsset) | **POST** /1.0/assets/add | Add asset
*AssetApi* | [**getCustomTypesList**](docs/AssetApi.md#getCustomTypesList) | **GET** /1.0/assets/types/list | List custom asset types
*AssetApi* | [**getDetail**](docs/AssetApi.md#getDetail) | **GET** /1.0/assets/{asset_id}/detail | Asset detail
*AssetApi* | [**listAssets**](docs/AssetApi.md#listAssets) | **GET** /1.0/assets/list | List assets
*AssetApi* | [**remove**](docs/AssetApi.md#remove) | **DELETE** /1.0/assets/{asset_id} | Delete asset
*AssetApi* | [**removeCustomType**](docs/AssetApi.md#removeCustomType) | **DELETE** /1.0/assets/types/{asset_type_id} | Delete custom asset type
*AssetApi* | [**updateAsset**](docs/AssetApi.md#updateAsset) | **PATCH** /1.0/assets/{asset_id} | Edit asset
*AuthenticationApi* | [**getAccessToken**](docs/AuthenticationApi.md#getAccessToken) | **POST** /1.0/token | Get access token
*BudgetApi* | [**addBudgetItem**](docs/BudgetApi.md#addBudgetItem) | **POST** /1.0/budgets/add | Add budget
*BudgetApi* | [**addItem**](docs/BudgetApi.md#addItem) | **POST** /1.0/budgets/{budget_id}/items/add | Add budget item
*BudgetApi* | [**deleteBudgetById**](docs/BudgetApi.md#deleteBudgetById) | **DELETE** /1.0/budgets/{budget_id} | Delete budget
*BudgetApi* | [**removeItem**](docs/BudgetApi.md#removeItem) | **DELETE** /1.0/budgets/{budget_id}/items/{item_id} | Delete budget item
*BudgetApi* | [**updateBudgetItem**](docs/BudgetApi.md#updateBudgetItem) | **PATCH** /1.0/budgets/{budget_id} | Edit budget
*CalendarRequestApi* | [**getDetailById**](docs/CalendarRequestApi.md#getDetailById) | **GET** /1.0/calendar/requests/{request_id}/detail | Calendar request detail
*CalendarRequestApi* | [**listRequests**](docs/CalendarRequestApi.md#listRequests) | **GET** /1.0/calendar/requests/list | List calendar requests
*CalendarStateApi* | [**unlockMonthProcessed**](docs/CalendarStateApi.md#unlockMonthProcessed) | **POST** /1.0/calendar/state/lock | Unlock calendar
*ComponentApi* | [**grantOneOffWage**](docs/ComponentApi.md#grantOneOffWage) | **POST** /1.0/wages/one_off/components/add | Grant one-off wage component
*ComponentApi* | [**removeOneOffWage**](docs/ComponentApi.md#removeOneOffWage) | **DELETE** /1.0/wages/one_off/components/{granted_component_id} | Remove one-off wage component
*ContractApi* | [**createNewContract**](docs/ContractApi.md#createNewContract) | **POST** /1.0/contracts/add | Add contract
*ContractApi* | [**getAll**](docs/ContractApi.md#getAll) | **GET** /1.0/contracts/list | List contracts
*ContractApi* | [**getDetail**](docs/ContractApi.md#getDetail) | **GET** /1.0/contracts/{contract_id}/detail | Contract detail
*ContractApi* | [**getPdfLink**](docs/ContractApi.md#getPdfLink) | **GET** /1.0/contracts/{contract_id}/pdf | Contract PDF
*ContractApi* | [**requestSignature**](docs/ContractApi.md#requestSignature) | **POST** /1.0/contracts/signature/request | Request contract signature
*CostCenterApi* | [**detailGet**](docs/CostCenterApi.md#detailGet) | **GET** /1.0/wages/cost_centers/detail/{internal_code} | Cost center detail
*CostCenterApi* | [**getList**](docs/CostCenterApi.md#getList) | **GET** /1.0/wages/cost_centers/list | List cost centers
*CostUnitApi* | [**getFunctionsDetail**](docs/CostUnitApi.md#getFunctionsDetail) | **GET** /1.0/wages/cost_units/detail/{internal_code} | Cost unit detail
*CostUnitApi* | [**listFunctions**](docs/CostUnitApi.md#listFunctions) | **GET** /1.0/wages/cost_units/list | List cost units
*CustomEventTypeApi* | [**getList**](docs/CustomEventTypeApi.md#getList) | **GET** /1.0/calendar/events/types/{year} | Custom event types
*CustomFieldApi* | [**editValueForObject**](docs/CustomFieldApi.md#editValueForObject) | **PATCH** /1.0/custom_fields/{custom_field_id}/{object_type}/{object_id} | Edit custom field value
*CustomFieldApi* | [**listFields**](docs/CustomFieldApi.md#listFields) | **GET** /1.0/custom_fields/list | List custom fields
*DepartmentApi* | [**getAllDepartments**](docs/DepartmentApi.md#getAllDepartments) | **GET** /1.0/wages/departments/list | List departments
*DepartmentApi* | [**getDetail**](docs/DepartmentApi.md#getDetail) | **GET** /1.0/wages/departments/detail/{internal_code} | Department detail
*DocumentApi* | [**getDownloadUrl**](docs/DocumentApi.md#getDownloadUrl) | **GET** /1.0/documents/{file_id}/download | Download document
*DocumentApi* | [**listRelated**](docs/DocumentApi.md#listRelated) | **GET** /1.0/documents/{object_type}/{object_id}/list | List documents
*DocumentApi* | [**remove**](docs/DocumentApi.md#remove) | **DELETE** /1.0/documents/{file_id} | Delete document
*DocumentApi* | [**uploadDocument**](docs/DocumentApi.md#uploadDocument) | **POST** /1.0/documents/{object_type}/{object_id}/add | Upload document
*ExpenseApi* | [**addCategory**](docs/ExpenseApi.md#addCategory) | **POST** /1.0/expenses/categories/add | Add expense category
*ExpenseApi* | [**addExpenseWithCategory**](docs/ExpenseApi.md#addExpenseWithCategory) | **POST** /1.0/expenses/add | Add expense
*ExpenseApi* | [**deleteById**](docs/ExpenseApi.md#deleteById) | **DELETE** /1.0/expenses/{expense_id} | Delete expense
*ExpenseApi* | [**deleteCategory**](docs/ExpenseApi.md#deleteCategory) | **DELETE** /1.0/expenses/categories/{category_id} | Delete expense category
*ExpenseApi* | [**editCategoryName**](docs/ExpenseApi.md#editCategoryName) | **PATCH** /1.0/expenses/categories/{category_id} | Edit expense category name
*ExpenseApi* | [**getDetail**](docs/ExpenseApi.md#getDetail) | **GET** /1.0/expenses/{expense_id}/detail | Expense detail
*ExpenseApi* | [**listByCategoryDetail**](docs/ExpenseApi.md#listByCategoryDetail) | **GET** /1.0/expenses/categories/{category_id}/detail | Expense category detail
*ExpenseApi* | [**listByMonth**](docs/ExpenseApi.md#listByMonth) | **GET** /1.0/expenses/list/{year}/{month} | List expenses by month
*ExpenseApi* | [**listByYear**](docs/ExpenseApi.md#listByYear) | **GET** /1.0/expenses/list/{year} | List expenses by year
*ExpenseApi* | [**listCategories**](docs/ExpenseApi.md#listCategories) | **GET** /1.0/expenses/categories/list | List expense categories
*ExpenseApi* | [**setPayoutMethodAndStatus**](docs/ExpenseApi.md#setPayoutMethodAndStatus) | **POST** /1.0/expenses/{expense_id}/updatePayout | Set payout method and status
*ExpenseApi* | [**updateDetails**](docs/ExpenseApi.md#updateDetails) | **PATCH** /1.0/expenses/{expense_id} | Edit expense
*FunctionApi* | [**getAllFunctions**](docs/FunctionApi.md#getAllFunctions) | **GET** /1.0/wages/functions/list | List functions
*FunctionApi* | [**getDetails**](docs/FunctionApi.md#getDetails) | **GET** /1.0/wages/functions/detail/{internal_code} | Function detail
*InvitationApi* | [**generateSecretUrl**](docs/InvitationApi.md#generateSecretUrl) | **POST** /1.0/people/selfservice/invite_link | Self-service invitation
*PersonApi* | [**addNew**](docs/PersonApi.md#addNew) | **POST** /1.0/people/add | Add person
*PersonApi* | [**addToCalendar**](docs/PersonApi.md#addToCalendar) | **POST** /1.0/calendar/{person_id}/events/add | Add event
*PersonApi* | [**addToCalendar_0**](docs/PersonApi.md#addToCalendar_0) | **POST** /1.0/calendar/{person_id}/priorityschemes/events/add | Use priority scheme
*PersonApi* | [**editDetail**](docs/PersonApi.md#editDetail) | **PATCH** /1.0/people/{person_id}/detail | Edit person
*PersonApi* | [**getBudgetsByYear**](docs/PersonApi.md#getBudgetsByYear) | **GET** /1.0/budgets/people/{person_id}/{year}/list | List budgets
*PersonApi* | [**getCurrentWage**](docs/PersonApi.md#getCurrentWage) | **GET** /1.0/wages/{person_id}/current | Current wage
*PersonApi* | [**getCurrentWeeklySchedule**](docs/PersonApi.md#getCurrentWeeklySchedule) | **GET** /1.0/people/{person_id}/weekly_schedule/current | Weekly schedule
*PersonApi* | [**getCustomFields**](docs/PersonApi.md#getCustomFields) | **GET** /1.0/people/{person_id}/custom_fields | Person custom fields
*PersonApi* | [**getDailyCalendar**](docs/PersonApi.md#getDailyCalendar) | **GET** /1.0/calendar/{person_id}/{year}/{month}/{day} | Daily calendar
*PersonApi* | [**getDetail**](docs/PersonApi.md#getDetail) | **GET** /1.0/people/{person_id}/detail | Person detail
*PersonApi* | [**getEventTypeLimits**](docs/PersonApi.md#getEventTypeLimits) | **GET** /1.0/calendar/{person_id}/events/types/{year}/limits | Event type limits
*PersonApi* | [**getManagerDetails**](docs/PersonApi.md#getManagerDetails) | **GET** /1.0/people/{person_id}/manager | Person manager
*PersonApi* | [**getMonthlyCalendar**](docs/PersonApi.md#getMonthlyCalendar) | **GET** /1.0/calendar/{person_id}/{year}/{month} | Monthly calendar
*PersonApi* | [**getOneOffWageComponentsByMonth**](docs/PersonApi.md#getOneOffWageComponentsByMonth) | **GET** /1.0/wages/one_off/components/{person_id}/{year}/{month}/list | Components by person by month
*PersonApi* | [**getPerformanceReviewsByPerson**](docs/PersonApi.md#getPerformanceReviewsByPerson) | **GET** /1.0/performance_reviews/{person_id}/list | List performance reviews
*PersonApi* | [**getPersonalDataChanges**](docs/PersonApi.md#getPersonalDataChanges) | **GET** /1.0/people/change_history | Personal data audit log
*PersonApi* | [**getVerzuimPeriods**](docs/PersonApi.md#getVerzuimPeriods) | **GET** /1.0/calendar/{person_id}/verzuim/{year} | List verzuim periods
*PersonApi* | [**getWageHistory**](docs/PersonApi.md#getWageHistory) | **GET** /1.0/wages/{person_id}/history | Wage history
*PersonApi* | [**getYearlyCalendar**](docs/PersonApi.md#getYearlyCalendar) | **GET** /1.0/calendar/{person_id}/{year} | Yearly calendar
*PersonApi* | [**listAvailableComponents**](docs/PersonApi.md#listAvailableComponents) | **GET** /1.0/wages/one_off/components/{person_id}/options/list | List available components
*PersonApi* | [**listBudgetItems**](docs/PersonApi.md#listBudgetItems) | **GET** /1.0/budgets/people/{person_id}/{budget_id}/items/list | List budget items
*PersonApi* | [**listDimonasByPerson**](docs/PersonApi.md#listDimonasByPerson) | **GET** /1.0/legal/dimonas/{person_id}/list | List dimonas by person
*PersonApi* | [**listPeople**](docs/PersonApi.md#listPeople) | **GET** /1.0/people/list | List people
*PersonApi* | [**overwriteEvent**](docs/PersonApi.md#overwriteEvent) | **PUT** /1.0/calendar/{person_id}/{year}/{month}/{day}/events/set | Overwrite event
*PersonApi* | [**removeEvent**](docs/PersonApi.md#removeEvent) | **DELETE** /1.0/calendar/{person_id}/events/{event_id} | Delete event
*PersonApi* | [**resetTimeWorked**](docs/PersonApi.md#resetTimeWorked) | **POST** /1.0/calendar/{person_id}/{year}/{month}/{day}/work/reset | Reset time worked
*PersonApi* | [**searchByCriteria**](docs/PersonApi.md#searchByCriteria) | **GET** /1.0/people/search | Search people
*PersonApi* | [**setFunctionDescription**](docs/PersonApi.md#setFunctionDescription) | **PUT** /1.0/people/{person_id}/role | Update role
*PersonApi* | [**updateBulkTimeWorked**](docs/PersonApi.md#updateBulkTimeWorked) | **PATCH** /1.0/calendar/{person_id}/{year}/work/bulk | Update time worked in bulk
*PersonApi* | [**updateEventTypeLimit**](docs/PersonApi.md#updateEventTypeLimit) | **POST** /1.0/calendar/{person_id}/events/types/{year}/limits/{type_id}/set | Set event type limit
*PersonApi* | [**updateManager**](docs/PersonApi.md#updateManager) | **PUT** /1.0/people/{person_id}/manager | Update manager
*PersonApi* | [**updateTimeWorked**](docs/PersonApi.md#updateTimeWorked) | **PATCH** /1.0/calendar/{person_id}/{year}/{month}/{day}/work | Update time worked
*PersonApi* | [**uploadAvatar**](docs/PersonApi.md#uploadAvatar) | **PUT** /1.0/people/{person_id}/photo | Upload avatar
*PersonApi* | [**viewRoleHistory**](docs/PersonApi.md#viewRoleHistory) | **GET** /1.0/roles/{person_id}/history | Role History
*PrioritySchemeApi* | [**listActivePrioritySchemesByYear**](docs/PrioritySchemeApi.md#listActivePrioritySchemesByYear) | **GET** /1.0/calendar/events/priorityschemes/{year} | List priority schemes
*TeamApi* | [**createNewTeam**](docs/TeamApi.md#createNewTeam) | **POST** /1.0/teams/add | Add team
*TeamApi* | [**editInformation**](docs/TeamApi.md#editInformation) | **PATCH** /1.0/teams/{team_id} | Edit team
*TeamApi* | [**getAllTeams**](docs/TeamApi.md#getAllTeams) | **GET** /1.0/teams/list | List teams
*VehicleApi* | [**createNew**](docs/VehicleApi.md#createNew) | **POST** /1.0/fleet/add | Add vehicle
*VehicleApi* | [**editDetails**](docs/VehicleApi.md#editDetails) | **PATCH** /1.0/fleet/{vehicle_id} | Edit vehicle
*VehicleApi* | [**getAllVehicles**](docs/VehicleApi.md#getAllVehicles) | **GET** /1.0/fleet/list | List vehicles
*VehicleApi* | [**getDetail**](docs/VehicleApi.md#getDetail) | **GET** /1.0/fleet/{vehicle_id}/detail | Vehicle detail
*WebhookApi* | [**getActiveNotifications**](docs/WebhookApi.md#getActiveNotifications) | **GET** /1.0/webhooks/list | List webhooks
*WebhookApi* | [**subscribeNotification**](docs/WebhookApi.md#subscribeNotification) | **POST** /1.0/webhooks/add | Add webhook
*WebhookApi* | [**unsubscribeNotification**](docs/WebhookApi.md#unsubscribeNotification) | **DELETE** /1.0/webhooks/{webhook_id} | Delete webhook


## Documentation for Models

 - [AccountGetInformationResponse](docs/AccountGetInformationResponse.md)
 - [AccountGetInformationResponseData](docs/AccountGetInformationResponseData.md)
 - [AssetAddCustomTypeResponse](docs/AssetAddCustomTypeResponse.md)
 - [AssetAddCustomTypeResponseData](docs/AssetAddCustomTypeResponseData.md)
 - [AssetCreateNewAssetResponse](docs/AssetCreateNewAssetResponse.md)
 - [AssetCreateNewAssetResponseData](docs/AssetCreateNewAssetResponseData.md)
 - [AssetGetCustomTypesListResponse](docs/AssetGetCustomTypesListResponse.md)
 - [AssetGetCustomTypesListResponseDataInner](docs/AssetGetCustomTypesListResponseDataInner.md)
 - [AssetGetDetailResponse](docs/AssetGetDetailResponse.md)
 - [AssetGetDetailResponseData](docs/AssetGetDetailResponseData.md)
 - [AssetGetDetailResponseDataCustomFieldsInner](docs/AssetGetDetailResponseDataCustomFieldsInner.md)
 - [AssetGetDetailResponseDataOwner](docs/AssetGetDetailResponseDataOwner.md)
 - [AssetListAssetsResponse](docs/AssetListAssetsResponse.md)
 - [AssetListAssetsResponseDataInner](docs/AssetListAssetsResponseDataInner.md)
 - [AssetListAssetsResponseDataInnerOwner](docs/AssetListAssetsResponseDataInnerOwner.md)
 - [AssetRemoveCustomTypeResponse](docs/AssetRemoveCustomTypeResponse.md)
 - [AssetRemoveResponse](docs/AssetRemoveResponse.md)
 - [AssetUpdateAssetResponse](docs/AssetUpdateAssetResponse.md)
 - [AuthenticationGetAccessTokenRequest](docs/AuthenticationGetAccessTokenRequest.md)
 - [AuthenticationGetAccessTokenResponse](docs/AuthenticationGetAccessTokenResponse.md)
 - [BudgetAddBudgetItemRequest](docs/BudgetAddBudgetItemRequest.md)
 - [BudgetAddBudgetItemResponse](docs/BudgetAddBudgetItemResponse.md)
 - [BudgetAddItemRequest](docs/BudgetAddItemRequest.md)
 - [BudgetAddItemResponse](docs/BudgetAddItemResponse.md)
 - [BudgetDeleteBudgetByIdResponse](docs/BudgetDeleteBudgetByIdResponse.md)
 - [BudgetRemoveItemResponse](docs/BudgetRemoveItemResponse.md)
 - [BudgetUpdateBudgetItemRequest](docs/BudgetUpdateBudgetItemRequest.md)
 - [BudgetUpdateBudgetItemResponse](docs/BudgetUpdateBudgetItemResponse.md)
 - [CalendarStateUnlockMonthProcessedRequest](docs/CalendarStateUnlockMonthProcessedRequest.md)
 - [CalendarStateUnlockMonthProcessedResponse](docs/CalendarStateUnlockMonthProcessedResponse.md)
 - [ComponentGrantOneOffWageResponse](docs/ComponentGrantOneOffWageResponse.md)
 - [ComponentRemoveOneOffWageResponse](docs/ComponentRemoveOneOffWageResponse.md)
 - [ContractCreateNewContractResponse](docs/ContractCreateNewContractResponse.md)
 - [ContractCreateNewContractResponseData](docs/ContractCreateNewContractResponseData.md)
 - [ContractGetAllResponse](docs/ContractGetAllResponse.md)
 - [ContractGetAllResponseDataInner](docs/ContractGetAllResponseDataInner.md)
 - [ContractGetAllResponseDataInnerOwner](docs/ContractGetAllResponseDataInnerOwner.md)
 - [ContractGetPdfLinkResponse](docs/ContractGetPdfLinkResponse.md)
 - [ContractGetPdfLinkResponseData](docs/ContractGetPdfLinkResponseData.md)
 - [ContractRequestSignatureResponse](docs/ContractRequestSignatureResponse.md)
 - [CostCenterDetailGetResponse](docs/CostCenterDetailGetResponse.md)
 - [CostCenterGetListResponseInner](docs/CostCenterGetListResponseInner.md)
 - [CostUnitGetFunctionsDetailResponse](docs/CostUnitGetFunctionsDetailResponse.md)
 - [CostUnitListFunctionsResponseInner](docs/CostUnitListFunctionsResponseInner.md)
 - [CustomEventTypeGetListResponse](docs/CustomEventTypeGetListResponse.md)
 - [CustomEventTypeGetListResponseDataInner](docs/CustomEventTypeGetListResponseDataInner.md)
 - [CustomEventTypeGetListResponseDataInnerIntegrationsInner](docs/CustomEventTypeGetListResponseDataInnerIntegrationsInner.md)
 - [CustomFieldEditValueForObjectResponse](docs/CustomFieldEditValueForObjectResponse.md)
 - [CustomFieldListFieldsResponse](docs/CustomFieldListFieldsResponse.md)
 - [CustomFieldListFieldsResponseDataInner](docs/CustomFieldListFieldsResponseDataInner.md)
 - [DepartmentGetAllDepartmentsResponseInner](docs/DepartmentGetAllDepartmentsResponseInner.md)
 - [DepartmentGetDetailResponse](docs/DepartmentGetDetailResponse.md)
 - [DocumentGetDownloadUrlResponse](docs/DocumentGetDownloadUrlResponse.md)
 - [DocumentGetDownloadUrlResponseData](docs/DocumentGetDownloadUrlResponseData.md)
 - [DocumentRemoveResponse](docs/DocumentRemoveResponse.md)
 - [DocumentUploadDocumentResponse](docs/DocumentUploadDocumentResponse.md)
 - [DocumentUploadDocumentResponseData](docs/DocumentUploadDocumentResponseData.md)
 - [ExpenseAddCategoryRequest](docs/ExpenseAddCategoryRequest.md)
 - [ExpenseAddCategoryResponse](docs/ExpenseAddCategoryResponse.md)
 - [ExpenseAddExpenseWithCategoryRequest](docs/ExpenseAddExpenseWithCategoryRequest.md)
 - [ExpenseAddExpenseWithCategoryResponse](docs/ExpenseAddExpenseWithCategoryResponse.md)
 - [ExpenseDeleteByIdResponse](docs/ExpenseDeleteByIdResponse.md)
 - [ExpenseDeleteCategoryResponse](docs/ExpenseDeleteCategoryResponse.md)
 - [ExpenseEditCategoryNameRequest](docs/ExpenseEditCategoryNameRequest.md)
 - [ExpenseEditCategoryNameResponse](docs/ExpenseEditCategoryNameResponse.md)
 - [ExpenseGetDetailResponse](docs/ExpenseGetDetailResponse.md)
 - [ExpenseGetDetailResponseData](docs/ExpenseGetDetailResponseData.md)
 - [ExpenseListByCategoryDetailResponse](docs/ExpenseListByCategoryDetailResponse.md)
 - [ExpenseListByCategoryDetailResponseData](docs/ExpenseListByCategoryDetailResponseData.md)
 - [ExpenseListByMonthResponse](docs/ExpenseListByMonthResponse.md)
 - [ExpenseListByMonthResponseDataInner](docs/ExpenseListByMonthResponseDataInner.md)
 - [ExpenseListByYearResponse](docs/ExpenseListByYearResponse.md)
 - [ExpenseListByYearResponseDataInner](docs/ExpenseListByYearResponseDataInner.md)
 - [ExpenseSetPayoutMethodAndStatusRequest](docs/ExpenseSetPayoutMethodAndStatusRequest.md)
 - [ExpenseSetPayoutMethodAndStatusResponse](docs/ExpenseSetPayoutMethodAndStatusResponse.md)
 - [ExpenseUpdateDetailsRequest](docs/ExpenseUpdateDetailsRequest.md)
 - [ExpenseUpdateDetailsResponse](docs/ExpenseUpdateDetailsResponse.md)
 - [FunctionGetAllFunctionsResponseInner](docs/FunctionGetAllFunctionsResponseInner.md)
 - [FunctionGetDetailsResponse](docs/FunctionGetDetailsResponse.md)
 - [InvitationGenerateSecretUrlRequest](docs/InvitationGenerateSecretUrlRequest.md)
 - [InvitationGenerateSecretUrlResponse](docs/InvitationGenerateSecretUrlResponse.md)
 - [InvitationGenerateSecretUrlResponseData](docs/InvitationGenerateSecretUrlResponseData.md)
 - [PersonAddNewResponse](docs/PersonAddNewResponse.md)
 - [PersonAddNewResponseData](docs/PersonAddNewResponseData.md)
 - [PersonAddToCalendar200Response](docs/PersonAddToCalendar200Response.md)
 - [PersonAddToCalendar200ResponseEventsInner](docs/PersonAddToCalendar200ResponseEventsInner.md)
 - [PersonAddToCalendarResponse](docs/PersonAddToCalendarResponse.md)
 - [PersonEditDetailResponse](docs/PersonEditDetailResponse.md)
 - [PersonGetBudgetsByYearResponse](docs/PersonGetBudgetsByYearResponse.md)
 - [PersonGetBudgetsByYearResponseDataInner](docs/PersonGetBudgetsByYearResponseDataInner.md)
 - [PersonGetCurrentWageResponse](docs/PersonGetCurrentWageResponse.md)
 - [PersonGetCurrentWageResponseData](docs/PersonGetCurrentWageResponseData.md)
 - [PersonGetCurrentWageResponseDataCustomPayrollData](docs/PersonGetCurrentWageResponseDataCustomPayrollData.md)
 - [PersonGetCurrentWageResponseDataEstimatedMonthlyCost](docs/PersonGetCurrentWageResponseDataEstimatedMonthlyCost.md)
 - [PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents](docs/PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.md)
 - [PersonGetCurrentWageResponseDataEstimatedMonthlyCostCustomComponentsInner](docs/PersonGetCurrentWageResponseDataEstimatedMonthlyCostCustomComponentsInner.md)
 - [PersonGetCurrentWageResponseDataMultipleWeekSchedule](docs/PersonGetCurrentWageResponseDataMultipleWeekSchedule.md)
 - [PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner](docs/PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner.md)
 - [PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInnerWeeklyTimeEngagementMinutes](docs/PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInnerWeeklyTimeEngagementMinutes.md)
 - [PersonGetCurrentWageResponseDataWeeklyTimeEngagementMinutes](docs/PersonGetCurrentWageResponseDataWeeklyTimeEngagementMinutes.md)
 - [PersonGetCustomFieldsResponse](docs/PersonGetCustomFieldsResponse.md)
 - [PersonGetCustomFieldsResponseDataInner](docs/PersonGetCustomFieldsResponseDataInner.md)
 - [PersonGetDailyCalendarResponse](docs/PersonGetDailyCalendarResponse.md)
 - [PersonGetDailyCalendarResponseData](docs/PersonGetDailyCalendarResponseData.md)
 - [PersonGetDailyCalendarResponseDataTimeOffInner](docs/PersonGetDailyCalendarResponseDataTimeOffInner.md)
 - [PersonGetDailyCalendarResponseDataTimeOffInnerEventsInner](docs/PersonGetDailyCalendarResponseDataTimeOffInnerEventsInner.md)
 - [PersonGetDetailResponse](docs/PersonGetDetailResponse.md)
 - [PersonGetDetailResponseData](docs/PersonGetDetailResponseData.md)
 - [PersonGetDetailResponseDataAddress](docs/PersonGetDetailResponseDataAddress.md)
 - [PersonGetDetailResponseDataCurrentReportsTo](docs/PersonGetDetailResponseDataCurrentReportsTo.md)
 - [PersonGetDetailResponseDataCurrentRole](docs/PersonGetDetailResponseDataCurrentRole.md)
 - [PersonGetDetailResponseDataCustomFieldsInner](docs/PersonGetDetailResponseDataCustomFieldsInner.md)
 - [PersonGetDetailResponseDataEmergencyContact](docs/PersonGetDetailResponseDataEmergencyContact.md)
 - [PersonGetDetailResponseDataEmployment](docs/PersonGetDetailResponseDataEmployment.md)
 - [PersonGetDetailResponseDataNameParts](docs/PersonGetDetailResponseDataNameParts.md)
 - [PersonGetDetailResponseDataTeam](docs/PersonGetDetailResponseDataTeam.md)
 - [PersonGetEventTypeLimitsResponse](docs/PersonGetEventTypeLimitsResponse.md)
 - [PersonGetEventTypeLimitsResponseDataInner](docs/PersonGetEventTypeLimitsResponseDataInner.md)
 - [PersonGetManagerDetailsResponse](docs/PersonGetManagerDetailsResponse.md)
 - [PersonGetManagerDetailsResponseData](docs/PersonGetManagerDetailsResponseData.md)
 - [PersonGetMonthlyCalendarResponse](docs/PersonGetMonthlyCalendarResponse.md)
 - [PersonGetMonthlyCalendarResponseData](docs/PersonGetMonthlyCalendarResponseData.md)
 - [PersonGetMonthlyCalendarResponseDataCompanyDaysOffInner](docs/PersonGetMonthlyCalendarResponseDataCompanyDaysOffInner.md)
 - [PersonGetMonthlyCalendarResponseDataTimeOffInner](docs/PersonGetMonthlyCalendarResponseDataTimeOffInner.md)
 - [PersonGetOneOffWageComponentsByMonthResponse](docs/PersonGetOneOffWageComponentsByMonthResponse.md)
 - [PersonGetOneOffWageComponentsByMonthResponseComponentsInner](docs/PersonGetOneOffWageComponentsByMonthResponseComponentsInner.md)
 - [PersonGetOneOffWageComponentsByMonthResponseComponentsInnerParts](docs/PersonGetOneOffWageComponentsByMonthResponseComponentsInnerParts.md)
 - [PersonGetPersonalDataChangesResponse](docs/PersonGetPersonalDataChangesResponse.md)
 - [PersonGetPersonalDataChangesResponseLogsInner](docs/PersonGetPersonalDataChangesResponseLogsInner.md)
 - [PersonGetPersonalDataChangesResponseLogsInnerChangedValues](docs/PersonGetPersonalDataChangesResponseLogsInnerChangedValues.md)
 - [PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressCity](docs/PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressCity.md)
 - [PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressCountryCode](docs/PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressCountryCode.md)
 - [PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1](docs/PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1.md)
 - [PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressZipcode](docs/PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressZipcode.md)
 - [PersonGetVerzuimPeriodsResponse](docs/PersonGetVerzuimPeriodsResponse.md)
 - [PersonGetVerzuimPeriodsResponseDataInnerInner](docs/PersonGetVerzuimPeriodsResponseDataInnerInner.md)
 - [PersonGetWageHistoryResponse](docs/PersonGetWageHistoryResponse.md)
 - [PersonGetWageHistoryResponseDataInner](docs/PersonGetWageHistoryResponseDataInner.md)
 - [PersonGetWageHistoryResponseDataInnerCustomPayrollData](docs/PersonGetWageHistoryResponseDataInnerCustomPayrollData.md)
 - [PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCost](docs/PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCost.md)
 - [PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCostBaseComponents](docs/PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCostBaseComponents.md)
 - [PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCostCustomComponentsInner](docs/PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCostCustomComponentsInner.md)
 - [PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes](docs/PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.md)
 - [PersonGetYearlyCalendarResponse](docs/PersonGetYearlyCalendarResponse.md)
 - [PersonGetYearlyCalendarResponseData](docs/PersonGetYearlyCalendarResponseData.md)
 - [PersonGetYearlyCalendarResponseDataCompanyDaysOffInner](docs/PersonGetYearlyCalendarResponseDataCompanyDaysOffInner.md)
 - [PersonGetYearlyCalendarResponseDataTimeOffInner](docs/PersonGetYearlyCalendarResponseDataTimeOffInner.md)
 - [PersonListAvailableComponentsResponse](docs/PersonListAvailableComponentsResponse.md)
 - [PersonListAvailableComponentsResponseAvailableTypesInner](docs/PersonListAvailableComponentsResponseAvailableTypesInner.md)
 - [PersonListBudgetItemsResponse](docs/PersonListBudgetItemsResponse.md)
 - [PersonListBudgetItemsResponseDataInner](docs/PersonListBudgetItemsResponseDataInner.md)
 - [PersonListDimonasByPersonResponse](docs/PersonListDimonasByPersonResponse.md)
 - [PersonListDimonasByPersonResponseDimonasInner](docs/PersonListDimonasByPersonResponseDimonasInner.md)
 - [PersonListPeopleResponse](docs/PersonListPeopleResponse.md)
 - [PersonListPeopleResponseDataInner](docs/PersonListPeopleResponseDataInner.md)
 - [PersonOverwriteEventResponse](docs/PersonOverwriteEventResponse.md)
 - [PersonRemoveEventResponse](docs/PersonRemoveEventResponse.md)
 - [PersonSearchByCriteriaResponseInner](docs/PersonSearchByCriteriaResponseInner.md)
 - [PersonSetFunctionDescriptionResponse](docs/PersonSetFunctionDescriptionResponse.md)
 - [PersonUpdateEventTypeLimitResponse](docs/PersonUpdateEventTypeLimitResponse.md)
 - [PersonUpdateManagerResponse](docs/PersonUpdateManagerResponse.md)
 - [PersonUpdateTimeWorkedResponse](docs/PersonUpdateTimeWorkedResponse.md)
 - [PersonUploadAvatarResponse](docs/PersonUploadAvatarResponse.md)
 - [PersonViewRoleHistoryResponse](docs/PersonViewRoleHistoryResponse.md)
 - [PersonViewRoleHistoryResponseDataInner](docs/PersonViewRoleHistoryResponseDataInner.md)
 - [PrioritySchemeListActivePrioritySchemesByYearResponse](docs/PrioritySchemeListActivePrioritySchemesByYearResponse.md)
 - [PrioritySchemeListActivePrioritySchemesByYearResponseDataInner](docs/PrioritySchemeListActivePrioritySchemesByYearResponseDataInner.md)
 - [TeamCreateNewTeamResponse](docs/TeamCreateNewTeamResponse.md)
 - [TeamEditInformationResponse](docs/TeamEditInformationResponse.md)
 - [TeamGetAllTeamsResponse](docs/TeamGetAllTeamsResponse.md)
 - [TeamGetAllTeamsResponseDataInner](docs/TeamGetAllTeamsResponseDataInner.md)
 - [VehicleCreateNewResponse](docs/VehicleCreateNewResponse.md)
 - [VehicleCreateNewResponseData](docs/VehicleCreateNewResponseData.md)
 - [VehicleEditDetailsResponse](docs/VehicleEditDetailsResponse.md)
 - [VehicleGetAllVehiclesResponse](docs/VehicleGetAllVehiclesResponse.md)
 - [VehicleGetAllVehiclesResponseDataInner](docs/VehicleGetAllVehiclesResponseDataInner.md)
 - [VehicleGetAllVehiclesResponseDataInnerOwner](docs/VehicleGetAllVehiclesResponseDataInnerOwner.md)
 - [VehicleGetDetailResponse](docs/VehicleGetDetailResponse.md)
 - [VehicleGetDetailResponseData](docs/VehicleGetDetailResponseData.md)
 - [VehicleGetDetailResponseDataCustomFieldsInner](docs/VehicleGetDetailResponseDataCustomFieldsInner.md)
 - [VehicleGetDetailResponseDataOwner](docs/VehicleGetDetailResponseDataOwner.md)
 - [VehicleGetDetailResponseDataYearlyCost](docs/VehicleGetDetailResponseDataYearlyCost.md)
 - [WebhookGetActiveNotificationsResponse](docs/WebhookGetActiveNotificationsResponse.md)
 - [WebhookGetActiveNotificationsResponseDataInner](docs/WebhookGetActiveNotificationsResponseDataInner.md)
 - [WebhookSubscribeNotificationResponse](docs/WebhookSubscribeNotificationResponse.md)
 - [WebhookSubscribeNotificationResponseData](docs/WebhookSubscribeNotificationResponseData.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
