package cms.user;

public class GuestUser extends User{

    public GuestUser(String email, int id, String nome, String password) {
        super(email, id, nome, password);
    }

	public void viewContent(int contentId) {
		/* exclusivo do visitante */ }
}
