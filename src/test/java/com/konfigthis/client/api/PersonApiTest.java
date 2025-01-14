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
import java.time.OffsetDateTime;
import com.konfigthis.client.model.PersonAddNewResponse;
import com.konfigthis.client.model.PersonAddToCalendar200Response;
import com.konfigthis.client.model.PersonAddToCalendarResponse;
import com.konfigthis.client.model.PersonEditDetailResponse;
import com.konfigthis.client.model.PersonGetBudgetsByYearResponse;
import com.konfigthis.client.model.PersonGetCurrentWageResponse;
import com.konfigthis.client.model.PersonGetCustomFieldsResponse;
import com.konfigthis.client.model.PersonGetDailyCalendarResponse;
import com.konfigthis.client.model.PersonGetDetailResponse;
import com.konfigthis.client.model.PersonGetEventTypeLimitsResponse;
import com.konfigthis.client.model.PersonGetManagerDetailsResponse;
import com.konfigthis.client.model.PersonGetMonthlyCalendarResponse;
import com.konfigthis.client.model.PersonGetOneOffWageComponentsByMonthResponse;
import com.konfigthis.client.model.PersonGetPersonalDataChangesResponse;
import com.konfigthis.client.model.PersonGetVerzuimPeriodsResponse;
import com.konfigthis.client.model.PersonGetWageHistoryResponse;
import com.konfigthis.client.model.PersonGetYearlyCalendarResponse;
import com.konfigthis.client.model.PersonListAvailableComponentsResponse;
import com.konfigthis.client.model.PersonListBudgetItemsResponse;
import com.konfigthis.client.model.PersonListDimonasByPersonResponse;
import com.konfigthis.client.model.PersonListPeopleResponse;
import com.konfigthis.client.model.PersonOverwriteEventResponse;
import com.konfigthis.client.model.PersonRemoveEventResponse;
import com.konfigthis.client.model.PersonSearchByCriteriaResponseInner;
import com.konfigthis.client.model.PersonSetFunctionDescriptionResponse;
import com.konfigthis.client.model.PersonUpdateEventTypeLimitResponse;
import com.konfigthis.client.model.PersonUpdateManagerResponse;
import com.konfigthis.client.model.PersonUpdateTimeWorkedResponse;
import com.konfigthis.client.model.PersonUploadAvatarResponse;
import com.konfigthis.client.model.PersonViewRoleHistoryResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PersonApi
 */
@Disabled
public class PersonApiTest {

