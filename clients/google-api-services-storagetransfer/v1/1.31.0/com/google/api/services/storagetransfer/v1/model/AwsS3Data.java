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
 * An AwsS3Data resource can be a data source, but not a data sink. In an AwsS3Data resource, an
 * object's name is the S3 object's key name.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AwsS3Data extends com.google.api.client.json.GenericJson {

  /**
   * Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on
   * the bucket must be granted to the access ID of the AWS access key. This field is required. For
   * information on our data retention policy for user credentials, see [User credentials](/storage-
   * transfer/docs/data-retention#user-credentials).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AwsAccessKey awsAccessKey;

  /**
   * Required. S3 Bucket name (see [Creating a
   * bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-
   * example.html)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucketName;

  /**
   * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'.
   * This field is treated as an object prefix. As such, it should generally not begin with a '/'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Input only. The Amazon Resource Name (ARN) of the role to support temporary credentials via
   * `AssumeRoleWithWebIdentity`. For more information about ARNs, see [IAM
   * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-
   * arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the
   * session using a `AssumeRoleWithWebIdentity` call for the provided role using the
   * GoogleServiceAccount for this project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roleArn;

  /**
   * Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on
   * the bucket must be granted to the access ID of the AWS access key. This field is required. For
   * information on our data retention policy for user credentials, see [User credentials](/storage-
   * transfer/docs/data-retention#user-credentials).
   * @return value or {@code null} for none
   */
  public AwsAccessKey getAwsAccessKey() {
    return awsAccessKey;
  }

  /**
   * Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on
   * the bucket must be granted to the access ID of the AWS access key. This field is required. For
   * information on our data retention policy for user credentials, see [User credentials](/storage-
   * transfer/docs/data-retention#user-credentials).
   * @param awsAccessKey awsAccessKey or {@code null} for none
   */
  public AwsS3Data setAwsAccessKey(AwsAccessKey awsAccessKey) {
    this.awsAccessKey = awsAccessKey;
    return this;
  }

  /**
   * Required. S3 Bucket name (see [Creating a
   * bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-
   * example.html)).
   * @return value or {@code null} for none
   */
  public java.lang.String getBucketName() {
    return bucketName;
  }

  /**
   * Required. S3 Bucket name (see [Creating a
   * bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-
   * example.html)).
   * @param bucketName bucketName or {@code null} for none
   */
  public AwsS3Data setBucketName(java.lang.String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'.
   * This field is treated as an object prefix. As such, it should generally not begin with a '/'.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'.
   * This field is treated as an object prefix. As such, it should generally not begin with a '/'.
   * @param path path or {@code null} for none
   */
  public AwsS3Data setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Input only. The Amazon Resource Name (ARN) of the role to support temporary credentials via
   * `AssumeRoleWithWebIdentity`. For more information about ARNs, see [IAM
   * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-
   * arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the
   * session using a `AssumeRoleWithWebIdentity` call for the provided role using the
   * GoogleServiceAccount for this project.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoleArn() {
    return roleArn;
  }

  /**
   * Input only. The Amazon Resource Name (ARN) of the role to support temporary credentials via
   * `AssumeRoleWithWebIdentity`. For more information about ARNs, see [IAM
   * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-
   * arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the
   * session using a `AssumeRoleWithWebIdentity` call for the provided role using the
   * GoogleServiceAccount for this project.
   * @param roleArn roleArn or {@code null} for none
   */
  public AwsS3Data setRoleArn(java.lang.String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  @Override
  public AwsS3Data set(String fieldName, Object value) {
    return (AwsS3Data) super.set(fieldName, value);
  }

  @Override
  public AwsS3Data clone() {
    return (AwsS3Data) super.clone();
  }

}
