package photoground.ceos.vote.domain.vote.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import photoground.ceos.vote.domain.candidate.entity.Candidate;
import photoground.ceos.vote.domain.member.entity.Member;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@DiscriminatorValue("L")
public class LeaderVote extends Vote {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leader_id")
    private Candidate leader;

    public LeaderVote(Candidate leader, Member voter) {
        this.leader = leader;
        this.voter = voter;
    }
}
