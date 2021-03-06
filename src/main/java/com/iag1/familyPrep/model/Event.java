package com.iag1.familyPrep.model;

import com.iag1.familyPrep.view.Phone;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by dqromney on 10/5/15.
 */
public class Event {
    @Size(min = 2, max = 30)
    private String name;

    @NotEmpty @Phone
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
