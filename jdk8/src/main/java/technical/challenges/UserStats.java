package technical.challenges;

import java.util.Optional;

public class UserStats {
    public Optional<Long> getVisitCount() {
        return visitCount;
    }

    UserStats(Optional<Long> visits) {
        this.visitCount = visits;
    }

    public void setVisitCount(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }

    Optional<Long> visitCount;
}
