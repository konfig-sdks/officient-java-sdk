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
 * PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes {
  public static final String SERIALIZED_NAME_MONDAY = "monday";
  @SerializedName(SERIALIZED_NAME_MONDAY)
  private Integer monday = 0;

  public static final String SERIALIZED_NAME_TUESDAY = "tuesday";
  @SerializedName(SERIALIZED_NAME_TUESDAY)
  private Integer tuesday = 0;

  public static final String SERIALIZED_NAME_WEDNESDAY = "wednesday";
  @SerializedName(SERIALIZED_NAME_WEDNESDAY)
  private Integer wednesday = 0;

  public static final String SERIALIZED_NAME_THURSDAY = "thursday";
  @SerializedName(SERIALIZED_NAME_THURSDAY)
  private Integer thursday = 0;

  public static final String SERIALIZED_NAME_FRIDAY = "friday";
  @SerializedName(SERIALIZED_NAME_FRIDAY)
  private Integer friday = 0;

  public static final String SERIALIZED_NAME_SATURDAY = "saturday";
  @SerializedName(SERIALIZED_NAME_SATURDAY)
  private Integer saturday = 0;

  public static final String SERIALIZED_NAME_SUNDAY = "sunday";
  @SerializedName(SERIALIZED_NAME_SUNDAY)
  private Integer sunday = 0;

  public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes() {
  }

  public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes monday(Integer monday) {
    
    
    
    
    this.monday = monday;
    return this;
  }

   /**
   * Get monday
   * @return monday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "456", value = "")

  public Integer getMonday() {
    return monday;
  }


  public void setMonday(Integer monday) {
    
    
    
    this.monday = monday;
  }


  public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes tuesday(Integer tuesday) {
    
    
    
    
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Get tuesday
   * @return tuesday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "456", value = "")

  public Integer getTuesday() {
    return tuesday;
  }


  public void setTuesday(Integer tuesday) {
    
    
    
    this.tuesday = tuesday;
  }


  public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes wednesday(Integer wednesday) {
    
    
    
    
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Get wednesday
   * @return wednesday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "456", value = "")

  public Integer getWednesday() {
    return wednesday;
  }


  public void setWednesday(Integer wednesday) {
    
    
    
    this.wednesday = wednesday;
  }


  public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes thursday(Integer thursday) {
    
    
    
    
    this.thursday = thursday;
    return this;
  }

   /**
   * Get thursday
   * @return thursday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "456", value = "")

  public Integer getThursday() {
    return thursday;
  }


  public void setThursday(Integer thursday) {
    
    
    
    this.thursday = thursday;
  }


  public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes friday(Integer friday) {
    
    
    
    
    this.friday = friday;
    return this;
  }

   /**
   * Get friday
   * @return friday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "456", value = "")

  public Integer getFriday() {
    return friday;
  }


  public void setFriday(Integer friday) {
    
    
    
    this.friday = friday;
  }


  public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes saturday(Integer saturday) {
    
    
    
    
    this.saturday = saturday;
    return this;
  }

   /**
   * Get saturday
   * @return saturday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getSaturday() {
    return saturday;
  }


  public void setSaturday(Integer saturday) {
    
    
    
    this.saturday = saturday;
  }


  public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes sunday(Integer sunday) {
    
    
    
    
    this.sunday = sunday;
    return this;
  }

   /**
   * Get sunday
   * @return sunday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getSunday() {
    return sunday;
  }


  public void setSunday(Integer sunday) {
    
    
    
    this.sunday = sunday;
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
   * @return the PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes instance itself
   */
  public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes putAdditionalProperty(String key, Object value) {
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
    PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes personGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes = (PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes) o;
    return Objects.equals(this.monday, personGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.monday) &&
        Objects.equals(this.tuesday, personGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.tuesday) &&
        Objects.equals(this.wednesday, personGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.wednesday) &&
        Objects.equals(this.thursday, personGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.thursday) &&
        Objects.equals(this.friday, personGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.friday) &&
        Objects.equals(this.saturday, personGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.saturday) &&
        Objects.equals(this.sunday, personGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.sunday)&&
        Objects.equals(this.additionalProperties, personGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monday, tuesday, wednesday, thursday, friday, saturday, sunday, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes {\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
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
    openapiFields.add("monday");
    openapiFields.add("tuesday");
    openapiFields.add("wednesday");
    openapiFields.add("thursday");
    openapiFields.add("friday");
    openapiFields.add("saturday");
    openapiFields.add("sunday");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes is not found in the empty JSON string", PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes>() {
           @Override
           public void write(JsonWriter out, PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes value) throws IOException {
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
           public PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes
  * @throws IOException if the JSON string is invalid with respect to PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes
  */
  public static PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes.class);
  }

 /**
  * Convert an instance of PersonGetWageHistoryResponseDataInnerWeeklyTimeEngagementMinutes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

