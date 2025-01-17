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
import com.konfigthis.client.model.VehicleGetDetailResponseDataCustomFieldsInner;
import com.konfigthis.client.model.VehicleGetDetailResponseDataOwner;
import com.konfigthis.client.model.VehicleGetDetailResponseDataYearlyCost;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * VehicleGetDetailResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VehicleGetDetailResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_FUEL = "fuel";
  @SerializedName(SERIALIZED_NAME_FUEL)
  private String fuel;

  public static final String SERIALIZED_NAME_PLATE = "plate";
  @SerializedName(SERIALIZED_NAME_PLATE)
  private String plate;

  public static final String SERIALIZED_NAME_HP = "hp";
  @SerializedName(SERIALIZED_NAME_HP)
  private Integer hp = 0;

  public static final String SERIALIZED_NAME_CO2_G_KM = "co2_g_km";
  @SerializedName(SERIALIZED_NAME_CO2_G_KM)
  private Integer co2GKm = 0;

  public static final String SERIALIZED_NAME_CHASSIS_NUMBER = "chassis_number";
  @SerializedName(SERIALIZED_NAME_CHASSIS_NUMBER)
  private String chassisNumber;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_SUPPLIER = "supplier";
  @SerializedName(SERIALIZED_NAME_SUPPLIER)
  private String supplier;

  public static final String SERIALIZED_NAME_CONTRACT_TYPE = "contract_type";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPE)
  private String contractType;

  public static final String SERIALIZED_NAME_CATALOGUE_VALUE = "catalogue_value";
  @SerializedName(SERIALIZED_NAME_CATALOGUE_VALUE)
  private String catalogueValue;

  public static final String SERIALIZED_NAME_DATE_FIRST_REGISTRATION = "date_first_registration";
  @SerializedName(SERIALIZED_NAME_DATE_FIRST_REGISTRATION)
  private String dateFirstRegistration;

  public static final String SERIALIZED_NAME_SPECIFICS = "specifics";
  @SerializedName(SERIALIZED_NAME_SPECIFICS)
  private String specifics;

  public static final String SERIALIZED_NAME_YEARLY_COST = "yearly_cost";
  @SerializedName(SERIALIZED_NAME_YEARLY_COST)
  private VehicleGetDetailResponseDataYearlyCost yearlyCost;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Integer deleted = 0;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private VehicleGetDetailResponseDataOwner owner;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<VehicleGetDetailResponseDataCustomFieldsInner> customFields = null;

  public VehicleGetDetailResponseData() {
  }

  public VehicleGetDetailResponseData id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public VehicleGetDetailResponseData type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "car", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public VehicleGetDetailResponseData brand(String brand) {
    
    
    
    
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Citroen", value = "")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    
    
    
    this.brand = brand;
  }


  public VehicleGetDetailResponseData model(String model) {
    
    
    
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Xsara", value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    
    
    
    this.model = model;
  }


  public VehicleGetDetailResponseData fuel(String fuel) {
    
    
    
    
    this.fuel = fuel;
    return this;
  }

   /**
   * Get fuel
   * @return fuel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gas", value = "")

  public String getFuel() {
    return fuel;
  }


  public void setFuel(String fuel) {
    
    
    
    this.fuel = fuel;
  }


  public VehicleGetDetailResponseData plate(String plate) {
    
    
    
    
    this.plate = plate;
    return this;
  }

   /**
   * Get plate
   * @return plate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1-NZH-879", value = "")

  public String getPlate() {
    return plate;
  }


  public void setPlate(String plate) {
    
    
    
    this.plate = plate;
  }


  public VehicleGetDetailResponseData hp(Integer hp) {
    
    
    
    
    this.hp = hp;
    return this;
  }

   /**
   * Get hp
   * @return hp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "70", value = "")

  public Integer getHp() {
    return hp;
  }


  public void setHp(Integer hp) {
    
    
    
    this.hp = hp;
  }


  public VehicleGetDetailResponseData co2GKm(Integer co2GKm) {
    
    
    
    
    this.co2GKm = co2GKm;
    return this;
  }

   /**
   * Get co2GKm
   * @return co2GKm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "")

  public Integer getCo2GKm() {
    return co2GKm;
  }


  public void setCo2GKm(Integer co2GKm) {
    
    
    
    this.co2GKm = co2GKm;
  }


  public VehicleGetDetailResponseData chassisNumber(String chassisNumber) {
    
    
    
    
    this.chassisNumber = chassisNumber;
    return this;
  }

   /**
   * Get chassisNumber
   * @return chassisNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AEFSF_FSF54546", value = "")

  public String getChassisNumber() {
    return chassisNumber;
  }


  public void setChassisNumber(String chassisNumber) {
    
    
    
    this.chassisNumber = chassisNumber;
  }


  public VehicleGetDetailResponseData color(String color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yellow", value = "")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    
    this.color = color;
  }


  public VehicleGetDetailResponseData supplier(String supplier) {
    
    
    
    
    this.supplier = supplier;
    return this;
  }

   /**
   * Get supplier
   * @return supplier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getSupplier() {
    return supplier;
  }


  public void setSupplier(String supplier) {
    
    
    
    this.supplier = supplier;
  }


  public VehicleGetDetailResponseData contractType(String contractType) {
    
    
    
    
    this.contractType = contractType;
    return this;
  }

   /**
   * Get contractType
   * @return contractType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getContractType() {
    return contractType;
  }


  public void setContractType(String contractType) {
    
    
    
    this.contractType = contractType;
  }


  public VehicleGetDetailResponseData catalogueValue(String catalogueValue) {
    
    
    
    
    this.catalogueValue = catalogueValue;
    return this;
  }

   /**
   * Get catalogueValue
   * @return catalogueValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20000", value = "")

  public String getCatalogueValue() {
    return catalogueValue;
  }


  public void setCatalogueValue(String catalogueValue) {
    
    
    
    this.catalogueValue = catalogueValue;
  }


  public VehicleGetDetailResponseData dateFirstRegistration(String dateFirstRegistration) {
    
    
    
    
    this.dateFirstRegistration = dateFirstRegistration;
    return this;
  }

   /**
   * Get dateFirstRegistration
   * @return dateFirstRegistration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1999-01-15", value = "")

  public String getDateFirstRegistration() {
    return dateFirstRegistration;
  }


  public void setDateFirstRegistration(String dateFirstRegistration) {
    
    
    
    this.dateFirstRegistration = dateFirstRegistration;
  }


  public VehicleGetDetailResponseData specifics(String specifics) {
    
    
    
    
    this.specifics = specifics;
    return this;
  }

   /**
   * Get specifics
   * @return specifics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getSpecifics() {
    return specifics;
  }


  public void setSpecifics(String specifics) {
    
    
    
    this.specifics = specifics;
  }


  public VehicleGetDetailResponseData yearlyCost(VehicleGetDetailResponseDataYearlyCost yearlyCost) {
    
    
    
    
    this.yearlyCost = yearlyCost;
    return this;
  }

   /**
   * Get yearlyCost
   * @return yearlyCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VehicleGetDetailResponseDataYearlyCost getYearlyCost() {
    return yearlyCost;
  }


  public void setYearlyCost(VehicleGetDetailResponseDataYearlyCost yearlyCost) {
    
    
    
    this.yearlyCost = yearlyCost;
  }


  public VehicleGetDetailResponseData deleted(Integer deleted) {
    
    
    
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getDeleted() {
    return deleted;
  }


  public void setDeleted(Integer deleted) {
    
    
    
    this.deleted = deleted;
  }


  public VehicleGetDetailResponseData owner(VehicleGetDetailResponseDataOwner owner) {
    
    
    
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VehicleGetDetailResponseDataOwner getOwner() {
    return owner;
  }


  public void setOwner(VehicleGetDetailResponseDataOwner owner) {
    
    
    
    this.owner = owner;
  }


  public VehicleGetDetailResponseData customFields(List<VehicleGetDetailResponseDataCustomFieldsInner> customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

  public VehicleGetDetailResponseData addCustomFieldsItem(VehicleGetDetailResponseDataCustomFieldsInner customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VehicleGetDetailResponseDataCustomFieldsInner> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(List<VehicleGetDetailResponseDataCustomFieldsInner> customFields) {
    
    
    
    this.customFields = customFields;
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
   * @return the VehicleGetDetailResponseData instance itself
   */
  public VehicleGetDetailResponseData putAdditionalProperty(String key, Object value) {
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
    VehicleGetDetailResponseData vehicleGetDetailResponseData = (VehicleGetDetailResponseData) o;
    return Objects.equals(this.id, vehicleGetDetailResponseData.id) &&
        Objects.equals(this.type, vehicleGetDetailResponseData.type) &&
        Objects.equals(this.brand, vehicleGetDetailResponseData.brand) &&
        Objects.equals(this.model, vehicleGetDetailResponseData.model) &&
        Objects.equals(this.fuel, vehicleGetDetailResponseData.fuel) &&
        Objects.equals(this.plate, vehicleGetDetailResponseData.plate) &&
        Objects.equals(this.hp, vehicleGetDetailResponseData.hp) &&
        Objects.equals(this.co2GKm, vehicleGetDetailResponseData.co2GKm) &&
        Objects.equals(this.chassisNumber, vehicleGetDetailResponseData.chassisNumber) &&
        Objects.equals(this.color, vehicleGetDetailResponseData.color) &&
        Objects.equals(this.supplier, vehicleGetDetailResponseData.supplier) &&
        Objects.equals(this.contractType, vehicleGetDetailResponseData.contractType) &&
        Objects.equals(this.catalogueValue, vehicleGetDetailResponseData.catalogueValue) &&
        Objects.equals(this.dateFirstRegistration, vehicleGetDetailResponseData.dateFirstRegistration) &&
        Objects.equals(this.specifics, vehicleGetDetailResponseData.specifics) &&
        Objects.equals(this.yearlyCost, vehicleGetDetailResponseData.yearlyCost) &&
        Objects.equals(this.deleted, vehicleGetDetailResponseData.deleted) &&
        Objects.equals(this.owner, vehicleGetDetailResponseData.owner) &&
        Objects.equals(this.customFields, vehicleGetDetailResponseData.customFields)&&
        Objects.equals(this.additionalProperties, vehicleGetDetailResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, brand, model, fuel, plate, hp, co2GKm, chassisNumber, color, supplier, contractType, catalogueValue, dateFirstRegistration, specifics, yearlyCost, deleted, owner, customFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleGetDetailResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    fuel: ").append(toIndentedString(fuel)).append("\n");
    sb.append("    plate: ").append(toIndentedString(plate)).append("\n");
    sb.append("    hp: ").append(toIndentedString(hp)).append("\n");
    sb.append("    co2GKm: ").append(toIndentedString(co2GKm)).append("\n");
    sb.append("    chassisNumber: ").append(toIndentedString(chassisNumber)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    catalogueValue: ").append(toIndentedString(catalogueValue)).append("\n");
    sb.append("    dateFirstRegistration: ").append(toIndentedString(dateFirstRegistration)).append("\n");
    sb.append("    specifics: ").append(toIndentedString(specifics)).append("\n");
    sb.append("    yearlyCost: ").append(toIndentedString(yearlyCost)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("brand");
    openapiFields.add("model");
    openapiFields.add("fuel");
    openapiFields.add("plate");
    openapiFields.add("hp");
    openapiFields.add("co2_g_km");
    openapiFields.add("chassis_number");
    openapiFields.add("color");
    openapiFields.add("supplier");
    openapiFields.add("contract_type");
    openapiFields.add("catalogue_value");
    openapiFields.add("date_first_registration");
    openapiFields.add("specifics");
    openapiFields.add("yearly_cost");
    openapiFields.add("deleted");
    openapiFields.add("owner");
    openapiFields.add("custom_fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VehicleGetDetailResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VehicleGetDetailResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VehicleGetDetailResponseData is not found in the empty JSON string", VehicleGetDetailResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("fuel") != null && !jsonObj.get("fuel").isJsonNull()) && !jsonObj.get("fuel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fuel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fuel").toString()));
      }
      if ((jsonObj.get("plate") != null && !jsonObj.get("plate").isJsonNull()) && !jsonObj.get("plate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plate").toString()));
      }
      if ((jsonObj.get("chassis_number") != null && !jsonObj.get("chassis_number").isJsonNull()) && !jsonObj.get("chassis_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chassis_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chassis_number").toString()));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if ((jsonObj.get("supplier") != null && !jsonObj.get("supplier").isJsonNull()) && !jsonObj.get("supplier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supplier").toString()));
      }
      if ((jsonObj.get("contract_type") != null && !jsonObj.get("contract_type").isJsonNull()) && !jsonObj.get("contract_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_type").toString()));
      }
      if ((jsonObj.get("catalogue_value") != null && !jsonObj.get("catalogue_value").isJsonNull()) && !jsonObj.get("catalogue_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `catalogue_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("catalogue_value").toString()));
      }
      if ((jsonObj.get("date_first_registration") != null && !jsonObj.get("date_first_registration").isJsonNull()) && !jsonObj.get("date_first_registration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_first_registration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_first_registration").toString()));
      }
      if ((jsonObj.get("specifics") != null && !jsonObj.get("specifics").isJsonNull()) && !jsonObj.get("specifics").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specifics` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specifics").toString()));
      }
      // validate the optional field `yearly_cost`
      if (jsonObj.get("yearly_cost") != null && !jsonObj.get("yearly_cost").isJsonNull()) {
        VehicleGetDetailResponseDataYearlyCost.validateJsonObject(jsonObj.getAsJsonObject("yearly_cost"));
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        VehicleGetDetailResponseDataOwner.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      }
      if (jsonObj.get("custom_fields") != null && !jsonObj.get("custom_fields").isJsonNull()) {
        JsonArray jsonArraycustomFields = jsonObj.getAsJsonArray("custom_fields");
        if (jsonArraycustomFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom_fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom_fields` to be an array in the JSON string but got `%s`", jsonObj.get("custom_fields").toString()));
          }

          // validate the optional field `custom_fields` (array)
          for (int i = 0; i < jsonArraycustomFields.size(); i++) {
            VehicleGetDetailResponseDataCustomFieldsInner.validateJsonObject(jsonArraycustomFields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VehicleGetDetailResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VehicleGetDetailResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VehicleGetDetailResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VehicleGetDetailResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<VehicleGetDetailResponseData>() {
           @Override
           public void write(JsonWriter out, VehicleGetDetailResponseData value) throws IOException {
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
           public VehicleGetDetailResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VehicleGetDetailResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VehicleGetDetailResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VehicleGetDetailResponseData
  * @throws IOException if the JSON string is invalid with respect to VehicleGetDetailResponseData
  */
  public static VehicleGetDetailResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VehicleGetDetailResponseData.class);
  }

 /**
  * Convert an instance of VehicleGetDetailResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

