package io.pivotal.bookshop.domain;


import lombok.*;

import java.util.List;

/**
 * TODO-01: Note that this class does not implement java.io.Serializable. Also note that one of the fields is an instance
 * of a complex object Address.
 */
@NoArgsConstructor @Getter @Setter
@EqualsAndHashCode(of={"customerNumber"})
@ToString(of={"customerNumber", "firstName", "lastName"})
@AllArgsConstructor
@Builder
public class Customer {
  private long customerNumber;
  private String firstName, lastName;
  @Singular
  private List<Address> addresses;
  @Singular
  private List<Long> bookOrders;

  // TODO-07: Add a new field called telephoneNumber of type String.
  // Also add the field name to the list of fields for the toString method (see annotation)


}
