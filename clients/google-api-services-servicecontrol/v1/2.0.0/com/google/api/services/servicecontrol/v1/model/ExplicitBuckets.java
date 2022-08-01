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

package com.google.api.services.servicecontrol.v1.model;

/**
 * Describing buckets with arbitrary user-provided width.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExplicitBuckets extends com.google.api.client.json.GenericJson {

  /**
   * 'bound' is a list of strictly increasing boundaries between buckets. Note that a list of length
   * N-1 defines N buckets because of fenceposting. See comments on `bucket_options` for details.
   * The i'th finite bucket covers the interval [bound[i-1], bound[i]) where i ranges from 1 to
   * bound_size() - 1. Note that there are no finite buckets at all if 'bound' only contains a
   * single element; in that special case the single bound defines the boundary between the
   * underflow and overflow buckets. bucket number lower bound upper bound i == 0 (underflow) -inf
   * bound[i] 0 < i < bound_size() bound[i-1] bound[i] i == bound_size() (overflow) bound[i-1] +inf
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Double> bounds;

  /**
   * 'bound' is a list of strictly increasing boundaries between buckets. Note that a list of length
   * N-1 defines N buckets because of fenceposting. See comments on `bucket_options` for details.
   * The i'th finite bucket covers the interval [bound[i-1], bound[i]) where i ranges from 1 to
   * bound_size() - 1. Note that there are no finite buckets at all if 'bound' only contains a
   * single element; in that special case the single bound defines the boundary between the
   * underflow and overflow buckets. bucket number lower bound upper bound i == 0 (underflow) -inf
   * bound[i] 0 < i < bound_size() bound[i-1] bound[i] i == bound_size() (overflow) bound[i-1] +inf
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getBounds() {
    return bounds;
  }

  /**
   * 'bound' is a list of strictly increasing boundaries between buckets. Note that a list of length
   * N-1 defines N buckets because of fenceposting. See comments on `bucket_options` for details.
   * The i'th finite bucket covers the interval [bound[i-1], bound[i]) where i ranges from 1 to
   * bound_size() - 1. Note that there are no finite buckets at all if 'bound' only contains a
   * single element; in that special case the single bound defines the boundary between the
   * underflow and overflow buckets. bucket number lower bound upper bound i == 0 (underflow) -inf
   * bound[i] 0 < i < bound_size() bound[i-1] bound[i] i == bound_size() (overflow) bound[i-1] +inf
   * @param bounds bounds or {@code null} for none
   */
  public ExplicitBuckets setBounds(java.util.List<java.lang.Double> bounds) {
    this.bounds = bounds;
    return this;
  }

  @Override
  public ExplicitBuckets set(String fieldName, Object value) {
    return (ExplicitBuckets) super.set(fieldName, value);
  }

  @Override
  public ExplicitBuckets clone() {
    return (ExplicitBuckets) super.clone();
  }

}
