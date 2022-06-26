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

package com.google.api.services.beyondcorp.v1.model;

/**
 * Gateway represents a GCE VM Instance endpoint for use by IAP TCP.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BeyondCorp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudSecurityZerotrustApplinkAppConnectorProtoGateway extends com.google.api.client.json.GenericJson {

  /**
   * interface specifies the network interface of the gateway to connect to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("interface")
  private java.lang.String interface__;

  /**
   * name is the name of an instance running a gateway. It is the unique ID for a gateway. All
   * gateways under the same connection have the same prefix. It is derived from the gateway URL.
   * For example, name=${instance} assuming a gateway URL. https://www.googleapis.com/compute/${vers
   * ion}/projects/${project}/zones/${zone}/instances/${instance}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * port specifies the port of the gateway for tunnel connections from the connectors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long port;

  /**
   * project is the tenant project the gateway belongs to. Different from the project in the
   * connection, it is a BeyondCorpAPI internally created project to manage all the gateways. It is
   * sharing the same network with the consumer project user owned. It is derived from the gateway
   * URL. For example, project=${project} assuming a gateway URL. https://www.googleapis.com/compute
   * /${version}/projects/${project}/zones/${zone}/instances/${instance}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * self_link is the gateway URL in the form https://www.googleapis.com/compute/${version}/projects
   * /${project}/zones/${zone}/instances/${instance}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * zone represents the zone the instance belongs. It is derived from the gateway URL. For example,
   * zone=${zone} assuming a gateway URL. https://www.googleapis.com/compute/${version}/projects/${p
   * roject}/zones/${zone}/instances/${instance}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * interface specifies the network interface of the gateway to connect to.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterface() {
    return interface__;
  }

  /**
   * interface specifies the network interface of the gateway to connect to.
   * @param interface__ interface__ or {@code null} for none
   */
  public CloudSecurityZerotrustApplinkAppConnectorProtoGateway setInterface(java.lang.String interface__) {
    this.interface__ = interface__;
    return this;
  }

  /**
   * name is the name of an instance running a gateway. It is the unique ID for a gateway. All
   * gateways under the same connection have the same prefix. It is derived from the gateway URL.
   * For example, name=${instance} assuming a gateway URL. https://www.googleapis.com/compute/${vers
   * ion}/projects/${project}/zones/${zone}/instances/${instance}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * name is the name of an instance running a gateway. It is the unique ID for a gateway. All
   * gateways under the same connection have the same prefix. It is derived from the gateway URL.
   * For example, name=${instance} assuming a gateway URL. https://www.googleapis.com/compute/${vers
   * ion}/projects/${project}/zones/${zone}/instances/${instance}
   * @param name name or {@code null} for none
   */
  public CloudSecurityZerotrustApplinkAppConnectorProtoGateway setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * port specifies the port of the gateway for tunnel connections from the connectors.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPort() {
    return port;
  }

  /**
   * port specifies the port of the gateway for tunnel connections from the connectors.
   * @param port port or {@code null} for none
   */
  public CloudSecurityZerotrustApplinkAppConnectorProtoGateway setPort(java.lang.Long port) {
    this.port = port;
    return this;
  }

  /**
   * project is the tenant project the gateway belongs to. Different from the project in the
   * connection, it is a BeyondCorpAPI internally created project to manage all the gateways. It is
   * sharing the same network with the consumer project user owned. It is derived from the gateway
   * URL. For example, project=${project} assuming a gateway URL. https://www.googleapis.com/compute
   * /${version}/projects/${project}/zones/${zone}/instances/${instance}
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * project is the tenant project the gateway belongs to. Different from the project in the
   * connection, it is a BeyondCorpAPI internally created project to manage all the gateways. It is
   * sharing the same network with the consumer project user owned. It is derived from the gateway
   * URL. For example, project=${project} assuming a gateway URL. https://www.googleapis.com/compute
   * /${version}/projects/${project}/zones/${zone}/instances/${instance}
   * @param project project or {@code null} for none
   */
  public CloudSecurityZerotrustApplinkAppConnectorProtoGateway setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * self_link is the gateway URL in the form https://www.googleapis.com/compute/${version}/projects
   * /${project}/zones/${zone}/instances/${instance}
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * self_link is the gateway URL in the form https://www.googleapis.com/compute/${version}/projects
   * /${project}/zones/${zone}/instances/${instance}
   * @param selfLink selfLink or {@code null} for none
   */
  public CloudSecurityZerotrustApplinkAppConnectorProtoGateway setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * zone represents the zone the instance belongs. It is derived from the gateway URL. For example,
   * zone=${zone} assuming a gateway URL. https://www.googleapis.com/compute/${version}/projects/${p
   * roject}/zones/${zone}/instances/${instance}
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * zone represents the zone the instance belongs. It is derived from the gateway URL. For example,
   * zone=${zone} assuming a gateway URL. https://www.googleapis.com/compute/${version}/projects/${p
   * roject}/zones/${zone}/instances/${instance}
   * @param zone zone or {@code null} for none
   */
  public CloudSecurityZerotrustApplinkAppConnectorProtoGateway setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public CloudSecurityZerotrustApplinkAppConnectorProtoGateway set(String fieldName, Object value) {
    return (CloudSecurityZerotrustApplinkAppConnectorProtoGateway) super.set(fieldName, value);
  }

  @Override
  public CloudSecurityZerotrustApplinkAppConnectorProtoGateway clone() {
    return (CloudSecurityZerotrustApplinkAppConnectorProtoGateway) super.clone();
  }

}
