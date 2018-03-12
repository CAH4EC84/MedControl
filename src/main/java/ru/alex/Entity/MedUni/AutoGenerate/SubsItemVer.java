package ru.alex.Entity.MedUni.AutoGenerate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "subsItemVer", schema = "dbo", catalog = "MedUni")
public class SubsItemVer {
    private Integer id;
    private Integer itemId;
    private Integer version;
    private Timestamp timeOf;
    private Long idMin;
    private Long idMax;
    private Integer baseSize;
    private Timestamp baseTimeOf;
    private Integer recCount;
    private Integer recEmpty;
    private Integer recSkipped;
    private Integer recHandled;
    private Integer priceCount;
    private Integer minVersion;
    private Integer uniProdCount;
    private Integer uniProdByCodeCount;
    private Integer uniMakerCount;
    private Integer f1;
    private String baseFile;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "id_min", nullable = true)
    public Long getIdMin() {
        return idMin;
    }

    public void setIdMin(Long idMin) {
        this.idMin = idMin;
    }

    @Basic
    @Column(name = "id_max", nullable = true)
    public Long getIdMax() {
        return idMax;
    }

    public void setIdMax(Long idMax) {
        this.idMax = idMax;
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
    @Column(name = "base_timeOf", nullable = true)
    public Timestamp getBaseTimeOf() {
        return baseTimeOf;
    }

    public void setBaseTimeOf(Timestamp baseTimeOf) {
        this.baseTimeOf = baseTimeOf;
    }

    @Basic
    @Column(name = "rec_count", nullable = true)
    public Integer getRecCount() {
        return recCount;
    }

    public void setRecCount(Integer recCount) {
        this.recCount = recCount;
    }

    @Basic
    @Column(name = "rec_empty", nullable = true)
    public Integer getRecEmpty() {
        return recEmpty;
    }

    public void setRecEmpty(Integer recEmpty) {
        this.recEmpty = recEmpty;
    }

    @Basic
    @Column(name = "rec_skipped", nullable = true)
    public Integer getRecSkipped() {
        return recSkipped;
    }

    public void setRecSkipped(Integer recSkipped) {
        this.recSkipped = recSkipped;
    }

    @Basic
    @Column(name = "rec_handled", nullable = true)
    public Integer getRecHandled() {
        return recHandled;
    }

    public void setRecHandled(Integer recHandled) {
        this.recHandled = recHandled;
    }

    @Basic
    @Column(name = "price_count", nullable = true)
    public Integer getPriceCount() {
        return priceCount;
    }

    public void setPriceCount(Integer priceCount) {
        this.priceCount = priceCount;
    }

    @Basic
    @Column(name = "min_version", nullable = true)
    public Integer getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(Integer minVersion) {
        this.minVersion = minVersion;
    }

    @Basic
    @Column(name = "uniProd_count", nullable = true)
    public Integer getUniProdCount() {
        return uniProdCount;
    }

    public void setUniProdCount(Integer uniProdCount) {
        this.uniProdCount = uniProdCount;
    }

    @Basic
    @Column(name = "uniProdByCode_count", nullable = true)
    public Integer getUniProdByCodeCount() {
        return uniProdByCodeCount;
    }

    public void setUniProdByCodeCount(Integer uniProdByCodeCount) {
        this.uniProdByCodeCount = uniProdByCodeCount;
    }

    @Basic
    @Column(name = "uniMaker_count", nullable = true)
    public Integer getUniMakerCount() {
        return uniMakerCount;
    }

    public void setUniMakerCount(Integer uniMakerCount) {
        this.uniMakerCount = uniMakerCount;
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
    @Column(name = "base_file", nullable = true, length = 512)
    public String getBaseFile() {
        return baseFile;
    }

    public void setBaseFile(String baseFile) {
        this.baseFile = baseFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubsItemVer that = (SubsItemVer) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (timeOf != null ? !timeOf.equals(that.timeOf) : that.timeOf != null) return false;
        if (idMin != null ? !idMin.equals(that.idMin) : that.idMin != null) return false;
        if (idMax != null ? !idMax.equals(that.idMax) : that.idMax != null) return false;
        if (baseSize != null ? !baseSize.equals(that.baseSize) : that.baseSize != null) return false;
        if (baseTimeOf != null ? !baseTimeOf.equals(that.baseTimeOf) : that.baseTimeOf != null) return false;
        if (recCount != null ? !recCount.equals(that.recCount) : that.recCount != null) return false;
        if (recEmpty != null ? !recEmpty.equals(that.recEmpty) : that.recEmpty != null) return false;
        if (recSkipped != null ? !recSkipped.equals(that.recSkipped) : that.recSkipped != null) return false;
        if (recHandled != null ? !recHandled.equals(that.recHandled) : that.recHandled != null) return false;
        if (priceCount != null ? !priceCount.equals(that.priceCount) : that.priceCount != null) return false;
        if (minVersion != null ? !minVersion.equals(that.minVersion) : that.minVersion != null) return false;
        if (uniProdCount != null ? !uniProdCount.equals(that.uniProdCount) : that.uniProdCount != null) return false;
        if (uniProdByCodeCount != null ? !uniProdByCodeCount.equals(that.uniProdByCodeCount) : that.uniProdByCodeCount != null)
            return false;
        if (uniMakerCount != null ? !uniMakerCount.equals(that.uniMakerCount) : that.uniMakerCount != null)
            return false;
        if (f1 != null ? !f1.equals(that.f1) : that.f1 != null) return false;
        if (baseFile != null ? !baseFile.equals(that.baseFile) : that.baseFile != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (timeOf != null ? timeOf.hashCode() : 0);
        result = 31 * result + (idMin != null ? idMin.hashCode() : 0);
        result = 31 * result + (idMax != null ? idMax.hashCode() : 0);
        result = 31 * result + (baseSize != null ? baseSize.hashCode() : 0);
        result = 31 * result + (baseTimeOf != null ? baseTimeOf.hashCode() : 0);
        result = 31 * result + (recCount != null ? recCount.hashCode() : 0);
        result = 31 * result + (recEmpty != null ? recEmpty.hashCode() : 0);
        result = 31 * result + (recSkipped != null ? recSkipped.hashCode() : 0);
        result = 31 * result + (recHandled != null ? recHandled.hashCode() : 0);
        result = 31 * result + (priceCount != null ? priceCount.hashCode() : 0);
        result = 31 * result + (minVersion != null ? minVersion.hashCode() : 0);
        result = 31 * result + (uniProdCount != null ? uniProdCount.hashCode() : 0);
        result = 31 * result + (uniProdByCodeCount != null ? uniProdByCodeCount.hashCode() : 0);
        result = 31 * result + (uniMakerCount != null ? uniMakerCount.hashCode() : 0);
        result = 31 * result + (f1 != null ? f1.hashCode() : 0);
        result = 31 * result + (baseFile != null ? baseFile.hashCode() : 0);
        return result;
    }
}
