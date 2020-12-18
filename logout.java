class Logout{
	String user;
	public Logout(){
		user="";
	}
	public logoutFunction(){
		if(user.equals(""))
			System.out.println("no logged in user");
		user="";
		System.out.println("user logged out");
	}
}