package ru.alex.Entity.MedUni.AutoGenerate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class UniClient {
    private Integer id;
    private String name;
    private String nameShort;
    private String phone;
    private String fax;
    private String email;
    private String addr;
    private Boolean active;
    private Boolean kind;
    private Timestamp lastDate;
    private String meneger;
    private String rem;
    private BigDecimal minZakaz;
    private Integer useCodeForProduct;
    private Integer useCodeFormaker;
    private Timestamp timeOf;
    private Integer ignoreProductCode;
    private Integer actualDays;
    private Integer trimId;
    private Integer deleted;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "name_short", nullable = true, length = 20)
    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 50)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "fax", nullable = true, length = 20)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "addr", nullable = true, length = 40)
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Basic
    @Column(name = "active", nullable = true)
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Basic
    @Column(name = "kind", nullable = true)
    public Boolean getKind() {
        return kind;
    }

    public void setKind(Boolean kind) {
        this.kind = kind;
    }

    @Basic
    @Column(name = "lastDate", nullable = true)
    public Timestamp getLastDate() {
        return lastDate;
    }

    public void setLastDate(Timestamp lastDate) {
        this.lastDate = lastDate;
    }

    @Basic
    @Column(name = "meneger", nullable = true, length = 40)
    public String getMeneger() {
        return meneger;
    }

    public void setMeneger(String meneger) {
        this.meneger = meneger;
    }

    @Basic
    @Column(name = "rem", nullable = true, length = 60)
    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem;
    }

    @Basic
    @Column(name = "minZakaz", nullable = true, precision = 4)
    public BigDecimal getMinZakaz() {
        return minZakaz;
    }

    public void setMinZakaz(BigDecimal minZakaz) {
        this.minZakaz = minZakaz;
    }

    @Basic
    @Column(name = "useCodeForProduct", nullable = true)
    public Integer getUseCodeForProduct() {
        return useCodeForProduct;
    }

    public void setUseCodeForProduct(Integer useCodeForProduct) {
        this.useCodeForProduct = useCodeForProduct;
    }

    @Basic
    @Column(name = "useCodeFormaker", nullable = true)
    public Integer getUseCodeFormaker() {
        return useCodeFormaker;
    }

    public void setUseCodeFormaker(Integer useCodeFormaker) {
        this.useCodeFormaker = useCodeFormaker;
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
    @Column(name = "ignore_product_code", nullable = true)
    public Integer getIgnoreProductCode() {
        return ignoreProductCode;
    }

    public void setIgnoreProductCode(Integer ignoreProductCode) {
        this.ignoreProductCode = ignoreProductCode;
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
    @Column(name = "trim_id", nullable = true)
    public Integer getTrimId() {
        return trimId;
    }

    public void setTrimId(Integer trimId) {
        this.trimId = trimId;
    }

    @Basic
    @Column(name = "deleted", nullable = true)
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UniClient uniClient = (UniClient) o;

        if (id != null ? !id.equals(uniClient.id) : uniClient.id != null) return false;
        if (name != null ? !name.equals(uniClient.name) : uniClient.name != null) return false;
        if (nameShort != null ? !nameShort.equals(uniClient.nameShort) : uniClient.nameShort != null) return false;
        if (phone != null ? !phone.equals(uniClient.phone) : uniClient.phone != null) return false;
        if (fax != null ? !fax.equals(uniClient.fax) : uniClient.fax != null) return false;
        if (email != null ? !email.equals(uniClient.email) : uniClient.email != null) return false;
        if (addr != null ? !addr.equals(uniClient.addr) : uniClient.addr != null) return false;
        if (active != null ? !active.equals(uniClient.active) : uniClient.active != null) return false;
        if (kind != null ? !kind.equals(uniClient.kind) : uniClient.kind != null) return false;
        if (lastDate != null ? !lastDate.equals(uniClient.lastDate) : uniClient.lastDate != null) return false;
        if (meneger != null ? !meneger.equals(uniClient.meneger) : uniClient.meneger != null) return false;
        if (rem != null ? !rem.equals(uniClient.rem) : uniClient.rem != null) return false;
        if (minZakaz != null ? !minZakaz.equals(uniClient.minZakaz) : uniClient.minZakaz != null) return false;
        if (useCodeForProduct != null ? !useCodeForProduct.equals(uniClient.useCodeForProduct) : uniClient.useCodeForProduct != null)
            return false;
        if (useCodeFormaker != null ? !useCodeFormaker.equals(uniClient.useCodeFormaker) : uniClient.useCodeFormaker != null)
            return false;
        if (timeOf != null ? !timeOf.equals(uniClient.timeOf) : uniClient.timeOf != null) return false;
        if (ignoreProductCode != null ? !ignoreProductCode.equals(uniClient.ignoreProductCode) : uniClient.ignoreProductCode != null)
            return false;
        if (actualDays != null ? !actualDays.equals(uniClient.actualDays) : uniClient.actualDays != null) return false;
        if (trimId != null ? !trimId.equals(uniClient.trimId) : uniClient.trimId != null) return false;
        if (deleted != null ? !deleted.equals(uniClient.deleted) : uniClient.deleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nameShort != null ? nameShort.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (addr != null ? addr.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (lastDate != null ? lastDate.hashCode() : 0);
        result = 31 * result + (meneger != null ? meneger.hashCode() : 0);
        result = 31 * result + (rem != null ? rem.hashCode() : 0);
        result = 31 * result + (minZakaz != null ? minZakaz.hashCode() : 0);
        result = 31 * result + (useCodeForProduct != null ? useCodeForProduct.hashCode() : 0);
        result = 31 * result + (useCodeFormaker != null ? useCodeFormaker.hashCode() : 0);
        result = 31 * result + (timeOf != null ? timeOf.hashCode() : 0);
        result = 31 * result + (ignoreProductCode != null ? ignoreProductCode.hashCode() : 0);
        result = 31 * result + (actualDays != null ? actualDays.hashCode() : 0);
        result = 31 * result + (trimId != null ? trimId.hashCode() : 0);
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        return result;
    }
}
