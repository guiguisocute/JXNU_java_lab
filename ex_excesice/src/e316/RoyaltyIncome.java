package e316;

/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income{

	// TODO
	public RoyaltyIncome(double in){
		super(in);
	}

	@Override
	public double getTax() {
		return income * 0.2;
	}

}
