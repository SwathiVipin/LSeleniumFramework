package pageObject;

public class loginPageObject {
	
//	locatore: xpath or CSS
	public static String signInButton = "//*[@id=\'root\']/div[1]/div/div[1]/nav/ul/li[3]/a";
	public static String title = "//*[@id=\"root\"]/div[1]/div/div[2]/h1/b/u";
	public static String userName = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[1]/div/input";
	public static String password = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[2]/div/input";
	public static String loginButton = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[3]/div/button";
	public static String loginErrorMsg = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[3]/div/div/h5/i";

}
