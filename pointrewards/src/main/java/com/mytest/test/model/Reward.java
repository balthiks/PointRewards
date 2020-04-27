/* balanithya created on 4/26/2020 inside the package - com.mytest.test.model */

package com.mytest.test.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Transient;

public abstract class Reward {

    @JsonInclude
    @Transient
    protected Long points;

    public abstract Long getPoints();
}
