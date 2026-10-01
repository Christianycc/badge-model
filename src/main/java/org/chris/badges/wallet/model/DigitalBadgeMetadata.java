package org.chris.badges.wallet.model;

import java.util.Objects;

public class DigitalBadgeMetadata implements Comparable <DigitalBadgeMetadata> {

    private int badgeId;
    private long walletPosition;

    private long imageSize;
    private String imageType;


    @Override
    public int compareTo(DigitalBadgeMetadata other) {
        return this.badgeId - other.badgeId;
    }

    public DigitalBadgeMetadata(int badgeId, long walletPosition, long imageSize, String imageType) {
        this.badgeId = badgeId;
        this.walletPosition = walletPosition;
        this.imageSize = imageSize;
        this.imageType = imageType;
    }

    public int getBadgeId() {
        return badgeId;
    }

    public long getWalletPosition() {
        return walletPosition;
    }

    public long getImageSize() {
        return imageSize;
    }

    public String getImageType() {
        return imageType;
    }

    public void setBadgeId(int badgeId) {
        this.badgeId = badgeId;
    }

    public void setWalletPosition(long walletPosition) {
        this.walletPosition = walletPosition;
    }

    public void setImageSize(long imageSize) {
        this.imageSize = imageSize;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @Override
    public String toString() {
        return "DigitalBadgeMetadata{" +
                "badgeId=" + badgeId +
                ", walletPosition=" + walletPosition +
                ", imageSize=" + imageSize +
                ", imageType='" + imageType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }

        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        DigitalBadgeMetadata that = (DigitalBadgeMetadata) other;
       // if (this.badgeId == that.badgeId && this.walletPosition == that.walletPosition && this.imageSize == that.imageSize) {
         //   return true;
        //}
        return this.badgeId == that.badgeId && this.walletPosition == that.walletPosition && this.imageSize == that.imageSize;

    }
    @Override
    public int hashCode(){
        return Objects.hash(badgeId,walletPosition,imageSize);
    }
}
