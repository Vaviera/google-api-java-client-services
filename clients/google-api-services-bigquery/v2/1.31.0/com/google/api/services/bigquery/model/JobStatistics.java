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

package com.google.api.services.bigquery.model;

/**
 * Model definition for JobStatistics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobStatistics extends com.google.api.client.json.GenericJson {

  /**
   * [TrustedTester] [Output-only] Job progress (0.0 -> 1.0) for LOAD and EXTRACT jobs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double completionRatio;

  /**
   * [Output-only] Statistics for a copy job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobStatistics5 copy;

  /**
   * [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be
   * present on all jobs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long creationTime;

  /**
   * [Output-only] End time of this job, in milliseconds since the epoch. This field will be present
   * whenever a job is in the DONE state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endTime;

  /**
   * [Output-only] Statistics for an extract job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobStatistics4 extract;

  /**
   * [Output-only] Statistics for a load job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobStatistics3 load;

  /**
   * [Output-only] Number of child jobs executed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numChildJobs;

  /**
   * [Output-only] If this is a child job, the id of the parent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentJobId;

  /**
   * [Output-only] Statistics for a query job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobStatistics2 query;

  /**
   * [Output-only] Quotas which delayed this job's start time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> quotaDeferments;

  /**
   * [Output-only] Job resource usage breakdown by reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReservationUsage> reservationUsage;

  static {
    // hack to force ProGuard to consider ReservationUsage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ReservationUsage.class);
  }

  /**
   * [Output-only] Name of the primary reservation assigned to this job. Note that this could be
   * different than reservations reported in the reservation usage field if parent reservations were
   * used to execute this job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("reservation_id")
  private java.lang.String reservationId;

  /**
   * [Output-only] [Preview] Statistics for row-level security. Present only for query and extract
   * jobs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RowLevelSecurityStatistics rowLevelSecurityStatistics;

  /**
   * [Output-only] Statistics for a child job of a script.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ScriptStatistics scriptStatistics;

  /**
   * [Output-only] [Preview] Information of the session if this job is part of one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SessionInfo sessionInfo;

  /**
   * [Output-only] Start time of this job, in milliseconds since the epoch. This field will be
   * present when the job transitions from the PENDING state to either RUNNING or DONE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startTime;

  /**
   * [Output-only] [Deprecated] Use the bytes processed in the query statistics instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalBytesProcessed;

  /**
   * [Output-only] Slot-milliseconds for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalSlotMs;

  /**
   * [Output-only] [Alpha] Information of the multi-statement transaction if this job is part of
   * one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransactionInfo transactionInfo;

  /**
   * [TrustedTester] [Output-only] Job progress (0.0 -> 1.0) for LOAD and EXTRACT jobs.
   * @return value or {@code null} for none
   */
  public java.lang.Double getCompletionRatio() {
    return completionRatio;
  }

  /**
   * [TrustedTester] [Output-only] Job progress (0.0 -> 1.0) for LOAD and EXTRACT jobs.
   * @param completionRatio completionRatio or {@code null} for none
   */
  public JobStatistics setCompletionRatio(java.lang.Double completionRatio) {
    this.completionRatio = completionRatio;
    return this;
  }

  /**
   * [Output-only] Statistics for a copy job.
   * @return value or {@code null} for none
   */
  public JobStatistics5 getCopy() {
    return copy;
  }

  /**
   * [Output-only] Statistics for a copy job.
   * @param copy copy or {@code null} for none
   */
  public JobStatistics setCopy(JobStatistics5 copy) {
    this.copy = copy;
    return this;
  }

  /**
   * [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be
   * present on all jobs.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreationTime() {
    return creationTime;
  }

  /**
   * [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be
   * present on all jobs.
   * @param creationTime creationTime or {@code null} for none
   */
  public JobStatistics setCreationTime(java.lang.Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * [Output-only] End time of this job, in milliseconds since the epoch. This field will be present
   * whenever a job is in the DONE state.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndTime() {
    return endTime;
  }

  /**
   * [Output-only] End time of this job, in milliseconds since the epoch. This field will be present
   * whenever a job is in the DONE state.
   * @param endTime endTime or {@code null} for none
   */
  public JobStatistics setEndTime(java.lang.Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * [Output-only] Statistics for an extract job.
   * @return value or {@code null} for none
   */
  public JobStatistics4 getExtract() {
    return extract;
  }

  /**
   * [Output-only] Statistics for an extract job.
   * @param extract extract or {@code null} for none
   */
  public JobStatistics setExtract(JobStatistics4 extract) {
    this.extract = extract;
    return this;
  }

  /**
   * [Output-only] Statistics for a load job.
   * @return value or {@code null} for none
   */
  public JobStatistics3 getLoad() {
    return load;
  }

  /**
   * [Output-only] Statistics for a load job.
   * @param load load or {@code null} for none
   */
  public JobStatistics setLoad(JobStatistics3 load) {
    this.load = load;
    return this;
  }

  /**
   * [Output-only] Number of child jobs executed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumChildJobs() {
    return numChildJobs;
  }

  /**
   * [Output-only] Number of child jobs executed.
   * @param numChildJobs numChildJobs or {@code null} for none
   */
  public JobStatistics setNumChildJobs(java.lang.Long numChildJobs) {
    this.numChildJobs = numChildJobs;
    return this;
  }

  /**
   * [Output-only] If this is a child job, the id of the parent.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentJobId() {
    return parentJobId;
  }

  /**
   * [Output-only] If this is a child job, the id of the parent.
   * @param parentJobId parentJobId or {@code null} for none
   */
  public JobStatistics setParentJobId(java.lang.String parentJobId) {
    this.parentJobId = parentJobId;
    return this;
  }

  /**
   * [Output-only] Statistics for a query job.
   * @return value or {@code null} for none
   */
  public JobStatistics2 getQuery() {
    return query;
  }

  /**
   * [Output-only] Statistics for a query job.
   * @param query query or {@code null} for none
   */
  public JobStatistics setQuery(JobStatistics2 query) {
    this.query = query;
    return this;
  }

  /**
   * [Output-only] Quotas which delayed this job's start time.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getQuotaDeferments() {
    return quotaDeferments;
  }

  /**
   * [Output-only] Quotas which delayed this job's start time.
   * @param quotaDeferments quotaDeferments or {@code null} for none
   */
  public JobStatistics setQuotaDeferments(java.util.List<java.lang.String> quotaDeferments) {
    this.quotaDeferments = quotaDeferments;
    return this;
  }

  /**
   * [Output-only] Job resource usage breakdown by reservation.
   * @return value or {@code null} for none
   */
  public java.util.List<ReservationUsage> getReservationUsage() {
    return reservationUsage;
  }

  /**
   * [Output-only] Job resource usage breakdown by reservation.
   * @param reservationUsage reservationUsage or {@code null} for none
   */
  public JobStatistics setReservationUsage(java.util.List<ReservationUsage> reservationUsage) {
    this.reservationUsage = reservationUsage;
    return this;
  }

  /**
   * [Output-only] Name of the primary reservation assigned to this job. Note that this could be
   * different than reservations reported in the reservation usage field if parent reservations were
   * used to execute this job.
   * @return value or {@code null} for none
   */
  public java.lang.String getReservationId() {
    return reservationId;
  }

  /**
   * [Output-only] Name of the primary reservation assigned to this job. Note that this could be
   * different than reservations reported in the reservation usage field if parent reservations were
   * used to execute this job.
   * @param reservationId reservationId or {@code null} for none
   */
  public JobStatistics setReservationId(java.lang.String reservationId) {
    this.reservationId = reservationId;
    return this;
  }

  /**
   * [Output-only] [Preview] Statistics for row-level security. Present only for query and extract
   * jobs.
   * @return value or {@code null} for none
   */
  public RowLevelSecurityStatistics getRowLevelSecurityStatistics() {
    return rowLevelSecurityStatistics;
  }

  /**
   * [Output-only] [Preview] Statistics for row-level security. Present only for query and extract
   * jobs.
   * @param rowLevelSecurityStatistics rowLevelSecurityStatistics or {@code null} for none
   */
  public JobStatistics setRowLevelSecurityStatistics(RowLevelSecurityStatistics rowLevelSecurityStatistics) {
    this.rowLevelSecurityStatistics = rowLevelSecurityStatistics;
    return this;
  }

  /**
   * [Output-only] Statistics for a child job of a script.
   * @return value or {@code null} for none
   */
  public ScriptStatistics getScriptStatistics() {
    return scriptStatistics;
  }

  /**
   * [Output-only] Statistics for a child job of a script.
   * @param scriptStatistics scriptStatistics or {@code null} for none
   */
  public JobStatistics setScriptStatistics(ScriptStatistics scriptStatistics) {
    this.scriptStatistics = scriptStatistics;
    return this;
  }

  /**
   * [Output-only] [Preview] Information of the session if this job is part of one.
   * @return value or {@code null} for none
   */
  public SessionInfo getSessionInfo() {
    return sessionInfo;
  }

  /**
   * [Output-only] [Preview] Information of the session if this job is part of one.
   * @param sessionInfo sessionInfo or {@code null} for none
   */
  public JobStatistics setSessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }

  /**
   * [Output-only] Start time of this job, in milliseconds since the epoch. This field will be
   * present when the job transitions from the PENDING state to either RUNNING or DONE.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartTime() {
    return startTime;
  }

  /**
   * [Output-only] Start time of this job, in milliseconds since the epoch. This field will be
   * present when the job transitions from the PENDING state to either RUNNING or DONE.
   * @param startTime startTime or {@code null} for none
   */
  public JobStatistics setStartTime(java.lang.Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * [Output-only] [Deprecated] Use the bytes processed in the query statistics instead.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalBytesProcessed() {
    return totalBytesProcessed;
  }

  /**
   * [Output-only] [Deprecated] Use the bytes processed in the query statistics instead.
   * @param totalBytesProcessed totalBytesProcessed or {@code null} for none
   */
  public JobStatistics setTotalBytesProcessed(java.lang.Long totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
    return this;
  }

  /**
   * [Output-only] Slot-milliseconds for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalSlotMs() {
    return totalSlotMs;
  }

  /**
   * [Output-only] Slot-milliseconds for the job.
   * @param totalSlotMs totalSlotMs or {@code null} for none
   */
  public JobStatistics setTotalSlotMs(java.lang.Long totalSlotMs) {
    this.totalSlotMs = totalSlotMs;
    return this;
  }

  /**
   * [Output-only] [Alpha] Information of the multi-statement transaction if this job is part of
   * one.
   * @return value or {@code null} for none
   */
  public TransactionInfo getTransactionInfo() {
    return transactionInfo;
  }

  /**
   * [Output-only] [Alpha] Information of the multi-statement transaction if this job is part of
   * one.
   * @param transactionInfo transactionInfo or {@code null} for none
   */
  public JobStatistics setTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
    return this;
  }

  @Override
  public JobStatistics set(String fieldName, Object value) {
    return (JobStatistics) super.set(fieldName, value);
  }

  @Override
  public JobStatistics clone() {
    return (JobStatistics) super.clone();
  }

  /**
   * Model definition for JobStatisticsReservationUsage.
   */
  public static final class ReservationUsage extends com.google.api.client.json.GenericJson {

    /**
     * [Output-only] Reservation name or "unreserved" for on-demand resources usage.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * [Output-only] Slot-milliseconds the job spent in the given reservation.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long slotMs;

    /**
     * [Output-only] Reservation name or "unreserved" for on-demand resources usage.
     * @return value or {@code null} for none
     */
    public java.lang.String getName() {
      return name;
    }

    /**
     * [Output-only] Reservation name or "unreserved" for on-demand resources usage.
     * @param name name or {@code null} for none
     */
    public ReservationUsage setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    /**
     * [Output-only] Slot-milliseconds the job spent in the given reservation.
     * @return value or {@code null} for none
     */
    public java.lang.Long getSlotMs() {
      return slotMs;
    }

    /**
     * [Output-only] Slot-milliseconds the job spent in the given reservation.
     * @param slotMs slotMs or {@code null} for none
     */
    public ReservationUsage setSlotMs(java.lang.Long slotMs) {
      this.slotMs = slotMs;
      return this;
    }

    @Override
    public ReservationUsage set(String fieldName, Object value) {
      return (ReservationUsage) super.set(fieldName, value);
    }

    @Override
    public ReservationUsage clone() {
      return (ReservationUsage) super.clone();
    }

  }

}
