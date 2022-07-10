package ru.russianroadman.wingman.entity;

import ru.russianroadman.wingman.data.RightsType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Table
public class Rights extends WingmanEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RightsType rightType;

    public RightsType getRightType() {
        return rightType;
    }

    public void setRightType(RightsType rightType) {
        this.rightType = rightType;
    }
}
