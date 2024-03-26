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
 * PersonGetDetailResponseDataCustomFieldsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonGetDetailResponseDataCustomFieldsInner {
  public static final String SERIALIZED_NAME_CUSTOM_FIELD_ID = "custom_field_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_ID)
  private Integer customFieldId = 0;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD_NAME = "custom_field_name";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_NAME)
  private String customFieldName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALUE_NAME = "value_name";
  @SerializedName(SERIALIZED_NAME_VALUE_NAME)
  private Object valueName = null;

  public PersonGetDetailResponseDataCustomFieldsInner() {
  }

  public PersonGetDetailResponseDataCustomFieldsInner customFieldId(Integer customFieldId) {
    
    
    
    
    this.customFieldId = customFieldId;
    return this;
  }

   /**
   * Get customFieldId
   * @return customFieldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "109", value = "")

  public Integer getCustomFieldId() {
    return customFieldId;
  }


  public void setCustomFieldId(Integer customFieldId) {
    
    
    
    this.customFieldId = customFieldId;
  }


  public PersonGetDetailResponseDataCustomFieldsInner customFieldName(String customFieldName) {
    
    
    
    
    this.customFieldName = customFieldName;
    return this;
  }

   /**
   * Get customFieldName
   * @return customFieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Allergies", value = "")

  public String getCustomFieldName() {
    return customFieldName;
  }


  public void setCustomFieldName(String customFieldName) {
    
    
    
    this.customFieldName = customFieldName;
  }


  public PersonGetDetailResponseDataCustomFieldsInner type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "email", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public PersonGetDetailResponseDataCustomFieldsInner value(String value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Soy", value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    
    
    
    this.value = value;
  }


  public PersonGetDetailResponseDataCustomFieldsInner valueName(Object valueName) {
    
    
    
    
    this.valueName = valueName;
    return this;
  }

   /**
   * Get valueName
   * @return valueName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValueName() {
    return valueName;
  }


  public void setValueName(Object valueName) {
    
    
    
    this.valueName = valueName;
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
   * @return the PersonGetDetailResponseDataCustomFieldsInner instance itself
   */
  public PersonGetDetailResponseDataCustomFieldsInner putAdditionalProperty(String key, Object value) {
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
    PersonGetDetailResponseDataCustomFieldsInner personGetDetailResponseDataCustomFieldsInner = (PersonGetDetailResponseDataCustomFieldsInner) o;
    return Objects.equals(this.customFieldId, personGetDetailResponseDataCustomFieldsInner.customFieldId) &&
        Objects.equals(this.customFieldName, personGetDetailResponseDataCustomFieldsInner.customFieldName) &&
        Objects.equals(this.type, personGetDetailResponseDataCustomFieldsInner.type) &&
        Objects.equals(this.value, personGetDetailResponseDataCustomFieldsInner.value) &&
        Objects.equals(this.valueName, personGetDetailResponseDataCustomFieldsInner.valueName)&&
        Objects.equals(this.additionalProperties, personGetDetailResponseDataCustomFieldsInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldId, customFieldName, type, value, valueName, additionalProperties);
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
    sb.append("class PersonGetDetailResponseDataCustomFieldsInner {\n");
    sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
    sb.append("    customFieldName: ").append(toIndentedString(customFieldName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueName: ").append(toIndentedString(valueName)).append("\n");
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
    openapiFields.add("custom_field_id");
    openapiFields.add("custom_field_name");
    openapiFields.add("type");
    openapiFields.add("value");
    openapiFields.add("value_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonGetDetailResponseDataCustomFieldsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonGetDetailResponseDataCustomFieldsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonGetDetailResponseDataCustomFieldsInner is not found in the empty JSON string", PersonGetDetailResponseDataCustomFieldsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("custom_field_name") != null && !jsonObj.get("custom_field_name").isJsonNull()) && !jsonObj.get("custom_field_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_field_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_field_name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonGetDetailResponseDataCustomFieldsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonGetDetailResponseDataCustomFieldsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonGetDetailResponseDataCustomFieldsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonGetDetailResponseDataCustomFieldsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonGetDetailResponseDataCustomFieldsInner>() {
           @Override
           public void write(JsonWriter out, PersonGetDetailResponseDataCustomFieldsInner value) throws IOException {
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
           public PersonGetDetailResponseDataCustomFieldsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonGetDetailResponseDataCustomFieldsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PersonGetDetailResponseDataCustomFieldsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonGetDetailResponseDataCustomFieldsInner
  * @throws IOException if the JSON string is invalid with respect to PersonGetDetailResponseDataCustomFieldsInner
  */
  public static PersonGetDetailResponseDataCustomFieldsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonGetDetailResponseDataCustomFieldsInner.class);
  }

 /**
  * Convert an instance of PersonGetDetailResponseDataCustomFieldsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

