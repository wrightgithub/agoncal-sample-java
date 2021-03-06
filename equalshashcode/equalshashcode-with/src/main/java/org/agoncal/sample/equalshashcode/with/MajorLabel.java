package org.agoncal.sample.equalshashcode.with;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class MajorLabel {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private String name;

    // ======================================
    // =            Constructors            =
    // ======================================

    public MajorLabel() {
    }

    public MajorLabel(String name) {
        this.name = name;
    }

    // ======================================
    // =         Getters & setters          =
    // ======================================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof MajorLabel)) {
            return false;
        }

        MajorLabel genre = (MajorLabel) o;

        return new EqualsBuilder()
                .append(name, genre.name)
                .isEquals();
    }

    @Override
    public final int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .toHashCode();
    }
}