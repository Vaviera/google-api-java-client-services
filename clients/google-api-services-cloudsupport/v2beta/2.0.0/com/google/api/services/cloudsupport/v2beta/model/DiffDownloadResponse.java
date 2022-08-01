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

package com.google.api.services.cloudsupport.v2beta.model;

/**
 * # gdata.* are outside protos with mising documentation
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Support API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiffDownloadResponse extends com.google.api.client.json.GenericJson {

  /**
   * # gdata.* are outside protos with mising documentation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompositeMedia objectLocation;

  /**
   * # gdata.* are outside protos with mising documentation
   * @return value or {@code null} for none
   */
  public CompositeMedia getObjectLocation() {
    return objectLocation;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @param objectLocation objectLocation or {@code null} for none
   */
  public DiffDownloadResponse setObjectLocation(CompositeMedia objectLocation) {
    this.objectLocation = objectLocation;
    return this;
  }

  @Override
  public DiffDownloadResponse set(String fieldName, Object value) {
    return (DiffDownloadResponse) super.set(fieldName, value);
  }

  @Override
  public DiffDownloadResponse clone() {
    return (DiffDownloadResponse) super.clone();
  }

}
