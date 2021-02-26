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

package com.google.api.services.displayvideo.v1.model;

/**
 * Targeting details for proximity location list. This will be populated in the details field of an
 * AssignedTargetingOption when targeting_type is `TARGETING_TYPE_PROXIMITY_LOCATION_LIST`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProximityLocationListAssignedTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * Required. ID of the proximity location list. Should refer to the location_list_id field of a
   * LocationList resource whose type is `TARGETING_LOCATION_TYPE_PROXIMITY`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long proximityLocationListId;

  /**
   * Required. Radius range for proximity location list. This represents the size of the area around
   * a chosen location that will be targeted. `All` proximity location targeting under a single
   * resource must have the same radius range value. Set this value to match any existing targeting.
   * If updated, this field will change the radius range for all proximity targeting under the
   * resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proximityRadiusRange;

  /**
   * Required. ID of the proximity location list. Should refer to the location_list_id field of a
   * LocationList resource whose type is `TARGETING_LOCATION_TYPE_PROXIMITY`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProximityLocationListId() {
    return proximityLocationListId;
  }

  /**
   * Required. ID of the proximity location list. Should refer to the location_list_id field of a
   * LocationList resource whose type is `TARGETING_LOCATION_TYPE_PROXIMITY`.
   * @param proximityLocationListId proximityLocationListId or {@code null} for none
   */
  public ProximityLocationListAssignedTargetingOptionDetails setProximityLocationListId(java.lang.Long proximityLocationListId) {
    this.proximityLocationListId = proximityLocationListId;
    return this;
  }

  /**
   * Required. Radius range for proximity location list. This represents the size of the area around
   * a chosen location that will be targeted. `All` proximity location targeting under a single
   * resource must have the same radius range value. Set this value to match any existing targeting.
   * If updated, this field will change the radius range for all proximity targeting under the
   * resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getProximityRadiusRange() {
    return proximityRadiusRange;
  }

  /**
   * Required. Radius range for proximity location list. This represents the size of the area around
   * a chosen location that will be targeted. `All` proximity location targeting under a single
   * resource must have the same radius range value. Set this value to match any existing targeting.
   * If updated, this field will change the radius range for all proximity targeting under the
   * resource.
   * @param proximityRadiusRange proximityRadiusRange or {@code null} for none
   */
  public ProximityLocationListAssignedTargetingOptionDetails setProximityRadiusRange(java.lang.String proximityRadiusRange) {
    this.proximityRadiusRange = proximityRadiusRange;
    return this;
  }

  @Override
  public ProximityLocationListAssignedTargetingOptionDetails set(String fieldName, Object value) {
    return (ProximityLocationListAssignedTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public ProximityLocationListAssignedTargetingOptionDetails clone() {
    return (ProximityLocationListAssignedTargetingOptionDetails) super.clone();
  }

}
