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

package com.google.api.services.cloudbuild.v2.model;

/**
 * Parameter value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ParamValue extends com.google.api.client.json.GenericJson {

  /**
   * Value of the parameter if type is array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> arrayVal;

  /**
   * Optional. Value of the parameter if type is object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> objectVal;

  /**
   * Value of the parameter if type is string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringVal;

  /**
   * Type of parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Value of the parameter if type is array.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getArrayVal() {
    return arrayVal;
  }

  /**
   * Value of the parameter if type is array.
   * @param arrayVal arrayVal or {@code null} for none
   */
  public ParamValue setArrayVal(java.util.List<java.lang.String> arrayVal) {
    this.arrayVal = arrayVal;
    return this;
  }

  /**
   * Optional. Value of the parameter if type is object.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getObjectVal() {
    return objectVal;
  }

  /**
   * Optional. Value of the parameter if type is object.
   * @param objectVal objectVal or {@code null} for none
   */
  public ParamValue setObjectVal(java.util.Map<String, java.lang.String> objectVal) {
    this.objectVal = objectVal;
    return this;
  }

  /**
   * Value of the parameter if type is string.
   * @return value or {@code null} for none
   */
  public java.lang.String getStringVal() {
    return stringVal;
  }

  /**
   * Value of the parameter if type is string.
   * @param stringVal stringVal or {@code null} for none
   */
  public ParamValue setStringVal(java.lang.String stringVal) {
    this.stringVal = stringVal;
    return this;
  }

  /**
   * Type of parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of parameter.
   * @param type type or {@code null} for none
   */
  public ParamValue setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ParamValue set(String fieldName, Object value) {
    return (ParamValue) super.set(fieldName, value);
  }

  @Override
  public ParamValue clone() {
    return (ParamValue) super.clone();
  }

}
