package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerTicket
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-11-12T23:41:18.210738873Z[GMT]")


public class CustomerTicket   {
  @JsonProperty("id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String id = null;

  @JsonProperty("userId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String userId = null;

  @JsonProperty("subject")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String subject = null;

  @JsonProperty("description")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String description = null;

  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String status = null;

  @JsonProperty("createdDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime createdDate = null;


  public CustomerTicket id(String id) { 

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  
  @Schema(example = "t78902", description = "")
  
  public String getId() {  
    return id;
  }



  public void setId(String id) { 
    this.id = id;
  }

  public CustomerTicket userId(String userId) { 

    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  
  @Schema(example = "u12345", description = "")
  
  public String getUserId() {  
    return userId;
  }



  public void setUserId(String userId) { 
    this.userId = userId;
  }

  public CustomerTicket subject(String subject) { 

    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   **/
  
  @Schema(example = "Producto no entregado", description = "")
  
  public String getSubject() {  
    return subject;
  }



  public void setSubject(String subject) { 
    this.subject = subject;
  }

  public CustomerTicket description(String description) { 

    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  
  @Schema(example = "El producto nunca llegó y necesito una solución.", description = "")
  
  public String getDescription() {  
    return description;
  }



  public void setDescription(String description) { 
    this.description = description;
  }

  public CustomerTicket status(String status) { 

    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  
  @Schema(example = "open", description = "")
  
  public String getStatus() {  
    return status;
  }



  public void setStatus(String status) { 
    this.status = status;
  }

  public CustomerTicket createdDate(OffsetDateTime createdDate) { 

    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   **/
  
  @Schema(example = "2023-10-01T12:30Z", description = "")
  
@Valid
  public OffsetDateTime getCreatedDate() {  
    return createdDate;
  }



  public void setCreatedDate(OffsetDateTime createdDate) { 
    this.createdDate = createdDate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerTicket customerTicket = (CustomerTicket) o;
    return Objects.equals(this.id, customerTicket.id) &&
        Objects.equals(this.userId, customerTicket.userId) &&
        Objects.equals(this.subject, customerTicket.subject) &&
        Objects.equals(this.description, customerTicket.description) &&
        Objects.equals(this.status, customerTicket.status) &&
        Objects.equals(this.createdDate, customerTicket.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, subject, description, status, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerTicket {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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
