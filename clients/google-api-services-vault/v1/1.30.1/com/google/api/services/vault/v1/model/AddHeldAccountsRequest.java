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

package com.google.api.services.vault.v1.model;

/**
 * Add a list of accounts to a hold.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AddHeldAccountsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Account IDs to identify which accounts to add. Only account_ids or only emails should be
   * specified, but not both.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> accountIds;

  /**
   * Emails to identify which accounts to add. Only emails or only account_ids should be specified,
   * but not both.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> emails;

  /**
   * Account IDs to identify which accounts to add. Only account_ids or only emails should be
   * specified, but not both.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAccountIds() {
    return accountIds;
  }

  /**
   * Account IDs to identify which accounts to add. Only account_ids or only emails should be
   * specified, but not both.
   * @param accountIds accountIds or {@code null} for none
   */
  public AddHeldAccountsRequest setAccountIds(java.util.List<java.lang.String> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  /**
   * Emails to identify which accounts to add. Only emails or only account_ids should be specified,
   * but not both.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEmails() {
    return emails;
  }

  /**
   * Emails to identify which accounts to add. Only emails or only account_ids should be specified,
   * but not both.
   * @param emails emails or {@code null} for none
   */
  public AddHeldAccountsRequest setEmails(java.util.List<java.lang.String> emails) {
    this.emails = emails;
    return this;
  }

  @Override
  public AddHeldAccountsRequest set(String fieldName, Object value) {
    return (AddHeldAccountsRequest) super.set(fieldName, value);
  }

  @Override
  public AddHeldAccountsRequest clone() {
    return (AddHeldAccountsRequest) super.clone();
  }

}
