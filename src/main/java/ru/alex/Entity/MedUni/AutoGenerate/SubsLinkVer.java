package ru.alex.Entity.MedUni.AutoGenerate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "subsLinkVer", schema = "dbo", catalog = "MedUni")
public class SubsLinkVer {
    private Integer id;
    private Integer linkId;
    private Integer itemVer;
    private Integer subsVer;
    private Integer typeOf;
    private Timestamp timeOf;
    private Integer errorCode;
    private Integer f1;
    private Integer subsVerId;
    private Integer itemVerId;
    private Integer actionVerId;
    private Integer actionVer;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "link_id", nullable = true)
    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    @Basic
    @Column(name = "item_ver", nullable = true)
    public Integer getItemVer() {
        return itemVer;
    }

    public void setItemVer(Integer itemVer) {
        this.itemVer = itemVer;
    }

    @Basic
    @Column(name = "subs_ver", nullable = true)
    public Integer getSubsVer() {
        return subsVer;
    }

    public void setSubsVer(Integer subsVer) {
        this.subsVer = subsVer;
    }

    @Basic
    @Column(name = "typeOf", nullable = true)
    public Integer getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(Integer typeOf) {
        this.typeOf = typeOf;
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
    @Column(name = "error_code", nullable = true)
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Basic
    @Column(name = "f1", nullable = true)
    public Integer getF1() {
        return f1;
    }

    public void setF1(Integer f1) {
        this.f1 = f1;
    }

    @Basic
    @Column(name = "subs_ver_id", nullable = true)
    public Integer getSubsVerId() {
        return subsVerId;
    }

    public void setSubsVerId(Integer subsVerId) {
        this.subsVerId = subsVerId;
    }

    @Basic
    @Column(name = "item_ver_id", nullable = true)
    public Integer getItemVerId() {
        return itemVerId;
    }

    public void setItemVerId(Integer itemVerId) {
        this.itemVerId = itemVerId;
    }

    @Basic
    @Column(name = "action_ver_id", nullable = true)
    public Integer getActionVerId() {
        return actionVerId;
    }

    public void setActionVerId(Integer actionVerId) {
        this.actionVerId = actionVerId;
    }

    @Basic
    @Column(name = "action_ver", nullable = true)
    public Integer getActionVer() {
        return actionVer;
    }

    public void setActionVer(Integer actionVer) {
        this.actionVer = actionVer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubsLinkVer that = (SubsLinkVer) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (linkId != null ? !linkId.equals(that.linkId) : that.linkId != null) return false;
        if (itemVer != null ? !itemVer.equals(that.itemVer) : that.itemVer != null) return false;
        if (subsVer != null ? !subsVer.equals(that.subsVer) : that.subsVer != null) return false;
        if (typeOf != null ? !typeOf.equals(that.typeOf) : that.typeOf != null) return false;
        if (timeOf != null ? !timeOf.equals(that.timeOf) : that.timeOf != null) return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        if (f1 != null ? !f1.equals(that.f1) : that.f1 != null) return false;
        if (subsVerId != null ? !subsVerId.equals(that.subsVerId) : that.subsVerId != null) return false;
        if (itemVerId != null ? !itemVerId.equals(that.itemVerId) : that.itemVerId != null) return false;
        if (actionVerId != null ? !actionVerId.equals(that.actionVerId) : that.actionVerId != null) return false;
        if (actionVer != null ? !actionVer.equals(that.actionVer) : that.actionVer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (linkId != null ? linkId.hashCode() : 0);
        result = 31 * result + (itemVer != null ? itemVer.hashCode() : 0);
        result = 31 * result + (subsVer != null ? subsVer.hashCode() : 0);
        result = 31 * result + (typeOf != null ? typeOf.hashCode() : 0);
        result = 31 * result + (timeOf != null ? timeOf.hashCode() : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (f1 != null ? f1.hashCode() : 0);
        result = 31 * result + (subsVerId != null ? subsVerId.hashCode() : 0);
        result = 31 * result + (itemVerId != null ? itemVerId.hashCode() : 0);
        result = 31 * result + (actionVerId != null ? actionVerId.hashCode() : 0);
        result = 31 * result + (actionVer != null ? actionVer.hashCode() : 0);
        return result;
    }
}
