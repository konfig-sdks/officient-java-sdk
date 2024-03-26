/*
 * Officient API
 * Officient offers an intuitive HRIS which helps manage all personnel administration through our HR platform & personalized employee self-services. Manage payroll, company assets, contracts, days off, fleet, performance reviews and all employee data in one HR system. HR deserves great software and we're here to provide it.  We support our customers in transforming HR towards paperless administration and automating tedious workforce management tasks in the process. Our goal? Transform HR from an administrative, processing role, to a controlling role which fuels HR strategy across the organization.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.PersonGetWageHistoryResponseDataInnerCustomPayrollData;
import com.konfigthis.client.model.PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCost;
import com.konfigthis.client.model.PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * PersonGetWageHistoryResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonGetWageHistoryResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_ESTIMATED_MONTHLY_TOTAL = "estimated_monthly_total";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_MONTHLY_TOTAL)
  private Integer estimatedMonthlyTotal = 0;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Integer rate = 0;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt = 0;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private Integer updatedAt = 0;

  public static final String SERIALIZED_NAME_REGISTRATION_COUNTRY_CODE = "registration_country_code";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_COUNTRY_CODE)
  private String registrationCountryCode;

  public static final String SERIALIZED_NAME_ESTIMATED_MONTHLY_COST = "estimated_monthly_cost";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_MONTHLY_COST)
  private PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCost estimatedMonthlyCost;

  public static final String SERIALIZED_NAME_WEEKLY_TIME_ENGAGEMENT_MINUTES = "weekly_time_engagement_minutes";
  @SerializedName(SERIALIZED_NAME_WEEKLY_TIME_ENGAGEMENT_MINUTES)
  private PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes weeklyTimeEngagementMinutes;

  public static final String SERIALIZED_NAME_CUSTOM_PAYROLL_DATA = "custom_payroll_data";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PAYROLL_DATA)
  private PersonGetWageHistoryResponseDataInnerCustomPayrollData customPayrollData;

  public static final String SERIALIZED_NAME_TERMINATION_REASON = "termination_reason";
  @SerializedName(SERIALIZED_NAME_TERMINATION_REASON)
  private String terminationReason;

  public static final String SERIALIZED_NAME_MULTIPLE_WEEK_SCHEDULE = "multiple_week_schedule";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_WEEK_SCHEDULE)
  private Object multipleWeekSchedule = null;

  public PersonGetWageHistoryResponseDataInner() {
  }

  public PersonGetWageHistoryResponseDataInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "234252342", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public PersonGetWageHistoryResponseDataInner startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-15", value = "")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public PersonGetWageHistoryResponseDataInner endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
  }


  public PersonGetWageHistoryResponseDataInner estimatedMonthlyTotal(Integer estimatedMonthlyTotal) {
    
    
    
    
    this.estimatedMonthlyTotal = estimatedMonthlyTotal;
    return this;
  }

   /**
   * Get estimatedMonthlyTotal
   * @return estimatedMonthlyTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4894", value = "")

  public Integer getEstimatedMonthlyTotal() {
    return estimatedMonthlyTotal;
  }


  public void setEstimatedMonthlyTotal(Integer estimatedMonthlyTotal) {
    
    
    
    this.estimatedMonthlyTotal = estimatedMonthlyTotal;
  }


  public PersonGetWageHistoryResponseDataInner currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EUR", value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public PersonGetWageHistoryResponseDataInner type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "employee_paid_monthly", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public PersonGetWageHistoryResponseDataInner rate(Integer rate) {
    
    
    
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3250", value = "")

  public Integer getRate() {
    return rate;
  }


  public void setRate(Integer rate) {
    
    
    
    this.rate = rate;
  }


  public PersonGetWageHistoryResponseDataInner createdAt(Integer createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1588595358", value = "")

  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public PersonGetWageHistoryResponseDataInner updatedAt(Integer updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1588595358", value = "")

  public Integer getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(Integer updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public PersonGetWageHistoryResponseDataInner registrationCountryCode(String registrationCountryCode) {
    
    
    
    
    this.registrationCountryCode = registrationCountryCode;
    return this;
  }

   /**
   * Get registrationCountryCode
   * @return registrationCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BE", value = "")

  public String getRegistrationCountryCode() {
    return registrationCountryCode;
  }


  public void setRegistrationCountryCode(String registrationCountryCode) {
    
    
    
    this.registrationCountryCode = registrationCountryCode;
  }


  public PersonGetWageHistoryResponseDataInner estimatedMonthlyCost(PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCost estimatedMonthlyCost) {
    
    
    
    
    this.estimatedMonthlyCost = estimatedMonthlyCost;
    return this;
  }

   /**
   * Get estimatedMonthlyCost
   * @return estimatedMonthlyCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCost getEstimatedMonthlyCost() {
    return estimatedMonthlyCost;
  }


  public void setEstimatedMonthlyCost(PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCost estimatedMonthlyCost) {
    
    
    
    this.estimatedMonthlyCost = estimatedMonthlyCost;
  }


  public PersonGetWageHistoryResponseDataInner weeklyTimeEngagementMinutes(PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes weeklyTimeEngagementMinutes) {
    
    
    
    
    this.weeklyTimeEngagementMinutes = weeklyTimeEngagementMinutes;
    return this;
  }

   /**
   * Get weeklyTimeEngagementMinutes
   * @return weeklyTimeEngagementMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes getWeeklyTimeEngagementMinutes() {
    return weeklyTimeEngagementMinutes;
  }


  public void setWeeklyTimeEngagementMinutes(PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes weeklyTimeEngagementMinutes) {
    
    
    
    this.weeklyTimeEngagementMinutes = weeklyTimeEngagementMinutes;
  }


  public PersonGetWageHistoryResponseDataInner customPayrollData(PersonGetWageHistoryResponseDataInnerCustomPayrollData customPayrollData) {
    
    
    
    
    this.customPayrollData = customPayrollData;
    return this;
  }

   /**
   * Get customPayrollData
   * @return customPayrollData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonGetWageHistoryResponseDataInnerCustomPayrollData getCustomPayrollData() {
    return customPayrollData;
  }


  public void setCustomPayrollData(PersonGetWageHistoryResponseDataInnerCustomPayrollData customPayrollData) {
    
    
    
    this.customPayrollData = customPayrollData;
  }


  public PersonGetWageHistoryResponseDataInner terminationReason(String terminationReason) {
    
    
    
    
    this.terminationReason = terminationReason;
    return this;
  }

   /**
   * Get terminationReason
   * @return terminationReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getTerminationReason() {
    return terminationReason;
  }


  public void setTerminationReason(String terminationReason) {
    
    
    
    this.terminationReason = terminationReason;
  }


  public PersonGetWageHistoryResponseDataInner multipleWeekSchedule(Object multipleWeekSchedule) {
    
    
    
    
    this.multipleWeekSchedule = multipleWeekSchedule;
    return this;
  }

   /**
   * Get multipleWeekSchedule
   * @return multipleWeekSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMultipleWeekSchedule() {
    return multipleWeekSchedule;
  }


  public void setMultipleWeekSchedule(Object multipleWeekSchedule) {
    
    
    
    this.multipleWeekSchedule = multipleWeekSchedule;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PersonGetWageHistoryResponseDataInner instance itself
   */
  public PersonGetWageHistoryResponseDataInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonGetWageHistoryResponseDataInner personGetWageHistoryResponseDataInner = (PersonGetWageHistoryResponseDataInner) o;
    return Objects.equals(this.id, personGetWageHistoryResponseDataInner.id) &&
        Objects.equals(this.startDate, personGetWageHistoryResponseDataInner.startDate) &&
        Objects.equals(this.endDate, personGetWageHistoryResponseDataInner.endDate) &&
        Objects.equals(this.estimatedMonthlyTotal, personGetWageHistoryResponseDataInner.estimatedMonthlyTotal) &&
        Objects.equals(this.currency, personGetWageHistoryResponseDataInner.currency) &&
        Objects.equals(this.type, personGetWageHistoryResponseDataInner.type) &&
        Objects.equals(this.rate, personGetWageHistoryResponseDataInner.rate) &&
        Objects.equals(this.createdAt, personGetWageHistoryResponseDataInner.createdAt) &&
        Objects.equals(this.updatedAt, personGetWageHistoryResponseDataInner.updatedAt) &&
        Objects.equals(this.registrationCountryCode, personGetWageHistoryResponseDataInner.registrationCountryCode) &&
        Objects.equals(this.estimatedMonthlyCost, personGetWageHistoryResponseDataInner.estimatedMonthlyCost) &&
        Objects.equals(this.weeklyTimeEngagementMinutes, personGetWageHistoryResponseDataInner.weeklyTimeEngagementMinutes) &&
        Objects.equals(this.customPayrollData, personGetWageHistoryResponseDataInner.customPayrollData) &&
        Objects.equals(this.terminationReason, personGetWageHistoryResponseDataInner.terminationReason) &&
        Objects.equals(this.multipleWeekSchedule, personGetWageHistoryResponseDataInner.multipleWeekSchedule)&&
        Objects.equals(this.additionalProperties, personGetWageHistoryResponseDataInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, endDate, estimatedMonthlyTotal, currency, type, rate, createdAt, updatedAt, registrationCountryCode, estimatedMonthlyCost, weeklyTimeEngagementMinutes, customPayrollData, terminationReason, multipleWeekSchedule, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonGetWageHistoryResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    estimatedMonthlyTotal: ").append(toIndentedString(estimatedMonthlyTotal)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    registrationCountryCode: ").append(toIndentedString(registrationCountryCode)).append("\n");
    sb.append("    estimatedMonthlyCost: ").append(toIndentedString(estimatedMonthlyCost)).append("\n");
    sb.append("    weeklyTimeEngagementMinutes: ").append(toIndentedString(weeklyTimeEngagementMinutes)).append("\n");
    sb.append("    customPayrollData: ").append(toIndentedString(customPayrollData)).append("\n");
    sb.append("    terminationReason: ").append(toIndentedString(terminationReason)).append("\n");
    sb.append("    multipleWeekSchedule: ").append(toIndentedString(multipleWeekSchedule)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("estimated_monthly_total");
    openapiFields.add("currency");
    openapiFields.add("type");
    openapiFields.add("rate");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("registration_country_code");
    openapiFields.add("estimated_monthly_cost");
    openapiFields.add("weekly_time_engagement_minutes");
    openapiFields.add("custom_payroll_data");
    openapiFields.add("termination_reason");
    openapiFields.add("multiple_week_schedule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonGetWageHistoryResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonGetWageHistoryResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonGetWageHistoryResponseDataInner is not found in the empty JSON string", PersonGetWageHistoryResponseDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("registration_country_code") != null && !jsonObj.get("registration_country_code").isJsonNull()) && !jsonObj.get("registration_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_country_code").toString()));
      }
      // validate the optional field `estimated_monthly_cost`
      if (jsonObj.get("estimated_monthly_cost") != null && !jsonObj.get("estimated_monthly_cost").isJsonNull()) {
        PersonGetWageHistoryResponseDataInnerEstimatedMonthlyCost.validateJsonObject(jsonObj.getAsJsonObject("estimated_monthly_cost"));
      }
      // validate the optional field `weekly_time_engagement_minutes`
      if (jsonObj.get("weekly_time_engagement_minutes") != null && !jsonObj.get("weekly_time_engagement_minutes").isJsonNull()) {
        PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.validateJsonObject(jsonObj.getAsJsonObject("weekly_time_engagement_minutes"));
      }
      // validate the optional field `custom_payroll_data`
      if (jsonObj.get("custom_payroll_data") != null && !jsonObj.get("custom_payroll_data").isJsonNull()) {
        PersonGetWageHistoryResponseDataInnerCustomPayrollData.validateJsonObject(jsonObj.getAsJsonObject("custom_payroll_data"));
      }
      if ((jsonObj.get("termination_reason") != null && !jsonObj.get("termination_reason").isJsonNull()) && !jsonObj.get("termination_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `termination_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("termination_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonGetWageHistoryResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonGetWageHistoryResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonGetWageHistoryResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonGetWageHistoryResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonGetWageHistoryResponseDataInner>() {
           @Override
           public void write(JsonWriter out, PersonGetWageHistoryResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonGetWageHistoryResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonGetWageHistoryResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonGetWageHistoryResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonGetWageHistoryResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to PersonGetWageHistoryResponseDataInner
  */
  public static PersonGetWageHistoryResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonGetWageHistoryResponseDataInner.class);
  }

 /**
  * Convert an instance of PersonGetWageHistoryResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

