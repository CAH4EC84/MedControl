package ru.alex.Entity.MedUni.AutoGenerate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table (name = "subsItems",schema = "dbo", catalog = "MedUni")
public class SubsItems {
    private Integer id;
    private Integer nodeFirm;
    private Integer docType;
    private Integer lockState;
    private Timestamp lastUpdated;
    private Integer version;
    private Timestamp timeOf;
    private Integer trimDocId;
    private Integer isActive;
    private String baseFile;
    private Timestamp baseTimeOf;
    private Integer baseSize;
    private Integer errorCode;
    private String errorText;
    private Integer actualDays;
    private Integer regionId;
    private Timestamp lockTime;
    private Integer minVer;
    private String lockData;
    private Integer lastVerId;
    private Integer fileId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column (name = "node_firm", nullable = false)
    public Integer getNodeFirm() { return nodeFirm; }

    public void setNodeFirm(Integer nodeFirm) {
        this.nodeFirm = nodeFirm;
    }

    @Basic
    @Column(name = "doc_type", nullable = true)
    public Integer getDocType() {
        return docType;
    }

    public void setDocType(Integer docType) {
        this.docType = docType;
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
    @Column(name = "trim_doc_id", nullable = true)
    public Integer getTrimDocId() {
        return trimDocId;
    }

    public void setTrimDocId(Integer trimDocId) {
        this.trimDocId = trimDocId;
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
    @Column(name = "base_file", nullable = true, length = 512)
    public String getBaseFile() {
        return baseFile;
    }

    public void setBaseFile(String baseFile) {
        this.baseFile = baseFile;
    }

    @Basic
    @Column(name = "base_timeOf", nullable = true)
    public Timestamp getBaseTimeOf() {
        return baseTimeOf;
    }

    public void setBaseTimeOf(Timestamp baseTimeOf) {
        this.baseTimeOf = baseTimeOf;
    }

    @Basic
    @Column(name = "base_size", nullable = true)
    public Integer getBaseSize() {
        return baseSize;
    }

    public void setBaseSize(Integer baseSize) {
        this.baseSize = baseSize;
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
    @Column(name = "error_text", nullable = true, length = 512)
    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
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
    @Column(name = "minVer", nullable = true)
    public Integer getMinVer() {
        return minVer;
    }

    public void setMinVer(Integer minVer) {
        this.minVer = minVer;
    }

    @Basic
    @Column(name = "lock_data", nullable = true, length = 40)
    public String getLockData() {
        return lockData;
    }

    public void setLockData(String lockData) {
        this.lockData = lockData;
    }

    @Basic
    @Column(name = "last_ver_id", nullable = true)
    public Integer getLastVerId() {
        return lastVerId;
    }

    public void setLastVerId(Integer lastVerId) {
        this.lastVerId = lastVerId;
    }

    @Basic
    @Column(name = "file_id", nullable = true)
    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubsItems subsItems = (SubsItems) o;

        if (id != null ? !id.equals(subsItems.id) : subsItems.id != null) return false;
        if (docType != null ? !docType.equals(subsItems.docType) : subsItems.docType != null) return false;
        if (lockState != null ? !lockState.equals(subsItems.lockState) : subsItems.lockState != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(subsItems.lastUpdated) : subsItems.lastUpdated != null)
            return false;
        if (version != null ? !version.equals(subsItems.version) : subsItems.version != null) return false;
        if (timeOf != null ? !timeOf.equals(subsItems.timeOf) : subsItems.timeOf != null) return false;
        if (trimDocId != null ? !trimDocId.equals(subsItems.trimDocId) : subsItems.trimDocId != null) return false;
        if (isActive != null ? !isActive.equals(subsItems.isActive) : subsItems.isActive != null) return false;
        if (baseFile != null ? !baseFile.equals(subsItems.baseFile) : subsItems.baseFile != null) return false;
        if (baseTimeOf != null ? !baseTimeOf.equals(subsItems.baseTimeOf) : subsItems.baseTimeOf != null) return false;
        if (baseSize != null ? !baseSize.equals(subsItems.baseSize) : subsItems.baseSize != null) return false;
        if (errorCode != null ? !errorCode.equals(subsItems.errorCode) : subsItems.errorCode != null) return false;
        if (errorText != null ? !errorText.equals(subsItems.errorText) : subsItems.errorText != null) return false;
        if (actualDays != null ? !actualDays.equals(subsItems.actualDays) : subsItems.actualDays != null) return false;
        if (regionId != null ? !regionId.equals(subsItems.regionId) : subsItems.regionId != null) return false;
        if (lockTime != null ? !lockTime.equals(subsItems.lockTime) : subsItems.lockTime != null) return false;
        if (minVer != null ? !minVer.equals(subsItems.minVer) : subsItems.minVer != null) return false;
        if (lockData != null ? !lockData.equals(subsItems.lockData) : subsItems.lockData != null) return false;
        if (lastVerId != null ? !lastVerId.equals(subsItems.lastVerId) : subsItems.lastVerId != null) return false;
        if (fileId != null ? !fileId.equals(subsItems.fileId) : subsItems.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (docType != null ? docType.hashCode() : 0);
        result = 31 * result + (lockState != null ? lockState.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (timeOf != null ? timeOf.hashCode() : 0);
        result = 31 * result + (trimDocId != null ? trimDocId.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (baseFile != null ? baseFile.hashCode() : 0);
        result = 31 * result + (baseTimeOf != null ? baseTimeOf.hashCode() : 0);
        result = 31 * result + (baseSize != null ? baseSize.hashCode() : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (errorText != null ? errorText.hashCode() : 0);
        result = 31 * result + (actualDays != null ? actualDays.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (lockTime != null ? lockTime.hashCode() : 0);
        result = 31 * result + (minVer != null ? minVer.hashCode() : 0);
        result = 31 * result + (lockData != null ? lockData.hashCode() : 0);
        result = 31 * result + (lastVerId != null ? lastVerId.hashCode() : 0);
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
