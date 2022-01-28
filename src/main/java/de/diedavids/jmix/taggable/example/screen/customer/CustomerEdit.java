package de.diedavids.jmix.taggable.example.screen.customer;

import io.jmix.ui.screen.*;
import de.diedavids.jmix.taggable.example.entity.Customer;

@UiController("Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
public class CustomerEdit extends StandardEditor<Customer> {
}