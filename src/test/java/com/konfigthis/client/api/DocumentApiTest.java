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
import com.konfigthis.client.model.DocumentGetDownloadUrlResponse;
import com.konfigthis.client.model.DocumentRemoveResponse;
import com.konfigthis.client.model.DocumentUploadDocumentResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentApi
 */
@Disabled
public class DocumentApiTest {

    private static DocumentApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DocumentApi(apiClient);
    }

    /**
     * Download document
     *
     * This API call returns a download url for a document
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDownloadUrlTest() throws ApiException {
        Integer fileId = null;
        DocumentGetDownloadUrlResponse response = api.getDownloadUrl(fileId)
                .execute();
        // TODO: test validations
    }

    /**
     * List documents
     *
     * This API call lists up all documents related to a specific object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRelatedTest() throws ApiException {
        String objectType = null;
        Integer objectId = null;
        Integer page = null;
        String response = api.listRelated(objectType, objectId)
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete document
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTest() throws ApiException {
        Integer fileId = null;
        DocumentRemoveResponse response = api.remove(fileId)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload document
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadDocumentTest() throws ApiException {
        String objectType = null;
        Integer objectId = null;
        DocumentUploadDocumentResponse response = api.uploadDocument(objectType, objectId)
                .execute();
        // TODO: test validations
    }

}
