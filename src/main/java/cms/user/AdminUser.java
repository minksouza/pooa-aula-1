package cms.user;

public class AdminUser extends User{
    public AdminUser(String email, int id, String nome, String password) {
        super(email, id, nome, password);
    }

	public void deleteContent(int contentId) {
		/* exclusivo do admin */ }
}
