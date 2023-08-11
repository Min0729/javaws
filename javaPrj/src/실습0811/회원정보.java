package 실습0811;

public class 회원정보 {

	private String id;
	private String pwd;
	private String name;
	public 회원정보(String id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	public 회원정보() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "회원정보 [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
