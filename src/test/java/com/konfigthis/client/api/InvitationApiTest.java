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
import com.konfigthis.client.model.InvitationGenerateSecretUrlRequest;
import com.konfigthis.client.model.InvitationGenerateSecretUrlResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvitationApi
 */
@Disabled
public class InvitationApiTest {

    private static InvitationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new InvitationApi(apiClient);
    }

    /**
     * Self-service invitation
     *
     * Generate a secret URL that brings a person straight to the HR self-service platform.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateSecretUrlTest() throws ApiException {
        String personId = null;
        InvitationGenerateSecretUrlResponse response = api.generateSecretUrl(personId)
                .execute();
        // TODO: test validations
    }

}
