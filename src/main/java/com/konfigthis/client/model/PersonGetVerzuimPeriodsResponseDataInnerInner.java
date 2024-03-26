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
 * PersonGetVerzuimPeriodsResponseDataInnerInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonGetVerzuimPeriodsResponseDataInnerInner {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Object endDate = null;

  public static final String SERIALIZED_NAME_DURATION_TYPE = "duration_type";
  @SerializedName(SERIALIZED_NAME_DURATION_TYPE)
  private String durationType;

  public static final String SERIALIZED_NAME_DURATION_MINUTES_ON_FIRST_DAY = "duration_minutes_on_first_day";
  @SerializedName(SERIALIZED_NAME_DURATION_MINUTES_ON_FIRST_DAY)
  private Integer durationMinutesOnFirstDay = 0;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public PersonGetVerzuimPeriodsResponseDataInnerInner() {
  }

  public PersonGetVerzuimPeriodsResponseDataInnerInner startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-09-10", value = "")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public PersonGetVerzuimPeriodsResponseDataInnerInner endDate(Object endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEndDate() {
    return endDate;
  }


  public void setEndDate(Object endDate) {
    
    
    
    this.endDate = endDate;
  }


  public PersonGetVerzuimPeriodsResponseDataInnerInner durationType(String durationType) {
    
    
    
    
    this.durationType = durationType;
    return this;
  }

   /**
   * Get durationType
   * @return durationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "all_day", value = "")

  public String getDurationType() {
    return durationType;
  }


  public void setDurationType(String durationType) {
    
    
    
    this.durationType = durationType;
  }


  public PersonGetVerzuimPeriodsResponseDataInnerInner durationMinutesOnFirstDay(Integer durationMinutesOnFirstDay) {
    
    
    
    
    this.durationMinutesOnFirstDay = durationMinutesOnFirstDay;
    return this;
  }

   /**
   * Get durationMinutesOnFirstDay
   * @return durationMinutesOnFirstDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "480", value = "")

  public Integer getDurationMinutesOnFirstDay() {
    return durationMinutesOnFirstDay;
  }


  public void setDurationMinutesOnFirstDay(Integer durationMinutesOnFirstDay) {
    
    
    
    this.durationMinutesOnFirstDay = durationMinutesOnFirstDay;
  }


  public PersonGetVerzuimPeriodsResponseDataInnerInner status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "open", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
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
   * @return the PersonGetVerzuimPeriodsResponseDataInnerInner instance itself
   */
  public PersonGetVerzuimPeriodsResponseDataInnerInner putAdditionalProperty(String key, Object value) {
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
    PersonGetVerzuimPeriodsResponseDataInnerInner personGetVerzuimPeriodsResponseDataInnerInner = (PersonGetVerzuimPeriodsResponseDataInnerInner) o;
    return Objects.equals(this.startDate, personGetVerzuimPeriodsResponseDataInnerInner.startDate) &&
        Objects.equals(this.endDate, personGetVerzuimPeriodsResponseDataInnerInner.endDate) &&
        Objects.equals(this.durationType, personGetVerzuimPeriodsResponseDataInnerInner.durationType) &&
        Objects.equals(this.durationMinutesOnFirstDay, personGetVerzuimPeriodsResponseDataInnerInner.durationMinutesOnFirstDay) &&
        Objects.equals(this.status, personGetVerzuimPeriodsResponseDataInnerInner.status)&&
        Objects.equals(this.additionalProperties, personGetVerzuimPeriodsResponseDataInnerInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, durationType, durationMinutesOnFirstDay, status, additionalProperties);
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
    sb.append("class PersonGetVerzuimPeriodsResponseDataInnerInner {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
    sb.append("    durationMinutesOnFirstDay: ").append(toIndentedString(durationMinutesOnFirstDay)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("duration_type");
    openapiFields.add("duration_minutes_on_first_day");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonGetVerzuimPeriodsResponseDataInnerInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonGetVerzuimPeriodsResponseDataInnerInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonGetVerzuimPeriodsResponseDataInnerInner is not found in the empty JSON string", PersonGetVerzuimPeriodsResponseDataInnerInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("duration_type") != null && !jsonObj.get("duration_type").isJsonNull()) && !jsonObj.get("duration_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration_type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonGetVerzuimPeriodsResponseDataInnerInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonGetVerzuimPeriodsResponseDataInnerInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonGetVerzuimPeriodsResponseDataInnerInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonGetVerzuimPeriodsResponseDataInnerInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonGetVerzuimPeriodsResponseDataInnerInner>() {
           @Override
           public void write(JsonWriter out, PersonGetVerzuimPeriodsResponseDataInnerInner value) throws IOException {
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
           public PersonGetVerzuimPeriodsResponseDataInnerInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonGetVerzuimPeriodsResponseDataInnerInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PersonGetVerzuimPeriodsResponseDataInnerInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonGetVerzuimPeriodsResponseDataInnerInner
  * @throws IOException if the JSON string is invalid with respect to PersonGetVerzuimPeriodsResponseDataInnerInner
  */
  public static PersonGetVerzuimPeriodsResponseDataInnerInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonGetVerzuimPeriodsResponseDataInnerInner.class);
  }

 /**
  * Convert an instance of PersonGetVerzuimPeriodsResponseDataInnerInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

