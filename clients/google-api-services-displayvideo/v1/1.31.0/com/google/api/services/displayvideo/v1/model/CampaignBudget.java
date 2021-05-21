/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.displayvideo.v1.model;

/**
 * Settings that control how the campaign budget is allocated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CampaignBudget extends com.google.api.client.json.GenericJson {

  /**
   * Required. The budget amount the insertion order will spend for the given date_range. The amount
   * is in micros. Must be greater than 0. For example, 500000000 represents 500 standard units of
   * the currency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long budgetAmountMicros;

  /**
   * The unique ID of the campaign budget. If not included, budget is assumed to be new.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long budgetId;

  /**
   * Required. Immutable. The budget unit specifies whether the budget is currency based or
   * impression based.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String budgetUnit;

  /**
   * Required. The flight start and end time settings of the segment. Both `start_date` and
   * `end_date` must be before the year 2037.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateRange dateRange;

  /**
   * Required. The display name of the budget. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Immutable. Must be unique under the campaign. If set, all impressions served against this
   * budget will include this ID on the invoice if the customer has opted into budget-segment-level
   * billing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalBudgetId;

  /**
   * Required. The external source of the budget segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalBudgetSource;

  /**
   * Immutable. If set, all external_budget_id sharing the same invoice_grouping_id will include
   * this ID on the invoice if the customer has opted into budget-segment-level billing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String invoiceGroupingId;

  /**
   * Required for MediaOcean budgets. Additional metadata set by the MediaOcean Prisma tool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrismaConfig prismaConfig;

  /**
   * Required. The budget amount the insertion order will spend for the given date_range. The amount
   * is in micros. Must be greater than 0. For example, 500000000 represents 500 standard units of
   * the currency.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBudgetAmountMicros() {
    return budgetAmountMicros;
  }

  /**
   * Required. The budget amount the insertion order will spend for the given date_range. The amount
   * is in micros. Must be greater than 0. For example, 500000000 represents 500 standard units of
   * the currency.
   * @param budgetAmountMicros budgetAmountMicros or {@code null} for none
   */
  public CampaignBudget setBudgetAmountMicros(java.lang.Long budgetAmountMicros) {
    this.budgetAmountMicros = budgetAmountMicros;
    return this;
  }

  /**
   * The unique ID of the campaign budget. If not included, budget is assumed to be new.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBudgetId() {
    return budgetId;
  }

  /**
   * The unique ID of the campaign budget. If not included, budget is assumed to be new.
   * @param budgetId budgetId or {@code null} for none
   */
  public CampaignBudget setBudgetId(java.lang.Long budgetId) {
    this.budgetId = budgetId;
    return this;
  }

  /**
   * Required. Immutable. The budget unit specifies whether the budget is currency based or
   * impression based.
   * @return value or {@code null} for none
   */
  public java.lang.String getBudgetUnit() {
    return budgetUnit;
  }

  /**
   * Required. Immutable. The budget unit specifies whether the budget is currency based or
   * impression based.
   * @param budgetUnit budgetUnit or {@code null} for none
   */
  public CampaignBudget setBudgetUnit(java.lang.String budgetUnit) {
    this.budgetUnit = budgetUnit;
    return this;
  }

  /**
   * Required. The flight start and end time settings of the segment. Both `start_date` and
   * `end_date` must be before the year 2037.
   * @return value or {@code null} for none
   */
  public DateRange getDateRange() {
    return dateRange;
  }

  /**
   * Required. The flight start and end time settings of the segment. Both `start_date` and
   * `end_date` must be before the year 2037.
   * @param dateRange dateRange or {@code null} for none
   */
  public CampaignBudget setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Required. The display name of the budget. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the budget. Must be UTF-8 encoded with a maximum size of 240
   * bytes.
   * @param displayName displayName or {@code null} for none
   */
  public CampaignBudget setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Immutable. Must be unique under the campaign. If set, all impressions served against this
   * budget will include this ID on the invoice if the customer has opted into budget-segment-level
   * billing.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalBudgetId() {
    return externalBudgetId;
  }

  /**
   * Immutable. Must be unique under the campaign. If set, all impressions served against this
   * budget will include this ID on the invoice if the customer has opted into budget-segment-level
   * billing.
   * @param externalBudgetId externalBudgetId or {@code null} for none
   */
  public CampaignBudget setExternalBudgetId(java.lang.String externalBudgetId) {
    this.externalBudgetId = externalBudgetId;
    return this;
  }

  /**
   * Required. The external source of the budget segment.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalBudgetSource() {
    return externalBudgetSource;
  }

  /**
   * Required. The external source of the budget segment.
   * @param externalBudgetSource externalBudgetSource or {@code null} for none
   */
  public CampaignBudget setExternalBudgetSource(java.lang.String externalBudgetSource) {
    this.externalBudgetSource = externalBudgetSource;
    return this;
  }

  /**
   * Immutable. If set, all external_budget_id sharing the same invoice_grouping_id will include
   * this ID on the invoice if the customer has opted into budget-segment-level billing.
   * @return value or {@code null} for none
   */
  public java.lang.String getInvoiceGroupingId() {
    return invoiceGroupingId;
  }

  /**
   * Immutable. If set, all external_budget_id sharing the same invoice_grouping_id will include
   * this ID on the invoice if the customer has opted into budget-segment-level billing.
   * @param invoiceGroupingId invoiceGroupingId or {@code null} for none
   */
  public CampaignBudget setInvoiceGroupingId(java.lang.String invoiceGroupingId) {
    this.invoiceGroupingId = invoiceGroupingId;
    return this;
  }

  /**
   * Required for MediaOcean budgets. Additional metadata set by the MediaOcean Prisma tool.
   * @return value or {@code null} for none
   */
  public PrismaConfig getPrismaConfig() {
    return prismaConfig;
  }

  /**
   * Required for MediaOcean budgets. Additional metadata set by the MediaOcean Prisma tool.
   * @param prismaConfig prismaConfig or {@code null} for none
   */
  public CampaignBudget setPrismaConfig(PrismaConfig prismaConfig) {
    this.prismaConfig = prismaConfig;
    return this;
  }

  @Override
  public CampaignBudget set(String fieldName, Object value) {
    return (CampaignBudget) super.set(fieldName, value);
  }

  @Override
  public CampaignBudget clone() {
    return (CampaignBudget) super.clone();
  }

}
