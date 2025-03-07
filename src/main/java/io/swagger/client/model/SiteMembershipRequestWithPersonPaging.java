/*
 * Alfresco Content Services REST API
 * **Core API**  Provides access to the core features of Alfresco Content Services. 
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.SiteMembershipRequestWithPersonPagingList;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SiteMembershipRequestWithPersonPaging
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class SiteMembershipRequestWithPersonPaging {
  @SerializedName("list")
  private SiteMembershipRequestWithPersonPagingList list = null;

  public SiteMembershipRequestWithPersonPaging list(SiteMembershipRequestWithPersonPagingList list) {
    this.list = list;
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @Schema(required = true, description = "")
  public SiteMembershipRequestWithPersonPagingList getList() {
    return list;
  }

  public void setList(SiteMembershipRequestWithPersonPagingList list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteMembershipRequestWithPersonPaging siteMembershipRequestWithPersonPaging = (SiteMembershipRequestWithPersonPaging) o;
    return Objects.equals(this.list, siteMembershipRequestWithPersonPaging.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteMembershipRequestWithPersonPaging {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
