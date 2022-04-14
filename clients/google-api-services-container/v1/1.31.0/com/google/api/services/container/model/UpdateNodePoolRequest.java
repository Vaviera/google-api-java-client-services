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

package com.google.api.services.container.model;

/**
 * UpdateNodePoolRequests update a node pool's image and/or version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateNodePoolRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * GCFS config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcfsConfig gcfsConfig;

  /**
   * Enable or disable gvnic on the node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VirtualNIC gvnic;

  /**
   * Required. The desired image type for the node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageType;

  /**
   * Node kubelet configs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodeKubeletConfig kubeletConfig;

  /**
   * The desired node labels to be applied to all nodes in the node pool. If this field is not
   * present, the labels will not be changed. Otherwise, the existing node labels will be *replaced*
   * with the provided labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodeLabels labels;

  /**
   * Parameters that can be configured on Linux nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LinuxNodeConfig linuxNodeConfig;

  /**
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the node pool's nodes
   * should be located. Changing the locations for a node pool will result in nodes being either
   * created or removed from the node pool, depending on whether locations are being added or
   * removed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> locations;

  /**
   * The name (project, location, cluster, node pool) of the node pool to update. Specified in the
   * format `projects/locations/clusters/nodePools`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced
   * by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodePoolId;

  /**
   * Required. The Kubernetes version to change the nodes to (typically an upgrade). Users may
   * specify either explicit versions offered by Kubernetes Engine or version aliases, which have
   * the following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks
   * the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N
   * patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks
   * the Kubernetes master version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeVersion;

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * The desired network tags to be applied to all nodes in the node pool. If this field is not
   * present, the tags will not be changed. Otherwise, the existing network tags will be *replaced*
   * with the provided tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkTags tags;

  /**
   * The desired node taints to be applied to all nodes in the node pool. If this field is not
   * present, the taints will not be changed. Otherwise, the existing node taints will be *replaced*
   * with the provided taints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodeTaints taints;

  /**
   * Upgrade settings control disruption and speed of the upgrade.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UpgradeSettings upgradeSettings;

  /**
   * The desired workload metadata config for the node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkloadMetadataConfig workloadMetadataConfig;

  /**
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * @param clusterId clusterId or {@code null} for none
   */
  public UpdateNodePoolRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * GCFS config.
   * @return value or {@code null} for none
   */
  public GcfsConfig getGcfsConfig() {
    return gcfsConfig;
  }

  /**
   * GCFS config.
   * @param gcfsConfig gcfsConfig or {@code null} for none
   */
  public UpdateNodePoolRequest setGcfsConfig(GcfsConfig gcfsConfig) {
    this.gcfsConfig = gcfsConfig;
    return this;
  }

  /**
   * Enable or disable gvnic on the node pool.
   * @return value or {@code null} for none
   */
  public VirtualNIC getGvnic() {
    return gvnic;
  }

  /**
   * Enable or disable gvnic on the node pool.
   * @param gvnic gvnic or {@code null} for none
   */
  public UpdateNodePoolRequest setGvnic(VirtualNIC gvnic) {
    this.gvnic = gvnic;
    return this;
  }

  /**
   * Required. The desired image type for the node pool.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageType() {
    return imageType;
  }

  /**
   * Required. The desired image type for the node pool.
   * @param imageType imageType or {@code null} for none
   */
  public UpdateNodePoolRequest setImageType(java.lang.String imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * Node kubelet configs.
   * @return value or {@code null} for none
   */
  public NodeKubeletConfig getKubeletConfig() {
    return kubeletConfig;
  }

  /**
   * Node kubelet configs.
   * @param kubeletConfig kubeletConfig or {@code null} for none
   */
  public UpdateNodePoolRequest setKubeletConfig(NodeKubeletConfig kubeletConfig) {
    this.kubeletConfig = kubeletConfig;
    return this;
  }

  /**
   * The desired node labels to be applied to all nodes in the node pool. If this field is not
   * present, the labels will not be changed. Otherwise, the existing node labels will be *replaced*
   * with the provided labels.
   * @return value or {@code null} for none
   */
  public NodeLabels getLabels() {
    return labels;
  }

  /**
   * The desired node labels to be applied to all nodes in the node pool. If this field is not
   * present, the labels will not be changed. Otherwise, the existing node labels will be *replaced*
   * with the provided labels.
   * @param labels labels or {@code null} for none
   */
  public UpdateNodePoolRequest setLabels(NodeLabels labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Parameters that can be configured on Linux nodes.
   * @return value or {@code null} for none
   */
  public LinuxNodeConfig getLinuxNodeConfig() {
    return linuxNodeConfig;
  }

  /**
   * Parameters that can be configured on Linux nodes.
   * @param linuxNodeConfig linuxNodeConfig or {@code null} for none
   */
  public UpdateNodePoolRequest setLinuxNodeConfig(LinuxNodeConfig linuxNodeConfig) {
    this.linuxNodeConfig = linuxNodeConfig;
    return this;
  }

  /**
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the node pool's nodes
   * should be located. Changing the locations for a node pool will result in nodes being either
   * created or removed from the node pool, depending on whether locations are being added or
   * removed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLocations() {
    return locations;
  }

  /**
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the node pool's nodes
   * should be located. Changing the locations for a node pool will result in nodes being either
   * created or removed from the node pool, depending on whether locations are being added or
   * removed.
   * @param locations locations or {@code null} for none
   */
  public UpdateNodePoolRequest setLocations(java.util.List<java.lang.String> locations) {
    this.locations = locations;
    return this;
  }

  /**
   * The name (project, location, cluster, node pool) of the node pool to update. Specified in the
   * format `projects/locations/clusters/nodePools`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (project, location, cluster, node pool) of the node pool to update. Specified in the
   * format `projects/locations/clusters/nodePools`.
   * @param name name or {@code null} for none
   */
  public UpdateNodePoolRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced
   * by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodePoolId() {
    return nodePoolId;
  }

  /**
   * Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced
   * by the name field.
   * @param nodePoolId nodePoolId or {@code null} for none
   */
  public UpdateNodePoolRequest setNodePoolId(java.lang.String nodePoolId) {
    this.nodePoolId = nodePoolId;
    return this;
  }

  /**
   * Required. The Kubernetes version to change the nodes to (typically an upgrade). Users may
   * specify either explicit versions offered by Kubernetes Engine or version aliases, which have
   * the following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks
   * the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N
   * patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks
   * the Kubernetes master version
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeVersion() {
    return nodeVersion;
  }

  /**
   * Required. The Kubernetes version to change the nodes to (typically an upgrade). Users may
   * specify either explicit versions offered by Kubernetes Engine or version aliases, which have
   * the following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks
   * the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N
   * patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks
   * the Kubernetes master version
   * @param nodeVersion nodeVersion or {@code null} for none
   */
  public UpdateNodePoolRequest setNodeVersion(java.lang.String nodeVersion) {
    this.nodeVersion = nodeVersion;
    return this;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * @param projectId projectId or {@code null} for none
   */
  public UpdateNodePoolRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The desired network tags to be applied to all nodes in the node pool. If this field is not
   * present, the tags will not be changed. Otherwise, the existing network tags will be *replaced*
   * with the provided tags.
   * @return value or {@code null} for none
   */
  public NetworkTags getTags() {
    return tags;
  }

  /**
   * The desired network tags to be applied to all nodes in the node pool. If this field is not
   * present, the tags will not be changed. Otherwise, the existing network tags will be *replaced*
   * with the provided tags.
   * @param tags tags or {@code null} for none
   */
  public UpdateNodePoolRequest setTags(NetworkTags tags) {
    this.tags = tags;
    return this;
  }

  /**
   * The desired node taints to be applied to all nodes in the node pool. If this field is not
   * present, the taints will not be changed. Otherwise, the existing node taints will be *replaced*
   * with the provided taints.
   * @return value or {@code null} for none
   */
  public NodeTaints getTaints() {
    return taints;
  }

  /**
   * The desired node taints to be applied to all nodes in the node pool. If this field is not
   * present, the taints will not be changed. Otherwise, the existing node taints will be *replaced*
   * with the provided taints.
   * @param taints taints or {@code null} for none
   */
  public UpdateNodePoolRequest setTaints(NodeTaints taints) {
    this.taints = taints;
    return this;
  }

  /**
   * Upgrade settings control disruption and speed of the upgrade.
   * @return value or {@code null} for none
   */
  public UpgradeSettings getUpgradeSettings() {
    return upgradeSettings;
  }

  /**
   * Upgrade settings control disruption and speed of the upgrade.
   * @param upgradeSettings upgradeSettings or {@code null} for none
   */
  public UpdateNodePoolRequest setUpgradeSettings(UpgradeSettings upgradeSettings) {
    this.upgradeSettings = upgradeSettings;
    return this;
  }

  /**
   * The desired workload metadata config for the node pool.
   * @return value or {@code null} for none
   */
  public WorkloadMetadataConfig getWorkloadMetadataConfig() {
    return workloadMetadataConfig;
  }

  /**
   * The desired workload metadata config for the node pool.
   * @param workloadMetadataConfig workloadMetadataConfig or {@code null} for none
   */
  public UpdateNodePoolRequest setWorkloadMetadataConfig(WorkloadMetadataConfig workloadMetadataConfig) {
    this.workloadMetadataConfig = workloadMetadataConfig;
    return this;
  }

  /**
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * @param zone zone or {@code null} for none
   */
  public UpdateNodePoolRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public UpdateNodePoolRequest set(String fieldName, Object value) {
    return (UpdateNodePoolRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateNodePoolRequest clone() {
    return (UpdateNodePoolRequest) super.clone();
  }

}
