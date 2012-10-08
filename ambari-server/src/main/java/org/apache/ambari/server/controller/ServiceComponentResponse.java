/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.server.controller;

import java.util.Map;

public class ServiceComponentResponse {

  private Long clusterId; // REF

  private String clusterName; // REF

  private String serviceName;

  private String componentName;

  // Config type -> version mapping
  private Map<String, String> configVersions;

  private String desiredStackVersion;

  private String desiredState;

  public ServiceComponentResponse(Long clusterId, String clusterName,
                                  String serviceName,
                                  String componentName,
                                  Map<String, String> configVersions,
                                  String desiredStackVersion,
                                  String desiredState) {
    super();
    this.clusterId = clusterId;
    this.clusterName = clusterName;
    this.serviceName = serviceName;
    this.componentName = componentName;
    this.configVersions = configVersions;
    this.desiredStackVersion = desiredStackVersion;
    this.desiredState = desiredState;
  }

  /**
   * @return the serviceName
   */
  public String getServiceName() {
    return serviceName;
  }

  /**
   * @param serviceName the serviceName to set
   */
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * @return the componentName
   */
  public String getComponentName() {
    return componentName;
  }

  /**
   * @param componentName the componentName to set
   */
  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }

  /**
   * @return the configVersions
   */
  public Map<String, String> getConfigVersions() {
    return configVersions;
  }

  /**
   * @param configVersions the configVersions to set
   */
  public void setConfigVersions(Map<String, String> configVersions) {
    this.configVersions = configVersions;
  }

  /**
   * @return the clusterId
   */
  public Long getClusterId() {
    return clusterId;
  }

  /**
   * @param clusterId the clusterId to set
   */
  public void setClusterId(Long clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * @return the clusterName
   */
  public String getClusterName() {
    return clusterName;
  }

  /**
   * @param clusterName the clusterName to set
   */
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * @return the desiredState
   */
  public String getDesiredState() {
    return desiredState;
  }

  /**
   * @param desiredState the desiredState to set
   */
  public void setDesiredState(String desiredState) {
    this.desiredState = desiredState;
  }

  /**
   * @return the desiredStackVersion
   */
  public String getDesiredStackVersion() {
    return desiredStackVersion;
  }

  /**
   * @param desiredStackVersion the desiredStackVersion to set
   */
  public void setDesiredStackVersion(String desiredStackVersion) {
    this.desiredStackVersion = desiredStackVersion;
  }
}
