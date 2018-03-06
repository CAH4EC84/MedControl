package ru.alex.Entity.MedUni.AutoGenerate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class SubsLink {
    private Integer id;
    private Integer subsId;
    private Integer itemId;
    private Integer isActive;
    private Timestamp timeOf;
    private Boolean flagPrice;
    private Boolean flagPrice1;
    private Boolean flagPrice2;
    private Boolean flagPrice3;
    private Boolean flagPrice5;
    private Boolean flagPrice10;
    private Boolean flagPrice15;
    private Boolean flagPrice20;
    private Boolean flagNewPrice1;
    private Boolean flagNewPrice2;
    private Integer minItemVer;
    private Integer minSubsVer;
    private Integer lastVerId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "subs_id", nullable = true)
    public Integer getSubsId() {
        return subsId;
    }

    public void setSubsId(Integer subsId) {
        this.subsId = subsId;
    }

    @Basic
    @Column(name = "item_id", nullable = true)
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "is_active", nullable = true)
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @Basic
    @Column(name = "timeOf", nullable = true)
    public Timestamp getTimeOf() {
        return timeOf;
    }

    public void setTimeOf(Timestamp timeOf) {
        this.timeOf = timeOf;
    }

    @Basic
    @Column(name = "flag_price", nullable = true)
    public Boolean getFlagPrice() {
        return flagPrice;
    }

    public void setFlagPrice(Boolean flagPrice) {
        this.flagPrice = flagPrice;
    }

    @Basic
    @Column(name = "flag_price1", nullable = true)
    public Boolean getFlagPrice1() {
        return flagPrice1;
    }

    public void setFlagPrice1(Boolean flagPrice1) {
        this.flagPrice1 = flagPrice1;
    }

    @Basic
    @Column(name = "flag_price2", nullable = true)
    public Boolean getFlagPrice2() {
        return flagPrice2;
    }

    public void setFlagPrice2(Boolean flagPrice2) {
        this.flagPrice2 = flagPrice2;
    }

    @Basic
    @Column(name = "flag_price3", nullable = true)
    public Boolean getFlagPrice3() {
        return flagPrice3;
    }

    public void setFlagPrice3(Boolean flagPrice3) {
        this.flagPrice3 = flagPrice3;
    }

    @Basic
    @Column(name = "flag_price5", nullable = true)
    public Boolean getFlagPrice5() {
        return flagPrice5;
    }

    public void setFlagPrice5(Boolean flagPrice5) {
        this.flagPrice5 = flagPrice5;
    }

    @Basic
    @Column(name = "flag_price10", nullable = true)
    public Boolean getFlagPrice10() {
        return flagPrice10;
    }

    public void setFlagPrice10(Boolean flagPrice10) {
        this.flagPrice10 = flagPrice10;
    }

    @Basic
    @Column(name = "flag_price15", nullable = true)
    public Boolean getFlagPrice15() {
        return flagPrice15;
    }

    public void setFlagPrice15(Boolean flagPrice15) {
        this.flagPrice15 = flagPrice15;
    }

    @Basic
    @Column(name = "flag_price20", nullable = true)
    public Boolean getFlagPrice20() {
        return flagPrice20;
    }

    public void setFlagPrice20(Boolean flagPrice20) {
        this.flagPrice20 = flagPrice20;
    }

    @Basic
    @Column(name = "flag_new_price1", nullable = true)
    public Boolean getFlagNewPrice1() {
        return flagNewPrice1;
    }

    public void setFlagNewPrice1(Boolean flagNewPrice1) {
        this.flagNewPrice1 = flagNewPrice1;
    }

    @Basic
    @Column(name = "flag_new_price2", nullable = true)
    public Boolean getFlagNewPrice2() {
        return flagNewPrice2;
    }

    public void setFlagNewPrice2(Boolean flagNewPrice2) {
        this.flagNewPrice2 = flagNewPrice2;
    }

    @Basic
    @Column(name = "minItemVer", nullable = true)
    public Integer getMinItemVer() {
        return minItemVer;
    }

    public void setMinItemVer(Integer minItemVer) {
        this.minItemVer = minItemVer;
    }

    @Basic
    @Column(name = "minSubsVer", nullable = true)
    public Integer getMinSubsVer() {
        return minSubsVer;
    }

    public void setMinSubsVer(Integer minSubsVer) {
        this.minSubsVer = minSubsVer;
    }

    @Basic
    @Column(name = "last_ver_id", nullable = true)
    public Integer getLastVerId() {
        return lastVerId;
    }

    public void setLastVerId(Integer lastVerId) {
        this.lastVerId = lastVerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubsLink subsLink = (SubsLink) o;

        if (id != null ? !id.equals(subsLink.id) : subsLink.id != null) return false;
        if (subsId != null ? !subsId.equals(subsLink.subsId) : subsLink.subsId != null) return false;
        if (itemId != null ? !itemId.equals(subsLink.itemId) : subsLink.itemId != null) return false;
        if (isActive != null ? !isActive.equals(subsLink.isActive) : subsLink.isActive != null) return false;
        if (timeOf != null ? !timeOf.equals(subsLink.timeOf) : subsLink.timeOf != null) return false;
        if (flagPrice != null ? !flagPrice.equals(subsLink.flagPrice) : subsLink.flagPrice != null) return false;
        if (flagPrice1 != null ? !flagPrice1.equals(subsLink.flagPrice1) : subsLink.flagPrice1 != null) return false;
        if (flagPrice2 != null ? !flagPrice2.equals(subsLink.flagPrice2) : subsLink.flagPrice2 != null) return false;
        if (flagPrice3 != null ? !flagPrice3.equals(subsLink.flagPrice3) : subsLink.flagPrice3 != null) return false;
        if (flagPrice5 != null ? !flagPrice5.equals(subsLink.flagPrice5) : subsLink.flagPrice5 != null) return false;
        if (flagPrice10 != null ? !flagPrice10.equals(subsLink.flagPrice10) : subsLink.flagPrice10 != null)
            return false;
        if (flagPrice15 != null ? !flagPrice15.equals(subsLink.flagPrice15) : subsLink.flagPrice15 != null)
            return false;
        if (flagPrice20 != null ? !flagPrice20.equals(subsLink.flagPrice20) : subsLink.flagPrice20 != null)
            return false;
        if (flagNewPrice1 != null ? !flagNewPrice1.equals(subsLink.flagNewPrice1) : subsLink.flagNewPrice1 != null)
            return false;
        if (flagNewPrice2 != null ? !flagNewPrice2.equals(subsLink.flagNewPrice2) : subsLink.flagNewPrice2 != null)
            return false;
        if (minItemVer != null ? !minItemVer.equals(subsLink.minItemVer) : subsLink.minItemVer != null) return false;
        if (minSubsVer != null ? !minSubsVer.equals(subsLink.minSubsVer) : subsLink.minSubsVer != null) return false;
        if (lastVerId != null ? !lastVerId.equals(subsLink.lastVerId) : subsLink.lastVerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (subsId != null ? subsId.hashCode() : 0);
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (timeOf != null ? timeOf.hashCode() : 0);
        result = 31 * result + (flagPrice != null ? flagPrice.hashCode() : 0);
        result = 31 * result + (flagPrice1 != null ? flagPrice1.hashCode() : 0);
        result = 31 * result + (flagPrice2 != null ? flagPrice2.hashCode() : 0);
        result = 31 * result + (flagPrice3 != null ? flagPrice3.hashCode() : 0);
        result = 31 * result + (flagPrice5 != null ? flagPrice5.hashCode() : 0);
        result = 31 * result + (flagPrice10 != null ? flagPrice10.hashCode() : 0);
        result = 31 * result + (flagPrice15 != null ? flagPrice15.hashCode() : 0);
        result = 31 * result + (flagPrice20 != null ? flagPrice20.hashCode() : 0);
        result = 31 * result + (flagNewPrice1 != null ? flagNewPrice1.hashCode() : 0);
        result = 31 * result + (flagNewPrice2 != null ? flagNewPrice2.hashCode() : 0);
        result = 31 * result + (minItemVer != null ? minItemVer.hashCode() : 0);
        result = 31 * result + (minSubsVer != null ? minSubsVer.hashCode() : 0);
        result = 31 * result + (lastVerId != null ? lastVerId.hashCode() : 0);
        return result;
    }
}
