package cms.user;

public class EditorUser extends User{

    public EditorUser(String email, int id, String nome, String password) {
        super(email, id, nome, password);
    }

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public boolean checkPassword(String p) {
		return password.equals(p);
	}

	public void editContent(int contentId, String body) {
		/* exclusivo do editor */ }
}