    private static PersonApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PersonApi(apiClient);
    }

    /**
     * Add person
     *
     * Add a new person to Officient
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewTest() throws ApiException {
        PersonAddNewResponse response = api.addNew()
                .execute();
        // TODO: test validations
    }

    /**
     * Add event
     *
     * Add new events to a calender (eg a day off, overtime,..)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToCalendarTest() throws ApiException {
        Integer personId = null;
        PersonAddToCalendarResponse response = api.addToCalendar(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Use priority scheme
     *
     * Adds events to a person&#39;s calendar based on a priority scheme of event types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToCalendar_0Test() throws ApiException {
        Integer personId = null;
        PersonAddToCalendar200Response response = api.addToCalendar_0(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit person
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editDetailTest() throws ApiException {
        Integer personId = null;
        PersonEditDetailResponse response = api.editDetail(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * List budgets
     *
     * Fetches a list of budgets for a given person and year.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBudgetsByYearTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        PersonGetBudgetsByYearResponse response = api.getBudgetsByYear(personId, year)
                .execute();
        // TODO: test validations
    }

    /**
     * Current wage
     *
     * Get the current wage details for one person
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentWageTest() throws ApiException {
        String personId = null;
        PersonGetCurrentWageResponse response = api.getCurrentWage(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Weekly schedule
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentWeeklyScheduleTest() throws ApiException {
        Integer personId = null;
        String response = api.getCurrentWeeklySchedule(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Person custom fields
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomFieldsTest() throws ApiException {
        Integer personId = null;
        PersonGetCustomFieldsResponse response = api.getCustomFields(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Daily calendar
     *
     * List the time off, overtime &amp; scheduled time for a single person for a single day
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDailyCalendarTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        Integer month = null;
        Integer day = null;
        PersonGetDailyCalendarResponse response = api.getDailyCalendar(personId, year, month, day)
                .execute();
        // TODO: test validations
    }

    /**
     * Person detail
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailTest() throws ApiException {
        String personId = null;
        PersonGetDetailResponse response = api.getDetail(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Event type limits
     *
     * This API can tell how many days off a certain person has in a certain year
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEventTypeLimitsTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        PersonGetEventTypeLimitsResponse response = api.getEventTypeLimits(personId, year)
                .execute();
        // TODO: test validations
    }

    /**
     * Person manager
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getManagerDetailsTest() throws ApiException {
        Integer personId = null;
        PersonGetManagerDetailsResponse response = api.getManagerDetails(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Monthly calendar
     *
     * List the time off, overtime &amp; scheduled time for a single person for an entire month
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMonthlyCalendarTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        Integer month = null;
        PersonGetMonthlyCalendarResponse response = api.getMonthlyCalendar(personId, year, month)
                .execute();
        // TODO: test validations
    }

    /**
     * Components by person by month
     *
     * Fetches the one-off wage components that are granted to a person on a specific month
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOneOffWageComponentsByMonthTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        Integer month = null;
        PersonGetOneOffWageComponentsByMonthResponse response = api.getOneOffWageComponentsByMonth(personId, year, month)
                .execute();
        // TODO: test validations
    }

    /**
     * List performance reviews
     *
     * show metadata for performance reviews by person. No content (notes,..) are exposed
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPerformanceReviewsByPersonTest() throws ApiException {
        Integer page = null;
        Integer personId = null;
        String response = api.getPerformanceReviewsByPerson(page, personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Personal data audit log
     *
     * Get the latest delta of changes to personal data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPersonalDataChangesTest() throws ApiException {
        OffsetDateTime sinceTimestamp = null;
        PersonGetPersonalDataChangesResponse response = api.getPersonalDataChanges()
                .sinceTimestamp(sinceTimestamp)
                .execute();
        // TODO: test validations
    }

    /**
     * List verzuim periods
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVerzuimPeriodsTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        PersonGetVerzuimPeriodsResponse response = api.getVerzuimPeriods(personId, year)
                .execute();
        // TODO: test validations
    }

    /**
     * Wage history
     *
     * Get the entire wage history for one person
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWageHistoryTest() throws ApiException {
        String personId = null;
        PersonGetWageHistoryResponse response = api.getWageHistory(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Yearly calendar
     *
     * List the time off, overtime &amp; scheduled time for a single person for an entire year
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getYearlyCalendarTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        String filter = null;
        PersonGetYearlyCalendarResponse response = api.getYearlyCalendar(personId, year)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * List available components
     *
     * Fetches a list of available one-off wage components (eg bonus, expense compensation,..) for a specific person.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAvailableComponentsTest() throws ApiException {
        PersonListAvailableComponentsResponse response = api.listAvailableComponents()
                .execute();
        // TODO: test validations
    }

    /**
     * List budget items
     *
     * Lists the items that are in a given budget.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBudgetItemsTest() throws ApiException {
        Integer personId = null;
        Integer budgetId = null;
        PersonListBudgetItemsResponse response = api.listBudgetItems(personId, budgetId)
                .execute();
        // TODO: test validations
    }

    /**
     * List dimonas by person
     *
     * Belgium only: this API allows you to list all historical DIMONA information for one person
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDimonasByPersonTest() throws ApiException {
        Integer personId = null;
        PersonListDimonasByPersonResponse response = api.listDimonasByPerson(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * List people
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPeopleTest() throws ApiException {
        Integer page = null;
        Integer includeArchived = null;
        PersonListPeopleResponse response = api.listPeople(page)
                .includeArchived(includeArchived)
                .execute();
        // TODO: test validations
    }

    /**
     * Overwrite event
     *
     * Create a new event or overwrite an existing one in a personal calender (eg a day off, overtime,..)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void overwriteEventTest() throws ApiException {
        String personId = null;
        String year = null;
        String month = null;
        String day = null;
        PersonOverwriteEventResponse response = api.overwriteEvent(personId, year, month, day)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete event
     *
     * Remove an event from the calender, such as a day off
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeEventTest() throws ApiException {
        Integer personId = null;
        Integer eventId = null;
        PersonRemoveEventResponse response = api.removeEvent(personId, eventId)
                .execute();
        // TODO: test validations
    }

    /**
     * Reset time worked
     *
     * reset the time worked on a given day to the regular work schedule for one person
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetTimeWorkedTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        Integer month = null;
        Integer day = null;
        Object response = api.resetTimeWorked(personId, year, month, day)
                .execute();
        // TODO: test validations
    }

    /**
     * Search people
     *
     * search people by name, email or national number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchByCriteriaTest() throws ApiException {
        String name = null;
        String email = null;
        String nationalNumber = null;
        List<PersonSearchByCriteriaResponseInner> response = api.searchByCriteria()
                .name(name)
                .email(email)
                .nationalNumber(nationalNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * Update role
     *
     * Set the function description for each person
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setFunctionDescriptionTest() throws ApiException {
        Integer personId = null;
        PersonSetFunctionDescriptionResponse response = api.setFunctionDescription(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update time worked in bulk
     *
     * Overwrite the amount of time worked for a set of days in bulk (eg for timetracking software integrations)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBulkTimeWorkedTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        Object response = api.updateBulkTimeWorked(personId, year)
                .execute();
        // TODO: test validations
    }

    /**
     * Set event type limit
     *
     * This API can update the limitations for a specific event type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEventTypeLimitTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        Integer typeId = null;
        PersonUpdateEventTypeLimitResponse response = api.updateEventTypeLimit(personId, year, typeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update manager
     *
     * Who reports to who?
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateManagerTest() throws ApiException {
        Integer personId = null;
        PersonUpdateManagerResponse response = api.updateManager(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update time worked
     *
     * Overwrite the amount of time worked on a certain day (eg for timetracking software integrations)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTimeWorkedTest() throws ApiException {
        Integer personId = null;
        Integer year = null;
        Integer month = null;
        Integer day = null;
        PersonUpdateTimeWorkedResponse response = api.updateTimeWorked(personId, year, month, day)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload avatar
     *
     * upload a photo of this person
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadAvatarTest() throws ApiException {
        Integer personId = null;
        PersonUploadAvatarResponse response = api.uploadAvatar(personId)
                .execute();
        // TODO: test validations
    }

    /**
     * Role History
     *
     * View the role history for one person
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewRoleHistoryTest() throws ApiException {
        Integer personId = null;
        PersonViewRoleHistoryResponse response = api.viewRoleHistory(personId)
                .execute();
        // TODO: test validations
    }

}
