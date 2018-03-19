package ru.alex.Entity.MedUni.AutoGenerate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "subsList", schema = "dbo", catalog = "MedUni")
public class SubsList {
    private Integer id;
    private String name;
    private Integer actualDays;
    private Boolean onlyItem;
    private Integer nodesId;
    private String server;
    private Integer lockState;
    private Timestamp lastUpdated;
    private Double checkInterval;
    private Integer isActive;
    private Integer skipPdx;
    private Integer makeXml;
    private Integer version;
    private Timestamp timeOf;
    private Integer trimId;
    private Integer intoTrim;
    private Integer regionId;
    private Timestamp lockTime;
    private Integer intoMapteka;
    private Integer minVer;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", columnDefinition = "NVARCHAR()")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "actual_days", nullable = true)
    public Integer getActualDays() {
        return actualDays;
    }

    public void setActualDays(Integer actualDays) {
        this.actualDays = actualDays;
    }

    @Basic
    @Column(name = "only_item", nullable = true)
    public Boolean getOnlyItem() {
        return onlyItem;
    }

    public void setOnlyItem(Boolean onlyItem) {
        this.onlyItem = onlyItem;
    }

    @Basic
    @Column(name = "nodes_id", nullable = true)
    public Integer getNodesId() {
        return nodesId;
    }

    public void setNodesId(Integer nodesId) {
        this.nodesId = nodesId;
    }

    @Basic
    @Column(name = "server", columnDefinition = "NVARCHAR()")
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    @Basic
    @Column(name = "lockState", nullable = true)
    public Integer getLockState() {
        return lockState;
    }

    public void setLockState(Integer lockState) {
        this.lockState = lockState;
    }

    @Basic
    @Column(name = "lastUpdated", nullable = true)
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Basic
    @Column(name = "checkInterval", nullable = true, precision = 0)
    public Double getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(Double checkInterval) {
        this.checkInterval = checkInterval;
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
    @Column(name = "skip_pdx", nullable = true)
    public Integer getSkipPdx() {
        return skipPdx;
    }

    public void setSkipPdx(Integer skipPdx) {
        this.skipPdx = skipPdx;
    }

    @Basic
    @Column(name = "make_xml", nullable = true)
    public Integer getMakeXml() {
        return makeXml;
    }

    public void setMakeXml(Integer makeXml) {
        this.makeXml = makeXml;
    }

    @Basic
    @Column(name = "version", nullable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
    @Column(name = "trim_id", nullable = true)
    public Integer getTrimId() {
        return trimId;
    }

    public void setTrimId(Integer trimId) {
        this.trimId = trimId;
    }

    @Basic
    @Column(name = "into_trim", nullable = true)
    public Integer getIntoTrim() {
        return intoTrim;
    }

    public void setIntoTrim(Integer intoTrim) {
        this.intoTrim = intoTrim;
    }

    @Basic
    @Column(name = "region_id", nullable = true)
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @Basic
    @Column(name = "lock_time", nullable = true)
    public Timestamp getLockTime() {
        return lockTime;
    }

    public void setLockTime(Timestamp lockTime) {
        this.lockTime = lockTime;
    }

    @Basic
    @Column(name = "into_mapteka", nullable = true)
    public Integer getIntoMapteka() {
        return intoMapteka;
    }

    public void setIntoMapteka(Integer intoMapteka) {
        this.intoMapteka = intoMapteka;
    }

    @Basic
    @Column(name = "minVer", nullable = true)
    public Integer getMinVer() {
        return minVer;
    }

    public void setMinVer(Integer minVer) {
        this.minVer = minVer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubsList subsList = (SubsList) o;

        if (id != null ? !id.equals(subsList.id) : subsList.id != null) return false;
        if (name != null ? !name.equals(subsList.name) : subsList.name != null) return false;
        if (actualDays != null ? !actualDays.equals(subsList.actualDays) : subsList.actualDays != null) return false;
        if (onlyItem != null ? !onlyItem.equals(subsList.onlyItem) : subsList.onlyItem != null) return false;
        if (nodesId != null ? !nodesId.equals(subsList.nodesId) : subsList.nodesId != null) return false;
        if (server != null ? !server.equals(subsList.server) : subsList.server != null) return false;
        if (lockState != null ? !lockState.equals(subsList.lockState) : subsList.lockState != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(subsList.lastUpdated) : subsList.lastUpdated != null)
            return false;
        if (checkInterval != null ? !checkInterval.equals(subsList.checkInterval) : subsList.checkInterval != null)
            return false;
        if (isActive != null ? !isActive.equals(subsList.isActive) : subsList.isActive != null) return false;
        if (skipPdx != null ? !skipPdx.equals(subsList.skipPdx) : subsList.skipPdx != null) return false;
        if (makeXml != null ? !makeXml.equals(subsList.makeXml) : subsList.makeXml != null) return false;
        if (version != null ? !version.equals(subsList.version) : subsList.version != null) return false;
        if (timeOf != null ? !timeOf.equals(subsList.timeOf) : subsList.timeOf != null) return false;
        if (trimId != null ? !trimId.equals(subsList.trimId) : subsList.trimId != null) return false;
        if (intoTrim != null ? !intoTrim.equals(subsList.intoTrim) : subsList.intoTrim != null) return false;
        if (regionId != null ? !regionId.equals(subsList.regionId) : subsList.regionId != null) return false;
        if (lockTime != null ? !lockTime.equals(subsList.lockTime) : subsList.lockTime != null) return false;
        if (intoMapteka != null ? !intoMapteka.equals(subsList.intoMapteka) : subsList.intoMapteka != null)
            return false;
        if (minVer != null ? !minVer.equals(subsList.minVer) : subsList.minVer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (actualDays != null ? actualDays.hashCode() : 0);
        result = 31 * result + (onlyItem != null ? onlyItem.hashCode() : 0);
        result = 31 * result + (nodesId != null ? nodesId.hashCode() : 0);
        result = 31 * result + (server != null ? server.hashCode() : 0);
        result = 31 * result + (lockState != null ? lockState.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + (checkInterval != null ? checkInterval.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (skipPdx != null ? skipPdx.hashCode() : 0);
        result = 31 * result + (makeXml != null ? makeXml.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (timeOf != null ? timeOf.hashCode() : 0);
        result = 31 * result + (trimId != null ? trimId.hashCode() : 0);
        result = 31 * result + (intoTrim != null ? intoTrim.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (lockTime != null ? lockTime.hashCode() : 0);
        result = 31 * result + (intoMapteka != null ? intoMapteka.hashCode() : 0);
        result = 31 * result + (minVer != null ? minVer.hashCode() : 0);
        return result;
    }
}
