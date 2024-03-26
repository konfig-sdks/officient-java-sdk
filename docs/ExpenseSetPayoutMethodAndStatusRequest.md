

# ExpenseSetPayoutMethodAndStatusRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**newPayoutMethod** | [**NewPayoutMethodEnum**](#NewPayoutMethodEnum) |  |  |
|**payoutOtherReason** | **String** |  |  [optional] |
|**payoutStatus** | [**PayoutStatusEnum**](#PayoutStatusEnum) | This field is required when the \&quot;new\&quot;payout_method\&quot; is either PAYOUT_ACCOUNTING, PAYOUT_OTHER or PAYOUT_MANUALLY |  [optional] |
|**period** | **String** |  |  [optional] |
|**year** | **String** |  |  [optional] |



## Enum: NewPayoutMethodEnum

| Name | Value |
|---- | -----|
| UNDECIDED | &quot;UNDECIDED&quot; |
| DO_NOT_PAYOUT | &quot;DO_NOT_PAYOUT&quot; |
| PAYOUT_ACCOUNTING | &quot;PAYOUT_ACCOUNTING&quot; |
| PAYOUT_OTHER | &quot;PAYOUT_OTHER&quot; |
| PAYOUT_MANUALLY | &quot;PAYOUT_MANUALLY&quot; |
| PAYOUT_USING_PAYROLL_PROVIDER | &quot;PAYOUT_USING_PAYROLL_PROVIDER&quot; |



## Enum: PayoutStatusEnum

| Name | Value |
|---- | -----|
| PAID_OUT | &quot;PAID_OUT&quot; |
| NOT_PAID_OUT | &quot;NOT_PAID_OUT&quot; |



