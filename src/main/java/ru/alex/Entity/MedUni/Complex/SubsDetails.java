package ru.alex.Entity.MedUni.Complex;

import ru.alex.Entity.dynBaseObject;
import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedHashMap;

public class SubsDetails implements dynBaseObject {
    private Integer id;
    private Integer subsId;
    private String name;
    private Integer nodeFirm;
    private Integer docType;
    private Date readTimeOf;
    private Date baseTimeOf;
    private String baseFile;
    private String errorText;
    private Integer actualDays;
    private Integer linkIsActive;
    private Boolean firmIsActive;
    private Integer docIsActive;

    public SubsDetails() {
    }

    //Конструктор вызывает из запроса данных для создания таблицы
    public SubsDetails(Integer id, Integer subsId, String name, Integer nodeFirm, Integer docType, Date readTimeOf, Date baseTimeOf, String baseFile, String errorText, Integer actualDays, Integer linkIsActive, Boolean firmIsActive, Integer docIsActive) {
        this.id = id;
        this.subsId = subsId;
        this.name = name;
        this.nodeFirm = nodeFirm;
        this.docType = docType;
        this.readTimeOf = readTimeOf;
        this.baseTimeOf = baseTimeOf;
        this.baseFile = baseFile;
        this.errorText = errorText;
        this.actualDays = actualDays;
        this.linkIsActive = linkIsActive;
        this.firmIsActive = firmIsActive;
        this.docIsActive = docIsActive;
    }



    public static LinkedHashMap<String, Double> visibleColumnsOrder() {
        LinkedHashMap<String,Double> visibleColumns = new LinkedHashMap<>();
        visibleColumns.put("id",100.0);
        visibleColumns.put("subsId",100.0);
        visibleColumns.put("name",300.0);
        visibleColumns.put("nodeFirm",100.0);
        visibleColumns.put("docType",100.0);
        visibleColumns.put("readTimeOf",300.0);
        visibleColumns.put("baseTimeOf",300.0);
        visibleColumns.put("baseFile",300.0);
        visibleColumns.put("errorText",300.0);
        visibleColumns.put("actualDays",100.0);
        visibleColumns.put("linkIsActive",100.0);
        visibleColumns.put("firmIsActive",100.0);
        visibleColumns.put("docIsActive",100.0);
        return visibleColumns;
    }


    public static String getObjectType() {
        return "complex";
    }


    public static String getHQL() {
        StringBuilder query = new StringBuilder();
        query.append(getSelectPart() + getWherePart() + getGroupPart() + getOrderPart());
        return query.toString();
    }

    public static String getHQL( String parentTableId) {
        StringBuilder query = new StringBuilder();
        query.append(getSelectPart() + getWherePart() + getGroupPart() + getOrderPart());
        return query.toString().replace(":parentTableId",parentTableId);
    }




    public static String getSelectPart () {
        return "Select " +
                "new ru.alex.Entity.MedUni.Complex.SubsDetails(" +
                "items.id, links.subsId, client.name, items.nodeFirm, items.docType, " +
                "items.timeOf, Iversions.baseTimeOf, " +
                "items.baseFile, items.errorText, items.actualDays, links.isActive,  client.active, items.isActive ) " +
                "from SubsItems as items " +
                "inner join  SubsLink as links on links.itemId = items.id " +
                "inner join UniClient as client on items.nodeFirm = client.id " +
                "inner join SubsItemVer as Iversions on Iversions.itemId = items.id and Iversions.version = items.version " +
                "inner join SubsLinkVer as Lversions on Lversions.linkId = links.id ";
    }
    public static String getWherePart () {
        return  " where Lversions.errorCode = 0 " +
                "and links.isActive = 1 " +
                "and client.active = 1 " +
                "and items.isActive = 1 " +
                "and links.subsId = :parentTableId ";
    }

