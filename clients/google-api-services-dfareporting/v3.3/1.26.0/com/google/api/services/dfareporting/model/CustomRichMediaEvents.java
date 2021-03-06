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

package com.google.api.services.dfareporting.model;

/**
 * Represents a Custom Rich Media Events group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomRichMediaEvents extends com.google.api.client.json.GenericJson {

  /**
   * List of custom rich media event IDs. Dimension values must be all of type
   * dfa:richMediaEventTypeIdAndName.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DimensionValue> filteredEventIds;

  /**
   * The kind of resource this is, in this case dfareporting#customRichMediaEvents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * List of custom rich media event IDs. Dimension values must be all of type
   * dfa:richMediaEventTypeIdAndName.
   * @return value or {@code null} for none
   */
  public java.util.List<DimensionValue> getFilteredEventIds() {
    return filteredEventIds;
  }

  /**
   * List of custom rich media event IDs. Dimension values must be all of type
   * dfa:richMediaEventTypeIdAndName.
   * @param filteredEventIds filteredEventIds or {@code null} for none
   */
  public CustomRichMediaEvents setFilteredEventIds(java.util.List<DimensionValue> filteredEventIds) {
    this.filteredEventIds = filteredEventIds;
    return this;
  }

  /**
   * The kind of resource this is, in this case dfareporting#customRichMediaEvents.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource this is, in this case dfareporting#customRichMediaEvents.
   * @param kind kind or {@code null} for none
   */
  public CustomRichMediaEvents setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public CustomRichMediaEvents set(String fieldName, Object value) {
    return (CustomRichMediaEvents) super.set(fieldName, value);
  }

  @Override
  public CustomRichMediaEvents clone() {
    return (CustomRichMediaEvents) super.clone();
  }

}
