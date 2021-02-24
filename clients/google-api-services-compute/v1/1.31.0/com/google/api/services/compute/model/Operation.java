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

package com.google.api.services.compute.model;

/**
 * Represents an Operation resource.
 *
 * Google Compute Engine has three Operation resources:
 *
 * * [Global](/compute/docs/reference/rest/{$api_version}/globalOperations) *
 * [Regional](/compute/docs/reference/rest/{$api_version}/regionOperations) *
 * [Zonal](/compute/docs/reference/rest/{$api_version}/zoneOperations)
 *
 * You can use an operation resource to manage asynchronous API requests. For more information, read
 * Handling API responses.
 *
 * Operations can be global, regional or zonal.   - For global operations, use the
 * `globalOperations` resource.  - For regional operations, use the `regionOperations` resource.  -
 * For zonal operations, use the `zonalOperations` resource.
 *
 * For more information, read  Global, Regional, and Zonal Resources. (== resource_for
 * {$api_version}.globalOperations ==) (== resource_for {$api_version}.regionOperations ==) (==
 * resource_for {$api_version}.zoneOperations ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Operation extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The value of `requestId` if you provided it in the request. Not present
   * otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientOperationId;

  /**
   * [Deprecated] This field is deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * [Output Only] A textual description of the operation, which is set when the operation is
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The time that this operation was completed. This value is in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endTime;

  /**
   * [Output Only] If errors are generated during processing of the operation, this field will be
   * populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Error error;

  /**
   * [Output Only] If the operation fails, this field contains the HTTP error message that was
   * returned, such as `NOT FOUND`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpErrorMessage;

  /**
   * [Output Only] If the operation fails, this field contains the HTTP error status code that was
   * returned. For example, a `404` means the resource was not found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer httpErrorStatusCode;

  /**
   * [Output Only] The unique identifier for the operation. This identifier is defined by the
   * server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] The time that this operation was requested. This value is in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insertTime;

  /**
   * [Output Only] Type of the resource. Always `compute#operation` for Operation resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] Name of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] An ID that represents a group of operations, such as when a group of operations
   * results from a `bulkInsert` API request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationGroupId;

  /**
   * [Output Only] The type of operation, such as `insert`, `update`, or `delete`, and so on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationType;

  /**
   * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement
   * that this be linear or support any granularity of operations. This should not be used to guess
   * when the operation will be complete. This number should monotonically increase as the operation
   * progresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer progress;

  /**
   * [Output Only] The URL of the region where the operation resides. Only applicable when
   * performing regional operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] The time that this operation was started by the server. This value is in RFC3339
   * text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTime;

  /**
   * [Output Only] The status of the operation, which can be one of the following: `PENDING`,
   * `RUNNING`, or `DONE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] An optional textual description of the current status of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * [Output Only] The unique target ID, which identifies a specific incarnation of the target
   * resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger targetId;

  /**
   * [Output Only] The URL of the resource that the operation modifies. For operations related to
   * creating a snapshot, this points to the persistent disk that the snapshot was created from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetLink;

  /**
   * [Output Only] User who requested the operation, for example: `user@example.com`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String user;

  /**
   * [Output Only] If warning messages are generated during processing of the operation, this field
   * will be populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Warnings> warnings;

  static {
    // hack to force ProGuard to consider Warnings used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Warnings.class);
  }

  /**
   * [Output Only] The URL of the zone where the operation resides. Only applicable when performing
   * per-zone operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * [Output Only] The value of `requestId` if you provided it in the request. Not present
   * otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientOperationId() {
    return clientOperationId;
  }

  /**
   * [Output Only] The value of `requestId` if you provided it in the request. Not present
   * otherwise.
   * @param clientOperationId clientOperationId or {@code null} for none
   */
  public Operation setClientOperationId(java.lang.String clientOperationId) {
    this.clientOperationId = clientOperationId;
    return this;
  }

  /**
   * [Deprecated] This field is deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Deprecated] This field is deprecated.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Operation setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * [Output Only] A textual description of the operation, which is set when the operation is
   * created.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * [Output Only] A textual description of the operation, which is set when the operation is
   * created.
   * @param description description or {@code null} for none
   */
  public Operation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The time that this operation was completed. This value is in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndTime() {
    return endTime;
  }

  /**
   * [Output Only] The time that this operation was completed. This value is in RFC3339 text format.
   * @param endTime endTime or {@code null} for none
   */
  public Operation setEndTime(java.lang.String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * [Output Only] If errors are generated during processing of the operation, this field will be
   * populated.
   * @return value or {@code null} for none
   */
  public Error getError() {
    return error;
  }

  /**
   * [Output Only] If errors are generated during processing of the operation, this field will be
   * populated.
   * @param error error or {@code null} for none
   */
  public Operation setError(Error error) {
    this.error = error;
    return this;
  }

  /**
   * [Output Only] If the operation fails, this field contains the HTTP error message that was
   * returned, such as `NOT FOUND`.
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpErrorMessage() {
    return httpErrorMessage;
  }

  /**
   * [Output Only] If the operation fails, this field contains the HTTP error message that was
   * returned, such as `NOT FOUND`.
   * @param httpErrorMessage httpErrorMessage or {@code null} for none
   */
  public Operation setHttpErrorMessage(java.lang.String httpErrorMessage) {
    this.httpErrorMessage = httpErrorMessage;
    return this;
  }

  /**
   * [Output Only] If the operation fails, this field contains the HTTP error status code that was
   * returned. For example, a `404` means the resource was not found.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHttpErrorStatusCode() {
    return httpErrorStatusCode;
  }

  /**
   * [Output Only] If the operation fails, this field contains the HTTP error status code that was
   * returned. For example, a `404` means the resource was not found.
   * @param httpErrorStatusCode httpErrorStatusCode or {@code null} for none
   */
  public Operation setHttpErrorStatusCode(java.lang.Integer httpErrorStatusCode) {
    this.httpErrorStatusCode = httpErrorStatusCode;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the operation. This identifier is defined by the
   * server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the operation. This identifier is defined by the
   * server.
   * @param id id or {@code null} for none
   */
  public Operation setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] The time that this operation was requested. This value is in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getInsertTime() {
    return insertTime;
  }

  /**
   * [Output Only] The time that this operation was requested. This value is in RFC3339 text format.
   * @param insertTime insertTime or {@code null} for none
   */
  public Operation setInsertTime(java.lang.String insertTime) {
    this.insertTime = insertTime;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always `compute#operation` for Operation resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always `compute#operation` for Operation resources.
   * @param kind kind or {@code null} for none
   */
  public Operation setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] Name of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * [Output Only] Name of the operation.
   * @param name name or {@code null} for none
   */
  public Operation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] An ID that represents a group of operations, such as when a group of operations
   * results from a `bulkInsert` API request.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationGroupId() {
    return operationGroupId;
  }

  /**
   * [Output Only] An ID that represents a group of operations, such as when a group of operations
   * results from a `bulkInsert` API request.
   * @param operationGroupId operationGroupId or {@code null} for none
   */
  public Operation setOperationGroupId(java.lang.String operationGroupId) {
    this.operationGroupId = operationGroupId;
    return this;
  }

  /**
   * [Output Only] The type of operation, such as `insert`, `update`, or `delete`, and so on.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationType() {
    return operationType;
  }

  /**
   * [Output Only] The type of operation, such as `insert`, `update`, or `delete`, and so on.
   * @param operationType operationType or {@code null} for none
   */
  public Operation setOperationType(java.lang.String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement
   * that this be linear or support any granularity of operations. This should not be used to guess
   * when the operation will be complete. This number should monotonically increase as the operation
   * progresses.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProgress() {
    return progress;
  }

  /**
   * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement
   * that this be linear or support any granularity of operations. This should not be used to guess
   * when the operation will be complete. This number should monotonically increase as the operation
   * progresses.
   * @param progress progress or {@code null} for none
   */
  public Operation setProgress(java.lang.Integer progress) {
    this.progress = progress;
    return this;
  }

  /**
   * [Output Only] The URL of the region where the operation resides. Only applicable when
   * performing regional operations.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] The URL of the region where the operation resides. Only applicable when
   * performing regional operations.
   * @param region region or {@code null} for none
   */
  public Operation setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Operation setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] The time that this operation was started by the server. This value is in RFC3339
   * text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTime() {
    return startTime;
  }

  /**
   * [Output Only] The time that this operation was started by the server. This value is in RFC3339
   * text format.
   * @param startTime startTime or {@code null} for none
   */
  public Operation setStartTime(java.lang.String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * [Output Only] The status of the operation, which can be one of the following: `PENDING`,
   * `RUNNING`, or `DONE`.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the operation, which can be one of the following: `PENDING`,
   * `RUNNING`, or `DONE`.
   * @param status status or {@code null} for none
   */
  public Operation setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] An optional textual description of the current status of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * [Output Only] An optional textual description of the current status of the operation.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public Operation setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * [Output Only] The unique target ID, which identifies a specific incarnation of the target
   * resource.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTargetId() {
    return targetId;
  }

  /**
   * [Output Only] The unique target ID, which identifies a specific incarnation of the target
   * resource.
   * @param targetId targetId or {@code null} for none
   */
  public Operation setTargetId(java.math.BigInteger targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * [Output Only] The URL of the resource that the operation modifies. For operations related to
   * creating a snapshot, this points to the persistent disk that the snapshot was created from.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetLink() {
    return targetLink;
  }

  /**
   * [Output Only] The URL of the resource that the operation modifies. For operations related to
   * creating a snapshot, this points to the persistent disk that the snapshot was created from.
   * @param targetLink targetLink or {@code null} for none
   */
  public Operation setTargetLink(java.lang.String targetLink) {
    this.targetLink = targetLink;
    return this;
  }

  /**
   * [Output Only] User who requested the operation, for example: `user@example.com`.
   * @return value or {@code null} for none
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * [Output Only] User who requested the operation, for example: `user@example.com`.
   * @param user user or {@code null} for none
   */
  public Operation setUser(java.lang.String user) {
    this.user = user;
    return this;
  }

  /**
   * [Output Only] If warning messages are generated during processing of the operation, this field
   * will be populated.
   * @return value or {@code null} for none
   */
  public java.util.List<Warnings> getWarnings() {
    return warnings;
  }

  /**
   * [Output Only] If warning messages are generated during processing of the operation, this field
   * will be populated.
   * @param warnings warnings or {@code null} for none
   */
  public Operation setWarnings(java.util.List<Warnings> warnings) {
    this.warnings = warnings;
    return this;
  }

  /**
   * [Output Only] The URL of the zone where the operation resides. Only applicable when performing
   * per-zone operations.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] The URL of the zone where the operation resides. Only applicable when performing
   * per-zone operations.
   * @param zone zone or {@code null} for none
   */
  public Operation setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Operation set(String fieldName, Object value) {
    return (Operation) super.set(fieldName, value);
  }

  @Override
  public Operation clone() {
    return (Operation) super.clone();
  }

  /**
   * [Output Only] If errors are generated during processing of the operation, this field will be
   * populated.
   */
  public static final class Error extends com.google.api.client.json.GenericJson {

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Errors> errors;

    static {
      // hack to force ProGuard to consider Errors used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Errors.class);
    }

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * @return value or {@code null} for none
     */
    public java.util.List<Errors> getErrors() {
      return errors;
    }

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * @param errors errors or {@code null} for none
     */
    public Error setErrors(java.util.List<Errors> errors) {
      this.errors = errors;
      return this;
    }

    @Override
    public Error set(String fieldName, Object value) {
      return (Error) super.set(fieldName, value);
    }

    @Override
    public Error clone() {
      return (Error) super.clone();
    }

    /**
     * Model definition for OperationErrorErrors.
     */
    public static final class Errors extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] The error type identifier for this error.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String code;

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String location;

      /**
       * [Output Only] An optional, human-readable error message.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String message;

      /**
       * [Output Only] The error type identifier for this error.
       * @return value or {@code null} for none
       */
      public java.lang.String getCode() {
        return code;
      }

      /**
       * [Output Only] The error type identifier for this error.
       * @param code code or {@code null} for none
       */
      public Errors setCode(java.lang.String code) {
        this.code = code;
        return this;
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * @return value or {@code null} for none
       */
      public java.lang.String getLocation() {
        return location;
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * @param location location or {@code null} for none
       */
      public Errors setLocation(java.lang.String location) {
        this.location = location;
        return this;
      }

      /**
       * [Output Only] An optional, human-readable error message.
       * @return value or {@code null} for none
       */
      public java.lang.String getMessage() {
        return message;
      }

      /**
       * [Output Only] An optional, human-readable error message.
       * @param message message or {@code null} for none
       */
      public Errors setMessage(java.lang.String message) {
        this.message = message;
        return this;
      }

      @Override
      public Errors set(String fieldName, Object value) {
        return (Errors) super.set(fieldName, value);
      }

      @Override
      public Errors clone() {
        return (Errors) super.clone();
      }

    }
  }

  /**
   * Model definition for OperationWarnings.
   */
  public static final class Warnings extends com.google.api.client.json.GenericJson {

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Data> data;

    static {
      // hack to force ProGuard to consider Data used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Data.class);
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String message;

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * @return value or {@code null} for none
     */
    public java.lang.String getCode() {
      return code;
    }

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * @param code code or {@code null} for none
     */
    public Warnings setCode(java.lang.String code) {
      this.code = code;
      return this;
    }

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * @return value or {@code null} for none
     */
    public java.util.List<Data> getData() {
      return data;
    }

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * @param data data or {@code null} for none
     */
    public Warnings setData(java.util.List<Data> data) {
      this.data = data;
      return this;
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * @return value or {@code null} for none
     */
    public java.lang.String getMessage() {
      return message;
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * @param message message or {@code null} for none
     */
    public Warnings setMessage(java.lang.String message) {
      this.message = message;
      return this;
    }

    @Override
    public Warnings set(String fieldName, Object value) {
      return (Warnings) super.set(fieldName, value);
    }

    @Override
    public Warnings clone() {
      return (Warnings) super.clone();
    }

    /**
     * Model definition for OperationWarningsData.
     */
    public static final class Data extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String key;

      /**
       * [Output Only] A warning data value corresponding to the key.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String value;

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * @return value or {@code null} for none
       */
      public java.lang.String getKey() {
        return key;
      }

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * @param key key or {@code null} for none
       */
      public Data setKey(java.lang.String key) {
        this.key = key;
        return this;
      }

      /**
       * [Output Only] A warning data value corresponding to the key.
       * @return value or {@code null} for none
       */
      public java.lang.String getValue() {
        return value;
      }

      /**
       * [Output Only] A warning data value corresponding to the key.
       * @param value value or {@code null} for none
       */
      public Data setValue(java.lang.String value) {
        this.value = value;
        return this;
      }

      @Override
      public Data set(String fieldName, Object value) {
        return (Data) super.set(fieldName, value);
      }

      @Override
      public Data clone() {
        return (Data) super.clone();
      }

    }
  }

}
