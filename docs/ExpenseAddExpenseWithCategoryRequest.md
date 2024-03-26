

# ExpenseAddExpenseWithCategoryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | This is the title for the expense |  |
|**employeeId** | **Integer** |  |  |
|**categoryId** | **Integer** | For some integrations this is required not to be 0 which is the default category id |  |
|**amount** | **Float** | this is the price of the expense, this is only required when using a total amount category |  [optional] |
|**extraInformation** | **String** |  |  [optional] |
|**date** | **String** | this is the day the expense has incurred on and is required when it is a total amount category |  [optional] |
|**filename** | **String** | this is required when you want to add an expense with a total amount category |  [optional] |
|**fileBase64** | **String** | this is required when you want to add an expense with a total amount category |  [optional] |
|**dates** | **List&lt;String&gt;** | this is required when you want to add an expense with a kilometer or day allowance expense category, multiple dates are also possible (ex: [\&quot;24/05/2023\&quot;, \&quot;26/05/2023\&quot;]) |  [optional] |
|**distance** | **Integer** | this is required when you want to update to a killometer allowance expense category. This is equal to the total amount of kilometers that has been done |  [optional] |
|**ride** | [**RideEnum**](#RideEnum) | this is the value if it&#39;s an outward or a round journey when using kilometer allowances, this defaults to single |  [optional] |



## Enum: RideEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| DOUBLE | &quot;double&quot; |



