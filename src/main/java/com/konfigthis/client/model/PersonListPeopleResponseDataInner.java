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
 * PersonListPeopleResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonListPeopleResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ROLE_NAME = "role_name";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  private String roleName;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Integer archived = 0;

  public static final String SERIALIZED_NAME_LINKED_PAYROLL_PROVIDER_EXTERNAL_ID = "linked_payroll_provider_external_id";
  @SerializedName(SERIALIZED_NAME_LINKED_PAYROLL_PROVIDER_EXTERNAL_ID)
  private String linkedPayrollProviderExternalId;

  public static final String SERIALIZED_NAME_PAYROLL_PROVIDER = "payroll_provider";
  @SerializedName(SERIALIZED_NAME_PAYROLL_PROVIDER)
  private String payrollProvider;

  public static final String SERIALIZED_NAME_LINKED_INTEGRATION_ALIAS = "linked_integration_alias";
  @SerializedName(SERIALIZED_NAME_LINKED_INTEGRATION_ALIAS)
  private String linkedIntegrationAlias;

  public PersonListPeopleResponseDataInner() {
  }

  public PersonListPeopleResponseDataInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "264", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public PersonListPeopleResponseDataInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Walter White", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public PersonListPeopleResponseDataInner email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "walter@white.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public PersonListPeopleResponseDataInner roleName(String roleName) {
    
    
    
    
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chemist", value = "")

  public String getRoleName() {
    return roleName;
  }


  public void setRoleName(String roleName) {
    
    
    
    this.roleName = roleName;
  }


  public PersonListPeopleResponseDataInner archived(Integer archived) {
    
    
    
    
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getArchived() {
    return archived;
  }


  public void setArchived(Integer archived) {
    
    
    
    this.archived = archived;
  }


  public PersonListPeopleResponseDataInner linkedPayrollProviderExternalId(String linkedPayrollProviderExternalId) {
    
    
    
    
    this.linkedPayrollProviderExternalId = linkedPayrollProviderExternalId;
    return this;
  }

   /**
   * Get linkedPayrollProviderExternalId
   * @return linkedPayrollProviderExternalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "")

  public String getLinkedPayrollProviderExternalId() {
    return linkedPayrollProviderExternalId;
  }


  public void setLinkedPayrollProviderExternalId(String linkedPayrollProviderExternalId) {
    
    
    
    this.linkedPayrollProviderExternalId = linkedPayrollProviderExternalId;
  }


  public PersonListPeopleResponseDataInner payrollProvider(String payrollProvider) {
    
    
    
    
    this.payrollProvider = payrollProvider;
    return this;
  }

   /**
   * Get payrollProvider
   * @return payrollProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DemoPayroll", value = "")

  public String getPayrollProvider() {
    return payrollProvider;
  }


  public void setPayrollProvider(String payrollProvider) {
    
    
    
    this.payrollProvider = payrollProvider;
  }


  public PersonListPeopleResponseDataInner linkedIntegrationAlias(String linkedIntegrationAlias) {
    
    
    
    
    this.linkedIntegrationAlias = linkedIntegrationAlias;
    return this;
  }

   /**
   * Get linkedIntegrationAlias
   * @return linkedIntegrationAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DM", value = "")

  public String getLinkedIntegrationAlias() {
    return linkedIntegrationAlias;
  }


  public void setLinkedIntegrationAlias(String linkedIntegrationAlias) {
    
    
    
    this.linkedIntegrationAlias = linkedIntegrationAlias;
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
   * @return the PersonListPeopleResponseDataInner instance itself
   */
  public PersonListPeopleResponseDataInner putAdditionalProperty(String key, Object value) {
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
    PersonListPeopleResponseDataInner personListPeopleResponseDataInner = (PersonListPeopleResponseDataInner) o;
    return Objects.equals(this.id, personListPeopleResponseDataInner.id) &&
        Objects.equals(this.name, personListPeopleResponseDataInner.name) &&
        Objects.equals(this.email, personListPeopleResponseDataInner.email) &&
        Objects.equals(this.roleName, personListPeopleResponseDataInner.roleName) &&
        Objects.equals(this.archived, personListPeopleResponseDataInner.archived) &&
        Objects.equals(this.linkedPayrollProviderExternalId, personListPeopleResponseDataInner.linkedPayrollProviderExternalId) &&
        Objects.equals(this.payrollProvider, personListPeopleResponseDataInner.payrollProvider) &&
        Objects.equals(this.linkedIntegrationAlias, personListPeopleResponseDataInner.linkedIntegrationAlias)&&
        Objects.equals(this.additionalProperties, personListPeopleResponseDataInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, roleName, archived, linkedPayrollProviderExternalId, payrollProvider, linkedIntegrationAlias, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonListPeopleResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    linkedPayrollProviderExternalId: ").append(toIndentedString(linkedPayrollProviderExternalId)).append("\n");
    sb.append("    payrollProvider: ").append(toIndentedString(payrollProvider)).append("\n");
    sb.append("    linkedIntegrationAlias: ").append(toIndentedString(linkedIntegrationAlias)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("role_name");
    openapiFields.add("archived");
    openapiFields.add("linked_payroll_provider_external_id");
    openapiFields.add("payroll_provider");
    openapiFields.add("linked_integration_alias");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonListPeopleResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonListPeopleResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonListPeopleResponseDataInner is not found in the empty JSON string", PersonListPeopleResponseDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("role_name") != null && !jsonObj.get("role_name").isJsonNull()) && !jsonObj.get("role_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_name").toString()));
      }
      if ((jsonObj.get("linked_payroll_provider_external_id") != null && !jsonObj.get("linked_payroll_provider_external_id").isJsonNull()) && !jsonObj.get("linked_payroll_provider_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_payroll_provider_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_payroll_provider_external_id").toString()));
      }
      if ((jsonObj.get("payroll_provider") != null && !jsonObj.get("payroll_provider").isJsonNull()) && !jsonObj.get("payroll_provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_provider").toString()));
      }
      if ((jsonObj.get("linked_integration_alias") != null && !jsonObj.get("linked_integration_alias").isJsonNull()) && !jsonObj.get("linked_integration_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_integration_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_integration_alias").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonListPeopleResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonListPeopleResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonListPeopleResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonListPeopleResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonListPeopleResponseDataInner>() {
           @Override
           public void write(JsonWriter out, PersonListPeopleResponseDataInner value) throws IOException {
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
           public PersonListPeopleResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonListPeopleResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PersonListPeopleResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonListPeopleResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to PersonListPeopleResponseDataInner
  */
  public static PersonListPeopleResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonListPeopleResponseDataInner.class);
  }

 /**
  * Convert an instance of PersonListPeopleResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
