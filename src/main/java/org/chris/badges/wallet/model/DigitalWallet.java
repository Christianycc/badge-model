package org.chris.badges.wallet.model;

import java.util.HashSet;
import java.util.Set;

public class DigitalWallet {
    private Set<DigitalBadge> allBadges;
    private Set<Long> deadLinesPositions;
    private Set<DigitalBadge> deletingBadges = new HashSet<>();

    public Set<DigitalBadge> getAllBadges() {
        return allBadges;
    }

    public Set<Long> getDeadLinesPositions() {
        return deadLinesPositions;
    }

    public Set<DigitalBadge> getDeletingBadges() {
        return deletingBadges;
    }

    public void setAllBadges(Set<DigitalBadge> allBadges) {
        this.allBadges = allBadges;
    }

    public void setDeadLinesPositions(Set<Long> deadLinesPositions) {
        this.deadLinesPositions = deadLinesPositions;
    }

    public void setDeletingBadges(Set<DigitalBadge> deletingBadges) {
        this.deletingBadges = deletingBadges;
    }
}
