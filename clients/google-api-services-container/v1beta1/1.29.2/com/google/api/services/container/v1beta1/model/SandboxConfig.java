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

package com.google.api.services.container.v1beta1.model;

/**
 * SandboxConfig contains configurations of the sandbox to use for the node.
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
public final class SandboxConfig extends com.google.api.client.json.GenericJson {

  /**
   * Type of the sandbox to use for the node (e.g. 'gvisor')
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sandboxType;

  /**
   * Type of the sandbox to use for the node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Type of the sandbox to use for the node (e.g. 'gvisor')
   * @return value or {@code null} for none
   */
  public java.lang.String getSandboxType() {
    return sandboxType;
  }

  /**
   * Type of the sandbox to use for the node (e.g. 'gvisor')
   * @param sandboxType sandboxType or {@code null} for none
   */
  public SandboxConfig setSandboxType(java.lang.String sandboxType) {
    this.sandboxType = sandboxType;
    return this;
  }

  /**
   * Type of the sandbox to use for the node.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of the sandbox to use for the node.
   * @param type type or {@code null} for none
   */
  public SandboxConfig setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public SandboxConfig set(String fieldName, Object value) {
    return (SandboxConfig) super.set(fieldName, value);
  }

  @Override
  public SandboxConfig clone() {
    return (SandboxConfig) super.clone();
  }

}
