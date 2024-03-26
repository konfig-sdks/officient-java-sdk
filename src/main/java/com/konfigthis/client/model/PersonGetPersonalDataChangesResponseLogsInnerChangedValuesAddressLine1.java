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
 * PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 {
  public static final String SERIALIZED_NAME_OLD = "old";
  @SerializedName(SERIALIZED_NAME_OLD)
  private String old;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private String _new;

  public PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1() {
  }

  public PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 old(String old) {
    
    
    
    
    this.old = old;
    return this;
  }

   /**
   * Get old
   * @return old
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getOld() {
    return old;
  }


  public void setOld(String old) {
    
    
    
    this.old = old;
  }


  public PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 _new(String _new) {
    
    
    
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kortrijksesteenweg 181", value = "")

  public String getNew() {
    return _new;
  }


  public void setNew(String _new) {
    
    
    
    this._new = _new;
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
   * @return the PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 instance itself
   */
  public PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 putAdditionalProperty(String key, Object value) {
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
    PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 personGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 = (PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1) o;
    return Objects.equals(this.old, personGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1.old) &&
        Objects.equals(this._new, personGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1._new)&&
        Objects.equals(this.additionalProperties, personGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(old, _new, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 {\n");
    sb.append("    old: ").append(toIndentedString(old)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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
    openapiFields.add("old");
    openapiFields.add("new");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 is not found in the empty JSON string", PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("old") != null && !jsonObj.get("old").isJsonNull()) && !jsonObj.get("old").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `old` to be a primitive type in the JSON string but got `%s`", jsonObj.get("old").toString()));
      }
      if ((jsonObj.get("new") != null && !jsonObj.get("new").isJsonNull()) && !jsonObj.get("new").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1>() {
           @Override
           public void write(JsonWriter out, PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 value) throws IOException {
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
           public PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1
  * @throws IOException if the JSON string is invalid with respect to PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1
  */
  public static PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1.class);
  }

 /**
  * Convert an instance of PersonGetPersonalDataChangesResponseLogsInnerChangedValuesAddressLine1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
