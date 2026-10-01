package org.chris.badges.wallet.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.io.File;
import java.util.Date;

public class DigitalBadge implements Comparable<DigitalBadge> {

    private DigitalBadgeMetadata metadata;
    private File badge;
    private String serial ;
    private String Description;
    private Date begin;
    private Date end ;

    private Boolean serializeHash = false;

    public DigitalBadge(DigitalBadgeMetadata metadata, File badge, String serial, Date begin, Date end) {
        this.metadata = metadata;
        this.badge = badge;
        this.serial = serial;
        this.begin = begin;
        this.end = end;
    }

    public DigitalBadge(String serial, Date begin, Date end) {
        this.serial = serial;
        this.begin = begin;
        this.end = end;
    }

    public DigitalBadge() {
    }

    public DigitalBadgeMetadata getMetadata() {
        return metadata;
    }

    public File getBadge() {
        return badge;
    }

    public String getSerial() {
        return serial;
    }

    public String getDescription() {
        return Description;
    }

    public Date getBegin() {
        return begin;
    }

    public Date getEnd() {
        return end;
    }

    public Boolean getSerializeHash() {
        return serializeHash;
    }

    public void setMetadata(DigitalBadgeMetadata metadata) {
        this.metadata = metadata;
    }

    public void setBadge(File badge) {
        this.badge = badge;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setSerializeHash(Boolean serializeHash) {
        this.serializeHash = serializeHash;
    }

    @Override
    public boolean equals(Object other){
        if(this == other ) return true;
        if(other == null || getClass() != other.getClass()) return false;
        DigitalBadge that = (DigitalBadge) other;
        return new EqualsBuilder()
                .append(this.serial,that.serial)
                .append(this.end,that.end).isEquals();

    }
    @Override
    public int compareTo(DigitalBadge other){
        return this.metadata.compareTo(other.metadata);
    }
    @Override
    public int hashCode(){
        return  new HashCodeBuilder(17,37)
                .append(this.serial)
                .append(this.end)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "DigitalBadge{" +
                "metadata=" + metadata +
                ", badge=" + badge +
                ", serial='" + serial + '\'' +
                ", Description='" + Description + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                ", serializeHash=" + serializeHash +
                '}';
    }
}
