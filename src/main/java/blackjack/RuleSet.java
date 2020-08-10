package blackjack;

public interface RuleSet {
    abstract void EvaluateCard ();
    abstract void EvaluateHand ();
    abstract void MeetsWinCondition ();
    abstract void MeetsLoseCondition ();
}