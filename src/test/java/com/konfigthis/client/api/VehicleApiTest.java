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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.VehicleCreateNewResponse;
import com.konfigthis.client.model.VehicleEditDetailsResponse;
import com.konfigthis.client.model.VehicleGetAllVehiclesResponse;
import com.konfigthis.client.model.VehicleGetDetailResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VehicleApi
 */
@Disabled
public class VehicleApiTest {

    private static VehicleApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VehicleApi(apiClient);
    }

    /**
     * Add vehicle
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewTest() throws ApiException {
        VehicleCreateNewResponse response = api.createNew()
                .execute();
        // TODO: test validations
    }

    /**
     * Edit vehicle
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editDetailsTest() throws ApiException {
        Integer vehicleId = null;
        VehicleEditDetailsResponse response = api.editDetails(vehicleId)
                .execute();
        // TODO: test validations
    }

    /**
     * List vehicles
     *
     * Get a list of all vehicles in the fleet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllVehiclesTest() throws ApiException {
        Integer page = null;
        Integer personId = null;
        VehicleGetAllVehiclesResponse response = api.getAllVehicles(page)
                .personId(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Vehicle detail
     *
     * Get details about one vehicle in the fleet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailTest() throws ApiException {
        Integer vehicleId = null;
        VehicleGetDetailResponse response = api.getDetail(vehicleId)
                .execute();
        // TODO: test validations
    }

}
