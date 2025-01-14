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
 * ExpenseGetDetailResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExpenseGetDetailResponseData {
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

  public static final String SERIALIZED_NAME_FILE_ID = "file_id";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private Integer fileId = 0;

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

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private Object filename = null;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId = 0;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_CATEGORY_WAY_OF_INPUT = "category_way_of_input";
  @SerializedName(SERIALIZED_NAME_CATEGORY_WAY_OF_INPUT)
  private String categoryWayOfInput;

  public static final String SERIALIZED_NAME_PRICE_PER_KILOMETER = "price_per_kilometer";
  @SerializedName(SERIALIZED_NAME_PRICE_PER_KILOMETER)
  private String pricePerKilometer;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private String distance;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private Object requestId = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_DATES = "dates";
  @SerializedName(SERIALIZED_NAME_DATES)
  private String dates;

  public static final String SERIALIZED_NAME_DATE_APPROVED = "date_approved";
  @SerializedName(SERIALIZED_NAME_DATE_APPROVED)
  private String dateApproved;

  public static final String SERIALIZED_NAME_PAYOUT_OTHER_REASON = "payout_other_reason";
  @SerializedName(SERIALIZED_NAME_PAYOUT_OTHER_REASON)
  private String payoutOtherReason;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Integer deleted = 0;

  public static final String SERIALIZED_NAME_PAYOUT_STATUS = "payout_status";
  @SerializedName(SERIALIZED_NAME_PAYOUT_STATUS)
  private String payoutStatus;

  public static final String SERIALIZED_NAME_DATE_CREATED_DMY = "date_created_dmy";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED_DMY)
  private String dateCreatedDmy;

  public ExpenseGetDetailResponseData() {
  }

  public ExpenseGetDetailResponseData title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "zonder amount", value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ExpenseGetDetailResponseData description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ExpenseGetDetailResponseData id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "77", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public ExpenseGetDetailResponseData employeeId(Integer employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21310", value = "")

  public Integer getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(Integer employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public ExpenseGetDetailResponseData date(String date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-06-09", value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    
    
    
    this.date = date;
  }


  public ExpenseGetDetailResponseData timeCreated(Integer timeCreated) {
    
    
    
    
    this.timeCreated = timeCreated;
    return this;
  }

   /**
   * Get timeCreated
   * @return timeCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1686300546", value = "")

  public Integer getTimeCreated() {
    return timeCreated;
  }


  public void setTimeCreated(Integer timeCreated) {
    
    
    
    this.timeCreated = timeCreated;
  }


  public ExpenseGetDetailResponseData status(String status) {
    
    
    
    
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


  public ExpenseGetDetailResponseData price(String price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.00", value = "")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    
    
    
    this.price = price;
  }


  public ExpenseGetDetailResponseData fileId(Integer fileId) {
    
    
    
    
    this.fileId = fileId;
    return this;
  }

   /**
   * Get fileId
   * @return fileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-1", value = "")

  public Integer getFileId() {
    return fileId;
  }


  public void setFileId(Integer fileId) {
    
    
    
    this.fileId = fileId;
  }


  public ExpenseGetDetailResponseData payoutMethod(String payoutMethod) {
    
    
    
    
    this.payoutMethod = payoutMethod;
    return this;
  }

   /**
   * Get payoutMethod
   * @return payoutMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getPayoutMethod() {
    return payoutMethod;
  }


  public void setPayoutMethod(String payoutMethod) {
    
    
    
    this.payoutMethod = payoutMethod;
  }


  public ExpenseGetDetailResponseData payoutPeriod(Object payoutPeriod) {
    
    
    
    
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


  public ExpenseGetDetailResponseData payoutPeriodFrequency(Object payoutPeriodFrequency) {
    
    
    
    
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


  public ExpenseGetDetailResponseData payoutYear(Object payoutYear) {
    
    
    
    
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


  public ExpenseGetDetailResponseData expenseCategoryId(Integer expenseCategoryId) {
    
    
    
    
    this.expenseCategoryId = expenseCategoryId;
    return this;
  }

   /**
   * Get expenseCategoryId
   * @return expenseCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getExpenseCategoryId() {
    return expenseCategoryId;
  }


  public void setExpenseCategoryId(Integer expenseCategoryId) {
    
    
    
    this.expenseCategoryId = expenseCategoryId;
  }


  public ExpenseGetDetailResponseData filename(Object filename) {
    
    
    
    
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFilename() {
    return filename;
  }


  public void setFilename(Object filename) {
    
    
    
    this.filename = filename;
  }


  public ExpenseGetDetailResponseData categoryId(Integer categoryId) {
    
    
    
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Integer categoryId) {
    
    
    
    this.categoryId = categoryId;
  }


  public ExpenseGetDetailResponseData categoryName(String categoryName) {
    
    
    
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "we", value = "")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    
    
    
    this.categoryName = categoryName;
  }


  public ExpenseGetDetailResponseData categoryWayOfInput(String categoryWayOfInput) {
    
    
    
    
    this.categoryWayOfInput = categoryWayOfInput;
    return this;
  }

   /**
   * Get categoryWayOfInput
   * @return categoryWayOfInput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "kilometer-allowance", value = "")

  public String getCategoryWayOfInput() {
    return categoryWayOfInput;
  }


  public void setCategoryWayOfInput(String categoryWayOfInput) {
    
    
    
    this.categoryWayOfInput = categoryWayOfInput;
  }


  public ExpenseGetDetailResponseData pricePerKilometer(String pricePerKilometer) {
    
    
    
    
    this.pricePerKilometer = pricePerKilometer;
    return this;
  }

   /**
   * Get pricePerKilometer
   * @return pricePerKilometer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.2000", value = "")

  public String getPricePerKilometer() {
    return pricePerKilometer;
  }


  public void setPricePerKilometer(String pricePerKilometer) {
    
    
    
    this.pricePerKilometer = pricePerKilometer;
  }


  public ExpenseGetDetailResponseData distance(String distance) {
    
    
    
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "")

  public String getDistance() {
    return distance;
  }


  public void setDistance(String distance) {
    
    
    
    this.distance = distance;
  }


  public ExpenseGetDetailResponseData requestId(Object requestId) {
    
    
    
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRequestId() {
    return requestId;
  }


  public void setRequestId(Object requestId) {
    
    
    
    this.requestId = requestId;
  }


  public ExpenseGetDetailResponseData metadata(String metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"{\\\"startLocation\\\":{\\\"description\\\":\\\"\\\",\\\"place_id\\\":0},\\\"endLocation\\\":null,\\\"suggestedDistance\\\":0,\\\"kindOfRide\\\":\\\"double\\\"}\"", value = "")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    
    
    
    this.metadata = metadata;
  }


  public ExpenseGetDetailResponseData dates(String dates) {
    
    
    
    
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"12/06/2023\"]", value = "")

  public String getDates() {
    return dates;
  }


  public void setDates(String dates) {
    
    
    
    this.dates = dates;
  }


  public ExpenseGetDetailResponseData dateApproved(String dateApproved) {
    
    
    
    
    this.dateApproved = dateApproved;
    return this;
  }

   /**
   * Get dateApproved
   * @return dateApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-06-09", value = "")

  public String getDateApproved() {
    return dateApproved;
  }


  public void setDateApproved(String dateApproved) {
    
    
    
    this.dateApproved = dateApproved;
  }


  public ExpenseGetDetailResponseData payoutOtherReason(String payoutOtherReason) {
    
    
    
    
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


  public ExpenseGetDetailResponseData deleted(Integer deleted) {
    
    
    
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getDeleted() {
    return deleted;
  }


  public void setDeleted(Integer deleted) {
    
    
    
    this.deleted = deleted;
  }


  public ExpenseGetDetailResponseData payoutStatus(String payoutStatus) {
    
    
    
    
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


  public ExpenseGetDetailResponseData dateCreatedDmy(String dateCreatedDmy) {
    
    
    
    
    this.dateCreatedDmy = dateCreatedDmy;
    return this;
  }

   /**
   * Get dateCreatedDmy
   * @return dateCreatedDmy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "09/06/2023", value = "")

  public String getDateCreatedDmy() {
    return dateCreatedDmy;
  }


  public void setDateCreatedDmy(String dateCreatedDmy) {
    
    
    
    this.dateCreatedDmy = dateCreatedDmy;
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
   * @return the ExpenseGetDetailResponseData instance itself
   */
  public ExpenseGetDetailResponseData putAdditionalProperty(String key, Object value) {
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
    ExpenseGetDetailResponseData expenseGetDetailResponseData = (ExpenseGetDetailResponseData) o;
    return Objects.equals(this.title, expenseGetDetailResponseData.title) &&
        Objects.equals(this.description, expenseGetDetailResponseData.description) &&
        Objects.equals(this.id, expenseGetDetailResponseData.id) &&
        Objects.equals(this.employeeId, expenseGetDetailResponseData.employeeId) &&
        Objects.equals(this.date, expenseGetDetailResponseData.date) &&
        Objects.equals(this.timeCreated, expenseGetDetailResponseData.timeCreated) &&
        Objects.equals(this.status, expenseGetDetailResponseData.status) &&
        Objects.equals(this.price, expenseGetDetailResponseData.price) &&
        Objects.equals(this.fileId, expenseGetDetailResponseData.fileId) &&
        Objects.equals(this.payoutMethod, expenseGetDetailResponseData.payoutMethod) &&
        Objects.equals(this.payoutPeriod, expenseGetDetailResponseData.payoutPeriod) &&
        Objects.equals(this.payoutPeriodFrequency, expenseGetDetailResponseData.payoutPeriodFrequency) &&
        Objects.equals(this.payoutYear, expenseGetDetailResponseData.payoutYear) &&
        Objects.equals(this.expenseCategoryId, expenseGetDetailResponseData.expenseCategoryId) &&
        Objects.equals(this.filename, expenseGetDetailResponseData.filename) &&
        Objects.equals(this.categoryId, expenseGetDetailResponseData.categoryId) &&
        Objects.equals(this.categoryName, expenseGetDetailResponseData.categoryName) &&
        Objects.equals(this.categoryWayOfInput, expenseGetDetailResponseData.categoryWayOfInput) &&
        Objects.equals(this.pricePerKilometer, expenseGetDetailResponseData.pricePerKilometer) &&
        Objects.equals(this.distance, expenseGetDetailResponseData.distance) &&
        Objects.equals(this.requestId, expenseGetDetailResponseData.requestId) &&
        Objects.equals(this.metadata, expenseGetDetailResponseData.metadata) &&
        Objects.equals(this.dates, expenseGetDetailResponseData.dates) &&
        Objects.equals(this.dateApproved, expenseGetDetailResponseData.dateApproved) &&
        Objects.equals(this.payoutOtherReason, expenseGetDetailResponseData.payoutOtherReason) &&
        Objects.equals(this.deleted, expenseGetDetailResponseData.deleted) &&
        Objects.equals(this.payoutStatus, expenseGetDetailResponseData.payoutStatus) &&
        Objects.equals(this.dateCreatedDmy, expenseGetDetailResponseData.dateCreatedDmy)&&
        Objects.equals(this.additionalProperties, expenseGetDetailResponseData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, id, employeeId, date, timeCreated, status, price, fileId, payoutMethod, payoutPeriod, payoutPeriodFrequency, payoutYear, expenseCategoryId, filename, categoryId, categoryName, categoryWayOfInput, pricePerKilometer, distance, requestId, metadata, dates, dateApproved, payoutOtherReason, deleted, payoutStatus, dateCreatedDmy, additionalProperties);
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
    sb.append("class ExpenseGetDetailResponseData {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    timeCreated: ").append(toIndentedString(timeCreated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    payoutMethod: ").append(toIndentedString(payoutMethod)).append("\n");
    sb.append("    payoutPeriod: ").append(toIndentedString(payoutPeriod)).append("\n");
    sb.append("    payoutPeriodFrequency: ").append(toIndentedString(payoutPeriodFrequency)).append("\n");
    sb.append("    payoutYear: ").append(toIndentedString(payoutYear)).append("\n");
    sb.append("    expenseCategoryId: ").append(toIndentedString(expenseCategoryId)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    categoryWayOfInput: ").append(toIndentedString(categoryWayOfInput)).append("\n");
    sb.append("    pricePerKilometer: ").append(toIndentedString(pricePerKilometer)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    dateApproved: ").append(toIndentedString(dateApproved)).append("\n");
    sb.append("    payoutOtherReason: ").append(toIndentedString(payoutOtherReason)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    payoutStatus: ").append(toIndentedString(payoutStatus)).append("\n");
    sb.append("    dateCreatedDmy: ").append(toIndentedString(dateCreatedDmy)).append("\n");
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
    openapiFields.add("file_id");
    openapiFields.add("payout_method");
    openapiFields.add("payout_period");
    openapiFields.add("payout_period_frequency");
    openapiFields.add("payout_year");
    openapiFields.add("expense_category_id");
    openapiFields.add("filename");
    openapiFields.add("category_id");
    openapiFields.add("category_name");
    openapiFields.add("category_way_of_input");
    openapiFields.add("price_per_kilometer");
    openapiFields.add("distance");
    openapiFields.add("request_id");
    openapiFields.add("metadata");
    openapiFields.add("dates");
    openapiFields.add("date_approved");
    openapiFields.add("payout_other_reason");
    openapiFields.add("deleted");
    openapiFields.add("payout_status");
    openapiFields.add("date_created_dmy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseGetDetailResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExpenseGetDetailResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseGetDetailResponseData is not found in the empty JSON string", ExpenseGetDetailResponseData.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("category_name") != null && !jsonObj.get("category_name").isJsonNull()) && !jsonObj.get("category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_name").toString()));
      }
      if ((jsonObj.get("category_way_of_input") != null && !jsonObj.get("category_way_of_input").isJsonNull()) && !jsonObj.get("category_way_of_input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_way_of_input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_way_of_input").toString()));
      }
      if ((jsonObj.get("price_per_kilometer") != null && !jsonObj.get("price_per_kilometer").isJsonNull()) && !jsonObj.get("price_per_kilometer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_per_kilometer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price_per_kilometer").toString()));
      }
      if ((jsonObj.get("distance") != null && !jsonObj.get("distance").isJsonNull()) && !jsonObj.get("distance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distance").toString()));
      }
      if ((jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if ((jsonObj.get("dates") != null && !jsonObj.get("dates").isJsonNull()) && !jsonObj.get("dates").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dates` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dates").toString()));
      }
      if ((jsonObj.get("date_approved") != null && !jsonObj.get("date_approved").isJsonNull()) && !jsonObj.get("date_approved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_approved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_approved").toString()));
      }
      if ((jsonObj.get("payout_other_reason") != null && !jsonObj.get("payout_other_reason").isJsonNull()) && !jsonObj.get("payout_other_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payout_other_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payout_other_reason").toString()));
      }
      if ((jsonObj.get("payout_status") != null && !jsonObj.get("payout_status").isJsonNull()) && !jsonObj.get("payout_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payout_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payout_status").toString()));
      }
      if ((jsonObj.get("date_created_dmy") != null && !jsonObj.get("date_created_dmy").isJsonNull()) && !jsonObj.get("date_created_dmy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_created_dmy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_created_dmy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseGetDetailResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseGetDetailResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseGetDetailResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseGetDetailResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseGetDetailResponseData>() {
           @Override
           public void write(JsonWriter out, ExpenseGetDetailResponseData value) throws IOException {
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
           public ExpenseGetDetailResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExpenseGetDetailResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExpenseGetDetailResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseGetDetailResponseData
  * @throws IOException if the JSON string is invalid with respect to ExpenseGetDetailResponseData
  */
  public static ExpenseGetDetailResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseGetDetailResponseData.class);
  }

 /**
  * Convert an instance of ExpenseGetDetailResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

