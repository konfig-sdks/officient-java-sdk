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
 * ExpenseSetPayoutMethodAndStatusRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExpenseSetPayoutMethodAndStatusRequest {
  /**
   * Gets or Sets newPayoutMethod
   */
  @JsonAdapter(NewPayoutMethodEnum.Adapter.class)
 public enum NewPayoutMethodEnum {
    UNDECIDED("UNDECIDED"),
    
    DO_NOT_PAYOUT("DO_NOT_PAYOUT"),
    
    PAYOUT_ACCOUNTING("PAYOUT_ACCOUNTING"),
    
    PAYOUT_OTHER("PAYOUT_OTHER"),
    
    PAYOUT_MANUALLY("PAYOUT_MANUALLY"),
    
    PAYOUT_USING_PAYROLL_PROVIDER("PAYOUT_USING_PAYROLL_PROVIDER");

    private String value;

    NewPayoutMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NewPayoutMethodEnum fromValue(String value) {
      for (NewPayoutMethodEnum b : NewPayoutMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NewPayoutMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NewPayoutMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NewPayoutMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NewPayoutMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NEW_PAYOUT_METHOD = "new_payout_method";
  @SerializedName(SERIALIZED_NAME_NEW_PAYOUT_METHOD)
  private NewPayoutMethodEnum newPayoutMethod;

  public static final String SERIALIZED_NAME_PAYOUT_OTHER_REASON = "payout_other_reason";
  @SerializedName(SERIALIZED_NAME_PAYOUT_OTHER_REASON)
  private String payoutOtherReason;

  /**
   * This field is required when the \&quot;new\&quot;payout_method\&quot; is either PAYOUT_ACCOUNTING, PAYOUT_OTHER or PAYOUT_MANUALLY
   */
  @JsonAdapter(PayoutStatusEnum.Adapter.class)
 public enum PayoutStatusEnum {
    PAID_OUT("PAID_OUT"),
    
    NOT_PAID_OUT("NOT_PAID_OUT");

    private String value;

    PayoutStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayoutStatusEnum fromValue(String value) {
      for (PayoutStatusEnum b : PayoutStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayoutStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayoutStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayoutStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayoutStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYOUT_STATUS = "payout_status";
  @SerializedName(SERIALIZED_NAME_PAYOUT_STATUS)
  private PayoutStatusEnum payoutStatus;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;

  public ExpenseSetPayoutMethodAndStatusRequest() {
  }

  public ExpenseSetPayoutMethodAndStatusRequest newPayoutMethod(NewPayoutMethodEnum newPayoutMethod) {
    
    
    
    
    this.newPayoutMethod = newPayoutMethod;
    return this;
  }

   /**
   * Get newPayoutMethod
   * @return newPayoutMethod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NewPayoutMethodEnum getNewPayoutMethod() {
    return newPayoutMethod;
  }


  public void setNewPayoutMethod(NewPayoutMethodEnum newPayoutMethod) {
    
    
    
    this.newPayoutMethod = newPayoutMethod;
  }


  public ExpenseSetPayoutMethodAndStatusRequest payoutOtherReason(String payoutOtherReason) {
    
    
    
    
    this.payoutOtherReason = payoutOtherReason;
    return this;
  }

   /**
   * Get payoutOtherReason
   * @return payoutOtherReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPayoutOtherReason() {
    return payoutOtherReason;
  }


  public void setPayoutOtherReason(String payoutOtherReason) {
    
    
    
    this.payoutOtherReason = payoutOtherReason;
  }


  public ExpenseSetPayoutMethodAndStatusRequest payoutStatus(PayoutStatusEnum payoutStatus) {
    
    
    
    
    this.payoutStatus = payoutStatus;
    return this;
  }

   /**
   * This field is required when the \&quot;new\&quot;payout_method\&quot; is either PAYOUT_ACCOUNTING, PAYOUT_OTHER or PAYOUT_MANUALLY
   * @return payoutStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is required when the \"new\"payout_method\" is either PAYOUT_ACCOUNTING, PAYOUT_OTHER or PAYOUT_MANUALLY")

  public PayoutStatusEnum getPayoutStatus() {
    return payoutStatus;
  }


  public void setPayoutStatus(PayoutStatusEnum payoutStatus) {
    
    
    
    this.payoutStatus = payoutStatus;
  }


  public ExpenseSetPayoutMethodAndStatusRequest period(String period) {
    
    
    
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPeriod() {
    return period;
  }


  public void setPeriod(String period) {
    
    
    
    this.period = period;
  }


  public ExpenseSetPayoutMethodAndStatusRequest year(String year) {
    
    
    
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    
    
    
    this.year = year;
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
   * @return the ExpenseSetPayoutMethodAndStatusRequest instance itself
   */
  public ExpenseSetPayoutMethodAndStatusRequest putAdditionalProperty(String key, Object value) {
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
    ExpenseSetPayoutMethodAndStatusRequest expenseSetPayoutMethodAndStatusRequest = (ExpenseSetPayoutMethodAndStatusRequest) o;
    return Objects.equals(this.newPayoutMethod, expenseSetPayoutMethodAndStatusRequest.newPayoutMethod) &&
        Objects.equals(this.payoutOtherReason, expenseSetPayoutMethodAndStatusRequest.payoutOtherReason) &&
        Objects.equals(this.payoutStatus, expenseSetPayoutMethodAndStatusRequest.payoutStatus) &&
        Objects.equals(this.period, expenseSetPayoutMethodAndStatusRequest.period) &&
        Objects.equals(this.year, expenseSetPayoutMethodAndStatusRequest.year)&&
        Objects.equals(this.additionalProperties, expenseSetPayoutMethodAndStatusRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPayoutMethod, payoutOtherReason, payoutStatus, period, year, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseSetPayoutMethodAndStatusRequest {\n");
    sb.append("    newPayoutMethod: ").append(toIndentedString(newPayoutMethod)).append("\n");
    sb.append("    payoutOtherReason: ").append(toIndentedString(payoutOtherReason)).append("\n");
    sb.append("    payoutStatus: ").append(toIndentedString(payoutStatus)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("new_payout_method");
    openapiFields.add("payout_other_reason");
    openapiFields.add("payout_status");
    openapiFields.add("period");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("new_payout_method");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseSetPayoutMethodAndStatusRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExpenseSetPayoutMethodAndStatusRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseSetPayoutMethodAndStatusRequest is not found in the empty JSON string", ExpenseSetPayoutMethodAndStatusRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExpenseSetPayoutMethodAndStatusRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("new_payout_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_payout_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_payout_method").toString()));
      }
      if ((jsonObj.get("payout_other_reason") != null && !jsonObj.get("payout_other_reason").isJsonNull()) && !jsonObj.get("payout_other_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payout_other_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payout_other_reason").toString()));
      }
      if ((jsonObj.get("payout_status") != null && !jsonObj.get("payout_status").isJsonNull()) && !jsonObj.get("payout_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payout_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payout_status").toString()));
      }
      if ((jsonObj.get("period") != null && !jsonObj.get("period").isJsonNull()) && !jsonObj.get("period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period").toString()));
      }
      if ((jsonObj.get("year") != null && !jsonObj.get("year").isJsonNull()) && !jsonObj.get("year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("year").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseSetPayoutMethodAndStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseSetPayoutMethodAndStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseSetPayoutMethodAndStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseSetPayoutMethodAndStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseSetPayoutMethodAndStatusRequest>() {
           @Override
           public void write(JsonWriter out, ExpenseSetPayoutMethodAndStatusRequest value) throws IOException {
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
           public ExpenseSetPayoutMethodAndStatusRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExpenseSetPayoutMethodAndStatusRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExpenseSetPayoutMethodAndStatusRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseSetPayoutMethodAndStatusRequest
  * @throws IOException if the JSON string is invalid with respect to ExpenseSetPayoutMethodAndStatusRequest
  */
  public static ExpenseSetPayoutMethodAndStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseSetPayoutMethodAndStatusRequest.class);
  }

 /**
  * Convert an instance of ExpenseSetPayoutMethodAndStatusRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

