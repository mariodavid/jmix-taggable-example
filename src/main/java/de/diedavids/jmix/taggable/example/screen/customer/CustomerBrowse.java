package de.diedavids.jmix.taggable.example.screen.customer;

import de.diedavids.jmix.taggable.screen.WithTagsSupport;
import io.jmix.ui.component.ButtonsPanel;
import io.jmix.ui.component.GroupTable;
import io.jmix.ui.component.Table;
import io.jmix.ui.screen.*;
import de.diedavids.jmix.taggable.example.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
public class CustomerBrowse extends StandardLookup<Customer> implements WithTagsSupport {

    @Autowired
    private GroupTable<Customer> customersTable;

    @Autowired
    private ButtonsPanel buttonsPanel;

    @Override
    public Table getListComponent() {
        return customersTable;
    }

    @Override
    public ButtonsPanel getButtonsPanel() {
        return buttonsPanel;
    }

    @Override
    public boolean showTagsInList() {
        return true;
    }

    @Override
    public OpenMode tagLinkOpenMode() {
        return OpenMode.NEW_TAB;
    }

    @Override
    public boolean showTagsAsLink() {
        return true;
    }
}