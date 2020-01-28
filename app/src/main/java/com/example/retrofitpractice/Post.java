package com.example.retrofitpractice;

import java.util.List;

public class Post {

    /**
     * caseId : 20140106000001
     * caseName : 原潭子鄉本仁堂交趾陶壁飾
     * assetsClassifyCode : 6.1.1
     * assetsClassifyName : 一般古物
     * assetsTypeCode : G1
     * assetsTypeName : 藝術作品 其他 G1.99
     * judgeCriteria : ["具有歷史意義或能表現傳統、族群或地方文化特色","具有一定之時代特色、技術及流派","具有藝術造詣或科學成就","具有歷史、文化、藝術或科學價值"]
     * registerReason : 「本仁堂」係日治時期台中潭子區長林瓊彰的宅第，位於現今台中市潭子區潭興路「風動石」附近。2007年該宅第區域土地售予建商，建物將一併拆除，林瓊彰的長曾孫林錦錕為保存古宅第珍貴的交趾陶，代表家屬慨然將建物上的交趾陶壁堵捐贈給嘉義市政府，由文化局列為永久典藏。「本仁堂」宅第於日據時期大正15年（1926）興建，當時延聘唐山（大陸）名匠前來製作交趾陶裝飾。本案交趾陶捐贈品包括〝ㄇ〞字型的壁堵一座、書卷兩組、堂號匾及書卷型文字，其作品題材、釉色表現、製作手法等風格，研判為泉州派洪坤福的創作品。
     * lawsReference : 文化資產保存法第65條暨古物分級登錄指定及廢止審查辦法第2條第7條。
     * officialDocNo : 府授文資字第10351000574號
     * registerDate : 2014-01-06
     * govInstitutionName : 嘉義市政府
     * belongCity : 嘉義市東區
     * representImage : https://data.boch.gov.tw/old_upload/_upload/Assets_new/antiquity/37687/photo/45e56874-df74-4db2-9d49-13781b694ae1.JPG
     * keepNameNew : 其他
     * keepAddressNew : 嘉義市東區嘉義市忠孝路275-1號
     * amount : 1
     * pastHistorySource : 受贈
     * pastHistorySourceNotes : 林瓊彰的長曾孫林錦錕
     * reserveStatus : 完整良好
     */

    private String caseId;
    private String caseName;
    private String assetsClassifyCode;
    private String assetsClassifyName;
    private String assetsTypeCode;
    private String assetsTypeName;
    private String registerReason;
    private String lawsReference;
    private String officialDocNo;
    private String registerDate;
    private String govInstitutionName;
    private String belongCity;
    private String representImage;
    private String keepNameNew;
    private String keepAddressNew;
    private int amount;
    private String pastHistorySource;
    private String pastHistorySourceNotes;
    private String reserveStatus;
    private List<String> judgeCriteria;

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getAssetsClassifyCode() {
        return assetsClassifyCode;
    }

    public void setAssetsClassifyCode(String assetsClassifyCode) {
        this.assetsClassifyCode = assetsClassifyCode;
    }

    public String getAssetsClassifyName() {
        return assetsClassifyName;
    }

    public void setAssetsClassifyName(String assetsClassifyName) {
        this.assetsClassifyName = assetsClassifyName;
    }

    public String getAssetsTypeCode() {
        return assetsTypeCode;
    }

    public void setAssetsTypeCode(String assetsTypeCode) {
        this.assetsTypeCode = assetsTypeCode;
    }

    public String getAssetsTypeName() {
        return assetsTypeName;
    }

    public void setAssetsTypeName(String assetsTypeName) {
        this.assetsTypeName = assetsTypeName;
    }

    public String getRegisterReason() {
        return registerReason;
    }

    public void setRegisterReason(String registerReason) {
        this.registerReason = registerReason;
    }

    public String getLawsReference() {
        return lawsReference;
    }

    public void setLawsReference(String lawsReference) {
        this.lawsReference = lawsReference;
    }

    public String getOfficialDocNo() {
        return officialDocNo;
    }

    public void setOfficialDocNo(String officialDocNo) {
        this.officialDocNo = officialDocNo;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getGovInstitutionName() {
        return govInstitutionName;
    }

    public void setGovInstitutionName(String govInstitutionName) {
        this.govInstitutionName = govInstitutionName;
    }

    public String getBelongCity() {
        return belongCity;
    }

    public void setBelongCity(String belongCity) {
        this.belongCity = belongCity;
    }

    public String getRepresentImage() {
        return representImage;
    }

    public void setRepresentImage(String representImage) {
        this.representImage = representImage;
    }

    public String getKeepNameNew() {
        return keepNameNew;
    }

    public void setKeepNameNew(String keepNameNew) {
        this.keepNameNew = keepNameNew;
    }

    public String getKeepAddressNew() {
        return keepAddressNew;
    }

    public void setKeepAddressNew(String keepAddressNew) {
        this.keepAddressNew = keepAddressNew;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPastHistorySource() {
        return pastHistorySource;
    }

    public void setPastHistorySource(String pastHistorySource) {
        this.pastHistorySource = pastHistorySource;
    }

    public String getPastHistorySourceNotes() {
        return pastHistorySourceNotes;
    }

    public void setPastHistorySourceNotes(String pastHistorySourceNotes) {
        this.pastHistorySourceNotes = pastHistorySourceNotes;
    }

    public String getReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(String reserveStatus) {
        this.reserveStatus = reserveStatus;
    }

    public List<String> getJudgeCriteria() {
        return judgeCriteria;
    }

    public void setJudgeCriteria(List<String> judgeCriteria) {
        this.judgeCriteria = judgeCriteria;
    }
}
