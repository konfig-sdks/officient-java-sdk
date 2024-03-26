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
 * ExpenseListByYearResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExpenseListByYearResponseDataInner {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private Integer employeeId = 0;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_TIME_CREATED = "time_created";
  @SerializedName(SERIALIZED_NAME_TIME_CREATED)
  private Integer timeCreated = 0;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_PAYOUT_METHOD = "payout_method";
  @SerializedName(SERIALIZED_NAME_PAYOUT_METHOD)
  private String payoutMethod;

  public static final String SERIALIZED_NAME_PAYOUT_PERIOD = "payout_period";
  @SerializedName(SERIALIZED_NAME_PAYOUT_PERIOD)
  private Object payoutPeriod = null;

  public static final String SERIALIZED_NAME_PAYOUT_PERIOD_FREQUENCY = "payout_period_frequency";
  @SerializedName(SERIALIZED_NAME_PAYOUT_PERIOD_FREQUENCY)
  private Object payoutPeriodFrequency = null;

  public static final String SERIALIZED_NAME_PAYOUT_YEAR = "payout_year";
  @SerializedName(SERIALIZED_NAME_PAYOUT_YEAR)
  private Object payoutYear = null;

  public static final String SERIALIZED_NAME_EXPENSE_CATEGORY_ID = "expense_category_id";
  @SerializedName(SERIALIZED_NAME_EXPENSE_CATEGORY_ID)
  private Integer expenseCategoryId = 0;

  public static final String SERIALIZED_NAME_PRICE_PER_KILOMETER = "price_per_kilometer";
  @SerializedName(SERIALIZED_NAME_PRICE_PER_KILOMETER)
  private Object pricePerKilometer = null;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private Object distance = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_DATES = "dates";
  @SerializedName(SERIALIZED_NAME_DATES)
  private Object dates = null;

  public static final String SERIALIZED_NAME_DATE_APPROVED = "date_approved";
  @SerializedName(SERIALIZED_NAME_DATE_APPROVED)
  private Object dateApproved = null;

  public static final String SERIALIZED_NAME_PAYOUT_OTHER_REASON = "payout_other_reason";
  @SerializedName(SERIALIZED_NAME_PAYOUT_OTHER_REASON)
  private String payoutOtherReason;

  public static final String SERIALIZED_NAME_PAYOUT_STATUS = "payout_status";
  @SerializedName(SERIALIZED_NAME_PAYOUT_STATUS)
  private String payoutStatus;

  public ExpenseListByYearResponseDataInner() {
  }

  public ExpenseListByYearResponseDataInner title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Expense 1", value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ExpenseListByYearResponseDataInner description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some extra information", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ExpenseListByYearResponseDataInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public ExpenseListByYearResponseDataInner employeeId(Integer employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21312", value = "")

  public Integer getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(Integer employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public ExpenseListByYearResponseDataInner date(String date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-07-08", value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    
    
    
    this.date = date;
  }


  public ExpenseListByYearResponseDataInner timeCreated(Integer timeCreated) {
    
    
    
    
    this.timeCreated = timeCreated;
    return this;
  }

   /**
   * Get timeCreated
   * @return timeCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1618498412", value = "")

  public Integer getTimeCreated() {
    return timeCreated;
  }


  public void setTimeCreated(Integer timeCreated) {
    
    
    
    this.timeCreated = timeCreated;
  }


  public ExpenseListByYearResponseDataInner status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "approved", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public ExpenseListByYearResponseDataInner price(String price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35.00", value = "")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    
    
    
    this.price = price;
  }


  public ExpenseListByYearResponseDataInner payoutMethod(String payoutMethod) {
    
    
    
    
    this.payoutMethod = payoutMethod;
    return this;
  }

   /**
   * Get payoutMethod
   * @return payoutMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UNDECIDED", value = "")

  public String getPayoutMethod() {
    return payoutMethod;
  }


  public void setPayoutMethod(String payoutMethod) {
    
    
    
    this.payoutMethod = payoutMethod;
  }


  public ExpenseListByYearResponseDataInner payoutPeriod(Object payoutPeriod) {
    
    
    
    
    this.payoutPeriod = payoutPeriod;
    return this;
  }

   /**
   * Get payoutPeriod
   * @return payoutPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPayoutPeriod() {
    return payoutPeriod;
  }


  public void setPayoutPeriod(Object payoutPeriod) {
    
    
    
    this.payoutPeriod = payoutPeriod;
  }


  public ExpenseListByYearResponseDataInner payoutPeriodFrequency(Object payoutPeriodFrequency) {
    
    
    
    
    this.payoutPeriodFrequency = payoutPeriodFrequency;
    return this;
  }

   /**
   * Get payoutPeriodFrequency
   * @return payoutPeriodFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPayoutPeriodFrequency() {
    return payoutPeriodFrequency;
  }


  public void setPayoutPeriodFrequency(Object payoutPeriodFrequency) {
    
    
    
    this.payoutPeriodFrequency = payoutPeriodFrequency;
  }


  public ExpenseListByYearResponseDataInner payoutYear(Object payoutYear) {
    
    
    
    
    this.payoutYear = payoutYear;
    return this;
  }

   /**
   * Get payoutYear
   * @return payoutYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPayoutYear() {
    return payoutYear;
  }


  public void setPayoutYear(Object payoutYear) {
    
    
    
    this.payoutYear = payoutYear;
  }


  public ExpenseListByYearResponseDataInner expenseCategoryId(Integer expenseCategoryId) {
    
    
    
    
    this.expenseCategoryId = expenseCategoryId;
    return this;
  }

   /**
   * Get expenseCategoryId
   * @return expenseCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getExpenseCategoryId() {
    return expenseCategoryId;
  }


  public void setExpenseCategoryId(Integer expenseCategoryId) {
    
    
    
    this.expenseCategoryId = expenseCategoryId;
  }


  public ExpenseListByYearResponseDataInner pricePerKilometer(Object pricePerKilometer) {
    
    
    
    
    this.pricePerKilometer = pricePerKilometer;
    return this;
  }

   /**
   * Get pricePerKilometer
   * @return pricePerKilometer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPricePerKilometer() {
    return pricePerKilometer;
  }


  public void setPricePerKilometer(Object pricePerKilometer) {
    
    
    
    this.pricePerKilometer = pricePerKilometer;
  }


  public ExpenseListByYearResponseDataInner distance(Object distance) {
    
    
    
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDistance() {
    return distance;
  }


  public void setDistance(Object distance) {
    
    
    
    this.distance = distance;
  }


  public ExpenseListByYearResponseDataInner metadata(Object metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    
    
    
    this.metadata = metadata;
  }


  public ExpenseListByYearResponseDataInner dates(Object dates) {
    
    
    
    
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDates() {
    return dates;
  }


  public void setDates(Object dates) {
    
    
    
    this.dates = dates;
  }


  public ExpenseListByYearResponseDataInner dateApproved(Object dateApproved) {
    
    
    
    
    this.dateApproved = dateApproved;
    return this;
  }

   /**
   * Get dateApproved
   * @return dateApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDateApproved() {
    return dateApproved;
  }


  public void setDateApproved(Object dateApproved) {
    
    
    
    this.dateApproved = dateApproved;
  }


  public ExpenseListByYearResponseDataInner payoutOtherReason(String payoutOtherReason) {
    
    
    
    
    this.payoutOtherReason = payoutOtherReason;
    return this;
  }

   /**
   * Get payoutOtherReason
   * @return payoutOtherReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getPayoutOtherReason() {
    return payoutOtherReason;
  }


  public void setPayoutOtherReason(String payoutOtherReason) {
    
    
    
    this.payoutOtherReason = payoutOtherReason;
  }


  public ExpenseListByYearResponseDataInner payoutStatus(String payoutStatus) {
    
    
    
    
    this.payoutStatus = payoutStatus;
    return this;
  }

   /**
   * Get payoutStatus
   * @return payoutStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getPayoutStatus() {
    return payoutStatus;
  }


  public void setPayoutStatus(String payoutStatus) {
    
    
    
    this.payoutStatus = payoutStatus;
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
   * @return the ExpenseListByYearResponseDataInner instance itself
   */
  public ExpenseListByYearResponseDataInner putAdditionalProperty(String key, Object value) {
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
    ExpenseListByYearResponseDataInner expenseListByYearResponseDataInner = (ExpenseListByYearResponseDataInner) o;
    return Objects.equals(this.title, expenseListByYearResponseDataInner.title) &&
        Objects.equals(this.description, expenseListByYearResponseDataInner.description) &&
        Objects.equals(this.id, expenseListByYearResponseDataInner.id) &&
        Objects.equals(this.employeeId, expenseListByYearResponseDataInner.employeeId) &&
        Objects.equals(this.date, expenseListByYearResponseDataInner.date) &&
        Objects.equals(this.timeCreated, expenseListByYearResponseDataInner.timeCreated) &&
        Objects.equals(this.status, expenseListByYearResponseDataInner.status) &&
        Objects.equals(this.price, expenseListByYearResponseDataInner.price) &&
        Objects.equals(this.payoutMethod, expenseListByYearResponseDataInner.payoutMethod) &&
        Objects.equals(this.payoutPeriod, expenseListByYearResponseDataInner.payoutPeriod) &&
        Objects.equals(this.payoutPeriodFrequency, expenseListByYearResponseDataInner.payoutPeriodFrequency) &&
        Objects.equals(this.payoutYear, expenseListByYearResponseDataInner.payoutYear) &&
        Objects.equals(this.expenseCategoryId, expenseListByYearResponseDataInner.expenseCategoryId) &&
        Objects.equals(this.pricePerKilometer, expenseListByYearResponseDataInner.pricePerKilometer) &&
        Objects.equals(this.distance, expenseListByYearResponseDataInner.distance) &&
        Objects.equals(this.metadata, expenseListByYearResponseDataInner.metadata) &&
        Objects.equals(this.dates, expenseListByYearResponseDataInner.dates) &&
        Objects.equals(this.dateApproved, expenseListByYearResponseDataInner.dateApproved) &&
        Objects.equals(this.payoutOtherReason, expenseListByYearResponseDataInner.payoutOtherReason) &&
        Objects.equals(this.payoutStatus, expenseListByYearResponseDataInner.payoutStatus)&&
        Objects.equals(this.additionalProperties, expenseListByYearResponseDataInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, id, employeeId, date, timeCreated, status, price, payoutMethod, payoutPeriod, payoutPeriodFrequency, payoutYear, expenseCategoryId, pricePerKilometer, distance, metadata, dates, dateApproved, payoutOtherReason, payoutStatus, additionalProperties);
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
    sb.append("class ExpenseListByYearResponseDataInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    timeCreated: ").append(toIndentedString(timeCreated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    payoutMethod: ").append(toIndentedString(payoutMethod)).append("\n");
    sb.append("    payoutPeriod: ").append(toIndentedString(payoutPeriod)).append("\n");
    sb.append("    payoutPeriodFrequency: ").append(toIndentedString(payoutPeriodFrequency)).append("\n");
    sb.append("    payoutYear: ").append(toIndentedString(payoutYear)).append("\n");
    sb.append("    expenseCategoryId: ").append(toIndentedString(expenseCategoryId)).append("\n");
    sb.append("    pricePerKilometer: ").append(toIndentedString(pricePerKilometer)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    dateApproved: ").append(toIndentedString(dateApproved)).append("\n");
    sb.append("    payoutOtherReason: ").append(toIndentedString(payoutOtherReason)).append("\n");
    sb.append("    payoutStatus: ").append(toIndentedString(payoutStatus)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("employee_id");
    openapiFields.add("date");
    openapiFields.add("time_created");
    openapiFields.add("status");
    openapiFields.add("price");
    openapiFields.add("payout_method");
    openapiFields.add("payout_period");
    openapiFields.add("payout_period_frequency");
    openapiFields.add("payout_year");
    openapiFields.add("expense_category_id");
    openapiFields.add("price_per_kilometer");
    openapiFields.add("distance");
    openapiFields.add("metadata");
    openapiFields.add("dates");
    openapiFields.add("date_approved");
    openapiFields.add("payout_other_reason");
    openapiFields.add("payout_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseListByYearResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExpenseListByYearResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseListByYearResponseDataInner is not found in the empty JSON string", ExpenseListByYearResponseDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if ((jsonObj.get("payout_method") != null && !jsonObj.get("payout_method").isJsonNull()) && !jsonObj.get("payout_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payout_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payout_method").toString()));
      }
      if ((jsonObj.get("payout_other_reason") != null && !jsonObj.get("payout_other_reason").isJsonNull()) && !jsonObj.get("payout_other_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payout_other_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payout_other_reason").toString()));
      }
      if ((jsonObj.get("payout_status") != null && !jsonObj.get("payout_status").isJsonNull()) && !jsonObj.get("payout_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payout_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payout_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseListByYearResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseListByYearResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseListByYearResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseListByYearResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseListByYearResponseDataInner>() {
           @Override
           public void write(JsonWriter out, ExpenseListByYearResponseDataInner value) throws IOException {
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
           public ExpenseListByYearResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExpenseListByYearResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExpenseListByYearResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseListByYearResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to ExpenseListByYearResponseDataInner
  */
  public static ExpenseListByYearResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseListByYearResponseDataInner.class);
  }

 /**
  * Convert an instance of ExpenseListByYearResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

