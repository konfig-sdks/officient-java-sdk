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
import com.konfigthis.client.model.PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInnerWeeklyTimeEngagementMinutes;
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
 * PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner {
  public static final String SERIALIZED_NAME_WEEK_NR = "week_nr";
  @SerializedName(SERIALIZED_NAME_WEEK_NR)
  private Integer weekNr = 0;

  public static final String SERIALIZED_NAME_WEEKLY_TIME_ENGAGEMENT_MINUTES = "weekly_time_engagement_minutes";
  @SerializedName(SERIALIZED_NAME_WEEKLY_TIME_ENGAGEMENT_MINUTES)
  private PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInnerWeeklyTimeEngagementMinutes weeklyTimeEngagementMinutes;

  public PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner() {
  }

  public PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner weekNr(Integer weekNr) {
    
    
    
    
    this.weekNr = weekNr;
    return this;
  }

   /**
   * Get weekNr
   * @return weekNr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getWeekNr() {
    return weekNr;
  }


  public void setWeekNr(Integer weekNr) {
    
    
    
    this.weekNr = weekNr;
  }


  public PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner weeklyTimeEngagementMinutes(PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInnerWeeklyTimeEngagementMinutes weeklyTimeEngagementMinutes) {
    
    
    
    
    this.weeklyTimeEngagementMinutes = weeklyTimeEngagementMinutes;
    return this;
  }

   /**
   * Get weeklyTimeEngagementMinutes
   * @return weeklyTimeEngagementMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInnerWeeklyTimeEngagementMinutes getWeeklyTimeEngagementMinutes() {
    return weeklyTimeEngagementMinutes;
  }


  public void setWeeklyTimeEngagementMinutes(PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInnerWeeklyTimeEngagementMinutes weeklyTimeEngagementMinutes) {
    
    
    
    this.weeklyTimeEngagementMinutes = weeklyTimeEngagementMinutes;
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
   * @return the PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner instance itself
   */
  public PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner putAdditionalProperty(String key, Object value) {
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
    PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner personGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner = (PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner) o;
    return Objects.equals(this.weekNr, personGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner.weekNr) &&
        Objects.equals(this.weeklyTimeEngagementMinutes, personGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner.weeklyTimeEngagementMinutes)&&
        Objects.equals(this.additionalProperties, personGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekNr, weeklyTimeEngagementMinutes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner {\n");
    sb.append("    weekNr: ").append(toIndentedString(weekNr)).append("\n");
    sb.append("    weeklyTimeEngagementMinutes: ").append(toIndentedString(weeklyTimeEngagementMinutes)).append("\n");
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
    openapiFields.add("week_nr");
    openapiFields.add("weekly_time_engagement_minutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner is not found in the empty JSON string", PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `weekly_time_engagement_minutes`
      if (jsonObj.get("weekly_time_engagement_minutes") != null && !jsonObj.get("weekly_time_engagement_minutes").isJsonNull()) {
        PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInnerWeeklyTimeEngagementMinutes.validateJsonObject(jsonObj.getAsJsonObject("weekly_time_engagement_minutes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner>() {
           @Override
           public void write(JsonWriter out, PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner value) throws IOException {
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
           public PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner
  * @throws IOException if the JSON string is invalid with respect to PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner
  */
  public static PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner.class);
  }

 /**
  * Convert an instance of PersonGetCurrentWageResponseDataMultipleWeekScheduleWeeksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

