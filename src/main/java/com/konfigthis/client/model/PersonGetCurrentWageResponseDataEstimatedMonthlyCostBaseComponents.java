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
 * PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents {
  public static final String SERIALIZED_NAME_BASE_RATE = "base_rate";
  @SerializedName(SERIALIZED_NAME_BASE_RATE)
  private Integer baseRate = 0;

  public static final String SERIALIZED_NAME_SOCIAL_CONTRIBUTIONS = "social_contributions";
  @SerializedName(SERIALIZED_NAME_SOCIAL_CONTRIBUTIONS)
  private Integer socialContributions = 0;

  public static final String SERIALIZED_NAME_END_OF_YEAR_BONUS = "end_of_year_bonus";
  @SerializedName(SERIALIZED_NAME_END_OF_YEAR_BONUS)
  private Double endOfYearBonus = 0d;

  public static final String SERIALIZED_NAME_RETIREMENT_PLAN = "retirement_plan";
  @SerializedName(SERIALIZED_NAME_RETIREMENT_PLAN)
  private Double retirementPlan = 0d;

  public static final String SERIALIZED_NAME_HOLIDAY_PAY = "holiday_pay";
  @SerializedName(SERIALIZED_NAME_HOLIDAY_PAY)
  private Double holidayPay = 0d;

  public static final String SERIALIZED_NAME_HOSPITALIZATION_INSURANCE = "hospitalization_insurance";
  @SerializedName(SERIALIZED_NAME_HOSPITALIZATION_INSURANCE)
  private Integer hospitalizationInsurance = 0;

  public static final String SERIALIZED_NAME_NET_ALLOWANCE = "net_allowance";
  @SerializedName(SERIALIZED_NAME_NET_ALLOWANCE)
  private Integer netAllowance = 0;

  public static final String SERIALIZED_NAME_CAR = "car";
  @SerializedName(SERIALIZED_NAME_CAR)
  private Integer car = 0;

  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents() {
  }

  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents baseRate(Integer baseRate) {
    
    
    
    
    this.baseRate = baseRate;
    return this;
  }

   /**
   * Get baseRate
   * @return baseRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2750", value = "")

  public Integer getBaseRate() {
    return baseRate;
  }


  public void setBaseRate(Integer baseRate) {
    
    
    
    this.baseRate = baseRate;
  }


  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents socialContributions(Integer socialContributions) {
    
    
    
    
    this.socialContributions = socialContributions;
    return this;
  }

   /**
   * Get socialContributions
   * @return socialContributions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "885", value = "")

  public Integer getSocialContributions() {
    return socialContributions;
  }


  public void setSocialContributions(Integer socialContributions) {
    
    
    
    this.socialContributions = socialContributions;
  }


  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents endOfYearBonus(Double endOfYearBonus) {
    
    
    
    
    this.endOfYearBonus = endOfYearBonus;
    return this;
  }

  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents endOfYearBonus(Integer endOfYearBonus) {
    
    
    
    
    this.endOfYearBonus = endOfYearBonus.doubleValue();
    return this;
  }

   /**
   * Get endOfYearBonus
   * @return endOfYearBonus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "245.83", value = "")

  public Double getEndOfYearBonus() {
    return endOfYearBonus;
  }


  public void setEndOfYearBonus(Double endOfYearBonus) {
    
    
    
    this.endOfYearBonus = endOfYearBonus;
  }


  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents retirementPlan(Double retirementPlan) {
    
    
    
    
    this.retirementPlan = retirementPlan;
    return this;
  }

  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents retirementPlan(Integer retirementPlan) {
    
    
    
    
    this.retirementPlan = retirementPlan.doubleValue();
    return this;
  }

   /**
   * Get retirementPlan
   * @return retirementPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "136.92", value = "")

  public Double getRetirementPlan() {
    return retirementPlan;
  }


  public void setRetirementPlan(Double retirementPlan) {
    
    
    
    this.retirementPlan = retirementPlan;
  }


  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents holidayPay(Double holidayPay) {
    
    
    
    
    this.holidayPay = holidayPay;
    return this;
  }

  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents holidayPay(Integer holidayPay) {
    
    
    
    
    this.holidayPay = holidayPay.doubleValue();
    return this;
  }

   /**
   * Get holidayPay
   * @return holidayPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "226.17", value = "")

  public Double getHolidayPay() {
    return holidayPay;
  }


  public void setHolidayPay(Double holidayPay) {
    
    
    
    this.holidayPay = holidayPay;
  }


  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents hospitalizationInsurance(Integer hospitalizationInsurance) {
    
    
    
    
    this.hospitalizationInsurance = hospitalizationInsurance;
    return this;
  }

   /**
   * Get hospitalizationInsurance
   * @return hospitalizationInsurance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getHospitalizationInsurance() {
    return hospitalizationInsurance;
  }


  public void setHospitalizationInsurance(Integer hospitalizationInsurance) {
    
    
    
    this.hospitalizationInsurance = hospitalizationInsurance;
  }


  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents netAllowance(Integer netAllowance) {
    
    
    
    
    this.netAllowance = netAllowance;
    return this;
  }

   /**
   * Get netAllowance
   * @return netAllowance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getNetAllowance() {
    return netAllowance;
  }


  public void setNetAllowance(Integer netAllowance) {
    
    
    
    this.netAllowance = netAllowance;
  }


  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents car(Integer car) {
    
    
    
    
    this.car = car;
    return this;
  }

   /**
   * Get car
   * @return car
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getCar() {
    return car;
  }


  public void setCar(Integer car) {
    
    
    
    this.car = car;
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
   * @return the PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents instance itself
   */
  public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents putAdditionalProperty(String key, Object value) {
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
    PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents personGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents = (PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents) o;
    return Objects.equals(this.baseRate, personGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.baseRate) &&
        Objects.equals(this.socialContributions, personGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.socialContributions) &&
        Objects.equals(this.endOfYearBonus, personGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.endOfYearBonus) &&
        Objects.equals(this.retirementPlan, personGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.retirementPlan) &&
        Objects.equals(this.holidayPay, personGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.holidayPay) &&
        Objects.equals(this.hospitalizationInsurance, personGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.hospitalizationInsurance) &&
        Objects.equals(this.netAllowance, personGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.netAllowance) &&
        Objects.equals(this.car, personGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.car)&&
        Objects.equals(this.additionalProperties, personGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseRate, socialContributions, endOfYearBonus, retirementPlan, holidayPay, hospitalizationInsurance, netAllowance, car, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents {\n");
    sb.append("    baseRate: ").append(toIndentedString(baseRate)).append("\n");
    sb.append("    socialContributions: ").append(toIndentedString(socialContributions)).append("\n");
    sb.append("    endOfYearBonus: ").append(toIndentedString(endOfYearBonus)).append("\n");
    sb.append("    retirementPlan: ").append(toIndentedString(retirementPlan)).append("\n");
    sb.append("    holidayPay: ").append(toIndentedString(holidayPay)).append("\n");
    sb.append("    hospitalizationInsurance: ").append(toIndentedString(hospitalizationInsurance)).append("\n");
    sb.append("    netAllowance: ").append(toIndentedString(netAllowance)).append("\n");
    sb.append("    car: ").append(toIndentedString(car)).append("\n");
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
    openapiFields.add("base_rate");
    openapiFields.add("social_contributions");
    openapiFields.add("end_of_year_bonus");
    openapiFields.add("retirement_plan");
    openapiFields.add("holiday_pay");
    openapiFields.add("hospitalization_insurance");
    openapiFields.add("net_allowance");
    openapiFields.add("car");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents is not found in the empty JSON string", PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents>() {
           @Override
           public void write(JsonWriter out, PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents value) throws IOException {
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
           public PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents
  * @throws IOException if the JSON string is invalid with respect to PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents
  */
  public static PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents.class);
  }

 /**
  * Convert an instance of PersonGetCurrentWageResponseDataEstimatedMonthlyCostBaseComponents to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
