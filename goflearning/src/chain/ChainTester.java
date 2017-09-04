package chain;

public class ChainTester {

	public static void main(String[] args) {
		SeniorManager sManager = new SeniorManager(null);
		L2Manager l2Manager = new L2Manager(sManager);
		L1Manager l1Manager = new L1Manager(l2Manager);
		OARequest r1 = new OARequest(RequestType.Vocation, RequestLevel.L1,"Sick");
		l1Manager.HandleRequest(r1);
		r1 = new OARequest(RequestType.BusinessTrip, RequestLevel.L2,"Trip to BJ");
		l1Manager.HandleRequest(r1);
		r1 = new OARequest(RequestType.Buy, RequestLevel.Senior,"Buy PC");
		l1Manager.HandleRequest(r1);

	}

}
