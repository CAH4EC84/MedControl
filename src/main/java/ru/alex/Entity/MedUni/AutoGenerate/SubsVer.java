package ru.alex.Entity.MedUni.AutoGenerate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "subsVer", schema = "dbo", catalog = "MedUni")
public class SubsVer {
    private Integer id;
    private Integer subsId;
    private Integer version;
    private Integer typeOf;
    private Timestamp timeOf;
    private Integer docCount;
    private Integer docMissed;
    private Integer priceCount;
    private Integer dataSize;
    private Integer packedSize;
    private Integer uniMakerCount;
    private Integer uniProdCount;
    private Integer f1;

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
    @Column(name = "version", nullable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
    @Column(name = "doc_count", nullable = true)
    public Integer getDocCount() {
        return docCount;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    @Basic
    @Column(name = "doc_missed", nullable = true)
    public Integer getDocMissed() {
        return docMissed;
    }

    public void setDocMissed(Integer docMissed) {
        this.docMissed = docMissed;
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
    @Column(name = "data_size", nullable = true)
    public Integer getDataSize() {
        return dataSize;
    }

    public void setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
    }

    @Basic
    @Column(name = "packed_size", nullable = true)
    public Integer getPackedSize() {
        return packedSize;
    }

    public void setPackedSize(Integer packedSize) {
        this.packedSize = packedSize;
    }

    @Basic
    @Column(name = "uni_maker_count", nullable = true)
    public Integer getUniMakerCount() {
        return uniMakerCount;
    }

    public void setUniMakerCount(Integer uniMakerCount) {
        this.uniMakerCount = uniMakerCount;
    }

    @Basic
    @Column(name = "uni_prod_count", nullable = true)
    public Integer getUniProdCount() {
        return uniProdCount;
    }

    public void setUniProdCount(Integer uniProdCount) {
        this.uniProdCount = uniProdCount;
    }

    @Basic
    @Column(name = "f1", nullable = true)
    public Integer getF1() {
        return f1;
    }

    public void setF1(Integer f1) {
        this.f1 = f1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubsVer subsVer = (SubsVer) o;

        if (id != null ? !id.equals(subsVer.id) : subsVer.id != null) return false;
        if (subsId != null ? !subsId.equals(subsVer.subsId) : subsVer.subsId != null) return false;
        if (version != null ? !version.equals(subsVer.version) : subsVer.version != null) return false;
        if (typeOf != null ? !typeOf.equals(subsVer.typeOf) : subsVer.typeOf != null) return false;
        if (timeOf != null ? !timeOf.equals(subsVer.timeOf) : subsVer.timeOf != null) return false;
        if (docCount != null ? !docCount.equals(subsVer.docCount) : subsVer.docCount != null) return false;
        if (docMissed != null ? !docMissed.equals(subsVer.docMissed) : subsVer.docMissed != null) return false;
        if (priceCount != null ? !priceCount.equals(subsVer.priceCount) : subsVer.priceCount != null) return false;
        if (dataSize != null ? !dataSize.equals(subsVer.dataSize) : subsVer.dataSize != null) return false;
        if (packedSize != null ? !packedSize.equals(subsVer.packedSize) : subsVer.packedSize != null) return false;
        if (uniMakerCount != null ? !uniMakerCount.equals(subsVer.uniMakerCount) : subsVer.uniMakerCount != null)
            return false;
        if (uniProdCount != null ? !uniProdCount.equals(subsVer.uniProdCount) : subsVer.uniProdCount != null)
            return false;
        if (f1 != null ? !f1.equals(subsVer.f1) : subsVer.f1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (subsId != null ? subsId.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (typeOf != null ? typeOf.hashCode() : 0);
        result = 31 * result + (timeOf != null ? timeOf.hashCode() : 0);
        result = 31 * result + (docCount != null ? docCount.hashCode() : 0);
        result = 31 * result + (docMissed != null ? docMissed.hashCode() : 0);
        result = 31 * result + (priceCount != null ? priceCount.hashCode() : 0);
        result = 31 * result + (dataSize != null ? dataSize.hashCode() : 0);
        result = 31 * result + (packedSize != null ? packedSize.hashCode() : 0);
        result = 31 * result + (uniMakerCount != null ? uniMakerCount.hashCode() : 0);
        result = 31 * result + (uniProdCount != null ? uniProdCount.hashCode() : 0);
        result = 31 * result + (f1 != null ? f1.hashCode() : 0);
        return result;
    }
}
