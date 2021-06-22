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

package com.google.api.services.datacatalog.v1.model;

/**
 * Response message for ListPolicyTags.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1ListPolicyTagsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Pagination token of the next results page. Empty if there are no more results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The policy tags that belong to the taxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDatacatalogV1PolicyTag> policyTags;

  /**
   * Pagination token of the next results page. Empty if there are no more results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Pagination token of the next results page. Empty if there are no more results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudDatacatalogV1ListPolicyTagsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The policy tags that belong to the taxonomy.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDatacatalogV1PolicyTag> getPolicyTags() {
    return policyTags;
  }

  /**
   * The policy tags that belong to the taxonomy.
   * @param policyTags policyTags or {@code null} for none
   */
  public GoogleCloudDatacatalogV1ListPolicyTagsResponse setPolicyTags(java.util.List<GoogleCloudDatacatalogV1PolicyTag> policyTags) {
    this.policyTags = policyTags;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1ListPolicyTagsResponse set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1ListPolicyTagsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1ListPolicyTagsResponse clone() {
    return (GoogleCloudDatacatalogV1ListPolicyTagsResponse) super.clone();
  }

}
