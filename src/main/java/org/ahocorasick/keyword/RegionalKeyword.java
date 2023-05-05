package org.ahocorasick.keyword;

import java.util.Set;

public class RegionalKeyword{

    private String id;
    private String region;
    private String source;
    private String rule;
    private String keyword;
    private String keywordAsString;
    private Set<String> keywordsList;
    private String direction;
    private String parentTypeId;
    private Set<String> parentTypeIdAsList;
    private String excludeParentTypeId;
    private Set<String> excludeParentTypeIdAsList;
    private String clientMCC;
    private Set<String> clientMCCAsList;
    private String excludeClientMCC;
    private Set<String> excludeClientMCCAsList;
    private int priority;
    private String initiationMode;
    private boolean isCashback;
    private String channel;
    private boolean isOverdraftProtection;
    private boolean isBankSpecialSavings;
    private boolean isRej;
    private boolean isTermDepositRedemption;
    private boolean isReversal;
    private String deviceId;
    private boolean hasInstallments;
    private String transactionPurpose;
    private String keywordMccCharge;
    private String keywordMccNonCharge;
    private String activityClass;
    private boolean isRecurring;
    private double mccConfidenceLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeywordAsString() {
        return keywordAsString;
    }

    public void setKeywordAsString(String keywordAsString) {
        this.keywordAsString = keywordAsString;
    }

    public Set<String> getKeywordsList() {
        return keywordsList;
    }

    public void setKeywordsList(Set<String> keywordsList) {
        this.keywordsList = keywordsList;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public Set<String> getParentTypeIdAsList() {
        return parentTypeIdAsList;
    }

    public void setParentTypeIdAsList(Set<String> parentTypeIdAsList) {
        this.parentTypeIdAsList = parentTypeIdAsList;
    }

    public String getExcludeParentTypeId() {
        return excludeParentTypeId;
    }

    public void setExcludeParentTypeId(String excludeParentTypeId) {
        this.excludeParentTypeId = excludeParentTypeId;
    }

    public Set<String> getExcludeParentTypeIdAsList() {
        return excludeParentTypeIdAsList;
    }

    public void setExcludeParentTypeIdAsList(Set<String> excludeParentTypeIdAsList) {
        this.excludeParentTypeIdAsList = excludeParentTypeIdAsList;
    }

    public String getClientMCC() {
        return clientMCC;
    }

    public void setClientMCC(String clientMCC) {
        this.clientMCC = clientMCC;
    }

    public Set<String> getClientMCCAsList() {
        return clientMCCAsList;
    }

    public void setClientMCCAsList(Set<String> clientMCCAsList) {
        this.clientMCCAsList = clientMCCAsList;
    }

    public String getExcludeClientMCC() {
        return excludeClientMCC;
    }

    public void setExcludeClientMCC(String excludeClientMCC) {
        this.excludeClientMCC = excludeClientMCC;
    }

    public Set<String> getExcludeClientMCCAsList() {
        return excludeClientMCCAsList;
    }

    public void setExcludeClientMCCAsList(Set<String> excludeClientMCCAsList) {
        this.excludeClientMCCAsList = excludeClientMCCAsList;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getInitiationMode() {
        return initiationMode;
    }

    public void setInitiationMode(String initiationMode) {
        this.initiationMode = initiationMode;
    }

    public boolean getCashback() {
        return isCashback;
    }

    public void setCashback(boolean cashback) {
        isCashback = cashback;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean getOverdraftProtection() {
        return isOverdraftProtection;
    }

    public void setOverdraftProtection(boolean overdraftProtection) {
        isOverdraftProtection = overdraftProtection;
    }

    public boolean getBankSpecialSavings() {
        return isBankSpecialSavings;
    }

    public void setBankSpecialSavings(boolean bankSpecialSavings) {
        isBankSpecialSavings = bankSpecialSavings;
    }

    public boolean getRej() {
        return isRej;
    }

    public void setRej(boolean rej) {
        isRej = rej;
    }

    public boolean getTermDepositRedemption() {
        return isTermDepositRedemption;
    }

    public void setTermDepositRedemption(boolean termDepositRedemption) {
        isTermDepositRedemption = termDepositRedemption;
    }

    public boolean getReversal() {
        return isReversal;
    }

    public void setReversal(boolean reversal) {
        isReversal = reversal;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public boolean getHasInstallments() {
        return hasInstallments;
    }

    public void setHasInstallments(boolean hasInstallments) {
        this.hasInstallments = hasInstallments;
    }

    public String getTransactionPurpose() {
        return transactionPurpose;
    }

    public void setTransactionPurpose(String transactionPurpose) {
        this.transactionPurpose = transactionPurpose;
    }

    public String getKeywordMccCharge() {
        return keywordMccCharge;
    }

    public void setKeywordMccCharge(String keywordMccCharge) {
        this.keywordMccCharge = keywordMccCharge;
    }

    public String getKeywordMccNonCharge() {
        return keywordMccNonCharge;
    }

    public void setKeywordMccNonCharge(String keywordMccNonCharge) {
        this.keywordMccNonCharge = keywordMccNonCharge;
    }

    public String getActivityClass() {
        return activityClass;
    }

    public void setActivityClass(String activityClass) {
        this.activityClass = activityClass;
    }

    public boolean getRecurring() {
        return isRecurring;
    }

    public void setRecurring(boolean recurring) {
        isRecurring = recurring;
    }

    public double getMccConfidenceLevel() {
        return mccConfidenceLevel;
    }

    public void setMccConfidenceLevel(double mccConfidenceLevel) {
        this.mccConfidenceLevel = mccConfidenceLevel;
    }
}
