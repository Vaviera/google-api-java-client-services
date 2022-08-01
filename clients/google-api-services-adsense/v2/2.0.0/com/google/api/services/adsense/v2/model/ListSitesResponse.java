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

package com.google.api.services.adsense.v2.model;

/**
 * Response definition for the sites list rpc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListSitesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Continuation token used to page through sites. To retrieve the next page of the results, set
   * the next request's "page_token" value to this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The sites returned in this list response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Site> sites;

  /**
   * Continuation token used to page through sites. To retrieve the next page of the results, set
   * the next request's "page_token" value to this.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Continuation token used to page through sites. To retrieve the next page of the results, set
   * the next request's "page_token" value to this.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListSitesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The sites returned in this list response.
   * @return value or {@code null} for none
   */
  public java.util.List<Site> getSites() {
    return sites;
  }

  /**
   * The sites returned in this list response.
   * @param sites sites or {@code null} for none
   */
  public ListSitesResponse setSites(java.util.List<Site> sites) {
    this.sites = sites;
    return this;
  }

  @Override
  public ListSitesResponse set(String fieldName, Object value) {
    return (ListSitesResponse) super.set(fieldName, value);
  }

  @Override
  public ListSitesResponse clone() {
    return (ListSitesResponse) super.clone();
  }

}
