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
 * A single Invoice.
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
public final class Invoice extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Budget invoice grouping ID associated with the budget segment in the insertion
   * order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String budgetInvoiceGroupingId;

  /**
   * Output only. The list of summarized budget information associated with this invoice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BudgetSummary> budgetSummaries;

  static {
    // hack to force ProGuard to consider BudgetSummary used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BudgetSummary.class);
  }

  /**
   * Output only. The originally issued invoice that is being adjusted by this invoice, if
   * applicable. If there is a corrected invoice, the replaced_invoice_ids field will be empty. May
   * appear on invoice PDF as `Reference invoice number`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String correctedInvoiceId;

  /**
   * Output only. Invoice currency code in ISO 4217 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * Output only. Display name of the invoice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. The invoice due date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date dueDate;

  /**
   * Output only. The unique ID of the invoice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String invoiceId;

  /**
   * Output only. The type of invoice document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String invoiceType;

  /**
   * Output only. The date when the invoice was issued.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date issueDate;

  /**
   * Output only. The resource name of the invoice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The total amount of costs or adjustments not tied to a particular budget, in
   * micros of the invoice's currency. For example if currency_code is `USD`, then 1000000 micros is
   * one US dollar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long nonBudgetMicros;

  /**
   * Output only. The ID of the payments account the invoice belongs to. Appears on the invoice PDF
   * as `Billing Account Number`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentsAccountId;

  /**
   * Output only. The ID of the payments profile the invoice belongs to. Appears on the invoice PDF
   * as `Billing ID`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentsProfileId;

  /**
   * Output only. The URL to download a PDF copy of the invoice. Note that this URL is user specific
   * and requires a valid OAuth 2.0 access token to access. The access token must be provided in an
   * `Authorization: Bearer` HTTP header and be authorized for one of the following scopes: *
   * `https://www.googleapis.com/auth/display-video-mediaplanning` *
   * `https://www.googleapis.com/auth/display-video` The URL will only be usable for 7 days from
   * when the api is called.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pdfUrl;

  /**
   * Output only. Purchase order number associated with the invoice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purchaseOrderNumber;

  /**
   * Output only. The originally issued invoice(s) that is being cancelled by this invoice, if
   * applicable. If there are any replaced invoices, the corrected_invoice_id field will be empty.
   * May appear on invoice PDF as `Replaced invoice numbers`. Note: There may be multiple replaced
   * invoices due to consolidation of multiple invoices into a single invoice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> replacedInvoiceIds;

  /**
   * Output only. Service start and end dates which are covered by this invoice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateRange serviceDateRange;

  /**
   * Output only. The pre-tax subtotal amount, in micros of the invoice's currency. For example if
   * currency_code is `USD`, then 1000000 micros is one US dollar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long subtotalAmountMicros;

  /**
   * Output only. The invoice total amount, in micros of the invoice's currency. For example if
   * currency_code is `USD`, then 1000000 micros is one US dollar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalAmountMicros;

  /**
   * Output only. The sum of all taxes in invoice, in micros of the invoice's currency. For example
   * if currency_code is `USD`, then 1000000 micros is one US dollar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalTaxAmountMicros;

  /**
   * Output only. Budget invoice grouping ID associated with the budget segment in the insertion
   * order.
   * @return value or {@code null} for none
   */
  public java.lang.String getBudgetInvoiceGroupingId() {
    return budgetInvoiceGroupingId;
  }

  /**
   * Output only. Budget invoice grouping ID associated with the budget segment in the insertion
   * order.
   * @param budgetInvoiceGroupingId budgetInvoiceGroupingId or {@code null} for none
   */
  public Invoice setBudgetInvoiceGroupingId(java.lang.String budgetInvoiceGroupingId) {
    this.budgetInvoiceGroupingId = budgetInvoiceGroupingId;
    return this;
  }

  /**
   * Output only. The list of summarized budget information associated with this invoice.
   * @return value or {@code null} for none
   */
  public java.util.List<BudgetSummary> getBudgetSummaries() {
    return budgetSummaries;
  }

  /**
   * Output only. The list of summarized budget information associated with this invoice.
   * @param budgetSummaries budgetSummaries or {@code null} for none
   */
  public Invoice setBudgetSummaries(java.util.List<BudgetSummary> budgetSummaries) {
    this.budgetSummaries = budgetSummaries;
    return this;
  }

  /**
   * Output only. The originally issued invoice that is being adjusted by this invoice, if
   * applicable. If there is a corrected invoice, the replaced_invoice_ids field will be empty. May
   * appear on invoice PDF as `Reference invoice number`.
   * @return value or {@code null} for none
   */
  public java.lang.String getCorrectedInvoiceId() {
    return correctedInvoiceId;
  }

  /**
   * Output only. The originally issued invoice that is being adjusted by this invoice, if
   * applicable. If there is a corrected invoice, the replaced_invoice_ids field will be empty. May
   * appear on invoice PDF as `Reference invoice number`.
   * @param correctedInvoiceId correctedInvoiceId or {@code null} for none
   */
  public Invoice setCorrectedInvoiceId(java.lang.String correctedInvoiceId) {
    this.correctedInvoiceId = correctedInvoiceId;
    return this;
  }

  /**
   * Output only. Invoice currency code in ISO 4217 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Output only. Invoice currency code in ISO 4217 format.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public Invoice setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Output only. Display name of the invoice.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. Display name of the invoice.
   * @param displayName displayName or {@code null} for none
   */
  public Invoice setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. The invoice due date.
   * @return value or {@code null} for none
   */
  public Date getDueDate() {
    return dueDate;
  }

  /**
   * Output only. The invoice due date.
   * @param dueDate dueDate or {@code null} for none
   */
  public Invoice setDueDate(Date dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Output only. The unique ID of the invoice.
   * @return value or {@code null} for none
   */
  public java.lang.String getInvoiceId() {
    return invoiceId;
  }

  /**
   * Output only. The unique ID of the invoice.
   * @param invoiceId invoiceId or {@code null} for none
   */
  public Invoice setInvoiceId(java.lang.String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Output only. The type of invoice document.
   * @return value or {@code null} for none
   */
  public java.lang.String getInvoiceType() {
    return invoiceType;
  }

  /**
   * Output only. The type of invoice document.
   * @param invoiceType invoiceType or {@code null} for none
   */
  public Invoice setInvoiceType(java.lang.String invoiceType) {
    this.invoiceType = invoiceType;
    return this;
  }

  /**
   * Output only. The date when the invoice was issued.
   * @return value or {@code null} for none
   */
  public Date getIssueDate() {
    return issueDate;
  }

  /**
   * Output only. The date when the invoice was issued.
   * @param issueDate issueDate or {@code null} for none
   */
  public Invoice setIssueDate(Date issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Output only. The resource name of the invoice.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the invoice.
   * @param name name or {@code null} for none
   */
  public Invoice setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The total amount of costs or adjustments not tied to a particular budget, in
   * micros of the invoice's currency. For example if currency_code is `USD`, then 1000000 micros is
   * one US dollar.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNonBudgetMicros() {
    return nonBudgetMicros;
  }

  /**
   * Output only. The total amount of costs or adjustments not tied to a particular budget, in
   * micros of the invoice's currency. For example if currency_code is `USD`, then 1000000 micros is
   * one US dollar.
   * @param nonBudgetMicros nonBudgetMicros or {@code null} for none
   */
  public Invoice setNonBudgetMicros(java.lang.Long nonBudgetMicros) {
    this.nonBudgetMicros = nonBudgetMicros;
    return this;
  }

  /**
   * Output only. The ID of the payments account the invoice belongs to. Appears on the invoice PDF
   * as `Billing Account Number`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentsAccountId() {
    return paymentsAccountId;
  }

  /**
   * Output only. The ID of the payments account the invoice belongs to. Appears on the invoice PDF
   * as `Billing Account Number`.
   * @param paymentsAccountId paymentsAccountId or {@code null} for none
   */
  public Invoice setPaymentsAccountId(java.lang.String paymentsAccountId) {
    this.paymentsAccountId = paymentsAccountId;
    return this;
  }

  /**
   * Output only. The ID of the payments profile the invoice belongs to. Appears on the invoice PDF
   * as `Billing ID`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentsProfileId() {
    return paymentsProfileId;
  }

  /**
   * Output only. The ID of the payments profile the invoice belongs to. Appears on the invoice PDF
   * as `Billing ID`.
   * @param paymentsProfileId paymentsProfileId or {@code null} for none
   */
  public Invoice setPaymentsProfileId(java.lang.String paymentsProfileId) {
    this.paymentsProfileId = paymentsProfileId;
    return this;
  }

  /**
   * Output only. The URL to download a PDF copy of the invoice. Note that this URL is user specific
   * and requires a valid OAuth 2.0 access token to access. The access token must be provided in an
   * `Authorization: Bearer` HTTP header and be authorized for one of the following scopes: *
   * `https://www.googleapis.com/auth/display-video-mediaplanning` *
   * `https://www.googleapis.com/auth/display-video` The URL will only be usable for 7 days from
   * when the api is called.
   * @return value or {@code null} for none
   */
  public java.lang.String getPdfUrl() {
    return pdfUrl;
  }

  /**
   * Output only. The URL to download a PDF copy of the invoice. Note that this URL is user specific
   * and requires a valid OAuth 2.0 access token to access. The access token must be provided in an
   * `Authorization: Bearer` HTTP header and be authorized for one of the following scopes: *
   * `https://www.googleapis.com/auth/display-video-mediaplanning` *
   * `https://www.googleapis.com/auth/display-video` The URL will only be usable for 7 days from
   * when the api is called.
   * @param pdfUrl pdfUrl or {@code null} for none
   */
  public Invoice setPdfUrl(java.lang.String pdfUrl) {
    this.pdfUrl = pdfUrl;
    return this;
  }

  /**
   * Output only. Purchase order number associated with the invoice.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  /**
   * Output only. Purchase order number associated with the invoice.
   * @param purchaseOrderNumber purchaseOrderNumber or {@code null} for none
   */
  public Invoice setPurchaseOrderNumber(java.lang.String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

  /**
   * Output only. The originally issued invoice(s) that is being cancelled by this invoice, if
   * applicable. If there are any replaced invoices, the corrected_invoice_id field will be empty.
   * May appear on invoice PDF as `Replaced invoice numbers`. Note: There may be multiple replaced
   * invoices due to consolidation of multiple invoices into a single invoice.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReplacedInvoiceIds() {
    return replacedInvoiceIds;
  }

  /**
   * Output only. The originally issued invoice(s) that is being cancelled by this invoice, if
   * applicable. If there are any replaced invoices, the corrected_invoice_id field will be empty.
   * May appear on invoice PDF as `Replaced invoice numbers`. Note: There may be multiple replaced
   * invoices due to consolidation of multiple invoices into a single invoice.
   * @param replacedInvoiceIds replacedInvoiceIds or {@code null} for none
   */
  public Invoice setReplacedInvoiceIds(java.util.List<java.lang.String> replacedInvoiceIds) {
    this.replacedInvoiceIds = replacedInvoiceIds;
    return this;
  }

  /**
   * Output only. Service start and end dates which are covered by this invoice.
   * @return value or {@code null} for none
   */
  public DateRange getServiceDateRange() {
    return serviceDateRange;
  }

  /**
   * Output only. Service start and end dates which are covered by this invoice.
   * @param serviceDateRange serviceDateRange or {@code null} for none
   */
  public Invoice setServiceDateRange(DateRange serviceDateRange) {
    this.serviceDateRange = serviceDateRange;
    return this;
  }

  /**
   * Output only. The pre-tax subtotal amount, in micros of the invoice's currency. For example if
   * currency_code is `USD`, then 1000000 micros is one US dollar.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubtotalAmountMicros() {
    return subtotalAmountMicros;
  }

  /**
   * Output only. The pre-tax subtotal amount, in micros of the invoice's currency. For example if
   * currency_code is `USD`, then 1000000 micros is one US dollar.
   * @param subtotalAmountMicros subtotalAmountMicros or {@code null} for none
   */
  public Invoice setSubtotalAmountMicros(java.lang.Long subtotalAmountMicros) {
    this.subtotalAmountMicros = subtotalAmountMicros;
    return this;
  }

  /**
   * Output only. The invoice total amount, in micros of the invoice's currency. For example if
   * currency_code is `USD`, then 1000000 micros is one US dollar.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalAmountMicros() {
    return totalAmountMicros;
  }

  /**
   * Output only. The invoice total amount, in micros of the invoice's currency. For example if
   * currency_code is `USD`, then 1000000 micros is one US dollar.
   * @param totalAmountMicros totalAmountMicros or {@code null} for none
   */
  public Invoice setTotalAmountMicros(java.lang.Long totalAmountMicros) {
    this.totalAmountMicros = totalAmountMicros;
    return this;
  }

  /**
   * Output only. The sum of all taxes in invoice, in micros of the invoice's currency. For example
   * if currency_code is `USD`, then 1000000 micros is one US dollar.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalTaxAmountMicros() {
    return totalTaxAmountMicros;
  }

  /**
   * Output only. The sum of all taxes in invoice, in micros of the invoice's currency. For example
   * if currency_code is `USD`, then 1000000 micros is one US dollar.
   * @param totalTaxAmountMicros totalTaxAmountMicros or {@code null} for none
   */
  public Invoice setTotalTaxAmountMicros(java.lang.Long totalTaxAmountMicros) {
    this.totalTaxAmountMicros = totalTaxAmountMicros;
    return this;
  }

  @Override
  public Invoice set(String fieldName, Object value) {
    return (Invoice) super.set(fieldName, value);
  }

  @Override
  public Invoice clone() {
    return (Invoice) super.clone();
  }

}