    public static String getGroupPart () {
        return " group by  items.id, links.subsId, client.name," +
                " items.nodeFirm, items.docType, items.timeOf, Iversions.baseTimeOf, " +
                "items.baseFile, items.errorText, items.actualDays," +
                "links.isActive, client.active, items.isActive ";
    }
    public static String getOrderPart () {return " order by client.name";}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubsId() {
        return subsId;
    }

    public void setSubsId(Integer subsId) {
        this.subsId = subsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNodeFirm() {
        return nodeFirm;
    }

    public void setNodeFirm(Integer nodeFirm) {
        this.nodeFirm = nodeFirm;
    }

    public Integer getDocType() {
        return docType;
    }

    public void setDocType(Integer docType) {
        this.docType = docType;
    }

    public Date getReadTimeOf() {
        return readTimeOf;
    }

    public void setReadTimeOf(Date readTimeOf) {
        this.readTimeOf = readTimeOf;
    }

    public Date getBaseTimeOf() {
        return baseTimeOf;
    }

    public void setBaseTimeOf(Date baseTimeOf) {
        this.baseTimeOf = baseTimeOf;
    }

    public String getBaseFile() {
        return baseFile.replace("\\\\medwww\\priceimp","..");
    }

    public void setBaseFile(String baseFile) {
        this.baseFile = baseFile;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public Integer getActualDays() {
        return actualDays;
    }

    public void setActualDays(Integer actualDays) {
        this.actualDays = actualDays;
    }

    public Integer getLinkIsActive() {
        return linkIsActive;
    }

    public void setLinkIsActive(Integer linkIsActive) {
        this.linkIsActive = linkIsActive;
    }

    public Boolean getFirmIsActive() {
        return firmIsActive;
    }

    public void setFirmIsActive(Boolean firmIsActive) {
        this.firmIsActive = firmIsActive;
    }

    public Integer getDocIsActive() {
        return docIsActive;
    }

    public void setDocIsActive(Integer docIsActive) {
        this.docIsActive = docIsActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubsDetails that = (SubsDetails) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (subsId != null ? !subsId.equals(that.subsId) : that.subsId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nodeFirm != null ? !nodeFirm.equals(that.nodeFirm) : that.nodeFirm != null) return false;
        if (docType != null ? !docType.equals(that.docType) : that.docType != null) return false;
        if (readTimeOf != null ? !readTimeOf.equals(that.readTimeOf) : that.readTimeOf != null) return false;
        if (baseTimeOf != null ? !baseTimeOf.equals(that.baseTimeOf) : that.baseTimeOf != null) return false;
        if (baseFile != null ? !baseFile.equals(that.baseFile) : that.baseFile != null) return false;
        if (errorText != null ? !errorText.equals(that.errorText) : that.errorText != null) return false;
        if (actualDays != null ? !actualDays.equals(that.actualDays) : that.actualDays != null) return false;
        if (linkIsActive != null ? !linkIsActive.equals(that.linkIsActive) : that.linkIsActive != null) return false;
        if (firmIsActive != null ? !firmIsActive.equals(that.firmIsActive) : that.firmIsActive != null) return false;
        return docIsActive != null ? docIsActive.equals(that.docIsActive) : that.docIsActive == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (subsId != null ? subsId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nodeFirm != null ? nodeFirm.hashCode() : 0);
        result = 31 * result + (docType != null ? docType.hashCode() : 0);
        result = 31 * result + (readTimeOf != null ? readTimeOf.hashCode() : 0);
        result = 31 * result + (baseTimeOf != null ? baseTimeOf.hashCode() : 0);
        result = 31 * result + (baseFile != null ? baseFile.hashCode() : 0);
        result = 31 * result + (errorText != null ? errorText.hashCode() : 0);
        result = 31 * result + (actualDays != null ? actualDays.hashCode() : 0);
        result = 31 * result + (linkIsActive != null ? linkIsActive.hashCode() : 0);
        result = 31 * result + (firmIsActive != null ? firmIsActive.hashCode() : 0);
        result = 31 * result + (docIsActive != null ? docIsActive.hashCode() : 0);
        return result;
    }
}
