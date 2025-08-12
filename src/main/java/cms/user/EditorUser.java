package cms.user;

public class EditorUser extends User{

    public EditorUser(String email, int id, String nome, String password) {
        super(email, id, nome, password);
    }

	public void editContent(int contentId, String body) {
		/* exclusivo do editor */ }
}
