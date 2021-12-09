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

package com.google.api.services.storagetransfer.v1.model;

/**
 * Conditions that determine which objects are transferred. Applies only to Cloud Data Sources such
 * as S3, Azure, and Cloud Storage. The "last modification time" refers to the time of the last
 * change to the object's content or metadata — specifically, this is the `updated` property of
 * Cloud Storage objects, the `LastModified` field of S3 objects, and the `Last-Modified` header of
 * Azure blobs. Transfers with a PosixFilesystem source or destination don't support
 * `ObjectConditions`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ObjectConditions extends com.google.api.client.json.GenericJson {

  /**
   * If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the
   * `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must
   * not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The
   * following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any
   * sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not
   * contain Carriage Return or Line Feed characters. Wildcard matching and regular expression
   * matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to
   * exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as
   * `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. *
   * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix
   * may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each
   * exclude-prefix must start with the value of a path explicitly included by `include_prefixes`.
   * The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from
   * transfers](/storage-transfer/docs/filtering-objects-from-transfers).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludePrefixes;

  /**
   * If you specify `include_prefixes`, Storage Transfer Service uses the items in the
   * `include_prefixes` array to determine which objects to include in a transfer. Objects must
   * start with one of the matching `include_prefixes` for inclusion in the transfer. If
   * exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes`
   * specified for inclusion in the transfer. The following are requirements of `include_prefixes`:
   * * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024
   * bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard
   * matching and regular expression matching are not supported. * Each include-prefix must omit the
   * leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`,
   * specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values
   * can be empty, if specified. * Each include-prefix must include a distinct portion of the object
   * namespace. No include-prefix may be a prefix of another include-prefix. The max size of
   * `include_prefixes` is 1000. For more information, see [Filtering objects from transfers
   * ](/storage-transfer/docs/filtering-objects-from-transfers).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includePrefixes;

  /**
   * If specified, only objects with a "last modification time" before this timestamp and objects
   * that don't have a "last modification time" are transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastModifiedBefore;

  /**
   * If specified, only objects with a "last modification time" on or after this timestamp and
   * objects that don't have a "last modification time" are transferred. The `last_modified_since`
   * and `last_modified_before` fields can be used together for chunked data processing. For
   * example, consider a script that processes each day's worth of data at a time. For that you'd
   * set each of the fields as follows: * `last_modified_since` to the start of the day *
   * `last_modified_before` to the end of the day
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastModifiedSince;

  /**
   * Ensures that objects are not transferred if a specific maximum time has elapsed since the "last
   * modification time". When a TransferOperation begins, objects with a "last modification time"
   * are transferred only if the elapsed time between the start_time of the `TransferOperation`and
   * the "last modification time" of the object is less than the value of
   * max_time_elapsed_since_last_modification`. Objects that do not have a "last modification time"
   * are also transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxTimeElapsedSinceLastModification;

  /**
   * Ensures that objects are not transferred until a specific minimum time has elapsed after the
   * "last modification time". When a TransferOperation begins, objects with a "last modification
   * time" are transferred only if the elapsed time between the start_time of the
   * `TransferOperation` and the "last modification time" of the object is equal to or greater than
   * the value of min_time_elapsed_since_last_modification`. Objects that do not have a "last
   * modification time" are also transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String minTimeElapsedSinceLastModification;

  /**
   * If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the
   * `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must
   * not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The
   * following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any
   * sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not
   * contain Carriage Return or Line Feed characters. Wildcard matching and regular expression
   * matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to
   * exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as
   * `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. *
   * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix
   * may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each
   * exclude-prefix must start with the value of a path explicitly included by `include_prefixes`.
   * The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from
   * transfers](/storage-transfer/docs/filtering-objects-from-transfers).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludePrefixes() {
    return excludePrefixes;
  }

  /**
   * If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the
   * `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must
   * not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The
   * following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any
   * sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not
   * contain Carriage Return or Line Feed characters. Wildcard matching and regular expression
   * matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to
   * exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as
   * `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. *
   * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix
   * may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each
   * exclude-prefix must start with the value of a path explicitly included by `include_prefixes`.
   * The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from
   * transfers](/storage-transfer/docs/filtering-objects-from-transfers).
   * @param excludePrefixes excludePrefixes or {@code null} for none
   */
  public ObjectConditions setExcludePrefixes(java.util.List<java.lang.String> excludePrefixes) {
    this.excludePrefixes = excludePrefixes;
    return this;
  }

  /**
   * If you specify `include_prefixes`, Storage Transfer Service uses the items in the
   * `include_prefixes` array to determine which objects to include in a transfer. Objects must
   * start with one of the matching `include_prefixes` for inclusion in the transfer. If
   * exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes`
   * specified for inclusion in the transfer. The following are requirements of `include_prefixes`:
   * * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024
   * bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard
   * matching and regular expression matching are not supported. * Each include-prefix must omit the
   * leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`,
   * specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values
   * can be empty, if specified. * Each include-prefix must include a distinct portion of the object
   * namespace. No include-prefix may be a prefix of another include-prefix. The max size of
   * `include_prefixes` is 1000. For more information, see [Filtering objects from transfers
   * ](/storage-transfer/docs/filtering-objects-from-transfers).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludePrefixes() {
    return includePrefixes;
  }

  /**
   * If you specify `include_prefixes`, Storage Transfer Service uses the items in the
   * `include_prefixes` array to determine which objects to include in a transfer. Objects must
   * start with one of the matching `include_prefixes` for inclusion in the transfer. If
   * exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes`
   * specified for inclusion in the transfer. The following are requirements of `include_prefixes`:
   * * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024
   * bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard
   * matching and regular expression matching are not supported. * Each include-prefix must omit the
   * leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`,
   * specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values
   * can be empty, if specified. * Each include-prefix must include a distinct portion of the object
   * namespace. No include-prefix may be a prefix of another include-prefix. The max size of
   * `include_prefixes` is 1000. For more information, see [Filtering objects from transfers
   * ](/storage-transfer/docs/filtering-objects-from-transfers).
   * @param includePrefixes includePrefixes or {@code null} for none
   */
  public ObjectConditions setIncludePrefixes(java.util.List<java.lang.String> includePrefixes) {
    this.includePrefixes = includePrefixes;
    return this;
  }

  /**
   * If specified, only objects with a "last modification time" before this timestamp and objects
   * that don't have a "last modification time" are transferred.
   * @return value or {@code null} for none
   */
  public String getLastModifiedBefore() {
    return lastModifiedBefore;
  }

  /**
   * If specified, only objects with a "last modification time" before this timestamp and objects
   * that don't have a "last modification time" are transferred.
   * @param lastModifiedBefore lastModifiedBefore or {@code null} for none
   */
  public ObjectConditions setLastModifiedBefore(String lastModifiedBefore) {
    this.lastModifiedBefore = lastModifiedBefore;
    return this;
  }

  /**
   * If specified, only objects with a "last modification time" on or after this timestamp and
   * objects that don't have a "last modification time" are transferred. The `last_modified_since`
   * and `last_modified_before` fields can be used together for chunked data processing. For
   * example, consider a script that processes each day's worth of data at a time. For that you'd
   * set each of the fields as follows: * `last_modified_since` to the start of the day *
   * `last_modified_before` to the end of the day
   * @return value or {@code null} for none
   */
  public String getLastModifiedSince() {
    return lastModifiedSince;
  }

  /**
   * If specified, only objects with a "last modification time" on or after this timestamp and
   * objects that don't have a "last modification time" are transferred. The `last_modified_since`
   * and `last_modified_before` fields can be used together for chunked data processing. For
   * example, consider a script that processes each day's worth of data at a time. For that you'd
   * set each of the fields as follows: * `last_modified_since` to the start of the day *
   * `last_modified_before` to the end of the day
   * @param lastModifiedSince lastModifiedSince or {@code null} for none
   */
  public ObjectConditions setLastModifiedSince(String lastModifiedSince) {
    this.lastModifiedSince = lastModifiedSince;
    return this;
  }

  /**
   * Ensures that objects are not transferred if a specific maximum time has elapsed since the "last
   * modification time". When a TransferOperation begins, objects with a "last modification time"
   * are transferred only if the elapsed time between the start_time of the `TransferOperation`and
   * the "last modification time" of the object is less than the value of
   * max_time_elapsed_since_last_modification`. Objects that do not have a "last modification time"
   * are also transferred.
   * @return value or {@code null} for none
   */
  public String getMaxTimeElapsedSinceLastModification() {
    return maxTimeElapsedSinceLastModification;
  }

  /**
   * Ensures that objects are not transferred if a specific maximum time has elapsed since the "last
   * modification time". When a TransferOperation begins, objects with a "last modification time"
   * are transferred only if the elapsed time between the start_time of the `TransferOperation`and
   * the "last modification time" of the object is less than the value of
   * max_time_elapsed_since_last_modification`. Objects that do not have a "last modification time"
   * are also transferred.
   * @param maxTimeElapsedSinceLastModification maxTimeElapsedSinceLastModification or {@code null} for none
   */
  public ObjectConditions setMaxTimeElapsedSinceLastModification(String maxTimeElapsedSinceLastModification) {
    this.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
    return this;
  }

  /**
   * Ensures that objects are not transferred until a specific minimum time has elapsed after the
   * "last modification time". When a TransferOperation begins, objects with a "last modification
   * time" are transferred only if the elapsed time between the start_time of the
   * `TransferOperation` and the "last modification time" of the object is equal to or greater than
   * the value of min_time_elapsed_since_last_modification`. Objects that do not have a "last
   * modification time" are also transferred.
   * @return value or {@code null} for none
   */
  public String getMinTimeElapsedSinceLastModification() {
    return minTimeElapsedSinceLastModification;
  }

  /**
   * Ensures that objects are not transferred until a specific minimum time has elapsed after the
   * "last modification time". When a TransferOperation begins, objects with a "last modification
   * time" are transferred only if the elapsed time between the start_time of the
   * `TransferOperation` and the "last modification time" of the object is equal to or greater than
   * the value of min_time_elapsed_since_last_modification`. Objects that do not have a "last
   * modification time" are also transferred.
   * @param minTimeElapsedSinceLastModification minTimeElapsedSinceLastModification or {@code null} for none
   */
  public ObjectConditions setMinTimeElapsedSinceLastModification(String minTimeElapsedSinceLastModification) {
    this.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
    return this;
  }

  @Override
  public ObjectConditions set(String fieldName, Object value) {
    return (ObjectConditions) super.set(fieldName, value);
  }

  @Override
  public ObjectConditions clone() {
    return (ObjectConditions) super.clone();
  }

}
