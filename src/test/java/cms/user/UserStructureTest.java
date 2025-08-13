package cms.user;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

class UserStructureTest {
	@Test
	void userDeveSerAbstrataEAvoDasSubclasses() throws Exception {
		try {
			Class<?> user = Class.forName("cms.user.User");
			assertTrue(Modifier.isAbstract(user.getModifiers()), "User deve ser abstract");
			assertEquals(user, Class.forName("cms.user.AdminUser").getSuperclass());
			assertEquals(user, Class.forName("cms.user.EditorUser").getSuperclass());
			assertEquals(user, Class.forName("cms.user.GuestUser").getSuperclass());
		} catch (ClassNotFoundException e) {
			fail("Crie a classe abstract cms.user.User");
		}
	}

	@Test
	void polimorfismoBasico() {
		// Este teste só compila se você criar cms.user.User e ajustar AdminUser para
		// extends User
		// Ajuste depois de criar a superclasse
		User a = new AdminUser("ana@x",1, "Ana", "123");
		assertEquals("Ana", a.getNome());
		assertTrue(a.checkPassword("123"));

		User b = new EditorUser("Yasmin@x",2, "Yasmin", "456");
		assertEquals("Yasmin", b.getNome());
		assertTrue(b.checkPassword("456"));

		User c = new GuestUser("taylorswift@x",3, "Taylor Swift", "000");
		assertEquals("Taylor Swift", c.getNome());
		assertTrue(c.checkPassword("000"));
	}
}
