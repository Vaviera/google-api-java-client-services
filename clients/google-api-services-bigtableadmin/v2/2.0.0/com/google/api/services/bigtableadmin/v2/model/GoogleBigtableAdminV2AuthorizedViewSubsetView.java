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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Defines a simple AuthorizedView that is a subset of the underlying Table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleBigtableAdminV2AuthorizedViewSubsetView extends com.google.api.client.json.GenericJson {

  /**
   * Map from column family name to the columns in this family to be included in the AuthorizedView.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleBigtableAdminV2AuthorizedViewFamilySubsets> familySubsets;

  static {
    // hack to force ProGuard to consider GoogleBigtableAdminV2AuthorizedViewFamilySubsets used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleBigtableAdminV2AuthorizedViewFamilySubsets.class);
  }

  /**
   * Row prefixes to be included in the AuthorizedView. To provide access to all rows, include the
   * empty string as a prefix ("").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> rowPrefixes;

  /**
   * Map from column family name to the columns in this family to be included in the AuthorizedView.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleBigtableAdminV2AuthorizedViewFamilySubsets> getFamilySubsets() {
    return familySubsets;
  }

  /**
   * Map from column family name to the columns in this family to be included in the AuthorizedView.
   * @param familySubsets familySubsets or {@code null} for none
   */
  public GoogleBigtableAdminV2AuthorizedViewSubsetView setFamilySubsets(java.util.Map<String, GoogleBigtableAdminV2AuthorizedViewFamilySubsets> familySubsets) {
    this.familySubsets = familySubsets;
    return this;
  }

  /**
   * Row prefixes to be included in the AuthorizedView. To provide access to all rows, include the
   * empty string as a prefix ("").
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRowPrefixes() {
    return rowPrefixes;
  }

  /**
   * Row prefixes to be included in the AuthorizedView. To provide access to all rows, include the
   * empty string as a prefix ("").
   * @param rowPrefixes rowPrefixes or {@code null} for none
   */
  public GoogleBigtableAdminV2AuthorizedViewSubsetView setRowPrefixes(java.util.List<java.lang.String> rowPrefixes) {
    this.rowPrefixes = rowPrefixes;
    return this;
  }

  @Override
  public GoogleBigtableAdminV2AuthorizedViewSubsetView set(String fieldName, Object value) {
    return (GoogleBigtableAdminV2AuthorizedViewSubsetView) super.set(fieldName, value);
  }

  @Override
  public GoogleBigtableAdminV2AuthorizedViewSubsetView clone() {
    return (GoogleBigtableAdminV2AuthorizedViewSubsetView) super.clone();
  }

}
