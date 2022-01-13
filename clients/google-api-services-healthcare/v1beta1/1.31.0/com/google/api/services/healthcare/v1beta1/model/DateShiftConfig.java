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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Shift a date forward or backward in time by a random amount which is consistent for a given
 * patient and crypto key combination.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DateShiftConfig extends com.google.api.client.json.GenericJson {

  /**
   * An AES 128/192/256 bit key. Causes the shift to be computed based on this key and the patient
   * ID. A default key is generated for each de-identification operation and is used when neither
   * `crypto_key` nor `kms_wrapped` is specified. Must not be set if `kms_wrapped` is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cryptoKey;

  /**
   * An AES 128/192/256 bit key. Causes the shift to be computed based on this key and the patient
   * ID. A default key is generated for each de-identification operation and is used when neither
   * `crypto_key` nor `kms_wrapped` is specified. Must not be set if `kms_wrapped` is set.
   * @see #decodeCryptoKey()
   * @return value or {@code null} for none
   */
  public java.lang.String getCryptoKey() {
    return cryptoKey;
  }

  /**
   * An AES 128/192/256 bit key. Causes the shift to be computed based on this key and the patient
   * ID. A default key is generated for each de-identification operation and is used when neither
   * `crypto_key` nor `kms_wrapped` is specified. Must not be set if `kms_wrapped` is set.
   * @see #getCryptoKey()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCryptoKey() {
    return com.google.api.client.util.Base64.decodeBase64(cryptoKey);
  }

  /**
   * An AES 128/192/256 bit key. Causes the shift to be computed based on this key and the patient
   * ID. A default key is generated for each de-identification operation and is used when neither
   * `crypto_key` nor `kms_wrapped` is specified. Must not be set if `kms_wrapped` is set.
   * @see #encodeCryptoKey()
   * @param cryptoKey cryptoKey or {@code null} for none
   */
  public DateShiftConfig setCryptoKey(java.lang.String cryptoKey) {
    this.cryptoKey = cryptoKey;
    return this;
  }

  /**
   * An AES 128/192/256 bit key. Causes the shift to be computed based on this key and the patient
   * ID. A default key is generated for each de-identification operation and is used when neither
   * `crypto_key` nor `kms_wrapped` is specified. Must not be set if `kms_wrapped` is set.
   * @see #setCryptoKey()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public DateShiftConfig encodeCryptoKey(byte[] cryptoKey) {
    this.cryptoKey = com.google.api.client.util.Base64.encodeBase64URLSafeString(cryptoKey);
    return this;
  }

  @Override
  public DateShiftConfig set(String fieldName, Object value) {
    return (DateShiftConfig) super.set(fieldName, value);
  }

  @Override
  public DateShiftConfig clone() {
    return (DateShiftConfig) super.clone();
  }

}
