package chain;

enum RequestType
{
	Buy,
	Vocation,
	BusinessTrip,
	Signment	
}
enum RequestLevel
{
	L1,
	L2,
	Senior	
}
public class OARequest {
	private RequestType  _requestType;
	private String       _requestData;
	private RequestLevel _requestLevel;
	public OARequest(RequestType type, RequestLevel level, String desc )
	{
		_requestType = type;
		_requestLevel = level;
		_requestData = desc;		
	}
	public RequestType getRequestType() {
		return _requestType;
	}
	public void setRequestType(RequestType _requestType) {
		this._requestType = _requestType;
	}
	public String getRequestData() {
		return _requestData;
	}
	public void setRequestData(String _requestData) {
		this._requestData = _requestData;
	}
	public RequestLevel getRequestLevel() {
		return _requestLevel;
	}
	public void setRequestLevel(RequestLevel _requestLevel) {
		this._requestLevel = _requestLevel;
	}
	

}
