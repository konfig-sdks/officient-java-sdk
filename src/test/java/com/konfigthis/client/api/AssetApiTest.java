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
import com.konfigthis.client.model.AssetAddCustomTypeResponse;
import com.konfigthis.client.model.AssetCreateNewAssetResponse;
import com.konfigthis.client.model.AssetGetCustomTypesListResponse;
import com.konfigthis.client.model.AssetGetDetailResponse;
import com.konfigthis.client.model.AssetListAssetsResponse;
import com.konfigthis.client.model.AssetRemoveCustomTypeResponse;
import com.konfigthis.client.model.AssetRemoveResponse;
import com.konfigthis.client.model.AssetUpdateAssetResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssetApi
 */
@Disabled
public class AssetApiTest {

    private static AssetApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AssetApi(apiClient);
    }

    /**
     * Add custom asset type
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCustomTypeTest() throws ApiException {
        AssetAddCustomTypeResponse response = api.addCustomType()
                .execute();
        // TODO: test validations
    }

    /**
     * Add asset
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewAssetTest() throws ApiException {
        AssetCreateNewAssetResponse response = api.createNewAsset()
                .execute();
        // TODO: test validations
    }

    /**
     * List custom asset types
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomTypesListTest() throws ApiException {
        AssetGetCustomTypesListResponse response = api.getCustomTypesList()
                .execute();
        // TODO: test validations
    }

    /**
     * Asset detail
     *
     * Get details about one asset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailTest() throws ApiException {
        Integer assetId = null;
        AssetGetDetailResponse response = api.getDetail(assetId)
                .execute();
        // TODO: test validations
    }

    /**
     * List assets
     *
     * List all assets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAssetsTest() throws ApiException {
        Integer page = null;
        Integer personId = null;
        AssetListAssetsResponse response = api.listAssets()
                .page(page)
                .personId(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete asset
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTest() throws ApiException {
        Integer assetId = null;
        AssetRemoveResponse response = api.remove(assetId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete custom asset type
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeCustomTypeTest() throws ApiException {
        Integer assetTypeId = null;
        AssetRemoveCustomTypeResponse response = api.removeCustomType(assetTypeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit asset
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAssetTest() throws ApiException {
        Integer assetId = null;
        AssetUpdateAssetResponse response = api.updateAsset(assetId)
                .execute();
        // TODO: test validations
    }

}