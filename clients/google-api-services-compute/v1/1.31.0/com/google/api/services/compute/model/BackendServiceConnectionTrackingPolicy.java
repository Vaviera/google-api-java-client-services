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

package com.google.api.services.compute.model;

/**
 * Connection Tracking configuration for this BackendService.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackendServiceConnectionTrackingPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Specifies connection persistence when backends are unhealthy. The default value is
   * DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on
   * unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the
   * Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured
   * for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes
   * unhealthy, the existing connections on the unhealthy backend are never persisted on the
   * unhealthy backend. They are always diverted to newly selected healthy backends (unless all
   * backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on
   * unhealthy backends regardless of protocol and session affinity. It is generally not recommended
   * to use this mode overriding the default. For more details, see [Connection Persistence for
   * Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-
   * service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load
   * Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectionPersistenceOnUnhealthyBackends;

  /**
   * Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in
   * seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the
   * maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e.
   * Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode
   * is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not
   * available publicly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer idleTimeoutSec;

  /**
   * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This
   * is the default mode. The Connection Tracking is performed as per the Connection Key (default
   * Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as
   * per the configured Session Affinity. It matches the configured Session Affinity. For more
   * details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-
   * balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal
   * TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackingMode;

  /**
   * Specifies connection persistence when backends are unhealthy. The default value is
   * DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on
   * unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the
   * Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured
   * for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes
   * unhealthy, the existing connections on the unhealthy backend are never persisted on the
   * unhealthy backend. They are always diverted to newly selected healthy backends (unless all
   * backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on
   * unhealthy backends regardless of protocol and session affinity. It is generally not recommended
   * to use this mode overriding the default. For more details, see [Connection Persistence for
   * Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-
   * service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load
   * Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectionPersistenceOnUnhealthyBackends() {
    return connectionPersistenceOnUnhealthyBackends;
  }

  /**
   * Specifies connection persistence when backends are unhealthy. The default value is
   * DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on
   * unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the
   * Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured
   * for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes
   * unhealthy, the existing connections on the unhealthy backend are never persisted on the
   * unhealthy backend. They are always diverted to newly selected healthy backends (unless all
   * backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on
   * unhealthy backends regardless of protocol and session affinity. It is generally not recommended
   * to use this mode overriding the default. For more details, see [Connection Persistence for
   * Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-
   * service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load
   * Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
   * @param connectionPersistenceOnUnhealthyBackends connectionPersistenceOnUnhealthyBackends or {@code null} for none
   */
  public BackendServiceConnectionTrackingPolicy setConnectionPersistenceOnUnhealthyBackends(java.lang.String connectionPersistenceOnUnhealthyBackends) {
    this.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
    return this;
  }

  /**
   * Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in
   * seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the
   * maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e.
   * Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode
   * is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not
   * available publicly.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIdleTimeoutSec() {
    return idleTimeoutSec;
  }

  /**
   * Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in
   * seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the
   * maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e.
   * Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode
   * is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not
   * available publicly.
   * @param idleTimeoutSec idleTimeoutSec or {@code null} for none
   */
  public BackendServiceConnectionTrackingPolicy setIdleTimeoutSec(java.lang.Integer idleTimeoutSec) {
    this.idleTimeoutSec = idleTimeoutSec;
    return this;
  }

  /**
   * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This
   * is the default mode. The Connection Tracking is performed as per the Connection Key (default
   * Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as
   * per the configured Session Affinity. It matches the configured Session Affinity. For more
   * details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-
   * balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal
   * TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackingMode() {
    return trackingMode;
  }

  /**
   * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This
   * is the default mode. The Connection Tracking is performed as per the Connection Key (default
   * Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as
   * per the configured Session Affinity. It matches the configured Session Affinity. For more
   * details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-
   * balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal
   * TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
   * @param trackingMode trackingMode or {@code null} for none
   */
  public BackendServiceConnectionTrackingPolicy setTrackingMode(java.lang.String trackingMode) {
    this.trackingMode = trackingMode;
    return this;
  }

  @Override
  public BackendServiceConnectionTrackingPolicy set(String fieldName, Object value) {
    return (BackendServiceConnectionTrackingPolicy) super.set(fieldName, value);
  }

  @Override
  public BackendServiceConnectionTrackingPolicy clone() {
    return (BackendServiceConnectionTrackingPolicy) super.clone();
  }

}
