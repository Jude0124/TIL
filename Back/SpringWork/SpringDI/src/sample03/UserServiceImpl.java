package sample03;

public class UserServiceImpl implements UserServise {
	
	public UserServiceImpl() {
		super();
		System.out.println("UserService 생성자 호출");
	}

	@Override
	public void addUser(UserVo uv) {
		System.out.println("UserService : addUser()메서드 호출");
		System.out.println("이름 : " + uv.getUserName());
	}
	
}
