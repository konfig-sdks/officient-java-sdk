package com.konfigthis.client;

import com.konfigthis.client.api.AccountApi;
import com.konfigthis.client.api.AssetApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.BudgetApi;
import com.konfigthis.client.api.CalendarRequestApi;
import com.konfigthis.client.api.CalendarStateApi;
import com.konfigthis.client.api.ComponentApi;
import com.konfigthis.client.api.ContractApi;
import com.konfigthis.client.api.CostCenterApi;
import com.konfigthis.client.api.CostUnitApi;
import com.konfigthis.client.api.CustomEventTypeApi;
import com.konfigthis.client.api.CustomFieldApi;
import com.konfigthis.client.api.DepartmentApi;
import com.konfigthis.client.api.DocumentApi;
import com.konfigthis.client.api.ExpenseApi;
import com.konfigthis.client.api.FunctionApi;
import com.konfigthis.client.api.InvitationApi;
import com.konfigthis.client.api.PersonApi;
import com.konfigthis.client.api.PrioritySchemeApi;
import com.konfigthis.client.api.TeamApi;
import com.konfigthis.client.api.VehicleApi;
import com.konfigthis.client.api.WebhookApi;

public class Officient {
    private ApiClient apiClient;
    public final AccountApi account;
    public final AssetApi asset;
    public final AuthenticationApi authentication;
    public final BudgetApi budget;
    public final CalendarRequestApi calendarRequest;
    public final CalendarStateApi calendarState;
    public final ComponentApi component;
    public final ContractApi contract;
    public final CostCenterApi costCenter;
    public final CostUnitApi costUnit;
    public final CustomEventTypeApi customEventType;
    public final CustomFieldApi customField;
    public final DepartmentApi department;
    public final DocumentApi document;
    public final ExpenseApi expense;
    public final FunctionApi function;
    public final InvitationApi invitation;
    public final PersonApi person;
    public final PrioritySchemeApi priorityScheme;
    public final TeamApi team;
    public final VehicleApi vehicle;
    public final WebhookApi webhook;

    public Officient() {
        this(null);
    }

    public Officient(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.account = new AccountApi(this.apiClient);
        this.asset = new AssetApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.budget = new BudgetApi(this.apiClient);
        this.calendarRequest = new CalendarRequestApi(this.apiClient);
        this.calendarState = new CalendarStateApi(this.apiClient);
        this.component = new ComponentApi(this.apiClient);
        this.contract = new ContractApi(this.apiClient);
        this.costCenter = new CostCenterApi(this.apiClient);
        this.costUnit = new CostUnitApi(this.apiClient);
        this.customEventType = new CustomEventTypeApi(this.apiClient);
        this.customField = new CustomFieldApi(this.apiClient);
        this.department = new DepartmentApi(this.apiClient);
        this.document = new DocumentApi(this.apiClient);
        this.expense = new ExpenseApi(this.apiClient);
        this.function = new FunctionApi(this.apiClient);
        this.invitation = new InvitationApi(this.apiClient);
        this.person = new PersonApi(this.apiClient);
        this.priorityScheme = new PrioritySchemeApi(this.apiClient);
        this.team = new TeamApi(this.apiClient);
        this.vehicle = new VehicleApi(this.apiClient);
        this.webhook = new WebhookApi(this.apiClient);
    }

}
